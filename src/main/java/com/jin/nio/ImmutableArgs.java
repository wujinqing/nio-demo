package com.jin.nio;

/**
 * 解析由EWP原封不动传给TMS的不可变参数
 * 
 * @author wu.jinqing
 * @date 2017年3月3日
 */
public class ImmutableArgs {
	private String arg1;

	@Override
	public String toString() {
		return "ImmutableArgs{" +
				"arg1='" + arg1 + '\'' +
				", arg2='" + arg2 + '\'' +
				'}';
	}

	private String arg2;
	

	public String getArg2() {
		return arg2;
	}

	public void setArg2(String arg2) {
		this.arg2 = arg2;
	}

	public String getArg1() {
		return arg1;
	}

	public void setArg1(String arg1) {
		this.arg1 = arg1;
	}
}
