package com.jiupai.payFrontSys.service;

import com.jiupai.payFrontSys.mybatis.mapper.PayFrontInfoMapper;

import javax.annotation.Resource;
import java.util.List;
import com.PayFrontServiceInterface;
import po.PayFrontInfo;

/**
 * Created by forvoid on 7/18/2017.
 */

public class PayFrontService implements PayFrontServiceInterface , java.io.Serializable{
    @Resource
    private PayFrontInfoMapper payFrontInfoMapper;



    /**
     * 查找信息
     * */
//    public PayFrontInfo getInfoById(int id){
//        System.out.println("进入这里了");
//        return payFrontInfoMapper.selectByPrimaryKey(id);
//    }

    @Override
    public PayFrontInfo getInfoById(PayFrontInfo payFrontInfo) {
        System.out.println("进入这里了");
        return payFrontInfoMapper.selectByPrimaryKey(payFrontInfo.getId());
    }


    /**
     * 添加信息
     * */
    public int addInfo(PayFrontInfo payFrontInfo) {
        return payFrontInfoMapper.insertSelective(payFrontInfo);
    }

    /**
     * 更新信息
     * */
    public int updateInfo(PayFrontInfo payFrontInfo){
        return payFrontInfoMapper.updateByPrimaryKeySelective(payFrontInfo);
    }


    /**
     * 删除
     * */
    public int deleteInfo(Integer id) {
        return payFrontInfoMapper.deleteByPrimaryKey(id);
    }

    /**
     * 查询数据总量
     * */
    public int findCountRows(){
        return payFrontInfoMapper.selectCount();
    }
    /**
     * 根据列表查找
     * */
    public List<PayFrontInfo> findByPage(Integer page, Integer rows) {
        return payFrontInfoMapper.selectByPage(page, rows);
    }
    /**
     * 根据id查找
     * */
    public PayFrontInfo findById(Integer id) {
        return payFrontInfoMapper.selectByPrimaryKey(id);
    }

    /**
     * 根据机构编号查找
     * */
    public List<PayFrontInfo> findByCode(String code) {
        return payFrontInfoMapper.selectByCode(code);
    }
}
