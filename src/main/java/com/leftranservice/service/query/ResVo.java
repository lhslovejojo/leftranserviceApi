package com.leftranservice.service.query;

public class ResVo<T> {
	private final static String SUCCESS="1";
	private final static String FAIL="0";
	private String code;
	private String msg;
	private T data;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
    public static ResVo getSuccessRes(Object data)
    {
    	ResVo res=new ResVo();
    	res.setCode(SUCCESS);
    	res.setData(data);
    	return res;
    }
    public static ResVo getFailRes(Object data)
    {
    	ResVo res=new ResVo();
    	res.setCode(FAIL);
    	res.setData(data);
    	return res;
    }
    public static ResVo getFailRes(String msg)
    {
    	ResVo res=new ResVo();
    	res.setCode(FAIL);
    	res.setMsg(msg);
    	return res;
    }

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
