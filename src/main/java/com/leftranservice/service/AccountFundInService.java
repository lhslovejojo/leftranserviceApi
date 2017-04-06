package com.leftranservice.service;

import com.leftranservice.service.tran.AccountFundInRequest;
import com.leftranservice.service.tran.PaymentResult;

/**
 * 账户充值
 * 
 * @author lihongsong
 *
 */
public interface AccountFundInService {
	/**
	 * 账户充值操作
	 * 
	 * @param request
	 * @return
	 */
	PaymentResult fundIn(AccountFundInRequest request);
}
