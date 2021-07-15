package com.wuhu.meizujdbc.dao;

import com.wuhu.meizubeans.pojo.TbShopping;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TbShoppingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_shopping
     *
     * @mbg.generated Thu Jul 08 20:44:10 CST 2021
     */
    int deleteByPrimaryKey(Integer sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_shopping
     *
     * @mbg.generated Thu Jul 08 20:44:10 CST 2021
     */
    int insert(TbShopping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_shopping
     *
     * @mbg.generated Thu Jul 08 20:44:10 CST 2021
     */
    TbShopping selectByPrimaryKey(Integer sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_shopping
     *
     * @mbg.generated Thu Jul 08 20:44:10 CST 2021
     */
    List<TbShopping> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_shopping
     *
     * @mbg.generated Thu Jul 08 20:44:10 CST 2021
     */
    int updateByPrimaryKey(TbShopping record);

    TbShopping getShoppingByPid(Integer pid);

    void updateShoppingNum(TbShopping shoppingResult);
}