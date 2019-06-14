package cn.cllover.administration.pojo;

import java.util.ArrayList;
import java.util.List;

public class AcademyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcademyExample() {
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

        public Criteria andAcaIdIsNull() {
            addCriterion("aca_id is null");
            return (Criteria) this;
        }

        public Criteria andAcaIdIsNotNull() {
            addCriterion("aca_id is not null");
            return (Criteria) this;
        }

        public Criteria andAcaIdEqualTo(Integer value) {
            addCriterion("aca_id =", value, "acaId");
            return (Criteria) this;
        }

        public Criteria andAcaIdNotEqualTo(Integer value) {
            addCriterion("aca_id <>", value, "acaId");
            return (Criteria) this;
        }

        public Criteria andAcaIdGreaterThan(Integer value) {
            addCriterion("aca_id >", value, "acaId");
            return (Criteria) this;
        }

        public Criteria andAcaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("aca_id >=", value, "acaId");
            return (Criteria) this;
        }

        public Criteria andAcaIdLessThan(Integer value) {
            addCriterion("aca_id <", value, "acaId");
            return (Criteria) this;
        }

        public Criteria andAcaIdLessThanOrEqualTo(Integer value) {
            addCriterion("aca_id <=", value, "acaId");
            return (Criteria) this;
        }

        public Criteria andAcaIdIn(List<Integer> values) {
            addCriterion("aca_id in", values, "acaId");
            return (Criteria) this;
        }

        public Criteria andAcaIdNotIn(List<Integer> values) {
            addCriterion("aca_id not in", values, "acaId");
            return (Criteria) this;
        }

        public Criteria andAcaIdBetween(Integer value1, Integer value2) {
            addCriterion("aca_id between", value1, value2, "acaId");
            return (Criteria) this;
        }

        public Criteria andAcaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("aca_id not between", value1, value2, "acaId");
            return (Criteria) this;
        }

        public Criteria andAcaNameIsNull() {
            addCriterion("aca_name is null");
            return (Criteria) this;
        }

        public Criteria andAcaNameIsNotNull() {
            addCriterion("aca_name is not null");
            return (Criteria) this;
        }

        public Criteria andAcaNameEqualTo(String value) {
            addCriterion("aca_name =", value, "acaName");
            return (Criteria) this;
        }

        public Criteria andAcaNameNotEqualTo(String value) {
            addCriterion("aca_name <>", value, "acaName");
            return (Criteria) this;
        }

        public Criteria andAcaNameGreaterThan(String value) {
            addCriterion("aca_name >", value, "acaName");
            return (Criteria) this;
        }

        public Criteria andAcaNameGreaterThanOrEqualTo(String value) {
            addCriterion("aca_name >=", value, "acaName");
            return (Criteria) this;
        }

        public Criteria andAcaNameLessThan(String value) {
            addCriterion("aca_name <", value, "acaName");
            return (Criteria) this;
        }

        public Criteria andAcaNameLessThanOrEqualTo(String value) {
            addCriterion("aca_name <=", value, "acaName");
            return (Criteria) this;
        }

        public Criteria andAcaNameLike(String value) {
            addCriterion("aca_name like", value, "acaName");
            return (Criteria) this;
        }

        public Criteria andAcaNameNotLike(String value) {
            addCriterion("aca_name not like", value, "acaName");
            return (Criteria) this;
        }

        public Criteria andAcaNameIn(List<String> values) {
            addCriterion("aca_name in", values, "acaName");
            return (Criteria) this;
        }

        public Criteria andAcaNameNotIn(List<String> values) {
            addCriterion("aca_name not in", values, "acaName");
            return (Criteria) this;
        }

        public Criteria andAcaNameBetween(String value1, String value2) {
            addCriterion("aca_name between", value1, value2, "acaName");
            return (Criteria) this;
        }

        public Criteria andAcaNameNotBetween(String value1, String value2) {
            addCriterion("aca_name not between", value1, value2, "acaName");
            return (Criteria) this;
        }

        public Criteria andAcaDescIsNull() {
            addCriterion("aca_desc is null");
            return (Criteria) this;
        }

        public Criteria andAcaDescIsNotNull() {
            addCriterion("aca_desc is not null");
            return (Criteria) this;
        }

        public Criteria andAcaDescEqualTo(String value) {
            addCriterion("aca_desc =", value, "acaDesc");
            return (Criteria) this;
        }

        public Criteria andAcaDescNotEqualTo(String value) {
            addCriterion("aca_desc <>", value, "acaDesc");
            return (Criteria) this;
        }

        public Criteria andAcaDescGreaterThan(String value) {
            addCriterion("aca_desc >", value, "acaDesc");
            return (Criteria) this;
        }

        public Criteria andAcaDescGreaterThanOrEqualTo(String value) {
            addCriterion("aca_desc >=", value, "acaDesc");
            return (Criteria) this;
        }

        public Criteria andAcaDescLessThan(String value) {
            addCriterion("aca_desc <", value, "acaDesc");
            return (Criteria) this;
        }

        public Criteria andAcaDescLessThanOrEqualTo(String value) {
            addCriterion("aca_desc <=", value, "acaDesc");
            return (Criteria) this;
        }

        public Criteria andAcaDescLike(String value) {
            addCriterion("aca_desc like", value, "acaDesc");
            return (Criteria) this;
        }

        public Criteria andAcaDescNotLike(String value) {
            addCriterion("aca_desc not like", value, "acaDesc");
            return (Criteria) this;
        }

        public Criteria andAcaDescIn(List<String> values) {
            addCriterion("aca_desc in", values, "acaDesc");
            return (Criteria) this;
        }

        public Criteria andAcaDescNotIn(List<String> values) {
            addCriterion("aca_desc not in", values, "acaDesc");
            return (Criteria) this;
        }

        public Criteria andAcaDescBetween(String value1, String value2) {
            addCriterion("aca_desc between", value1, value2, "acaDesc");
            return (Criteria) this;
        }

        public Criteria andAcaDescNotBetween(String value1, String value2) {
            addCriterion("aca_desc not between", value1, value2, "acaDesc");
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