package cn.cllover.administration.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Teacher {
    private Integer teaId;

    private String teaName;

    private String teaSex;

    private Integer teaAge;

    private Long teaIdentity;

    private Long teaPhone;

    private String teaAddress;

    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date teaBirthday;

    private Integer teaNationId;

    private String teaEmail;

    private Integer teaPartyMember;

    private String teaHobby;

    private String teaDesc;

    private Integer teaStatus;

    private Nation nation;

    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }

    public Integer getTeaId() {
        return teaId;
    }

    public void setTeaId(Integer teaId) {
        this.teaId = teaId;
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName == null ? null : teaName.trim();
    }

    public String getTeaSex() {
        return teaSex;
    }

    public void setTeaSex(String teaSex) {
        this.teaSex = teaSex == null ? null : teaSex.trim();
    }

    public Integer getTeaAge() {
        return teaAge;
    }

    public void setTeaAge(Integer teaAge) {
        this.teaAge = teaAge;
    }

    public Long getTeaIdentity() {
        return teaIdentity;
    }

    public void setTeaIdentity(Long teaIdentity) {
        this.teaIdentity = teaIdentity;
    }

    public Long getTeaPhone() {
        return teaPhone;
    }

    public void setTeaPhone(Long teaPhone) {
        this.teaPhone = teaPhone;
    }

    public String getTeaAddress() {
        return teaAddress;
    }

    public void setTeaAddress(String teaAddress) {
        this.teaAddress = teaAddress == null ? null : teaAddress.trim();
    }

    public Date getTeaBirthday() {
        return teaBirthday;
    }

    public void setTeaBirthday(Date teaBirthday) {
        this.teaBirthday = teaBirthday;
    }

    public Integer getTeaNationId() {
        return teaNationId;
    }

    public void setTeaNationId(Integer teaNationId) {
        this.teaNationId = teaNationId;
    }

    public String getTeaEmail() {
        return teaEmail;
    }

    public void setTeaEmail(String teaEmail) {
        this.teaEmail = teaEmail == null ? null : teaEmail.trim();
    }

    public Integer getTeaPartyMember() {
        return teaPartyMember;
    }

    public void setTeaPartyMember(Integer teaPartyMember) {
        this.teaPartyMember = teaPartyMember;
    }

    public String getTeaHobby() {
        return teaHobby;
    }

    public void setTeaHobby(String teaHobby) {
        this.teaHobby = teaHobby == null ? null : teaHobby.trim();
    }

    public String getTeaDesc() {
        return teaDesc;
    }

    public void setTeaDesc(String teaDesc) {
        this.teaDesc = teaDesc == null ? null : teaDesc.trim();
    }

    public Integer getTeaStatus() {
        return teaStatus;
    }

    public void setTeaStatus(Integer teaStatus) {
        this.teaStatus = teaStatus;
    }
}