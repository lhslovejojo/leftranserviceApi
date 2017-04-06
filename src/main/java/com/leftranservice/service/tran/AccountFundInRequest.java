package com.leftranservice.service.tran;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 账户充值
 * 
 * @author lihongsong
 *
 */
public class AccountFundInRequest extends CommonRequest {
	private String merchantId;// 商户号
	private String orderNo;// 商户订单号
	private String tradeNo;// 交易流水号
	private String oriTradeNo;// 原交易号
	private String tradeType;// 交易类型
	private String subTradeType;// 交易子类型
	private String payMethodCode;// 支付方式
	private String payToolsId;// 支付工具类型
	private String payGoodsId;// 支付产品编号
	private BigDecimal amount;// 支付金额
	private BigDecimal tradeAmount;// 交易金额
	private Date tradeDate;// 交易日期
	private String tradeDesc;// 交易说明
	private String paymentNo;// 支付服务流水
	private Date payReqTime;// 支付发起时间
	private Date payTime;// 支付成功时间
	private String cardType;// 卡类型
	private String channelType;// 通道类型，手工还是联机
	private String fundChannelCode;// 资金渠道编码，在资金渠道充值的情况下必填
	private String instMerId;// 资金渠道商户号，在资金渠道充值的情况下，该参数必填
	private String instTradeNo;// 资金渠道返回流水号，涉及资金渠道的情况下，该参数为了清算对账必填
	private String payOrderNo;// 资金渠道内部交易流水号，机构内部生成的支付订单号
	private String evidenceExt;// 凭证扩展，为前端保留扩展传递参数，专供凭证使用，json串格式
	private String evidenceDesc;// 凭证摘要，凭证摘要可以和交易摘要相同
	private String cutomerId;// 入款客户号
	private String cutomerAccountNo;// 入款客户账户号

	public AccountFundInRequest(String systemCode) {
		super(systemCode);
		// TODO Auto-generated constructor stub
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getOriTradeNo() {
		return oriTradeNo;
	}

	public void setOriTradeNo(String oriTradeNo) {
		this.oriTradeNo = oriTradeNo;
	}

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getSubTradeType() {
		return subTradeType;
	}

	public void setSubTradeType(String subTradeType) {
		this.subTradeType = subTradeType;
	}

	public String getPayMethodCode() {
		return payMethodCode;
	}

	public void setPayMethodCode(String payMethodCode) {
		this.payMethodCode = payMethodCode;
	}

	public String getPayToolsId() {
		return payToolsId;
	}

	public void setPayToolsId(String payToolsId) {
		this.payToolsId = payToolsId;
	}

	public String getPayGoodsId() {
		return payGoodsId;
	}

	public void setPayGoodsId(String payGoodsId) {
		this.payGoodsId = payGoodsId;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getTradeAmount() {
		return tradeAmount;
	}

	public void setTradeAmount(BigDecimal tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public Date getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(Date tradeDate) {
		this.tradeDate = tradeDate;
	}

	public String getTradeDesc() {
		return tradeDesc;
	}

	public void setTradeDesc(String tradeDesc) {
		this.tradeDesc = tradeDesc;
	}

	public String getPaymentNo() {
		return paymentNo;
	}

	public void setPaymentNo(String paymentNo) {
		this.paymentNo = paymentNo;
	}

	public Date getPayReqTime() {
		return payReqTime;
	}

	public void setPayReqTime(Date payReqTime) {
		this.payReqTime = payReqTime;
	}

	public Date getPayTime() {
		return payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getChannelType() {
		return channelType;
	}

	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public String getFundChannelCode() {
		return fundChannelCode;
	}

	public void setFundChannelCode(String fundChannelCode) {
		this.fundChannelCode = fundChannelCode;
	}

	public String getInstMerId() {
		return instMerId;
	}

	public void setInstMerId(String instMerId) {
		this.instMerId = instMerId;
	}

	public String getInstTradeNo() {
		return instTradeNo;
	}

	public void setInstTradeNo(String instTradeNo) {
		this.instTradeNo = instTradeNo;
	}

	public String getPayOrderNo() {
		return payOrderNo;
	}

	public void setPayOrderNo(String payOrderNo) {
		this.payOrderNo = payOrderNo;
	}

	public String getEvidenceExt() {
		return evidenceExt;
	}

	public void setEvidenceExt(String evidenceExt) {
		this.evidenceExt = evidenceExt;
	}

	public String getEvidenceDesc() {
		return evidenceDesc;
	}

	public void setEvidenceDesc(String evidenceDesc) {
		this.evidenceDesc = evidenceDesc;
	}

	public String getCutomerId() {
		return cutomerId;
	}

	public void setCutomerId(String cutomerId) {
		this.cutomerId = cutomerId;
	}

	public String getCutomerAccountNo() {
		return cutomerAccountNo;
	}

	public void setCutomerAccountNo(String cutomerAccountNo) {
		this.cutomerAccountNo = cutomerAccountNo;
	}

	@Override
	public String toString() {
		return "AccountFundInRequest [merchantId=" + merchantId + ", orderNo=" + orderNo + ", tradeNo=" + tradeNo
				+ ", oriTradeNo=" + oriTradeNo + ", tradeType=" + tradeType + ", subTradeType=" + subTradeType
				+ ", payMethodCode=" + payMethodCode + ", payToolsId=" + payToolsId + ", payGoodsId=" + payGoodsId
				+ ", amount=" + amount + ", tradeAmount=" + tradeAmount + ", tradeDate=" + tradeDate + ", tradeDesc="
				+ tradeDesc + ", paymentNo=" + paymentNo + ", payReqTime=" + payReqTime + ", payTime=" + payTime
				+ ", cardType=" + cardType + ", channelType=" + channelType + ", fundChannelCode=" + fundChannelCode
				+ ", instMerId=" + instMerId + ", instTradeNo=" + instTradeNo + ", payOrderNo=" + payOrderNo
				+ ", evidenceExt=" + evidenceExt + ", evidenceDesc=" + evidenceDesc + ", cutomerId=" + cutomerId
				+ ", cutomerAccountNo=" + cutomerAccountNo + "]";
	}

}
