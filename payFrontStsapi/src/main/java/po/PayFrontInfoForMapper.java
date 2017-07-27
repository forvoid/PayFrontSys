package po;

/**
 * Created by forvoid on 7/19/2017.
 */
public class PayFrontInfoForMapper {
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
        this.orgCode = orgCode;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
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
        this.sourceIp = sourceIp;
    }

    public String getNatedIp() {
        return natedIp;
    }

    public void setNatedIp(String natedIp) {
        this.natedIp = natedIp;
    }

    public String getReqAddr() {
        return reqAddr;
    }

    public void setReqAddr(String reqAddr) {
        this.reqAddr = reqAddr;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
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
        this.appType = appType;
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
        this.opCode = opCode;
    }

    public String getOpPasswd() {
        return opPasswd;
    }

    public void setOpPasswd(String opPasswd) {
        this.opPasswd = opPasswd;
    }

    @Override
    public String toString() {
        return "PayFrontInfoForMapper{" +
                "id=" + id +
                ", orgCode='" + orgCode + '\'' +
                ", orgName='" + orgName + '\'' +
                ", isFrontEnd=" + isFrontEnd +
                ", stateProcess=" + stateProcess +
                ", isSingleKey=" + isSingleKey +
                ", certType=" + certType +
                ", keyNo=" + keyNo +
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
                '}';
    }
}
