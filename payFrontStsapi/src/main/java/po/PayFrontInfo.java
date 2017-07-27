package po;


import java.io.Serializable;
import java.util.Date;

public class PayFrontInfo implements Serializable {
    private Integer id;

    private String orgCode;

    private String orgName;

    private Integer isFrontEnd;

    private Integer stateProcess;

    private Integer isSingleKey;

    private Integer certType;

    private String keyNo;

    private Integer stratMaster;

    private String sourceIp;

    private String natedIp;

    private String reqAddr;

    private String serviceType;

    private Integer port;

    private Integer stratNetwork;

    private String appType;

    private Integer stateEnable;

    private String opCode;

    private String opPasswd;

    private Date insTime;

    private Date updTime;

    public PayFrontInfo() {
    }

    public PayFrontInfo(PayFrontInfoForMapper payFrontInfoForMapper) {
        this.id = payFrontInfoForMapper.getId();
        this.orgCode = payFrontInfoForMapper.getOrgCode();
        this.orgName = payFrontInfoForMapper.getOrgName();
        this.isFrontEnd = payFrontInfoForMapper.getIsFrontEnd();
        this.stateProcess = payFrontInfoForMapper.getStateProcess();
        this.isSingleKey = payFrontInfoForMapper.getIsSingleKey();
        this.certType = payFrontInfoForMapper.getCertType();
        this.keyNo = payFrontInfoForMapper.getKeyNo();
        this.stratMaster = payFrontInfoForMapper.getStratMaster();
        this.sourceIp = payFrontInfoForMapper.getSourceIp();
        this.natedIp = payFrontInfoForMapper.getNatedIp();
        this.reqAddr = payFrontInfoForMapper.getReqAddr();
        this.serviceType = payFrontInfoForMapper.getServiceType();
        this.port = payFrontInfoForMapper.getPort();
        this.stratNetwork = payFrontInfoForMapper.getStratNetwork();
        this.appType = payFrontInfoForMapper.getAppType();
        this.stateEnable = payFrontInfoForMapper.getStateEnable();
        this.opCode = payFrontInfoForMapper.getOpCode();
        this.opPasswd = payFrontInfoForMapper.getOpPasswd();
        this.insTime = new Date();
        this.updTime = new Date();

    }


    public static PayFrontInfo updatePayFrontInfo(PayFrontInfoForMapper payFrontInfoForMapper, PayFrontInfo payFrontInfo) {
        payFrontInfo.id = payFrontInfoForMapper.getId();
        payFrontInfo.orgCode = payFrontInfoForMapper.getOrgCode();
        payFrontInfo.orgName = payFrontInfoForMapper.getOrgName();
        payFrontInfo.isFrontEnd = payFrontInfoForMapper.getIsFrontEnd();
        payFrontInfo.stateProcess = payFrontInfoForMapper.getStateProcess();
        payFrontInfo.isSingleKey = payFrontInfoForMapper.getIsSingleKey();
        payFrontInfo.certType = payFrontInfoForMapper.getCertType();
        payFrontInfo.keyNo = payFrontInfoForMapper.getKeyNo();
        payFrontInfo.stratMaster = payFrontInfoForMapper.getStratMaster();
        payFrontInfo.sourceIp = payFrontInfoForMapper.getSourceIp();
        payFrontInfo.natedIp = payFrontInfoForMapper.getNatedIp();
        payFrontInfo.reqAddr = payFrontInfoForMapper.getReqAddr();
        payFrontInfo.serviceType = payFrontInfoForMapper.getServiceType();
        payFrontInfo.port = payFrontInfoForMapper.getPort();
        payFrontInfo.stratNetwork = payFrontInfoForMapper.getStratNetwork();
        payFrontInfo.appType = payFrontInfoForMapper.getAppType();
        payFrontInfo.stateEnable = payFrontInfoForMapper.getStateEnable();
        payFrontInfo.opCode = payFrontInfoForMapper.getOpCode();
        payFrontInfo.opPasswd = payFrontInfoForMapper.getOpPasswd();
        payFrontInfo.insTime = new Date();
        payFrontInfo.updTime = new Date();
        return payFrontInfo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public Integer getIsFrontEnd() {
        return isFrontEnd;
    }

    public void setIsFrontEnd(Integer isFrontEnd) {
        this.isFrontEnd = isFrontEnd;
    }

    public Integer getStateProcess() {
        return stateProcess;
    }

    public void setStateProcess(Integer stateProcess) {
        this.stateProcess = stateProcess;
    }

    public Integer getIsSingleKey() {
        return isSingleKey;
    }

    public void setIsSingleKey(Integer isSingleKey) {
        this.isSingleKey = isSingleKey;
    }

    public Integer getCertType() {
        return certType;
    }

    public void setCertType(Integer certType) {
        this.certType = certType;
    }

    public String getKeyNo() {
        return keyNo;
    }

    public void setKeyNo(String keyNo) {
        this.keyNo = keyNo;
    }

    public Integer getStratMaster() {
        return stratMaster;
    }

    public void setStratMaster(Integer stratMaster) {
        this.stratMaster = stratMaster;
    }

    public String getSourceIp() {
        return sourceIp;
    }

    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp == null ? null : sourceIp.trim();
    }

    public String getNatedIp() {
        return natedIp;
    }

    public void setNatedIp(String natedIp) {
        this.natedIp = natedIp == null ? null : natedIp.trim();
    }

    public String getReqAddr() {
        return reqAddr;
    }

    public void setReqAddr(String reqAddr) {
        this.reqAddr = reqAddr == null ? null : reqAddr.trim();
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType == null ? null : serviceType.trim();
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getStratNetwork() {
        return stratNetwork;
    }

    public void setStratNetwork(Integer stratNetwork) {
        this.stratNetwork = stratNetwork;
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType == null ? null : appType.trim();
    }

    public Integer getStateEnable() {
        return stateEnable;
    }

    public void setStateEnable(Integer stateEnable) {
        this.stateEnable = stateEnable;
    }

    public String getOpCode() {
        return opCode;
    }

    public void setOpCode(String opCode) {
        this.opCode = opCode == null ? null : opCode.trim();
    }

    public String getOpPasswd() {
        return opPasswd;
    }

    public void setOpPasswd(String opPasswd) {
        this.opPasswd = opPasswd == null ? null : opPasswd.trim();
    }

    public Date getInsTime() {
        return insTime;
    }

    public void setInsTime(Date insTime) {
        this.insTime = insTime;
    }

    public Date getUpdTime() {
        return updTime;
    }

    public void setUpdTime(Date updTime) {
        this.updTime = updTime;
    }

    @Override
    public String toString() {
        return "PayFrontInfo{" +
                "id=" + id +
                ", orgCode='" + orgCode + '\'' +
                ", orgName='" + orgName + '\'' +
                ", isFrontEnd=" + isFrontEnd +
                ", stateProcess=" + stateProcess +
                ", isSingleKey=" + isSingleKey +
                ", certType=" + certType +
                ", keyNo='" + keyNo + '\'' +
                ", stratMaster=" + stratMaster +
                ", sourceIp='" + sourceIp + '\'' +
                ", natedIp='" + natedIp + '\'' +
                ", reqAddr='" + reqAddr + '\'' +
                ", serviceType='" + serviceType + '\'' +
                ", port=" + port +
                ", stratNetwork=" + stratNetwork +
                ", appType='" + appType + '\'' +
                ", stateEnable=" + stateEnable +
                ", opCode='" + opCode + '\'' +
                ", opPasswd='" + opPasswd + '\'' +
                ", insTime=" + insTime +
                ", updTime=" + updTime +
                '}';
    }
}