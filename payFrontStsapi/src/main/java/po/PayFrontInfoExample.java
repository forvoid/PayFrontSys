package po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PayFrontInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayFrontInfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNull() {
            addCriterion("org_code is null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNotNull() {
            addCriterion("org_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeEqualTo(String value) {
            addCriterion("org_code =", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotEqualTo(String value) {
            addCriterion("org_code <>", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThan(String value) {
            addCriterion("org_code >", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("org_code >=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThan(String value) {
            addCriterion("org_code <", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("org_code <=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLike(String value) {
            addCriterion("org_code like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotLike(String value) {
            addCriterion("org_code not like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIn(List<String> values) {
            addCriterion("org_code in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotIn(List<String> values) {
            addCriterion("org_code not in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeBetween(String value1, String value2) {
            addCriterion("org_code between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotBetween(String value1, String value2) {
            addCriterion("org_code not between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNull() {
            addCriterion("org_name is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNotNull() {
            addCriterion("org_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEqualTo(String value) {
            addCriterion("org_name =", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotEqualTo(String value) {
            addCriterion("org_name <>", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThan(String value) {
            addCriterion("org_name >", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("org_name >=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThan(String value) {
            addCriterion("org_name <", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThanOrEqualTo(String value) {
            addCriterion("org_name <=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLike(String value) {
            addCriterion("org_name like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotLike(String value) {
            addCriterion("org_name not like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameIn(List<String> values) {
            addCriterion("org_name in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotIn(List<String> values) {
            addCriterion("org_name not in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameBetween(String value1, String value2) {
            addCriterion("org_name between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotBetween(String value1, String value2) {
            addCriterion("org_name not between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andIsFrontEndIsNull() {
            addCriterion("is_front_end is null");
            return (Criteria) this;
        }

        public Criteria andIsFrontEndIsNotNull() {
            addCriterion("is_front_end is not null");
            return (Criteria) this;
        }

        public Criteria andIsFrontEndEqualTo(Integer value) {
            addCriterion("is_front_end =", value, "isFrontEnd");
            return (Criteria) this;
        }

        public Criteria andIsFrontEndNotEqualTo(Integer value) {
            addCriterion("is_front_end <>", value, "isFrontEnd");
            return (Criteria) this;
        }

        public Criteria andIsFrontEndGreaterThan(Integer value) {
            addCriterion("is_front_end >", value, "isFrontEnd");
            return (Criteria) this;
        }

        public Criteria andIsFrontEndGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_front_end >=", value, "isFrontEnd");
            return (Criteria) this;
        }

        public Criteria andIsFrontEndLessThan(Integer value) {
            addCriterion("is_front_end <", value, "isFrontEnd");
            return (Criteria) this;
        }

        public Criteria andIsFrontEndLessThanOrEqualTo(Integer value) {
            addCriterion("is_front_end <=", value, "isFrontEnd");
            return (Criteria) this;
        }

        public Criteria andIsFrontEndIn(List<Integer> values) {
            addCriterion("is_front_end in", values, "isFrontEnd");
            return (Criteria) this;
        }

        public Criteria andIsFrontEndNotIn(List<Integer> values) {
            addCriterion("is_front_end not in", values, "isFrontEnd");
            return (Criteria) this;
        }

        public Criteria andIsFrontEndBetween(Integer value1, Integer value2) {
            addCriterion("is_front_end between", value1, value2, "isFrontEnd");
            return (Criteria) this;
        }

        public Criteria andIsFrontEndNotBetween(Integer value1, Integer value2) {
            addCriterion("is_front_end not between", value1, value2, "isFrontEnd");
            return (Criteria) this;
        }

        public Criteria andStateProcessIsNull() {
            addCriterion("state_process is null");
            return (Criteria) this;
        }

        public Criteria andStateProcessIsNotNull() {
            addCriterion("state_process is not null");
            return (Criteria) this;
        }

        public Criteria andStateProcessEqualTo(Integer value) {
            addCriterion("state_process =", value, "stateProcess");
            return (Criteria) this;
        }

        public Criteria andStateProcessNotEqualTo(Integer value) {
            addCriterion("state_process <>", value, "stateProcess");
            return (Criteria) this;
        }

        public Criteria andStateProcessGreaterThan(Integer value) {
            addCriterion("state_process >", value, "stateProcess");
            return (Criteria) this;
        }

        public Criteria andStateProcessGreaterThanOrEqualTo(Integer value) {
            addCriterion("state_process >=", value, "stateProcess");
            return (Criteria) this;
        }

        public Criteria andStateProcessLessThan(Integer value) {
            addCriterion("state_process <", value, "stateProcess");
            return (Criteria) this;
        }

        public Criteria andStateProcessLessThanOrEqualTo(Integer value) {
            addCriterion("state_process <=", value, "stateProcess");
            return (Criteria) this;
        }

        public Criteria andStateProcessIn(List<Integer> values) {
            addCriterion("state_process in", values, "stateProcess");
            return (Criteria) this;
        }

        public Criteria andStateProcessNotIn(List<Integer> values) {
            addCriterion("state_process not in", values, "stateProcess");
            return (Criteria) this;
        }

        public Criteria andStateProcessBetween(Integer value1, Integer value2) {
            addCriterion("state_process between", value1, value2, "stateProcess");
            return (Criteria) this;
        }

        public Criteria andStateProcessNotBetween(Integer value1, Integer value2) {
            addCriterion("state_process not between", value1, value2, "stateProcess");
            return (Criteria) this;
        }

        public Criteria andIsSingleKeyIsNull() {
            addCriterion("is_single_key is null");
            return (Criteria) this;
        }

        public Criteria andIsSingleKeyIsNotNull() {
            addCriterion("is_single_key is not null");
            return (Criteria) this;
        }

        public Criteria andIsSingleKeyEqualTo(Integer value) {
            addCriterion("is_single_key =", value, "isSingleKey");
            return (Criteria) this;
        }

        public Criteria andIsSingleKeyNotEqualTo(Integer value) {
            addCriterion("is_single_key <>", value, "isSingleKey");
            return (Criteria) this;
        }

        public Criteria andIsSingleKeyGreaterThan(Integer value) {
            addCriterion("is_single_key >", value, "isSingleKey");
            return (Criteria) this;
        }

        public Criteria andIsSingleKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_single_key >=", value, "isSingleKey");
            return (Criteria) this;
        }

        public Criteria andIsSingleKeyLessThan(Integer value) {
            addCriterion("is_single_key <", value, "isSingleKey");
            return (Criteria) this;
        }

        public Criteria andIsSingleKeyLessThanOrEqualTo(Integer value) {
            addCriterion("is_single_key <=", value, "isSingleKey");
            return (Criteria) this;
        }

        public Criteria andIsSingleKeyIn(List<Integer> values) {
            addCriterion("is_single_key in", values, "isSingleKey");
            return (Criteria) this;
        }

        public Criteria andIsSingleKeyNotIn(List<Integer> values) {
            addCriterion("is_single_key not in", values, "isSingleKey");
            return (Criteria) this;
        }

        public Criteria andIsSingleKeyBetween(Integer value1, Integer value2) {
            addCriterion("is_single_key between", value1, value2, "isSingleKey");
            return (Criteria) this;
        }

        public Criteria andIsSingleKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("is_single_key not between", value1, value2, "isSingleKey");
            return (Criteria) this;
        }

        public Criteria andCertTypeIsNull() {
            addCriterion("cert_type is null");
            return (Criteria) this;
        }

        public Criteria andCertTypeIsNotNull() {
            addCriterion("cert_type is not null");
            return (Criteria) this;
        }

        public Criteria andCertTypeEqualTo(Integer value) {
            addCriterion("cert_type =", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotEqualTo(Integer value) {
            addCriterion("cert_type <>", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeGreaterThan(Integer value) {
            addCriterion("cert_type >", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cert_type >=", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLessThan(Integer value) {
            addCriterion("cert_type <", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLessThanOrEqualTo(Integer value) {
            addCriterion("cert_type <=", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeIn(List<Integer> values) {
            addCriterion("cert_type in", values, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotIn(List<Integer> values) {
            addCriterion("cert_type not in", values, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeBetween(Integer value1, Integer value2) {
            addCriterion("cert_type between", value1, value2, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("cert_type not between", value1, value2, "certType");
            return (Criteria) this;
        }

        public Criteria andKeyNoIsNull() {
            addCriterion("key_no is null");
            return (Criteria) this;
        }

        public Criteria andKeyNoIsNotNull() {
            addCriterion("key_no is not null");
            return (Criteria) this;
        }

        public Criteria andKeyNoEqualTo(Integer value) {
            addCriterion("key_no =", value, "keyNo");
            return (Criteria) this;
        }

        public Criteria andKeyNoNotEqualTo(Integer value) {
            addCriterion("key_no <>", value, "keyNo");
            return (Criteria) this;
        }

        public Criteria andKeyNoGreaterThan(Integer value) {
            addCriterion("key_no >", value, "keyNo");
            return (Criteria) this;
        }

        public Criteria andKeyNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("key_no >=", value, "keyNo");
            return (Criteria) this;
        }

        public Criteria andKeyNoLessThan(Integer value) {
            addCriterion("key_no <", value, "keyNo");
            return (Criteria) this;
        }

        public Criteria andKeyNoLessThanOrEqualTo(Integer value) {
            addCriterion("key_no <=", value, "keyNo");
            return (Criteria) this;
        }

        public Criteria andKeyNoIn(List<Integer> values) {
            addCriterion("key_no in", values, "keyNo");
            return (Criteria) this;
        }

        public Criteria andKeyNoNotIn(List<Integer> values) {
            addCriterion("key_no not in", values, "keyNo");
            return (Criteria) this;
        }

        public Criteria andKeyNoBetween(Integer value1, Integer value2) {
            addCriterion("key_no between", value1, value2, "keyNo");
            return (Criteria) this;
        }

        public Criteria andKeyNoNotBetween(Integer value1, Integer value2) {
            addCriterion("key_no not between", value1, value2, "keyNo");
            return (Criteria) this;
        }

        public Criteria andStratMasterIsNull() {
            addCriterion("strat_master is null");
            return (Criteria) this;
        }

        public Criteria andStratMasterIsNotNull() {
            addCriterion("strat_master is not null");
            return (Criteria) this;
        }

        public Criteria andStratMasterEqualTo(Integer value) {
            addCriterion("strat_master =", value, "stratMaster");
            return (Criteria) this;
        }

        public Criteria andStratMasterNotEqualTo(Integer value) {
            addCriterion("strat_master <>", value, "stratMaster");
            return (Criteria) this;
        }

        public Criteria andStratMasterGreaterThan(Integer value) {
            addCriterion("strat_master >", value, "stratMaster");
            return (Criteria) this;
        }

        public Criteria andStratMasterGreaterThanOrEqualTo(Integer value) {
            addCriterion("strat_master >=", value, "stratMaster");
            return (Criteria) this;
        }

        public Criteria andStratMasterLessThan(Integer value) {
            addCriterion("strat_master <", value, "stratMaster");
            return (Criteria) this;
        }

        public Criteria andStratMasterLessThanOrEqualTo(Integer value) {
            addCriterion("strat_master <=", value, "stratMaster");
            return (Criteria) this;
        }

        public Criteria andStratMasterIn(List<Integer> values) {
            addCriterion("strat_master in", values, "stratMaster");
            return (Criteria) this;
        }

        public Criteria andStratMasterNotIn(List<Integer> values) {
            addCriterion("strat_master not in", values, "stratMaster");
            return (Criteria) this;
        }

        public Criteria andStratMasterBetween(Integer value1, Integer value2) {
            addCriterion("strat_master between", value1, value2, "stratMaster");
            return (Criteria) this;
        }

        public Criteria andStratMasterNotBetween(Integer value1, Integer value2) {
            addCriterion("strat_master not between", value1, value2, "stratMaster");
            return (Criteria) this;
        }

        public Criteria andSourceIpIsNull() {
            addCriterion("source_ip is null");
            return (Criteria) this;
        }

        public Criteria andSourceIpIsNotNull() {
            addCriterion("source_ip is not null");
            return (Criteria) this;
        }

        public Criteria andSourceIpEqualTo(String value) {
            addCriterion("source_ip =", value, "sourceIp");
            return (Criteria) this;
        }

        public Criteria andSourceIpNotEqualTo(String value) {
            addCriterion("source_ip <>", value, "sourceIp");
            return (Criteria) this;
        }

        public Criteria andSourceIpGreaterThan(String value) {
            addCriterion("source_ip >", value, "sourceIp");
            return (Criteria) this;
        }

        public Criteria andSourceIpGreaterThanOrEqualTo(String value) {
            addCriterion("source_ip >=", value, "sourceIp");
            return (Criteria) this;
        }

        public Criteria andSourceIpLessThan(String value) {
            addCriterion("source_ip <", value, "sourceIp");
            return (Criteria) this;
        }

        public Criteria andSourceIpLessThanOrEqualTo(String value) {
            addCriterion("source_ip <=", value, "sourceIp");
            return (Criteria) this;
        }

        public Criteria andSourceIpLike(String value) {
            addCriterion("source_ip like", value, "sourceIp");
            return (Criteria) this;
        }

        public Criteria andSourceIpNotLike(String value) {
            addCriterion("source_ip not like", value, "sourceIp");
            return (Criteria) this;
        }

        public Criteria andSourceIpIn(List<String> values) {
            addCriterion("source_ip in", values, "sourceIp");
            return (Criteria) this;
        }

        public Criteria andSourceIpNotIn(List<String> values) {
            addCriterion("source_ip not in", values, "sourceIp");
            return (Criteria) this;
        }

        public Criteria andSourceIpBetween(String value1, String value2) {
            addCriterion("source_ip between", value1, value2, "sourceIp");
            return (Criteria) this;
        }

        public Criteria andSourceIpNotBetween(String value1, String value2) {
            addCriterion("source_ip not between", value1, value2, "sourceIp");
            return (Criteria) this;
        }

        public Criteria andNatedIpIsNull() {
            addCriterion("nated_ip is null");
            return (Criteria) this;
        }

        public Criteria andNatedIpIsNotNull() {
            addCriterion("nated_ip is not null");
            return (Criteria) this;
        }

        public Criteria andNatedIpEqualTo(String value) {
            addCriterion("nated_ip =", value, "natedIp");
            return (Criteria) this;
        }

        public Criteria andNatedIpNotEqualTo(String value) {
            addCriterion("nated_ip <>", value, "natedIp");
            return (Criteria) this;
        }

        public Criteria andNatedIpGreaterThan(String value) {
            addCriterion("nated_ip >", value, "natedIp");
            return (Criteria) this;
        }

        public Criteria andNatedIpGreaterThanOrEqualTo(String value) {
            addCriterion("nated_ip >=", value, "natedIp");
            return (Criteria) this;
        }

        public Criteria andNatedIpLessThan(String value) {
            addCriterion("nated_ip <", value, "natedIp");
            return (Criteria) this;
        }

        public Criteria andNatedIpLessThanOrEqualTo(String value) {
            addCriterion("nated_ip <=", value, "natedIp");
            return (Criteria) this;
        }

        public Criteria andNatedIpLike(String value) {
            addCriterion("nated_ip like", value, "natedIp");
            return (Criteria) this;
        }

        public Criteria andNatedIpNotLike(String value) {
            addCriterion("nated_ip not like", value, "natedIp");
            return (Criteria) this;
        }

        public Criteria andNatedIpIn(List<String> values) {
            addCriterion("nated_ip in", values, "natedIp");
            return (Criteria) this;
        }

        public Criteria andNatedIpNotIn(List<String> values) {
            addCriterion("nated_ip not in", values, "natedIp");
            return (Criteria) this;
        }

        public Criteria andNatedIpBetween(String value1, String value2) {
            addCriterion("nated_ip between", value1, value2, "natedIp");
            return (Criteria) this;
        }

        public Criteria andNatedIpNotBetween(String value1, String value2) {
            addCriterion("nated_ip not between", value1, value2, "natedIp");
            return (Criteria) this;
        }

        public Criteria andReqAddrIsNull() {
            addCriterion("req_addr is null");
            return (Criteria) this;
        }

        public Criteria andReqAddrIsNotNull() {
            addCriterion("req_addr is not null");
            return (Criteria) this;
        }

        public Criteria andReqAddrEqualTo(String value) {
            addCriterion("req_addr =", value, "reqAddr");
            return (Criteria) this;
        }

        public Criteria andReqAddrNotEqualTo(String value) {
            addCriterion("req_addr <>", value, "reqAddr");
            return (Criteria) this;
        }

        public Criteria andReqAddrGreaterThan(String value) {
            addCriterion("req_addr >", value, "reqAddr");
            return (Criteria) this;
        }

        public Criteria andReqAddrGreaterThanOrEqualTo(String value) {
            addCriterion("req_addr >=", value, "reqAddr");
            return (Criteria) this;
        }

        public Criteria andReqAddrLessThan(String value) {
            addCriterion("req_addr <", value, "reqAddr");
            return (Criteria) this;
        }

        public Criteria andReqAddrLessThanOrEqualTo(String value) {
            addCriterion("req_addr <=", value, "reqAddr");
            return (Criteria) this;
        }

        public Criteria andReqAddrLike(String value) {
            addCriterion("req_addr like", value, "reqAddr");
            return (Criteria) this;
        }

        public Criteria andReqAddrNotLike(String value) {
            addCriterion("req_addr not like", value, "reqAddr");
            return (Criteria) this;
        }

        public Criteria andReqAddrIn(List<String> values) {
            addCriterion("req_addr in", values, "reqAddr");
            return (Criteria) this;
        }

        public Criteria andReqAddrNotIn(List<String> values) {
            addCriterion("req_addr not in", values, "reqAddr");
            return (Criteria) this;
        }

        public Criteria andReqAddrBetween(String value1, String value2) {
            addCriterion("req_addr between", value1, value2, "reqAddr");
            return (Criteria) this;
        }

        public Criteria andReqAddrNotBetween(String value1, String value2) {
            addCriterion("req_addr not between", value1, value2, "reqAddr");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIsNull() {
            addCriterion("service_type is null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIsNotNull() {
            addCriterion("service_type is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeEqualTo(String value) {
            addCriterion("service_type =", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotEqualTo(String value) {
            addCriterion("service_type <>", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeGreaterThan(String value) {
            addCriterion("service_type >", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("service_type >=", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLessThan(String value) {
            addCriterion("service_type <", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLessThanOrEqualTo(String value) {
            addCriterion("service_type <=", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLike(String value) {
            addCriterion("service_type like", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotLike(String value) {
            addCriterion("service_type not like", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIn(List<String> values) {
            addCriterion("service_type in", values, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotIn(List<String> values) {
            addCriterion("service_type not in", values, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeBetween(String value1, String value2) {
            addCriterion("service_type between", value1, value2, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotBetween(String value1, String value2) {
            addCriterion("service_type not between", value1, value2, "serviceType");
            return (Criteria) this;
        }

        public Criteria andPortIsNull() {
            addCriterion("port is null");
            return (Criteria) this;
        }

        public Criteria andPortIsNotNull() {
            addCriterion("port is not null");
            return (Criteria) this;
        }

        public Criteria andPortEqualTo(Integer value) {
            addCriterion("port =", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotEqualTo(Integer value) {
            addCriterion("port <>", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThan(Integer value) {
            addCriterion("port >", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("port >=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThan(Integer value) {
            addCriterion("port <", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThanOrEqualTo(Integer value) {
            addCriterion("port <=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortIn(List<Integer> values) {
            addCriterion("port in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotIn(List<Integer> values) {
            addCriterion("port not in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortBetween(Integer value1, Integer value2) {
            addCriterion("port between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotBetween(Integer value1, Integer value2) {
            addCriterion("port not between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andStratNetworkIsNull() {
            addCriterion("strat_network is null");
            return (Criteria) this;
        }

        public Criteria andStratNetworkIsNotNull() {
            addCriterion("strat_network is not null");
            return (Criteria) this;
        }

        public Criteria andStratNetworkEqualTo(Integer value) {
            addCriterion("strat_network =", value, "stratNetwork");
            return (Criteria) this;
        }

        public Criteria andStratNetworkNotEqualTo(Integer value) {
            addCriterion("strat_network <>", value, "stratNetwork");
            return (Criteria) this;
        }

        public Criteria andStratNetworkGreaterThan(Integer value) {
            addCriterion("strat_network >", value, "stratNetwork");
            return (Criteria) this;
        }

        public Criteria andStratNetworkGreaterThanOrEqualTo(Integer value) {
            addCriterion("strat_network >=", value, "stratNetwork");
            return (Criteria) this;
        }

        public Criteria andStratNetworkLessThan(Integer value) {
            addCriterion("strat_network <", value, "stratNetwork");
            return (Criteria) this;
        }

        public Criteria andStratNetworkLessThanOrEqualTo(Integer value) {
            addCriterion("strat_network <=", value, "stratNetwork");
            return (Criteria) this;
        }

        public Criteria andStratNetworkIn(List<Integer> values) {
            addCriterion("strat_network in", values, "stratNetwork");
            return (Criteria) this;
        }

        public Criteria andStratNetworkNotIn(List<Integer> values) {
            addCriterion("strat_network not in", values, "stratNetwork");
            return (Criteria) this;
        }

        public Criteria andStratNetworkBetween(Integer value1, Integer value2) {
            addCriterion("strat_network between", value1, value2, "stratNetwork");
            return (Criteria) this;
        }

        public Criteria andStratNetworkNotBetween(Integer value1, Integer value2) {
            addCriterion("strat_network not between", value1, value2, "stratNetwork");
            return (Criteria) this;
        }

        public Criteria andAppTypeIsNull() {
            addCriterion("app_type is null");
            return (Criteria) this;
        }

        public Criteria andAppTypeIsNotNull() {
            addCriterion("app_type is not null");
            return (Criteria) this;
        }

        public Criteria andAppTypeEqualTo(String value) {
            addCriterion("app_type =", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeNotEqualTo(String value) {
            addCriterion("app_type <>", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeGreaterThan(String value) {
            addCriterion("app_type >", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeGreaterThanOrEqualTo(String value) {
            addCriterion("app_type >=", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeLessThan(String value) {
            addCriterion("app_type <", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeLessThanOrEqualTo(String value) {
            addCriterion("app_type <=", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeLike(String value) {
            addCriterion("app_type like", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeNotLike(String value) {
            addCriterion("app_type not like", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeIn(List<String> values) {
            addCriterion("app_type in", values, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeNotIn(List<String> values) {
            addCriterion("app_type not in", values, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeBetween(String value1, String value2) {
            addCriterion("app_type between", value1, value2, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeNotBetween(String value1, String value2) {
            addCriterion("app_type not between", value1, value2, "appType");
            return (Criteria) this;
        }

        public Criteria andStateEnableIsNull() {
            addCriterion("state_enable is null");
            return (Criteria) this;
        }

        public Criteria andStateEnableIsNotNull() {
            addCriterion("state_enable is not null");
            return (Criteria) this;
        }

        public Criteria andStateEnableEqualTo(Integer value) {
            addCriterion("state_enable =", value, "stateEnable");
            return (Criteria) this;
        }

        public Criteria andStateEnableNotEqualTo(Integer value) {
            addCriterion("state_enable <>", value, "stateEnable");
            return (Criteria) this;
        }

        public Criteria andStateEnableGreaterThan(Integer value) {
            addCriterion("state_enable >", value, "stateEnable");
            return (Criteria) this;
        }

        public Criteria andStateEnableGreaterThanOrEqualTo(Integer value) {
            addCriterion("state_enable >=", value, "stateEnable");
            return (Criteria) this;
        }

        public Criteria andStateEnableLessThan(Integer value) {
            addCriterion("state_enable <", value, "stateEnable");
            return (Criteria) this;
        }

        public Criteria andStateEnableLessThanOrEqualTo(Integer value) {
            addCriterion("state_enable <=", value, "stateEnable");
            return (Criteria) this;
        }

        public Criteria andStateEnableIn(List<Integer> values) {
            addCriterion("state_enable in", values, "stateEnable");
            return (Criteria) this;
        }

        public Criteria andStateEnableNotIn(List<Integer> values) {
            addCriterion("state_enable not in", values, "stateEnable");
            return (Criteria) this;
        }

        public Criteria andStateEnableBetween(Integer value1, Integer value2) {
            addCriterion("state_enable between", value1, value2, "stateEnable");
            return (Criteria) this;
        }

        public Criteria andStateEnableNotBetween(Integer value1, Integer value2) {
            addCriterion("state_enable not between", value1, value2, "stateEnable");
            return (Criteria) this;
        }

        public Criteria andOpCodeIsNull() {
            addCriterion("op_code is null");
            return (Criteria) this;
        }

        public Criteria andOpCodeIsNotNull() {
            addCriterion("op_code is not null");
            return (Criteria) this;
        }

        public Criteria andOpCodeEqualTo(String value) {
            addCriterion("op_code =", value, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeNotEqualTo(String value) {
            addCriterion("op_code <>", value, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeGreaterThan(String value) {
            addCriterion("op_code >", value, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeGreaterThanOrEqualTo(String value) {
            addCriterion("op_code >=", value, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeLessThan(String value) {
            addCriterion("op_code <", value, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeLessThanOrEqualTo(String value) {
            addCriterion("op_code <=", value, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeLike(String value) {
            addCriterion("op_code like", value, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeNotLike(String value) {
            addCriterion("op_code not like", value, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeIn(List<String> values) {
            addCriterion("op_code in", values, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeNotIn(List<String> values) {
            addCriterion("op_code not in", values, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeBetween(String value1, String value2) {
            addCriterion("op_code between", value1, value2, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeNotBetween(String value1, String value2) {
            addCriterion("op_code not between", value1, value2, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpPasswdIsNull() {
            addCriterion("op_passwd is null");
            return (Criteria) this;
        }

        public Criteria andOpPasswdIsNotNull() {
            addCriterion("op_passwd is not null");
            return (Criteria) this;
        }

        public Criteria andOpPasswdEqualTo(String value) {
            addCriterion("op_passwd =", value, "opPasswd");
            return (Criteria) this;
        }

        public Criteria andOpPasswdNotEqualTo(String value) {
            addCriterion("op_passwd <>", value, "opPasswd");
            return (Criteria) this;
        }

        public Criteria andOpPasswdGreaterThan(String value) {
            addCriterion("op_passwd >", value, "opPasswd");
            return (Criteria) this;
        }

        public Criteria andOpPasswdGreaterThanOrEqualTo(String value) {
            addCriterion("op_passwd >=", value, "opPasswd");
            return (Criteria) this;
        }

        public Criteria andOpPasswdLessThan(String value) {
            addCriterion("op_passwd <", value, "opPasswd");
            return (Criteria) this;
        }

        public Criteria andOpPasswdLessThanOrEqualTo(String value) {
            addCriterion("op_passwd <=", value, "opPasswd");
            return (Criteria) this;
        }

        public Criteria andOpPasswdLike(String value) {
            addCriterion("op_passwd like", value, "opPasswd");
            return (Criteria) this;
        }

        public Criteria andOpPasswdNotLike(String value) {
            addCriterion("op_passwd not like", value, "opPasswd");
            return (Criteria) this;
        }

        public Criteria andOpPasswdIn(List<String> values) {
            addCriterion("op_passwd in", values, "opPasswd");
            return (Criteria) this;
        }

        public Criteria andOpPasswdNotIn(List<String> values) {
            addCriterion("op_passwd not in", values, "opPasswd");
            return (Criteria) this;
        }

        public Criteria andOpPasswdBetween(String value1, String value2) {
            addCriterion("op_passwd between", value1, value2, "opPasswd");
            return (Criteria) this;
        }

        public Criteria andOpPasswdNotBetween(String value1, String value2) {
            addCriterion("op_passwd not between", value1, value2, "opPasswd");
            return (Criteria) this;
        }

        public Criteria andInsTimeIsNull() {
            addCriterion("ins_time is null");
            return (Criteria) this;
        }

        public Criteria andInsTimeIsNotNull() {
            addCriterion("ins_time is not null");
            return (Criteria) this;
        }

        public Criteria andInsTimeEqualTo(Date value) {
            addCriterion("ins_time =", value, "insTime");
            return (Criteria) this;
        }

        public Criteria andInsTimeNotEqualTo(Date value) {
            addCriterion("ins_time <>", value, "insTime");
            return (Criteria) this;
        }

        public Criteria andInsTimeGreaterThan(Date value) {
            addCriterion("ins_time >", value, "insTime");
            return (Criteria) this;
        }

        public Criteria andInsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ins_time >=", value, "insTime");
            return (Criteria) this;
        }

        public Criteria andInsTimeLessThan(Date value) {
            addCriterion("ins_time <", value, "insTime");
            return (Criteria) this;
        }

        public Criteria andInsTimeLessThanOrEqualTo(Date value) {
            addCriterion("ins_time <=", value, "insTime");
            return (Criteria) this;
        }

        public Criteria andInsTimeIn(List<Date> values) {
            addCriterion("ins_time in", values, "insTime");
            return (Criteria) this;
        }

        public Criteria andInsTimeNotIn(List<Date> values) {
            addCriterion("ins_time not in", values, "insTime");
            return (Criteria) this;
        }

        public Criteria andInsTimeBetween(Date value1, Date value2) {
            addCriterion("ins_time between", value1, value2, "insTime");
            return (Criteria) this;
        }

        public Criteria andInsTimeNotBetween(Date value1, Date value2) {
            addCriterion("ins_time not between", value1, value2, "insTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIsNull() {
            addCriterion("upd_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIsNotNull() {
            addCriterion("upd_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdTimeEqualTo(Date value) {
            addCriterion("upd_time =", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotEqualTo(Date value) {
            addCriterion("upd_time <>", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThan(Date value) {
            addCriterion("upd_time >", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("upd_time >=", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThan(Date value) {
            addCriterion("upd_time <", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThanOrEqualTo(Date value) {
            addCriterion("upd_time <=", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIn(List<Date> values) {
            addCriterion("upd_time in", values, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotIn(List<Date> values) {
            addCriterion("upd_time not in", values, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeBetween(Date value1, Date value2) {
            addCriterion("upd_time between", value1, value2, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotBetween(Date value1, Date value2) {
            addCriterion("upd_time not between", value1, value2, "updTime");
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