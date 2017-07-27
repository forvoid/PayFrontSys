package com.jiupai.payFrontSys.mybatis.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import po.PayFrontInfo;
import po.PayFrontInfoExample;

public interface PayFrontInfoMapper {
    long countByExample(PayFrontInfoExample example);


    int deleteByExample(PayFrontInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PayFrontInfo record);

    int insertSelective(PayFrontInfo record);

    int selectCount();

    List<PayFrontInfo> selectByExample(PayFrontInfoExample example);

    List<PayFrontInfo> selectByPage(@Param("page") Integer page, @Param("rows") Integer rows);

    List<PayFrontInfo> selectByCode(@Param("code") String code);

    PayFrontInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PayFrontInfo record, @Param("example") PayFrontInfoExample example);

    int updateByExample(@Param("record") PayFrontInfo record, @Param("example") PayFrontInfoExample example);

    int updateByPrimaryKeySelective(PayFrontInfo record);

    int updateByPrimaryKey(PayFrontInfo record);

//    int updateByPrimaryKeySelective(PayFrontInfo payFrontInfo);
}