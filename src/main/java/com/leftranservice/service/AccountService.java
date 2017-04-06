package com.leftranservice.service;

import java.util.List;

import com.leftranservice.service.customer.AccountBalUpdateRequest;
import com.leftranservice.service.customer.AccountCloseRequest;
import com.leftranservice.service.customer.AccountFrozenRequest;
import com.leftranservice.service.customer.AccountFrozenResponse;
import com.leftranservice.service.customer.BankInfoSyncRequest;
import com.leftranservice.service.customer.CustomerResponse;
import com.leftranservice.service.customer.GoodsInfoSyncRequest;
import com.leftranservice.service.customer.UserInfoSyncRequest;

/**
 * 客户注册相关
 * @author qibo
 *
 */
public interface AccountService {
  /**
   * 用户信息同步
   * @param request
   * @return
   */
  public CustomerResponse syncUserInfo(UserInfoSyncRequest request);

  /**
   * 账户冻结解冻
   * @param request
   * @return
   */
  public AccountFrozenResponse frozenAccount(AccountFrozenRequest request);

  /**
   * 关闭账户
   * @param request
   * @return
   */
  public CustomerResponse closeAccount(AccountCloseRequest request);

  /**
   * 商户信息同步
   * @param request
   * @return
   */
  public CustomerResponse syncGoodsInfo(GoodsInfoSyncRequest request);

  /**
   * 银行机构信息同步
   * @param request
   * @return
   */
  public CustomerResponse syncBankInfo(BankInfoSyncRequest request);
  /**
   * 批量更新账户余额
   * @param requestList
   * @return
   */
  public CustomerResponse batchUpdateBal (List<AccountBalUpdateRequest> requestList);
}
