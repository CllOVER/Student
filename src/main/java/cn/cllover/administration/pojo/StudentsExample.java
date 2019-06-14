package cn.cllover.administration.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StudentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentsExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andStuIdIsNull() {
            addCriterion("stu_id is null");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNotNull() {
            addCriterion("stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdEqualTo(Long value) {
            addCriterion("stu_id =", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotEqualTo(Long value) {
            addCriterion("stu_id <>", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThan(Long value) {
            addCriterion("stu_id >", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("stu_id >=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThan(Long value) {
            addCriterion("stu_id <", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThanOrEqualTo(Long value) {
            addCriterion("stu_id <=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdIn(List<Long> values) {
            addCriterion("stu_id in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotIn(List<Long> values) {
            addCriterion("stu_id not in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdBetween(Long value1, Long value2) {
            addCriterion("stu_id between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotBetween(Long value1, Long value2) {
            addCriterion("stu_id not between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNull() {
            addCriterion("stu_name is null");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNotNull() {
            addCriterion("stu_name is not null");
            return (Criteria) this;
        }

        public Criteria andStuNameEqualTo(String value) {
            addCriterion("stu_name =", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotEqualTo(String value) {
            addCriterion("stu_name <>", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThan(String value) {
            addCriterion("stu_name >", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThanOrEqualTo(String value) {
            addCriterion("stu_name >=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThan(String value) {
            addCriterion("stu_name <", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThanOrEqualTo(String value) {
            addCriterion("stu_name <=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLike(String value) {
            addCriterion("stu_name like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotLike(String value) {
            addCriterion("stu_name not like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameIn(List<String> values) {
            addCriterion("stu_name in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotIn(List<String> values) {
            addCriterion("stu_name not in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameBetween(String value1, String value2) {
            addCriterion("stu_name between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotBetween(String value1, String value2) {
            addCriterion("stu_name not between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNull() {
            addCriterion("stu_sex is null");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNotNull() {
            addCriterion("stu_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStuSexEqualTo(String value) {
            addCriterion("stu_sex =", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotEqualTo(String value) {
            addCriterion("stu_sex <>", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThan(String value) {
            addCriterion("stu_sex >", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThanOrEqualTo(String value) {
            addCriterion("stu_sex >=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThan(String value) {
            addCriterion("stu_sex <", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThanOrEqualTo(String value) {
            addCriterion("stu_sex <=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLike(String value) {
            addCriterion("stu_sex like", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotLike(String value) {
            addCriterion("stu_sex not like", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexIn(List<String> values) {
            addCriterion("stu_sex in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotIn(List<String> values) {
            addCriterion("stu_sex not in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexBetween(String value1, String value2) {
            addCriterion("stu_sex between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotBetween(String value1, String value2) {
            addCriterion("stu_sex not between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuAgeIsNull() {
            addCriterion("stu_age is null");
            return (Criteria) this;
        }

        public Criteria andStuAgeIsNotNull() {
            addCriterion("stu_age is not null");
            return (Criteria) this;
        }

        public Criteria andStuAgeEqualTo(Integer value) {
            addCriterion("stu_age =", value, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuAgeNotEqualTo(Integer value) {
            addCriterion("stu_age <>", value, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuAgeGreaterThan(Integer value) {
            addCriterion("stu_age >", value, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_age >=", value, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuAgeLessThan(Integer value) {
            addCriterion("stu_age <", value, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuAgeLessThanOrEqualTo(Integer value) {
            addCriterion("stu_age <=", value, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuAgeIn(List<Integer> values) {
            addCriterion("stu_age in", values, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuAgeNotIn(List<Integer> values) {
            addCriterion("stu_age not in", values, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuAgeBetween(Integer value1, Integer value2) {
            addCriterion("stu_age between", value1, value2, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_age not between", value1, value2, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuPhoneIsNull() {
            addCriterion("stu_phone is null");
            return (Criteria) this;
        }

        public Criteria andStuPhoneIsNotNull() {
            addCriterion("stu_phone is not null");
            return (Criteria) this;
        }

        public Criteria andStuPhoneEqualTo(Long value) {
            addCriterion("stu_phone =", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneNotEqualTo(Long value) {
            addCriterion("stu_phone <>", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneGreaterThan(Long value) {
            addCriterion("stu_phone >", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneGreaterThanOrEqualTo(Long value) {
            addCriterion("stu_phone >=", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneLessThan(Long value) {
            addCriterion("stu_phone <", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneLessThanOrEqualTo(Long value) {
            addCriterion("stu_phone <=", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneIn(List<Long> values) {
            addCriterion("stu_phone in", values, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneNotIn(List<Long> values) {
            addCriterion("stu_phone not in", values, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneBetween(Long value1, Long value2) {
            addCriterion("stu_phone between", value1, value2, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneNotBetween(Long value1, Long value2) {
            addCriterion("stu_phone not between", value1, value2, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuHomeIsNull() {
            addCriterion("stu_home is null");
            return (Criteria) this;
        }

        public Criteria andStuHomeIsNotNull() {
            addCriterion("stu_home is not null");
            return (Criteria) this;
        }

        public Criteria andStuHomeEqualTo(String value) {
            addCriterion("stu_home =", value, "stuHome");
            return (Criteria) this;
        }

        public Criteria andStuHomeNotEqualTo(String value) {
            addCriterion("stu_home <>", value, "stuHome");
            return (Criteria) this;
        }

        public Criteria andStuHomeGreaterThan(String value) {
            addCriterion("stu_home >", value, "stuHome");
            return (Criteria) this;
        }

        public Criteria andStuHomeGreaterThanOrEqualTo(String value) {
            addCriterion("stu_home >=", value, "stuHome");
            return (Criteria) this;
        }

        public Criteria andStuHomeLessThan(String value) {
            addCriterion("stu_home <", value, "stuHome");
            return (Criteria) this;
        }

        public Criteria andStuHomeLessThanOrEqualTo(String value) {
            addCriterion("stu_home <=", value, "stuHome");
            return (Criteria) this;
        }

        public Criteria andStuHomeLike(String value) {
            addCriterion("stu_home like", value, "stuHome");
            return (Criteria) this;
        }

        public Criteria andStuHomeNotLike(String value) {
            addCriterion("stu_home not like", value, "stuHome");
            return (Criteria) this;
        }

        public Criteria andStuHomeIn(List<String> values) {
            addCriterion("stu_home in", values, "stuHome");
            return (Criteria) this;
        }

        public Criteria andStuHomeNotIn(List<String> values) {
            addCriterion("stu_home not in", values, "stuHome");
            return (Criteria) this;
        }

        public Criteria andStuHomeBetween(String value1, String value2) {
            addCriterion("stu_home between", value1, value2, "stuHome");
            return (Criteria) this;
        }

        public Criteria andStuHomeNotBetween(String value1, String value2) {
            addCriterion("stu_home not between", value1, value2, "stuHome");
            return (Criteria) this;
        }

        public Criteria andStuAddressIsNull() {
            addCriterion("stu_address is null");
            return (Criteria) this;
        }

        public Criteria andStuAddressIsNotNull() {
            addCriterion("stu_address is not null");
            return (Criteria) this;
        }

        public Criteria andStuAddressEqualTo(String value) {
            addCriterion("stu_address =", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressNotEqualTo(String value) {
            addCriterion("stu_address <>", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressGreaterThan(String value) {
            addCriterion("stu_address >", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressGreaterThanOrEqualTo(String value) {
            addCriterion("stu_address >=", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressLessThan(String value) {
            addCriterion("stu_address <", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressLessThanOrEqualTo(String value) {
            addCriterion("stu_address <=", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressLike(String value) {
            addCriterion("stu_address like", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressNotLike(String value) {
            addCriterion("stu_address not like", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressIn(List<String> values) {
            addCriterion("stu_address in", values, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressNotIn(List<String> values) {
            addCriterion("stu_address not in", values, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressBetween(String value1, String value2) {
            addCriterion("stu_address between", value1, value2, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressNotBetween(String value1, String value2) {
            addCriterion("stu_address not between", value1, value2, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayIsNull() {
            addCriterion("stu_birthday is null");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayIsNotNull() {
            addCriterion("stu_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("stu_birthday =", value, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("stu_birthday <>", value, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("stu_birthday >", value, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("stu_birthday >=", value, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("stu_birthday <", value, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("stu_birthday <=", value, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("stu_birthday in", values, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("stu_birthday not in", values, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("stu_birthday between", value1, value2, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("stu_birthday not between", value1, value2, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuIdentityIsNull() {
            addCriterion("stu_identity is null");
            return (Criteria) this;
        }

        public Criteria andStuIdentityIsNotNull() {
            addCriterion("stu_identity is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdentityEqualTo(Long value) {
            addCriterion("stu_identity =", value, "stuIdentity");
            return (Criteria) this;
        }

        public Criteria andStuIdentityNotEqualTo(Long value) {
            addCriterion("stu_identity <>", value, "stuIdentity");
            return (Criteria) this;
        }

        public Criteria andStuIdentityGreaterThan(Long value) {
            addCriterion("stu_identity >", value, "stuIdentity");
            return (Criteria) this;
        }

        public Criteria andStuIdentityGreaterThanOrEqualTo(Long value) {
            addCriterion("stu_identity >=", value, "stuIdentity");
            return (Criteria) this;
        }

        public Criteria andStuIdentityLessThan(Long value) {
            addCriterion("stu_identity <", value, "stuIdentity");
            return (Criteria) this;
        }

        public Criteria andStuIdentityLessThanOrEqualTo(Long value) {
            addCriterion("stu_identity <=", value, "stuIdentity");
            return (Criteria) this;
        }

        public Criteria andStuIdentityIn(List<Long> values) {
            addCriterion("stu_identity in", values, "stuIdentity");
            return (Criteria) this;
        }

        public Criteria andStuIdentityNotIn(List<Long> values) {
            addCriterion("stu_identity not in", values, "stuIdentity");
            return (Criteria) this;
        }

        public Criteria andStuIdentityBetween(Long value1, Long value2) {
            addCriterion("stu_identity between", value1, value2, "stuIdentity");
            return (Criteria) this;
        }

        public Criteria andStuIdentityNotBetween(Long value1, Long value2) {
            addCriterion("stu_identity not between", value1, value2, "stuIdentity");
            return (Criteria) this;
        }

        public Criteria andStuNationIdIsNull() {
            addCriterion("stu_nation_id is null");
            return (Criteria) this;
        }

        public Criteria andStuNationIdIsNotNull() {
            addCriterion("stu_nation_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuNationIdEqualTo(Integer value) {
            addCriterion("stu_nation_id =", value, "stuNationId");
            return (Criteria) this;
        }

        public Criteria andStuNationIdNotEqualTo(Integer value) {
            addCriterion("stu_nation_id <>", value, "stuNationId");
            return (Criteria) this;
        }

        public Criteria andStuNationIdGreaterThan(Integer value) {
            addCriterion("stu_nation_id >", value, "stuNationId");
            return (Criteria) this;
        }

        public Criteria andStuNationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_nation_id >=", value, "stuNationId");
            return (Criteria) this;
        }

        public Criteria andStuNationIdLessThan(Integer value) {
            addCriterion("stu_nation_id <", value, "stuNationId");
            return (Criteria) this;
        }

        public Criteria andStuNationIdLessThanOrEqualTo(Integer value) {
            addCriterion("stu_nation_id <=", value, "stuNationId");
            return (Criteria) this;
        }

        public Criteria andStuNationIdIn(List<Integer> values) {
            addCriterion("stu_nation_id in", values, "stuNationId");
            return (Criteria) this;
        }

        public Criteria andStuNationIdNotIn(List<Integer> values) {
            addCriterion("stu_nation_id not in", values, "stuNationId");
            return (Criteria) this;
        }

        public Criteria andStuNationIdBetween(Integer value1, Integer value2) {
            addCriterion("stu_nation_id between", value1, value2, "stuNationId");
            return (Criteria) this;
        }

        public Criteria andStuNationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_nation_id not between", value1, value2, "stuNationId");
            return (Criteria) this;
        }

        public Criteria andStuEmailIsNull() {
            addCriterion("stu_email is null");
            return (Criteria) this;
        }

        public Criteria andStuEmailIsNotNull() {
            addCriterion("stu_email is not null");
            return (Criteria) this;
        }

        public Criteria andStuEmailEqualTo(String value) {
            addCriterion("stu_email =", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailNotEqualTo(String value) {
            addCriterion("stu_email <>", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailGreaterThan(String value) {
            addCriterion("stu_email >", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailGreaterThanOrEqualTo(String value) {
            addCriterion("stu_email >=", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailLessThan(String value) {
            addCriterion("stu_email <", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailLessThanOrEqualTo(String value) {
            addCriterion("stu_email <=", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailLike(String value) {
            addCriterion("stu_email like", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailNotLike(String value) {
            addCriterion("stu_email not like", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailIn(List<String> values) {
            addCriterion("stu_email in", values, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailNotIn(List<String> values) {
            addCriterion("stu_email not in", values, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailBetween(String value1, String value2) {
            addCriterion("stu_email between", value1, value2, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailNotBetween(String value1, String value2) {
            addCriterion("stu_email not between", value1, value2, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuQqIsNull() {
            addCriterion("stu_qq is null");
            return (Criteria) this;
        }

        public Criteria andStuQqIsNotNull() {
            addCriterion("stu_qq is not null");
            return (Criteria) this;
        }

        public Criteria andStuQqEqualTo(Long value) {
            addCriterion("stu_qq =", value, "stuQq");
            return (Criteria) this;
        }

        public Criteria andStuQqNotEqualTo(Long value) {
            addCriterion("stu_qq <>", value, "stuQq");
            return (Criteria) this;
        }

        public Criteria andStuQqGreaterThan(Long value) {
            addCriterion("stu_qq >", value, "stuQq");
            return (Criteria) this;
        }

        public Criteria andStuQqGreaterThanOrEqualTo(Long value) {
            addCriterion("stu_qq >=", value, "stuQq");
            return (Criteria) this;
        }

        public Criteria andStuQqLessThan(Long value) {
            addCriterion("stu_qq <", value, "stuQq");
            return (Criteria) this;
        }

        public Criteria andStuQqLessThanOrEqualTo(Long value) {
            addCriterion("stu_qq <=", value, "stuQq");
            return (Criteria) this;
        }

        public Criteria andStuQqIn(List<Long> values) {
            addCriterion("stu_qq in", values, "stuQq");
            return (Criteria) this;
        }

        public Criteria andStuQqNotIn(List<Long> values) {
            addCriterion("stu_qq not in", values, "stuQq");
            return (Criteria) this;
        }

        public Criteria andStuQqBetween(Long value1, Long value2) {
            addCriterion("stu_qq between", value1, value2, "stuQq");
            return (Criteria) this;
        }

        public Criteria andStuQqNotBetween(Long value1, Long value2) {
            addCriterion("stu_qq not between", value1, value2, "stuQq");
            return (Criteria) this;
        }

        public Criteria andStuLeagueMemberIsNull() {
            addCriterion("stu_league_member is null");
            return (Criteria) this;
        }

        public Criteria andStuLeagueMemberIsNotNull() {
            addCriterion("stu_league_member is not null");
            return (Criteria) this;
        }

        public Criteria andStuLeagueMemberEqualTo(String value) {
            addCriterion("stu_league_member =", value, "stuLeagueMember");
            return (Criteria) this;
        }

        public Criteria andStuLeagueMemberNotEqualTo(String value) {
            addCriterion("stu_league_member <>", value, "stuLeagueMember");
            return (Criteria) this;
        }

        public Criteria andStuLeagueMemberGreaterThan(String value) {
            addCriterion("stu_league_member >", value, "stuLeagueMember");
            return (Criteria) this;
        }

        public Criteria andStuLeagueMemberGreaterThanOrEqualTo(String value) {
            addCriterion("stu_league_member >=", value, "stuLeagueMember");
            return (Criteria) this;
        }

        public Criteria andStuLeagueMemberLessThan(String value) {
            addCriterion("stu_league_member <", value, "stuLeagueMember");
            return (Criteria) this;
        }

        public Criteria andStuLeagueMemberLessThanOrEqualTo(String value) {
            addCriterion("stu_league_member <=", value, "stuLeagueMember");
            return (Criteria) this;
        }

        public Criteria andStuLeagueMemberLike(String value) {
            addCriterion("stu_league_member like", value, "stuLeagueMember");
            return (Criteria) this;
        }

        public Criteria andStuLeagueMemberNotLike(String value) {
            addCriterion("stu_league_member not like", value, "stuLeagueMember");
            return (Criteria) this;
        }

        public Criteria andStuLeagueMemberIn(List<String> values) {
            addCriterion("stu_league_member in", values, "stuLeagueMember");
            return (Criteria) this;
        }

        public Criteria andStuLeagueMemberNotIn(List<String> values) {
            addCriterion("stu_league_member not in", values, "stuLeagueMember");
            return (Criteria) this;
        }

        public Criteria andStuLeagueMemberBetween(String value1, String value2) {
            addCriterion("stu_league_member between", value1, value2, "stuLeagueMember");
            return (Criteria) this;
        }

        public Criteria andStuLeagueMemberNotBetween(String value1, String value2) {
            addCriterion("stu_league_member not between", value1, value2, "stuLeagueMember");
            return (Criteria) this;
        }

        public Criteria andStuPartyMemberIsNull() {
            addCriterion("stu_party_member is null");
            return (Criteria) this;
        }

        public Criteria andStuPartyMemberIsNotNull() {
            addCriterion("stu_party_member is not null");
            return (Criteria) this;
        }

        public Criteria andStuPartyMemberEqualTo(String value) {
            addCriterion("stu_party_member =", value, "stuPartyMember");
            return (Criteria) this;
        }

        public Criteria andStuPartyMemberNotEqualTo(String value) {
            addCriterion("stu_party_member <>", value, "stuPartyMember");
            return (Criteria) this;
        }

        public Criteria andStuPartyMemberGreaterThan(String value) {
            addCriterion("stu_party_member >", value, "stuPartyMember");
            return (Criteria) this;
        }

        public Criteria andStuPartyMemberGreaterThanOrEqualTo(String value) {
            addCriterion("stu_party_member >=", value, "stuPartyMember");
            return (Criteria) this;
        }

        public Criteria andStuPartyMemberLessThan(String value) {
            addCriterion("stu_party_member <", value, "stuPartyMember");
            return (Criteria) this;
        }

        public Criteria andStuPartyMemberLessThanOrEqualTo(String value) {
            addCriterion("stu_party_member <=", value, "stuPartyMember");
            return (Criteria) this;
        }

        public Criteria andStuPartyMemberLike(String value) {
            addCriterion("stu_party_member like", value, "stuPartyMember");
            return (Criteria) this;
        }

        public Criteria andStuPartyMemberNotLike(String value) {
            addCriterion("stu_party_member not like", value, "stuPartyMember");
            return (Criteria) this;
        }

        public Criteria andStuPartyMemberIn(List<String> values) {
            addCriterion("stu_party_member in", values, "stuPartyMember");
            return (Criteria) this;
        }

        public Criteria andStuPartyMemberNotIn(List<String> values) {
            addCriterion("stu_party_member not in", values, "stuPartyMember");
            return (Criteria) this;
        }

        public Criteria andStuPartyMemberBetween(String value1, String value2) {
            addCriterion("stu_party_member between", value1, value2, "stuPartyMember");
            return (Criteria) this;
        }

        public Criteria andStuPartyMemberNotBetween(String value1, String value2) {
            addCriterion("stu_party_member not between", value1, value2, "stuPartyMember");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        public Criteria() {
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