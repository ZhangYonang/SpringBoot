package com.wuhu.meizubeans.pojo;

import java.util.Date;

public class TbOrders {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_orders.oid
     *
     * @mbg.generated Thu Jul 08 20:44:10 CST 2021
     */
    private Integer oid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_orders.createtime
     *
     * @mbg.generated Thu Jul 08 20:44:10 CST 2021
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_orders.totalprice
     *
     * @mbg.generated Thu Jul 08 20:44:10 CST 2021
     */
    private Double totalprice;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_orders.oid
     *
     * @return the value of tb_orders.oid
     *
     * @mbg.generated Thu Jul 08 20:44:10 CST 2021
     */
    public Integer getOid() {
        return oid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_orders.oid
     *
     * @param oid the value for tb_orders.oid
     *
     * @mbg.generated Thu Jul 08 20:44:10 CST 2021
     */
    public void setOid(Integer oid) {
        this.oid = oid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_orders.createtime
     *
     * @return the value of tb_orders.createtime
     *
     * @mbg.generated Thu Jul 08 20:44:10 CST 2021
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_orders.createtime
     *
     * @param createtime the value for tb_orders.createtime
     *
     * @mbg.generated Thu Jul 08 20:44:10 CST 2021
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_orders.totalprice
     *
     * @return the value of tb_orders.totalprice
     *
     * @mbg.generated Thu Jul 08 20:44:10 CST 2021
     */
    public Double getTotalprice() {
        return totalprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_orders.totalprice
     *
     * @param totalprice the value for tb_orders.totalprice
     *
     * @mbg.generated Thu Jul 08 20:44:10 CST 2021
     */
    public void setTotalprice(Double totalprice) {
        this.totalprice = totalprice;
    }
}