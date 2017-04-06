package com.leftranservice.service;

import com.leftranservice.service.tran.BalanceFrozenRequest;
import com.leftranservice.service.tran.ConCludeRequest;
import com.leftranservice.service.tran.DelegateRequest;
import com.leftranservice.service.tran.PositionRequest;
import com.leftranservice.service.tran.RechargeRequest;
import com.leftranservice.service.tran.SettlePriceRequest;
import com.leftranservice.service.tran.SettlementRequest;
import com.leftranservice.service.tran.TakeNowRequest;
import com.leftranservice.service.tran.TollRequest;
import com.leftranservice.service.tran.TranResponse;

/**
 * 交易类
 * 
 * @author qibo
 *
 */
public interface TxnService {
	/**
	 * 客户入金
	 * 
	 * @param request
	 * @return
	 */
	public TranResponse recharge(RechargeRequest request);

	/**
	 * 客户出金
	 * 
	 * @param request
	 * @return
	 */
	public TranResponse takeNow(TakeNowRequest request);

	/**
	 * 资金冻结解冻变动接口
	 * 
	 * @param request
	 * @return
	 */
	public TranResponse frozenBalance(BalanceFrozenRequest request);

	/**
	 * 客户委托单接口
	 * 
	 * @param request
	 * @return
	 */
	public TranResponse delegate(DelegateRequest request);

	/**
	 * 客户成交单接口
	 * 
	 * @param request
	 * @return
	 */
	public TranResponse conClude(ConCludeRequest request);

	/**
	 * 客户交割单接口
	 * 
	 * @param request
	 * @return
	 */
	public TranResponse settle(SettlementRequest request);

	/**
	 * 交易所收费单接口
	 * 
	 * @param request
	 * @return
	 */
	public TranResponse toll(TollRequest request);

	/**
	 * 日终持仓
	 * 
	 * @param request
	 * @return
	 */
	public TranResponse position(PositionRequest request);

	/**
	 * 更新结算价信息
	 * 
	 * @param request
	 * @return
	 */
	public TranResponse syncSettlePrice(SettlePriceRequest request);

}
