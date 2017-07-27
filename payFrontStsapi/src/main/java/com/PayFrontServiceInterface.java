package com;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import po.PayFrontInfo;

import java.util.List;

/**
 * Created by forvoid on 7/21/2017.
 */
@SuppressWarnings("serial")
public interface PayFrontServiceInterface extends java.io.Serializable{
//    PayFrontInfo getInfoById(int id);

    PayFrontInfo getInfoById(PayFrontInfo payFrontInfo);
    /**
     * 添加信息
     * */
    public int addInfo(PayFrontInfo payFrontInfo);

    /**
     * 更新信息
     * */
    public int updateInfo(PayFrontInfo payFrontInfo);
    /**
     * 删除
     * */
    public int deleteInfo(Integer id) ;

    /**
     * 查询数据总量
     * */
    public int findCountRows();
    /**
     * 根据列表查找
     * */
    public List<PayFrontInfo> findByPage(Integer page, Integer rows);
    /**
     * 根据id查找
     * */
    public PayFrontInfo findById(Integer id);

    /**
     * 根据机构编号查找
     * */
    public List<PayFrontInfo> findByCode(String code);

}
