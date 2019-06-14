package cn.cllover.administration.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Students {
    private Long stuId;

    private String stuName;

    private String stuSex;

    private Integer stuAge;

    private Long stuPhone;

    private String stuHome;

    private String stuAddress;

    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date stuBirthday;

    private Long stuIdentity;

    private Integer stuNationId;

    private String stuEmail;

    private Long stuQq;

    private String stuLeagueMember; //团员？

    private String stuPartyMember;  //党员？

    private Nation nation;

    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }

    public Long getStuId() {
        return stuId;
    }

    public void setStuId(Long stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? "" : stuName.trim();
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex == null ? null : stuSex.trim();
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    public Long getStuPhone() {
        return stuPhone;
    }

    public void setStuPhone(Long stuPhone) {
        this.stuPhone = stuPhone;
    }

    public String getStuHome() {
        return stuHome;
    }

    public void setStuHome(String stuHome) {
        this.stuHome = stuHome == null ? null : stuHome.trim();
    }

    public String getStuAddress() {
        return stuAddress;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress == null ? null : stuAddress.trim();
    }

    public Date getStuBirthday() {
        return stuBirthday;
    }

    public void setStuBirthday(Date stuBirthday) {
        this.stuBirthday = stuBirthday;
    }

    public Long getStuIdentity() {
        return stuIdentity;
    }

    public void setStuIdentity(Long stuIdentity) {
        this.stuIdentity = stuIdentity;
    }

    public Integer getStuNationId() {
        return stuNationId;
    }

    public void setStuNationId(Integer stuNationId) {
        this.stuNationId = stuNationId;
    }

    public String getStuEmail() {
        return stuEmail;
    }

    public void setStuEmail(String stuEmail) {
        this.stuEmail = stuEmail == null ? null : stuEmail.trim();
    }

    public Long getStuQq() {
        return stuQq;
    }

    public void setStuQq(Long stuQq) {
        this.stuQq = stuQq;
    }

    public String getStuLeagueMember() {
        return stuLeagueMember;
    }

    public void setStuLeagueMember(String stuLeagueMember) {
        this.stuLeagueMember = stuLeagueMember == null ? null : stuLeagueMember.trim();
    }

    public String getStuPartyMember() {
        return stuPartyMember;
    }

    public void setStuPartyMember(String stuPartyMember) {
        this.stuPartyMember = stuPartyMember == null ? null : stuPartyMember.trim();
    }
    @Override
    public String toString() {
        return "Students{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuSex='" + stuSex + '\'' +
                ", stuAge=" + stuAge +
                ", stuPhone=" + stuPhone +
                ", stuHome='" + stuHome + '\'' +
                ", stuAddress='" + stuAddress + '\'' +
                ", stuBirthday=" + stuBirthday +
                ", stuIdentity=" + stuIdentity +
                ", stuNationId=" + stuNationId +
                ", stuEmail='" + stuEmail + '\'' +
                ", stuQq=" + stuQq +
                ", stuLeagueMember='" + stuLeagueMember + '\'' +
                ", stuPartyMember='" + stuPartyMember + '\'' +
                ", nation=" + nation +
                '}';
    }
}