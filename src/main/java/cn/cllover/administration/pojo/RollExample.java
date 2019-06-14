package cn.cllover.administration.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RollExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RollExample() {
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

        public Criteria andRollIdIsNull() {
            addCriterion("roll_id is null");
            return (Criteria) this;
        }

        public Criteria andRollIdIsNotNull() {
            addCriterion("roll_id is not null");
            return (Criteria) this;
        }

        public Criteria andRollIdEqualTo(Long value) {
            addCriterion("roll_id =", value, "rollId");
            return (Criteria) this;
        }

        public Criteria andRollIdNotEqualTo(Long value) {
            addCriterion("roll_id <>", value, "rollId");
            return (Criteria) this;
        }

        public Criteria andRollIdGreaterThan(Long value) {
            addCriterion("roll_id >", value, "rollId");
            return (Criteria) this;
        }

        public Criteria andRollIdGreaterThanOrEqualTo(Long value) {
            addCriterion("roll_id >=", value, "rollId");
            return (Criteria) this;
        }

        public Criteria andRollIdLessThan(Long value) {
            addCriterion("roll_id <", value, "rollId");
            return (Criteria) this;
        }

        public Criteria andRollIdLessThanOrEqualTo(Long value) {
            addCriterion("roll_id <=", value, "rollId");
            return (Criteria) this;
        }

        public Criteria andRollIdIn(List<Long> values) {
            addCriterion("roll_id in", values, "rollId");
            return (Criteria) this;
        }

        public Criteria andRollIdNotIn(List<Long> values) {
            addCriterion("roll_id not in", values, "rollId");
            return (Criteria) this;
        }

        public Criteria andRollIdBetween(Long value1, Long value2) {
            addCriterion("roll_id between", value1, value2, "rollId");
            return (Criteria) this;
        }

        public Criteria andRollIdNotBetween(Long value1, Long value2) {
            addCriterion("roll_id not between", value1, value2, "rollId");
            return (Criteria) this;
        }

        public Criteria andStuRollIdIsNull() {
            addCriterion("stu_roll_id is null");
            return (Criteria) this;
        }

        public Criteria andStuRollIdIsNotNull() {
            addCriterion("stu_roll_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuRollIdEqualTo(Long value) {
            addCriterion("stu_roll_id =", value, "stuRollId");
            return (Criteria) this;
        }

        public Criteria andStuRollIdNotEqualTo(Long value) {
            addCriterion("stu_roll_id <>", value, "stuRollId");
            return (Criteria) this;
        }

        public Criteria andStuRollIdGreaterThan(Long value) {
            addCriterion("stu_roll_id >", value, "stuRollId");
            return (Criteria) this;
        }

        public Criteria andStuRollIdGreaterThanOrEqualTo(Long value) {
            addCriterion("stu_roll_id >=", value, "stuRollId");
            return (Criteria) this;
        }

        public Criteria andStuRollIdLessThan(Long value) {
            addCriterion("stu_roll_id <", value, "stuRollId");
            return (Criteria) this;
        }

        public Criteria andStuRollIdLessThanOrEqualTo(Long value) {
            addCriterion("stu_roll_id <=", value, "stuRollId");
            return (Criteria) this;
        }

        public Criteria andStuRollIdIn(List<Long> values) {
            addCriterion("stu_roll_id in", values, "stuRollId");
            return (Criteria) this;
        }

        public Criteria andStuRollIdNotIn(List<Long> values) {
            addCriterion("stu_roll_id not in", values, "stuRollId");
            return (Criteria) this;
        }

        public Criteria andStuRollIdBetween(Long value1, Long value2) {
            addCriterion("stu_roll_id between", value1, value2, "stuRollId");
            return (Criteria) this;
        }

        public Criteria andStuRollIdNotBetween(Long value1, Long value2) {
            addCriterion("stu_roll_id not between", value1, value2, "stuRollId");
            return (Criteria) this;
        }

        public Criteria andRollStudyingWayIsNull() {
            addCriterion("roll_studying_way is null");
            return (Criteria) this;
        }

        public Criteria andRollStudyingWayIsNotNull() {
            addCriterion("roll_studying_way is not null");
            return (Criteria) this;
        }

        public Criteria andRollStudyingWayEqualTo(String value) {
            addCriterion("roll_studying_way =", value, "rollStudyingWay");
            return (Criteria) this;
        }

        public Criteria andRollStudyingWayNotEqualTo(String value) {
            addCriterion("roll_studying_way <>", value, "rollStudyingWay");
            return (Criteria) this;
        }

        public Criteria andRollStudyingWayGreaterThan(String value) {
            addCriterion("roll_studying_way >", value, "rollStudyingWay");
            return (Criteria) this;
        }

        public Criteria andRollStudyingWayGreaterThanOrEqualTo(String value) {
            addCriterion("roll_studying_way >=", value, "rollStudyingWay");
            return (Criteria) this;
        }

        public Criteria andRollStudyingWayLessThan(String value) {
            addCriterion("roll_studying_way <", value, "rollStudyingWay");
            return (Criteria) this;
        }

        public Criteria andRollStudyingWayLessThanOrEqualTo(String value) {
            addCriterion("roll_studying_way <=", value, "rollStudyingWay");
            return (Criteria) this;
        }

        public Criteria andRollStudyingWayLike(String value) {
            addCriterion("roll_studying_way like", value, "rollStudyingWay");
            return (Criteria) this;
        }

        public Criteria andRollStudyingWayNotLike(String value) {
            addCriterion("roll_studying_way not like", value, "rollStudyingWay");
            return (Criteria) this;
        }

        public Criteria andRollStudyingWayIn(List<String> values) {
            addCriterion("roll_studying_way in", values, "rollStudyingWay");
            return (Criteria) this;
        }

        public Criteria andRollStudyingWayNotIn(List<String> values) {
            addCriterion("roll_studying_way not in", values, "rollStudyingWay");
            return (Criteria) this;
        }

        public Criteria andRollStudyingWayBetween(String value1, String value2) {
            addCriterion("roll_studying_way between", value1, value2, "rollStudyingWay");
            return (Criteria) this;
        }

        public Criteria andRollStudyingWayNotBetween(String value1, String value2) {
            addCriterion("roll_studying_way not between", value1, value2, "rollStudyingWay");
            return (Criteria) this;
        }

        public Criteria andRollStudyingDateIsNull() {
            addCriterion("roll_studying_date is null");
            return (Criteria) this;
        }

        public Criteria andRollStudyingDateIsNotNull() {
            addCriterion("roll_studying_date is not null");
            return (Criteria) this;
        }

        public Criteria andRollStudyingDateEqualTo(Date value) {
            addCriterion("roll_studying_date =", value, "rollStudyingDate");
            return (Criteria) this;
        }

        public Criteria andRollStudyingDateNotEqualTo(Date value) {
            addCriterion("roll_studying_date <>", value, "rollStudyingDate");
            return (Criteria) this;
        }

        public Criteria andRollStudyingDateGreaterThan(Date value) {
            addCriterion("roll_studying_date >", value, "rollStudyingDate");
            return (Criteria) this;
        }

        public Criteria andRollStudyingDateGreaterThanOrEqualTo(Date value) {
            addCriterion("roll_studying_date >=", value, "rollStudyingDate");
            return (Criteria) this;
        }

        public Criteria andRollStudyingDateLessThan(Date value) {
            addCriterion("roll_studying_date <", value, "rollStudyingDate");
            return (Criteria) this;
        }

        public Criteria andRollStudyingDateLessThanOrEqualTo(Date value) {
            addCriterion("roll_studying_date <=", value, "rollStudyingDate");
            return (Criteria) this;
        }

        public Criteria andRollStudyingDateIn(List<Date> values) {
            addCriterion("roll_studying_date in", values, "rollStudyingDate");
            return (Criteria) this;
        }

        public Criteria andRollStudyingDateNotIn(List<Date> values) {
            addCriterion("roll_studying_date not in", values, "rollStudyingDate");
            return (Criteria) this;
        }

        public Criteria andRollStudyingDateBetween(Date value1, Date value2) {
            addCriterion("roll_studying_date between", value1, value2, "rollStudyingDate");
            return (Criteria) this;
        }

        public Criteria andRollStudyingDateNotBetween(Date value1, Date value2) {
            addCriterion("roll_studying_date not between", value1, value2, "rollStudyingDate");
            return (Criteria) this;
        }

        public Criteria andRollStudyingFormIsNull() {
            addCriterion("roll_studying_form is null");
            return (Criteria) this;
        }

        public Criteria andRollStudyingFormIsNotNull() {
            addCriterion("roll_studying_form is not null");
            return (Criteria) this;
        }

        public Criteria andRollStudyingFormEqualTo(String value) {
            addCriterion("roll_studying_form =", value, "rollStudyingForm");
            return (Criteria) this;
        }

        public Criteria andRollStudyingFormNotEqualTo(String value) {
            addCriterion("roll_studying_form <>", value, "rollStudyingForm");
            return (Criteria) this;
        }

        public Criteria andRollStudyingFormGreaterThan(String value) {
            addCriterion("roll_studying_form >", value, "rollStudyingForm");
            return (Criteria) this;
        }

        public Criteria andRollStudyingFormGreaterThanOrEqualTo(String value) {
            addCriterion("roll_studying_form >=", value, "rollStudyingForm");
            return (Criteria) this;
        }

        public Criteria andRollStudyingFormLessThan(String value) {
            addCriterion("roll_studying_form <", value, "rollStudyingForm");
            return (Criteria) this;
        }

        public Criteria andRollStudyingFormLessThanOrEqualTo(String value) {
            addCriterion("roll_studying_form <=", value, "rollStudyingForm");
            return (Criteria) this;
        }

        public Criteria andRollStudyingFormLike(String value) {
            addCriterion("roll_studying_form like", value, "rollStudyingForm");
            return (Criteria) this;
        }

        public Criteria andRollStudyingFormNotLike(String value) {
            addCriterion("roll_studying_form not like", value, "rollStudyingForm");
            return (Criteria) this;
        }

        public Criteria andRollStudyingFormIn(List<String> values) {
            addCriterion("roll_studying_form in", values, "rollStudyingForm");
            return (Criteria) this;
        }

        public Criteria andRollStudyingFormNotIn(List<String> values) {
            addCriterion("roll_studying_form not in", values, "rollStudyingForm");
            return (Criteria) this;
        }

        public Criteria andRollStudyingFormBetween(String value1, String value2) {
            addCriterion("roll_studying_form between", value1, value2, "rollStudyingForm");
            return (Criteria) this;
        }

        public Criteria andRollStudyingFormNotBetween(String value1, String value2) {
            addCriterion("roll_studying_form not between", value1, value2, "rollStudyingForm");
            return (Criteria) this;
        }

        public Criteria andRollStudyingSourceIsNull() {
            addCriterion("roll_studying_source is null");
            return (Criteria) this;
        }

        public Criteria andRollStudyingSourceIsNotNull() {
            addCriterion("roll_studying_source is not null");
            return (Criteria) this;
        }

        public Criteria andRollStudyingSourceEqualTo(String value) {
            addCriterion("roll_studying_source =", value, "rollStudyingSource");
            return (Criteria) this;
        }

        public Criteria andRollStudyingSourceNotEqualTo(String value) {
            addCriterion("roll_studying_source <>", value, "rollStudyingSource");
            return (Criteria) this;
        }

        public Criteria andRollStudyingSourceGreaterThan(String value) {
            addCriterion("roll_studying_source >", value, "rollStudyingSource");
            return (Criteria) this;
        }

        public Criteria andRollStudyingSourceGreaterThanOrEqualTo(String value) {
            addCriterion("roll_studying_source >=", value, "rollStudyingSource");
            return (Criteria) this;
        }

        public Criteria andRollStudyingSourceLessThan(String value) {
            addCriterion("roll_studying_source <", value, "rollStudyingSource");
            return (Criteria) this;
        }

        public Criteria andRollStudyingSourceLessThanOrEqualTo(String value) {
            addCriterion("roll_studying_source <=", value, "rollStudyingSource");
            return (Criteria) this;
        }

        public Criteria andRollStudyingSourceLike(String value) {
            addCriterion("roll_studying_source like", value, "rollStudyingSource");
            return (Criteria) this;
        }

        public Criteria andRollStudyingSourceNotLike(String value) {
            addCriterion("roll_studying_source not like", value, "rollStudyingSource");
            return (Criteria) this;
        }

        public Criteria andRollStudyingSourceIn(List<String> values) {
            addCriterion("roll_studying_source in", values, "rollStudyingSource");
            return (Criteria) this;
        }

        public Criteria andRollStudyingSourceNotIn(List<String> values) {
            addCriterion("roll_studying_source not in", values, "rollStudyingSource");
            return (Criteria) this;
        }

        public Criteria andRollStudyingSourceBetween(String value1, String value2) {
            addCriterion("roll_studying_source between", value1, value2, "rollStudyingSource");
            return (Criteria) this;
        }

        public Criteria andRollStudyingSourceNotBetween(String value1, String value2) {
            addCriterion("roll_studying_source not between", value1, value2, "rollStudyingSource");
            return (Criteria) this;
        }

        public Criteria andRollStatusIsNull() {
            addCriterion("roll_status is null");
            return (Criteria) this;
        }

        public Criteria andRollStatusIsNotNull() {
            addCriterion("roll_status is not null");
            return (Criteria) this;
        }

        public Criteria andRollStatusEqualTo(String value) {
            addCriterion("roll_status =", value, "rollStatus");
            return (Criteria) this;
        }

        public Criteria andRollStatusNotEqualTo(String value) {
            addCriterion("roll_status <>", value, "rollStatus");
            return (Criteria) this;
        }

        public Criteria andRollStatusGreaterThan(String value) {
            addCriterion("roll_status >", value, "rollStatus");
            return (Criteria) this;
        }

        public Criteria andRollStatusGreaterThanOrEqualTo(String value) {
            addCriterion("roll_status >=", value, "rollStatus");
            return (Criteria) this;
        }

        public Criteria andRollStatusLessThan(String value) {
            addCriterion("roll_status <", value, "rollStatus");
            return (Criteria) this;
        }

        public Criteria andRollStatusLessThanOrEqualTo(String value) {
            addCriterion("roll_status <=", value, "rollStatus");
            return (Criteria) this;
        }

        public Criteria andRollStatusLike(String value) {
            addCriterion("roll_status like", value, "rollStatus");
            return (Criteria) this;
        }

        public Criteria andRollStatusNotLike(String value) {
            addCriterion("roll_status not like", value, "rollStatus");
            return (Criteria) this;
        }

        public Criteria andRollStatusIn(List<String> values) {
            addCriterion("roll_status in", values, "rollStatus");
            return (Criteria) this;
        }

        public Criteria andRollStatusNotIn(List<String> values) {
            addCriterion("roll_status not in", values, "rollStatus");
            return (Criteria) this;
        }

        public Criteria andRollStatusBetween(String value1, String value2) {
            addCriterion("roll_status between", value1, value2, "rollStatus");
            return (Criteria) this;
        }

        public Criteria andRollStatusNotBetween(String value1, String value2) {
            addCriterion("roll_status not between", value1, value2, "rollStatus");
            return (Criteria) this;
        }

        public Criteria andRollAcaIdIsNull() {
            addCriterion("roll_aca_id is null");
            return (Criteria) this;
        }

        public Criteria andRollAcaIdIsNotNull() {
            addCriterion("roll_aca_id is not null");
            return (Criteria) this;
        }

        public Criteria andRollAcaIdEqualTo(Integer value) {
            addCriterion("roll_aca_id =", value, "rollAcaId");
            return (Criteria) this;
        }

        public Criteria andRollAcaIdNotEqualTo(Integer value) {
            addCriterion("roll_aca_id <>", value, "rollAcaId");
            return (Criteria) this;
        }

        public Criteria andRollAcaIdGreaterThan(Integer value) {
            addCriterion("roll_aca_id >", value, "rollAcaId");
            return (Criteria) this;
        }

        public Criteria andRollAcaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("roll_aca_id >=", value, "rollAcaId");
            return (Criteria) this;
        }

        public Criteria andRollAcaIdLessThan(Integer value) {
            addCriterion("roll_aca_id <", value, "rollAcaId");
            return (Criteria) this;
        }

        public Criteria andRollAcaIdLessThanOrEqualTo(Integer value) {
            addCriterion("roll_aca_id <=", value, "rollAcaId");
            return (Criteria) this;
        }

        public Criteria andRollAcaIdIn(List<Integer> values) {
            addCriterion("roll_aca_id in", values, "rollAcaId");
            return (Criteria) this;
        }

        public Criteria andRollAcaIdNotIn(List<Integer> values) {
            addCriterion("roll_aca_id not in", values, "rollAcaId");
            return (Criteria) this;
        }

        public Criteria andRollAcaIdBetween(Integer value1, Integer value2) {
            addCriterion("roll_aca_id between", value1, value2, "rollAcaId");
            return (Criteria) this;
        }

        public Criteria andRollAcaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("roll_aca_id not between", value1, value2, "rollAcaId");
            return (Criteria) this;
        }

        public Criteria andRollGradeIdIsNull() {
            addCriterion("roll_grade_id is null");
            return (Criteria) this;
        }

        public Criteria andRollGradeIdIsNotNull() {
            addCriterion("roll_grade_id is not null");
            return (Criteria) this;
        }

        public Criteria andRollGradeIdEqualTo(Integer value) {
            addCriterion("roll_grade_id =", value, "rollGradeId");
            return (Criteria) this;
        }

        public Criteria andRollGradeIdNotEqualTo(Integer value) {
            addCriterion("roll_grade_id <>", value, "rollGradeId");
            return (Criteria) this;
        }

        public Criteria andRollGradeIdGreaterThan(Integer value) {
            addCriterion("roll_grade_id >", value, "rollGradeId");
            return (Criteria) this;
        }

        public Criteria andRollGradeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("roll_grade_id >=", value, "rollGradeId");
            return (Criteria) this;
        }

        public Criteria andRollGradeIdLessThan(Integer value) {
            addCriterion("roll_grade_id <", value, "rollGradeId");
            return (Criteria) this;
        }

        public Criteria andRollGradeIdLessThanOrEqualTo(Integer value) {
            addCriterion("roll_grade_id <=", value, "rollGradeId");
            return (Criteria) this;
        }

        public Criteria andRollGradeIdIn(List<Integer> values) {
            addCriterion("roll_grade_id in", values, "rollGradeId");
            return (Criteria) this;
        }

        public Criteria andRollGradeIdNotIn(List<Integer> values) {
            addCriterion("roll_grade_id not in", values, "rollGradeId");
            return (Criteria) this;
        }

        public Criteria andRollGradeIdBetween(Integer value1, Integer value2) {
            addCriterion("roll_grade_id between", value1, value2, "rollGradeId");
            return (Criteria) this;
        }

        public Criteria andRollGradeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("roll_grade_id not between", value1, value2, "rollGradeId");
            return (Criteria) this;
        }

        public Criteria andRollClassIdIsNull() {
            addCriterion("roll_class_id is null");
            return (Criteria) this;
        }

        public Criteria andRollClassIdIsNotNull() {
            addCriterion("roll_class_id is not null");
            return (Criteria) this;
        }

        public Criteria andRollClassIdEqualTo(Integer value) {
            addCriterion("roll_class_id =", value, "rollClassId");
            return (Criteria) this;
        }

        public Criteria andRollClassIdNotEqualTo(Integer value) {
            addCriterion("roll_class_id <>", value, "rollClassId");
            return (Criteria) this;
        }

        public Criteria andRollClassIdGreaterThan(Integer value) {
            addCriterion("roll_class_id >", value, "rollClassId");
            return (Criteria) this;
        }

        public Criteria andRollClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("roll_class_id >=", value, "rollClassId");
            return (Criteria) this;
        }

        public Criteria andRollClassIdLessThan(Integer value) {
            addCriterion("roll_class_id <", value, "rollClassId");
            return (Criteria) this;
        }

        public Criteria andRollClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("roll_class_id <=", value, "rollClassId");
            return (Criteria) this;
        }

        public Criteria andRollClassIdIn(List<Integer> values) {
            addCriterion("roll_class_id in", values, "rollClassId");
            return (Criteria) this;
        }

        public Criteria andRollClassIdNotIn(List<Integer> values) {
            addCriterion("roll_class_id not in", values, "rollClassId");
            return (Criteria) this;
        }

        public Criteria andRollClassIdBetween(Integer value1, Integer value2) {
            addCriterion("roll_class_id between", value1, value2, "rollClassId");
            return (Criteria) this;
        }

        public Criteria andRollClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("roll_class_id not between", value1, value2, "rollClassId");
            return (Criteria) this;
        }

        public Criteria andRollMajIdIsNull() {
            addCriterion("roll_maj_id is null");
            return (Criteria) this;
        }

        public Criteria andRollMajIdIsNotNull() {
            addCriterion("roll_maj_id is not null");
            return (Criteria) this;
        }

        public Criteria andRollMajIdEqualTo(Integer value) {
            addCriterion("roll_maj_id =", value, "rollMajId");
            return (Criteria) this;
        }

        public Criteria andRollMajIdNotEqualTo(Integer value) {
            addCriterion("roll_maj_id <>", value, "rollMajId");
            return (Criteria) this;
        }

        public Criteria andRollMajIdGreaterThan(Integer value) {
            addCriterion("roll_maj_id >", value, "rollMajId");
            return (Criteria) this;
        }

        public Criteria andRollMajIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("roll_maj_id >=", value, "rollMajId");
            return (Criteria) this;
        }

        public Criteria andRollMajIdLessThan(Integer value) {
            addCriterion("roll_maj_id <", value, "rollMajId");
            return (Criteria) this;
        }

        public Criteria andRollMajIdLessThanOrEqualTo(Integer value) {
            addCriterion("roll_maj_id <=", value, "rollMajId");
            return (Criteria) this;
        }

        public Criteria andRollMajIdIn(List<Integer> values) {
            addCriterion("roll_maj_id in", values, "rollMajId");
            return (Criteria) this;
        }

        public Criteria andRollMajIdNotIn(List<Integer> values) {
            addCriterion("roll_maj_id not in", values, "rollMajId");
            return (Criteria) this;
        }

        public Criteria andRollMajIdBetween(Integer value1, Integer value2) {
            addCriterion("roll_maj_id between", value1, value2, "rollMajId");
            return (Criteria) this;
        }

        public Criteria andRollMajIdNotBetween(Integer value1, Integer value2) {
            addCriterion("roll_maj_id not between", value1, value2, "rollMajId");
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