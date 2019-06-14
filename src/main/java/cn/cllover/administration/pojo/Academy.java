package cn.cllover.administration.pojo;

public class Academy {
    private Integer acaId;

    private String acaName;

    private String acaDesc;

    public Integer getAcaId() {
        return acaId;
    }

    public void setAcaId(Integer acaId) {
        this.acaId = acaId;
    }

    public String getAcaName() {
        return acaName;
    }

    public void setAcaName(String acaName) {
        this.acaName = acaName == null ? null : acaName.trim();
    }

    public String getAcaDesc() {
        return acaDesc;
    }

    public void setAcaDesc(String acaDesc) {
        this.acaDesc = acaDesc == null ? null : acaDesc.trim();
    }
}