package com.fujian.marketgoods.pojo.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

/**
 * user_order
 * @author 
 */

@Component
public class UserOrder implements Serializable {
    /**
     * 订单id
     */
    private String orderId;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 订单总价
     */
    private Double allCost;

    /**
     * 订单创建时间
     */
    private Date createTime;

    /**
     * 订单支付时间
     */
    private Date payTime;

    /**
     * 收货手机号码
     */
    private String receiverPhone;

    /**
     * 收货名字
     */
    private String receiverName;

    /**
     * 收货地址
     */
    private String receiveAddress;

    /**
     * 支付类型：支付宝，微信，银行卡
     */
    private String payType;

    /**
     * 订单状态：已支付，待支付，待评价，待收货，取消订单
     */
    private String status;

    /**
     * 实际支付金额
     */
    private Double actualPayment;

    /**
     * 总减免
     */
    private Double totalDeduction;

    private static final long serialVersionUID = 1L;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Double getAllCost() {
        return allCost;
    }

    public void setAllCost(Double allCost) {
        this.allCost = allCost;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiveAddress() {
        return receiveAddress;
    }

    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getActualPayment() {
        return actualPayment;
    }

    public void setActualPayment(Double actualPayment) {
        this.actualPayment = actualPayment;
    }

    public Double getTotalDeduction() {
        return totalDeduction;
    }

    public void setTotalDeduction(Double totalDeduction) {
        this.totalDeduction = totalDeduction;
    }
}