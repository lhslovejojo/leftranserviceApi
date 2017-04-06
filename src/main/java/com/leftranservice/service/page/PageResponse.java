package com.leftranservice.service.page;

import java.io.Serializable;
import java.util.List;

public class PageResponse<T> implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int pageSize=50; // 每页条数
	private int pageNum=1; // 当前页码
	private int totalPage; // 总页数
	private int totalSize; // 总条数
	private List<T> list;

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getTotalPage() { // 得到总页码数
		if (this.totalSize % this.pageSize == 0) {
			this.totalPage = this.totalSize / this.pageSize;
		} else {
			this.totalPage = this.totalSize / this.pageSize + 1;
		}
		return totalPage;
	}

	public int getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
}
