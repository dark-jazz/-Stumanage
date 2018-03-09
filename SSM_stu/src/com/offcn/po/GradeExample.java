package com.offcn.po;

import java.util.ArrayList;
import java.util.List;

public class GradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GradeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andPgradeIsNull() {
            addCriterion("pgrade is null");
            return (Criteria) this;
        }

        public Criteria andPgradeIsNotNull() {
            addCriterion("pgrade is not null");
            return (Criteria) this;
        }

        public Criteria andPgradeEqualTo(Double value) {
            addCriterion("pgrade =", value, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeNotEqualTo(Double value) {
            addCriterion("pgrade <>", value, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeGreaterThan(Double value) {
            addCriterion("pgrade >", value, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeGreaterThanOrEqualTo(Double value) {
            addCriterion("pgrade >=", value, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeLessThan(Double value) {
            addCriterion("pgrade <", value, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeLessThanOrEqualTo(Double value) {
            addCriterion("pgrade <=", value, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeIn(List<Double> values) {
            addCriterion("pgrade in", values, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeNotIn(List<Double> values) {
            addCriterion("pgrade not in", values, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeBetween(Double value1, Double value2) {
            addCriterion("pgrade between", value1, value2, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeNotBetween(Double value1, Double value2) {
            addCriterion("pgrade not between", value1, value2, "pgrade");
            return (Criteria) this;
        }

        public Criteria andKgradeIsNull() {
            addCriterion("kgrade is null");
            return (Criteria) this;
        }

        public Criteria andKgradeIsNotNull() {
            addCriterion("kgrade is not null");
            return (Criteria) this;
        }

        public Criteria andKgradeEqualTo(Double value) {
            addCriterion("kgrade =", value, "kgrade");
            return (Criteria) this;
        }

        public Criteria andKgradeNotEqualTo(Double value) {
            addCriterion("kgrade <>", value, "kgrade");
            return (Criteria) this;
        }

        public Criteria andKgradeGreaterThan(Double value) {
            addCriterion("kgrade >", value, "kgrade");
            return (Criteria) this;
        }

        public Criteria andKgradeGreaterThanOrEqualTo(Double value) {
            addCriterion("kgrade >=", value, "kgrade");
            return (Criteria) this;
        }

        public Criteria andKgradeLessThan(Double value) {
            addCriterion("kgrade <", value, "kgrade");
            return (Criteria) this;
        }

        public Criteria andKgradeLessThanOrEqualTo(Double value) {
            addCriterion("kgrade <=", value, "kgrade");
            return (Criteria) this;
        }

        public Criteria andKgradeIn(List<Double> values) {
            addCriterion("kgrade in", values, "kgrade");
            return (Criteria) this;
        }

        public Criteria andKgradeNotIn(List<Double> values) {
            addCriterion("kgrade not in", values, "kgrade");
            return (Criteria) this;
        }

        public Criteria andKgradeBetween(Double value1, Double value2) {
            addCriterion("kgrade between", value1, value2, "kgrade");
            return (Criteria) this;
        }

        public Criteria andKgradeNotBetween(Double value1, Double value2) {
            addCriterion("kgrade not between", value1, value2, "kgrade");
            return (Criteria) this;
        }

        public Criteria andZgradeIsNull() {
            addCriterion("zgrade is null");
            return (Criteria) this;
        }

        public Criteria andZgradeIsNotNull() {
            addCriterion("zgrade is not null");
            return (Criteria) this;
        }

        public Criteria andZgradeEqualTo(Double value) {
            addCriterion("zgrade =", value, "zgrade");
            return (Criteria) this;
        }

        public Criteria andZgradeNotEqualTo(Double value) {
            addCriterion("zgrade <>", value, "zgrade");
            return (Criteria) this;
        }

        public Criteria andZgradeGreaterThan(Double value) {
            addCriterion("zgrade >", value, "zgrade");
            return (Criteria) this;
        }

        public Criteria andZgradeGreaterThanOrEqualTo(Double value) {
            addCriterion("zgrade >=", value, "zgrade");
            return (Criteria) this;
        }

        public Criteria andZgradeLessThan(Double value) {
            addCriterion("zgrade <", value, "zgrade");
            return (Criteria) this;
        }

        public Criteria andZgradeLessThanOrEqualTo(Double value) {
            addCriterion("zgrade <=", value, "zgrade");
            return (Criteria) this;
        }

        public Criteria andZgradeIn(List<Double> values) {
            addCriterion("zgrade in", values, "zgrade");
            return (Criteria) this;
        }

        public Criteria andZgradeNotIn(List<Double> values) {
            addCriterion("zgrade not in", values, "zgrade");
            return (Criteria) this;
        }

        public Criteria andZgradeBetween(Double value1, Double value2) {
            addCriterion("zgrade between", value1, value2, "zgrade");
            return (Criteria) this;
        }

        public Criteria andZgradeNotBetween(Double value1, Double value2) {
            addCriterion("zgrade not between", value1, value2, "zgrade");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}