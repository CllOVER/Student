package cn.cllover.administration.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

public class Roll {
    private Long rollId;

    private Long stuRollId;

    private String rollStudyingWay;  //就读方式

    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date rollStudyingDate;   //入学日期

    private String rollStudyingForm;  //入学方式

    private String rollStudyingSource;  //学生来源

    private String rollStatus;  //入学状态

    private Integer rollAcaId;

    private Integer rollGradeId;

    private Integer rollClassId;

    private Integer rollMajId;

    private Grade grade;

    private Sclass sclass;

    private Major major;

    private Students students;

    private Academy academy;

    public Academy getAcademy() {
        return academy;
    }

    public void setAcademy(Academy academy) {
        this.academy = academy;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Sclass getSclass() {
        return sclass;
    }

    public void setSclass(Sclass sclass) {
        this.sclass = sclass;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public Long getRollId() {
        return rollId;
    }

    public void setRollId(Long rollId) {
        this.rollId = rollId;
    }

    public Long getStuRollId() {
        return stuRollId;
    }

    public void setStuRollId(Long stuRollId) {
        this.stuRollId = stuRollId;
    }

    public String getRollStudyingWay() {
        return rollStudyingWay;
    }

    public void setRollStudyingWay(String rollStudyingWay) {
        this.rollStudyingWay = rollStudyingWay == null ? null : rollStudyingWay.trim();
    }

    public Date getRollStudyingDate() {
        return rollStudyingDate;
    }

    public void setRollStudyingDate(Date rollStudyingDate) {
        this.rollStudyingDate = rollStudyingDate;
    }

    public String getRollStudyingForm() {
        return rollStudyingForm;
    }

    public void setRollStudyingForm(String rollStudyingForm) {
        this.rollStudyingForm = rollStudyingForm == null ? null : rollStudyingForm.trim();
    }

    public String getRollStudyingSource() {
        return rollStudyingSource;
    }

    public void setRollStudyingSource(String rollStudyingSource) {
        this.rollStudyingSource = rollStudyingSource == null ? null : rollStudyingSource.trim();
    }

    public String getRollStatus() {
        return rollStatus;
    }

    public void setRollStatus(String rollStatus) {
        this.rollStatus = rollStatus == null ? null : rollStatus.trim();
    }

    public Integer getRollAcaId() {
        return rollAcaId;
    }

    public void setRollAcaId(Integer rollAcaId) {
        this.rollAcaId = rollAcaId;
    }

    public Integer getRollGradeId() {
        return rollGradeId;
    }

    public void setRollGradeId(Integer rollGradeId) {
        this.rollGradeId = rollGradeId;
    }

    public Integer getRollClassId() {
        return rollClassId;
    }

    public void setRollClassId(Integer rollClassId) {
        this.rollClassId = rollClassId;
    }

    public Integer getRollMajId() {
        return rollMajId;
    }

    public void setRollMajId(Integer rollMajId) {
        this.rollMajId = rollMajId;
    }
}