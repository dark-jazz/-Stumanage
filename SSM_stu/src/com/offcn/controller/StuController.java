package com.offcn.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.offcn.po.CtcKey;
import com.offcn.po.Login;
import com.offcn.po.Sc;
import com.offcn.po.StuExt;
import com.offcn.po.StuLoginExt;
import com.offcn.po.Student;
import com.offcn.service.StuService;

import net.sf.json.JSONArray;

@Controller
@RequestMapping("/stu")
public class StuController {
   
	@Autowired
//	@Resource
	private StuService sService;
	
	/*
	 * 查询某个学生（姓名）
	 * http://localhost:8080/SSM_stu/stu/oop/ee
	 */
	@RequestMapping(value = "/oop/{name}" , method = RequestMethod.GET)
	@ResponseBody
	public String getStudentInf(@PathVariable String name){
	
	List<Student> listStudent = sService.getStudentByName(name);
		
	System.out.println("listStudent ==== "+listStudent);
	
	return listStudent.toString();
	}
	
	
	
	@RequestMapping
	public String getlist(Model model,@RequestParam(required=false,defaultValue="1") int pageNO){
		int size=5;
		List<StuExt> slist=sService.getList(pageNO,size);
		model.addAttribute("slist", slist);
		model.addAttribute("pageNO", pageNO);
		model.addAttribute("size", size);
		model.addAttribute("count", sService.getCount());
		return "stu/list";
	}
	
	@RequestMapping("/showadd")
	public String showadd(Model model){
		StuLoginExt stu=new StuLoginExt();
		model.addAttribute("stu", stu);
		model.addAttribute("clist",sService.getAll());
		return "stu/add";
	}
	
	@RequestMapping("/add")
	public String add(Model model,@ModelAttribute("stu") @Valid StuLoginExt stu,BindingResult bindingResult){
		System.out.println("---------------");
		if(!bindingResult.hasErrors()){
			sService.saveStu(stu);
			return "redirect:/stu";
		}else{
			model.addAttribute("stu", stu);
			model.addAttribute("clist",sService.getAll());
			return "stu/add";
		}
		
	}
	
	@RequestMapping("/deletes")
	public  String deletes(Model model,int[] id){
		
		sService.mutidel(id);
		return "redirect:/stu";
	}
	/*自己写*/
	@RequestMapping("/delete/{id}")
	public  String delete(Model model,@PathVariable int id){
		sService.delete(id);
		return "redirect:/stu";
	}
	
	
	@RequestMapping("/showedit/{id}")
	public String showedit(Model model,@PathVariable int id){
		
//		JsonUtil.common(Person);
		
		model.addAttribute("stu", sService.getStuAndLogin(id));
		model.addAttribute("clist",sService.getAll());
		return "stu/edit";
	}
	
	@RequestMapping("/edit")
	public String edit(Model model,@ModelAttribute("stu") @Valid StuLoginExt stu,BindingResult bindingResult){
		System.out.println("---------------");
		if(!bindingResult.hasErrors()){
			sService.updateStu(stu);
			return "redirect:/stu";
		}else{
			model.addAttribute("stu", stu);
			model.addAttribute("clist",sService.getAll());
			return "stu/edit";
		}
		
	}
	
	/*个人模块*/
	//显示登录学生的信息
	@RequestMapping("/showInfo/{id}")
	public String showInfo(Model model,@PathVariable("id") int id){
		Student student = sService.getMyInfo(id);
//	    jsonUtil.commonw(student);
		model.addAttribute("student",student);
		return "/stu/person/list";
	}
	//修改密码
	@RequestMapping("/updatePwd")
	public String updatePwd(Model model,Login login){
		sService.updatePwd(login);
		model.addAttribute("msg", "1");
		return "/stu/person/list";
	}
	
	
	//查询登录学生的成绩
		@RequestMapping("/getGrade/{id}")
		public String getGrade(Model model,@PathVariable("id") int id){
			
			model.addAttribute("gradelist", sService.getGrade(id));
			return "/stu/person/grade";
		}
		//学生对选修课进行选课
		@RequestMapping("/selectCourse/{lid}")
		public String selectCourse(Model model,@PathVariable("lid") int lid){
			//获得学生所在的班级根据id
			StuLoginExt s=sService.getStuAndLogin(lid);
			List<CtcKey> ctclist = sService.selectCourse(s.getClasses().getId());
			model.addAttribute("ctclist", ctclist);
			System.out.println(lid);  //测试lid的值
			return "/stu/person/selectcourse";
		}
		//执行选课后的保存操作
		@RequestMapping("/savecourse")
		public String savecourse(String ids,HttpServletRequest request,RedirectAttributes redirectAttributes){
			List<Sc> sclist=new ArrayList<Sc>();
			Login login=(Login)request.getSession().getAttribute("user");
			int sid=login.getRid();
			
			String[] ctids=ids.split(",");
			for(String scid:ctids){
				String[] ctidattrys=scid.split("_");
				Sc sc=new Sc();
				sc.setSid(sid);
				sc.setTid(Integer.parseInt(ctidattrys[1]));
				sc.setCid(Integer.parseInt(ctidattrys[0]));
				sclist.add(sc);
			}
			sService.addcourse(sclist);
			
			Login loign=(Login) request.getSession().getAttribute("user");
			StuLoginExt s=sService.getStuAndLogin(login.getRid());
			//int claid=Integer.parseInt(request.getSession().getAttribute("classid")+"");
			redirectAttributes.addFlashAttribute("msg", 1);
			return "redirect:/stu/selectCourse/"+s.getId();
		}
		
		//显示登录人的课表
		@RequestMapping("/mycourse/{id}")
		public String myCourse(Model model,@PathVariable("id") int id,@RequestParam(name="type",defaultValue="选修") String type,@RequestParam(name="pageNO",defaultValue="1") int pageNum){
			int size=3;
			int count=sService.getMyCoursesCount(id);
			int pageNO=pageNum;
			model.addAttribute("size", size);
			model.addAttribute("count", count);
			model.addAttribute("pageNO", pageNO);
			List<Student> stulist = sService.getMyCourses(id, pageNO, size,type);
			model.addAttribute("stulist", stulist);
			return "/stu/person/mycourse";
		}
		//ajax实现查不同类型的课（选修课，必修课）
		@RequestMapping("/changeCouType/{id}")
		public void changeCouType(HttpServletResponse response,Model model,@RequestParam("type") String type,@PathVariable("id") int id) throws IOException{
			int size=3;
			int count=sService.getMyCoursesCount(id);
			model.addAttribute("size", size);
			model.addAttribute("count", count);
			model.addAttribute("pageNO", 1);
			
			List<Student> stulist = sService.getMyCourses(id, 1, size,type);
			System.out.println(JSONArray.fromObject(stulist).toString());
			response.getWriter().write(JSONArray.fromObject(stulist).toString());
		}
		
		
	
	
}
