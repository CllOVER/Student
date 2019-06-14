package cn.cllover.administration.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTeaIdIsNull() {
            addCriterion("tea_id is null");
            return (Criteria) this;
        }

        public Criteria andTeaIdIsNotNull() {
            addCriterion("tea_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeaIdEqualTo(Integer value) {
            addCriterion("tea_id =", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdNotEqualTo(Integer value) {
            addCriterion("tea_id <>", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdGreaterThan(Integer value) {
            addCriterion("tea_id >", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tea_id >=", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdLessThan(Integer value) {
            addCriterion("tea_id <", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdLessThanOrEqualTo(Integer value) {
            addCriterion("tea_id <=", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdIn(List<Integer> values) {
            addCriterion("tea_id in", values, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdNotIn(List<Integer> values) {
            addCriterion("tea_id not in", values, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdBetween(Integer value1, Integer value2) {
            addCriterion("tea_id between", value1, value2, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tea_id not between", value1, value2, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaNameIsNull() {
            addCriterion("tea_name is null");
            return (Criteria) this;
        }

        public Criteria andTeaNameIsNotNull() {
            addCriterion("tea_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeaNameEqualTo(String value) {
            addCriterion("tea_name =", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotEqualTo(String value) {
            addCriterion("tea_name <>", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameGreaterThan(String value) {
            addCriterion("tea_name >", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameGreaterThanOrEqualTo(String value) {
            addCriterion("tea_name >=", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameLessThan(String value) {
            addCriterion("tea_name <", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameLessThanOrEqualTo(String value) {
            addCriterion("tea_name <=", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameLike(String value) {
            addCriterion("tea_name like", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotLike(String value) {
            addCriterion("tea_name not like", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameIn(List<String> values) {
            addCriterion("tea_name in", values, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotIn(List<String> values) {
            addCriterion("tea_name not in", values, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameBetween(String value1, String value2) {
            addCriterion("tea_name between", value1, value2, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotBetween(String value1, String value2) {
            addCriterion("tea_name not between", value1, value2, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaSexIsNull() {
            addCriterion("tea_sex is null");
            return (Criteria) this;
        }

        public Criteria andTeaSexIsNotNull() {
            addCriterion("tea_sex is not null");
            return (Criteria) this;
        }

        public Criteria andTeaSexEqualTo(String value) {
            addCriterion("tea_sex =", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexNotEqualTo(String value) {
            addCriterion("tea_sex <>", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexGreaterThan(String value) {
            addCriterion("tea_sex >", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexGreaterThanOrEqualTo(String value) {
            addCriterion("tea_sex >=", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexLessThan(String value) {
            addCriterion("tea_sex <", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexLessThanOrEqualTo(String value) {
            addCriterion("tea_sex <=", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexLike(String value) {
            addCriterion("tea_sex like", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexNotLike(String value) {
            addCriterion("tea_sex not like", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexIn(List<String> values) {
            addCriterion("tea_sex in", values, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexNotIn(List<String> values) {
            addCriterion("tea_sex not in", values, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexBetween(String value1, String value2) {
            addCriterion("tea_sex between", value1, value2, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexNotBetween(String value1, String value2) {
            addCriterion("tea_sex not between", value1, value2, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaAgeIsNull() {
            addCriterion("tea_age is null");
            return (Criteria) this;
        }

        public Criteria andTeaAgeIsNotNull() {
            addCriterion("tea_age is not null");
            return (Criteria) this;
        }

        public Criteria andTeaAgeEqualTo(Integer value) {
            addCriterion("tea_age =", value, "teaAge");
            return (Criteria) this;
        }

        public Criteria andTeaAgeNotEqualTo(Integer value) {
            addCriterion("tea_age <>", value, "teaAge");
            return (Criteria) this;
        }

        public Criteria andTeaAgeGreaterThan(Integer value) {
            addCriterion("tea_age >", value, "teaAge");
            return (Criteria) this;
        }

        public Criteria andTeaAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tea_age >=", value, "teaAge");
            return (Criteria) this;
        }

        public Criteria andTeaAgeLessThan(Integer value) {
            addCriterion("tea_age <", value, "teaAge");
            return (Criteria) this;
        }

        public Criteria andTeaAgeLessThanOrEqualTo(Integer value) {
            addCriterion("tea_age <=", value, "teaAge");
            return (Criteria) this;
        }

        public Criteria andTeaAgeIn(List<Integer> values) {
            addCriterion("tea_age in", values, "teaAge");
            return (Criteria) this;
        }

        public Criteria andTeaAgeNotIn(List<Integer> values) {
            addCriterion("tea_age not in", values, "teaAge");
            return (Criteria) this;
        }

        public Criteria andTeaAgeBetween(Integer value1, Integer value2) {
            addCriterion("tea_age between", value1, value2, "teaAge");
            return (Criteria) this;
        }

        public Criteria andTeaAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("tea_age not between", value1, value2, "teaAge");
            return (Criteria) this;
        }

        public Criteria andTeaIdentityIsNull() {
            addCriterion("tea_identity is null");
            return (Criteria) this;
        }

        public Criteria andTeaIdentityIsNotNull() {
            addCriterion("tea_identity is not null");
            return (Criteria) this;
        }

        public Criteria andTeaIdentityEqualTo(Long value) {
            addCriterion("tea_identity =", value, "teaIdentity");
            return (Criteria) this;
        }

        public Criteria andTeaIdentityNotEqualTo(Long value) {
            addCriterion("tea_identity <>", value, "teaIdentity");
            return (Criteria) this;
        }

        public Criteria andTeaIdentityGreaterThan(Long value) {
            addCriterion("tea_identity >", value, "teaIdentity");
            return (Criteria) this;
        }

        public Criteria andTeaIdentityGreaterThanOrEqualTo(Long value) {
            addCriterion("tea_identity >=", value, "teaIdentity");
            return (Criteria) this;
        }

        public Criteria andTeaIdentityLessThan(Long value) {
            addCriterion("tea_identity <", value, "teaIdentity");
            return (Criteria) this;
        }

        public Criteria andTeaIdentityLessThanOrEqualTo(Long value) {
            addCriterion("tea_identity <=", value, "teaIdentity");
            return (Criteria) this;
        }

        public Criteria andTeaIdentityIn(List<Long> values) {
            addCriterion("tea_identity in", values, "teaIdentity");
            return (Criteria) this;
        }

        public Criteria andTeaIdentityNotIn(List<Long> values) {
            addCriterion("tea_identity not in", values, "teaIdentity");
            return (Criteria) this;
        }

        public Criteria andTeaIdentityBetween(Long value1, Long value2) {
            addCriterion("tea_identity between", value1, value2, "teaIdentity");
            return (Criteria) this;
        }

        public Criteria andTeaIdentityNotBetween(Long value1, Long value2) {
            addCriterion("tea_identity not between", value1, value2, "teaIdentity");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneIsNull() {
            addCriterion("tea_phone is null");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneIsNotNull() {
            addCriterion("tea_phone is not null");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneEqualTo(Long value) {
            addCriterion("tea_phone =", value, "teaPhone");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneNotEqualTo(Long value) {
            addCriterion("tea_phone <>", value, "teaPhone");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneGreaterThan(Long value) {
            addCriterion("tea_phone >", value, "teaPhone");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneGreaterThanOrEqualTo(Long value) {
            addCriterion("tea_phone >=", value, "teaPhone");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneLessThan(Long value) {
            addCriterion("tea_phone <", value, "teaPhone");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneLessThanOrEqualTo(Long value) {
            addCriterion("tea_phone <=", value, "teaPhone");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneIn(List<Long> values) {
            addCriterion("tea_phone in", values, "teaPhone");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneNotIn(List<Long> values) {
            addCriterion("tea_phone not in", values, "teaPhone");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneBetween(Long value1, Long value2) {
            addCriterion("tea_phone between", value1, value2, "teaPhone");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneNotBetween(Long value1, Long value2) {
            addCriterion("tea_phone not between", value1, value2, "teaPhone");
            return (Criteria) this;
        }

        public Criteria andTeaAddressIsNull() {
            addCriterion("tea_address is null");
            return (Criteria) this;
        }

        public Criteria andTeaAddressIsNotNull() {
            addCriterion("tea_address is not null");
            return (Criteria) this;
        }

        public Criteria andTeaAddressEqualTo(String value) {
            addCriterion("tea_address =", value, "teaAddress");
            return (Criteria) this;
        }

        public Criteria andTeaAddressNotEqualTo(String value) {
            addCriterion("tea_address <>", value, "teaAddress");
            return (Criteria) this;
        }

        public Criteria andTeaAddressGreaterThan(String value) {
            addCriterion("tea_address >", value, "teaAddress");
            return (Criteria) this;
        }

        public Criteria andTeaAddressGreaterThanOrEqualTo(String value) {
            addCriterion("tea_address >=", value, "teaAddress");
            return (Criteria) this;
        }

        public Criteria andTeaAddressLessThan(String value) {
            addCriterion("tea_address <", value, "teaAddress");
            return (Criteria) this;
        }

        public Criteria andTeaAddressLessThanOrEqualTo(String value) {
            addCriterion("tea_address <=", value, "teaAddress");
            return (Criteria) this;
        }

        public Criteria andTeaAddressLike(String value) {
            addCriterion("tea_address like", value, "teaAddress");
            return (Criteria) this;
        }

        public Criteria andTeaAddressNotLike(String value) {
            addCriterion("tea_address not like", value, "teaAddress");
            return (Criteria) this;
        }

        public Criteria andTeaAddressIn(List<String> values) {
            addCriterion("tea_address in", values, "teaAddress");
            return (Criteria) this;
        }

        public Criteria andTeaAddressNotIn(List<String> values) {
            addCriterion("tea_address not in", values, "teaAddress");
            return (Criteria) this;
        }

        public Criteria andTeaAddressBetween(String value1, String value2) {
            addCriterion("tea_address between", value1, value2, "teaAddress");
            return (Criteria) this;
        }

        public Criteria andTeaAddressNotBetween(String value1, String value2) {
            addCriterion("tea_address not between", value1, value2, "teaAddress");
            return (Criteria) this;
        }

        public Criteria andTeaBirthdayIsNull() {
            addCriterion("tea_birthday is null");
            return (Criteria) this;
        }

        public Criteria andTeaBirthdayIsNotNull() {
            addCriterion("tea_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andTeaBirthdayEqualTo(Date value) {
            addCriterion("tea_birthday =", value, "teaBirthday");
            return (Criteria) this;
        }

        public Criteria andTeaBirthdayNotEqualTo(Date value) {
            addCriterion("tea_birthday <>", value, "teaBirthday");
            return (Criteria) this;
        }

        public Criteria andTeaBirthdayGreaterThan(Date value) {
            addCriterion("tea_birthday >", value, "teaBirthday");
            return (Criteria) this;
        }

        public Criteria andTeaBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("tea_birthday >=", value, "teaBirthday");
            return (Criteria) this;
        }

        public Criteria andTeaBirthdayLessThan(Date value) {
            addCriterion("tea_birthday <", value, "teaBirthday");
            return (Criteria) this;
        }

        public Criteria andTeaBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("tea_birthday <=", value, "teaBirthday");
            return (Criteria) this;
        }

        public Criteria andTeaBirthdayIn(List<Date> values) {
            addCriterion("tea_birthday in", values, "teaBirthday");
            return (Criteria) this;
        }

        public Criteria andTeaBirthdayNotIn(List<Date> values) {
            addCriterion("tea_birthday not in", values, "teaBirthday");
            return (Criteria) this;
        }

        public Criteria andTeaBirthdayBetween(Date value1, Date value2) {
            addCriterion("tea_birthday between", value1, value2, "teaBirthday");
            return (Criteria) this;
        }

        public Criteria andTeaBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("tea_birthday not between", value1, value2, "teaBirthday");
            return (Criteria) this;
        }

        public Criteria andTeaNationIdIsNull() {
            addCriterion("tea_nation_id is null");
            return (Criteria) this;
        }

        public Criteria andTeaNationIdIsNotNull() {
            addCriterion("tea_nation_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeaNationIdEqualTo(Integer value) {
            addCriterion("tea_nation_id =", value, "teaNationId");
            return (Criteria) this;
        }

        public Criteria andTeaNationIdNotEqualTo(Integer value) {
            addCriterion("tea_nation_id <>", value, "teaNationId");
            return (Criteria) this;
        }

        public Criteria andTeaNationIdGreaterThan(Integer value) {
            addCriterion("tea_nation_id >", value, "teaNationId");
            return (Criteria) this;
        }

        public Criteria andTeaNationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tea_nation_id >=", value, "teaNationId");
            return (Criteria) this;
        }

        public Criteria andTeaNationIdLessThan(Integer value) {
            addCriterion("tea_nation_id <", value, "teaNationId");
            return (Criteria) this;
        }

        public Criteria andTeaNationIdLessThanOrEqualTo(Integer value) {
            addCriterion("tea_nation_id <=", value, "teaNationId");
            return (Criteria) this;
        }

        public Criteria andTeaNationIdIn(List<Integer> values) {
            addCriterion("tea_nation_id in", values, "teaNationId");
            return (Criteria) this;
        }

        public Criteria andTeaNationIdNotIn(List<Integer> values) {
            addCriterion("tea_nation_id not in", values, "teaNationId");
            return (Criteria) this;
        }

        public Criteria andTeaNationIdBetween(Integer value1, Integer value2) {
            addCriterion("tea_nation_id between", value1, value2, "teaNationId");
            return (Criteria) this;
        }

        public Criteria andTeaNationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tea_nation_id not between", value1, value2, "teaNationId");
            return (Criteria) this;
        }

        public Criteria andTeaEmailIsNull() {
            addCriterion("tea_email is null");
            return (Criteria) this;
        }

        public Criteria andTeaEmailIsNotNull() {
            addCriterion("tea_email is not null");
            return (Criteria) this;
        }

        public Criteria andTeaEmailEqualTo(String value) {
            addCriterion("tea_email =", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailNotEqualTo(String value) {
            addCriterion("tea_email <>", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailGreaterThan(String value) {
            addCriterion("tea_email >", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailGreaterThanOrEqualTo(String value) {
            addCriterion("tea_email >=", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailLessThan(String value) {
            addCriterion("tea_email <", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailLessThanOrEqualTo(String value) {
            addCriterion("tea_email <=", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailLike(String value) {
            addCriterion("tea_email like", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailNotLike(String value) {
            addCriterion("tea_email not like", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailIn(List<String> values) {
            addCriterion("tea_email in", values, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailNotIn(List<String> values) {
            addCriterion("tea_email not in", values, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailBetween(String value1, String value2) {
            addCriterion("tea_email between", value1, value2, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailNotBetween(String value1, String value2) {
            addCriterion("tea_email not between", value1, value2, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaPartyMemberIsNull() {
            addCriterion("tea_party_member is null");
            return (Criteria) this;
        }

        public Criteria andTeaPartyMemberIsNotNull() {
            addCriterion("tea_party_member is not null");
            return (Criteria) this;
        }

        public Criteria andTeaPartyMemberEqualTo(Integer value) {
            addCriterion("tea_party_member =", value, "teaPartyMember");
            return (Criteria) this;
        }

        public Criteria andTeaPartyMemberNotEqualTo(Integer value) {
            addCriterion("tea_party_member <>", value, "teaPartyMember");
            return (Criteria) this;
        }

        public Criteria andTeaPartyMemberGreaterThan(Integer value) {
            addCriterion("tea_party_member >", value, "teaPartyMember");
            return (Criteria) this;
        }

        public Criteria andTeaPartyMemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("tea_party_member >=", value, "teaPartyMember");
            return (Criteria) this;
        }

        public Criteria andTeaPartyMemberLessThan(Integer value) {
            addCriterion("tea_party_member <", value, "teaPartyMember");
            return (Criteria) this;
        }

        public Criteria andTeaPartyMemberLessThanOrEqualTo(Integer value) {
            addCriterion("tea_party_member <=", value, "teaPartyMember");
            return (Criteria) this;
        }

        public Criteria andTeaPartyMemberIn(List<Integer> values) {
            addCriterion("tea_party_member in", values, "teaPartyMember");
            return (Criteria) this;
        }

        public Criteria andTeaPartyMemberNotIn(List<Integer> values) {
            addCriterion("tea_party_member not in", values, "teaPartyMember");
            return (Criteria) this;
        }

        public Criteria andTeaPartyMemberBetween(Integer value1, Integer value2) {
            addCriterion("tea_party_member between", value1, value2, "teaPartyMember");
            return (Criteria) this;
        }

        public Criteria andTeaPartyMemberNotBetween(Integer value1, Integer value2) {
            addCriterion("tea_party_member not between", value1, value2, "teaPartyMember");
            return (Criteria) this;
        }

        public Criteria andTeaHobbyIsNull() {
            addCriterion("tea_hobby is null");
            return (Criteria) this;
        }

        public Criteria andTeaHobbyIsNotNull() {
            addCriterion("tea_hobby is not null");
            return (Criteria) this;
        }

        public Criteria andTeaHobbyEqualTo(String value) {
            addCriterion("tea_hobby =", value, "teaHobby");
            return (Criteria) this;
        }

        public Criteria andTeaHobbyNotEqualTo(String value) {
            addCriterion("tea_hobby <>", value, "teaHobby");
            return (Criteria) this;
        }

        public Criteria andTeaHobbyGreaterThan(String value) {
            addCriterion("tea_hobby >", value, "teaHobby");
            return (Criteria) this;
        }

        public Criteria andTeaHobbyGreaterThanOrEqualTo(String value) {
            addCriterion("tea_hobby >=", value, "teaHobby");
            return (Criteria) this;
        }

        public Criteria andTeaHobbyLessThan(String value) {
            addCriterion("tea_hobby <", value, "teaHobby");
            return (Criteria) this;
        }

        public Criteria andTeaHobbyLessThanOrEqualTo(String value) {
            addCriterion("tea_hobby <=", value, "teaHobby");
            return (Criteria) this;
        }

        public Criteria andTeaHobbyLike(String value) {
            addCriterion("tea_hobby like", value, "teaHobby");
            return (Criteria) this;
        }

        public Criteria andTeaHobbyNotLike(String value) {
            addCriterion("tea_hobby not like", value, "teaHobby");
            return (Criteria) this;
        }

        public Criteria andTeaHobbyIn(List<String> values) {
            addCriterion("tea_hobby in", values, "teaHobby");
            return (Criteria) this;
        }

        public Criteria andTeaHobbyNotIn(List<String> values) {
            addCriterion("tea_hobby not in", values, "teaHobby");
            return (Criteria) this;
        }

        public Criteria andTeaHobbyBetween(String value1, String value2) {
            addCriterion("tea_hobby between", value1, value2, "teaHobby");
            return (Criteria) this;
        }

        public Criteria andTeaHobbyNotBetween(String value1, String value2) {
            addCriterion("tea_hobby not between", value1, value2, "teaHobby");
            return (Criteria) this;
        }

        public Criteria andTeaDescIsNull() {
            addCriterion("tea_desc is null");
            return (Criteria) this;
        }

        public Criteria andTeaDescIsNotNull() {
            addCriterion("tea_desc is not null");
            return (Criteria) this;
        }

        public Criteria andTeaDescEqualTo(String value) {
            addCriterion("tea_desc =", value, "teaDesc");
            return (Criteria) this;
        }

        public Criteria andTeaDescNotEqualTo(String value) {
            addCriterion("tea_desc <>", value, "teaDesc");
            return (Criteria) this;
        }

        public Criteria andTeaDescGreaterThan(String value) {
            addCriterion("tea_desc >", value, "teaDesc");
            return (Criteria) this;
        }

        public Criteria andTeaDescGreaterThanOrEqualTo(String value) {
            addCriterion("tea_desc >=", value, "teaDesc");
            return (Criteria) this;
        }

        public Criteria andTeaDescLessThan(String value) {
            addCriterion("tea_desc <", value, "teaDesc");
            return (Criteria) this;
        }

        public Criteria andTeaDescLessThanOrEqualTo(String value) {
            addCriterion("tea_desc <=", value, "teaDesc");
            return (Criteria) this;
        }

        public Criteria andTeaDescLike(String value) {
            addCriterion("tea_desc like", value, "teaDesc");
            return (Criteria) this;
        }

        public Criteria andTeaDescNotLike(String value) {
            addCriterion("tea_desc not like", value, "teaDesc");
            return (Criteria) this;
        }

        public Criteria andTeaDescIn(List<String> values) {
            addCriterion("tea_desc in", values, "teaDesc");
            return (Criteria) this;
        }

        public Criteria andTeaDescNotIn(List<String> values) {
            addCriterion("tea_desc not in", values, "teaDesc");
            return (Criteria) this;
        }

        public Criteria andTeaDescBetween(String value1, String value2) {
            addCriterion("tea_desc between", value1, value2, "teaDesc");
            return (Criteria) this;
        }

        public Criteria andTeaDescNotBetween(String value1, String value2) {
            addCriterion("tea_desc not between", value1, value2, "teaDesc");
            return (Criteria) this;
        }

        public Criteria andTeaStatusIsNull() {
            addCriterion("tea_status is null");
            return (Criteria) this;
        }

        public Criteria andTeaStatusIsNotNull() {
            addCriterion("tea_status is not null");
            return (Criteria) this;
        }

        public Criteria andTeaStatusEqualTo(Integer value) {
            addCriterion("tea_status =", value, "teaStatus");
            return (Criteria) this;
        }

        public Criteria andTeaStatusNotEqualTo(Integer value) {
            addCriterion("tea_status <>", value, "teaStatus");
            return (Criteria) this;
        }

        public Criteria andTeaStatusGreaterThan(Integer value) {
            addCriterion("tea_status >", value, "teaStatus");
            return (Criteria) this;
        }

        public Criteria andTeaStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("tea_status >=", value, "teaStatus");
            return (Criteria) this;
        }

        public Criteria andTeaStatusLessThan(Integer value) {
            addCriterion("tea_status <", value, "teaStatus");
            return (Criteria) this;
        }

        public Criteria andTeaStatusLessThanOrEqualTo(Integer value) {
            addCriterion("tea_status <=", value, "teaStatus");
            return (Criteria) this;
        }

        public Criteria andTeaStatusIn(List<Integer> values) {
            addCriterion("tea_status in", values, "teaStatus");
            return (Criteria) this;
        }

        public Criteria andTeaStatusNotIn(List<Integer> values) {
            addCriterion("tea_status not in", values, "teaStatus");
            return (Criteria) this;
        }

        public Criteria andTeaStatusBetween(Integer value1, Integer value2) {
            addCriterion("tea_status between", value1, value2, "teaStatus");
            return (Criteria) this;
        }

        public Criteria andTeaStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("tea_status not between", value1, value2, "teaStatus");
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