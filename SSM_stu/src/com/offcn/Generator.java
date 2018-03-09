package com.offcn;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;


/**
 * <p>Company: offcn</p>
 * @author zgf
 * @date 2017Äê5ÔÂ5ÈÕ
 * @version 1.0
 */
public class Generator {
	/**
	 * @param args
	 */
	public static void main(String[] args)  throws Exception{
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		File configFile = new File("D:\\0705\\SSM_stu\\src\\generator.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
				callback, warnings);
		myBatisGenerator.generate(null);
	}


}
