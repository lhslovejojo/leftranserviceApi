package com.leftranservice.service;

import java.util.List;

import com.leftranservice.service.page.PageResponse;
import com.leftranservice.service.query.AllBalanceResponse;
import com.leftranservice.service.query.BalanceResponse;
import com.leftranservice.service.query.DepositHisRequest;
import com.leftranservice.service.query.DepositHisResponse;
import com.leftranservice.service.query.FundChangeRequest;
import com.leftranservice.service.query.FundChangeResponse;
import com.leftranservice.service.query.TradeRequest;
import com.leftranservice.service.query.TradeResponse;
import com.leftranservice.service.query.UserRequest;
import com.leftranservice.service.query.UserResponse;
import com.leftranservice.service.query.domain.PositionResponse;

/**
 * 客户注册相关
 * 
 * @author qibo
 *
 */
public interface QueryService {
	/**
	 * 根据交易所编码、商编、商户名称、资金账号，查询一个账号
	 */
	public UserResponse getUserByMemCode(String memCode);

	/**
	 * 根据交易所编码、商编、商户名称、资金账号，查询多个账号
	 */
	public PageResponse<UserResponse> queryUser(UserRequest request);

	/**
	 * 交易凭证查询
	 * 
	 * @param request
	 * @return
	 */
	public PageResponse<TradeResponse> queryTrade(TradeRequest request);

	/**
	 * 资金账户余额查询
	 * 
	 * @param request
	 * @return
	 */
	public BalanceResponse queryBal(String exchangeId, String memCode);

	/**
	 * 余额变动历史查询
	 * 
	 * @param request
	 * @return
	 */
	public PageResponse<FundChangeResponse> queryFund(FundChangeRequest request);

	/**
	 * 总资产查询
	 * 
	 * @param request
	 * @return
	 */
	public AllBalanceResponse queryAllBal(String exchangeId, String memCode);

	/**
	 * 持仓历史查询
	 * 
	 * @param request
	 * @return
	 */
	public DepositHisResponse syncBankInfo(DepositHisRequest request);

	/**
	 * 查询持仓信息
	 * 
	 * @param exchangeId
	 * @param memCode
	 * @param productCode
	 * @return
	 */
	List<PositionResponse> queryPositionAsset(String exchangeId, String memCode, String productCode);
	/**
	 * 查询持仓历史
	 * @param exchangeId
	 * @param memCode
	 * @param productCode
	 * @return
	 */
	List<PositionResponse> queryPositionAssetHis(String exchangeId, String memCode,String productCode);
}
