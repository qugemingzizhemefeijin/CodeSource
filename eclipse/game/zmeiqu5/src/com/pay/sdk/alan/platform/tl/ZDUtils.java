package com.pay.sdk.alan.platform.tl;

import android.content.Context;

import com.pay.sdk.alan.config.ZDConfig;
import com.pay.sdk.alan.myInterface.SDKUtilsInterface;

public class ZDUtils implements SDKUtilsInterface{

	private Context context;
	
	private static ZDUtils ZDUtils;


	public ZDUtils() {
		
	}

	public static ZDUtils getInstance() {
		if (null == ZDUtils) {
			ZDUtils = new ZDUtils();
		}
		return ZDUtils;
	}
	
	@Override
	public void setContext(Context context) {
		this.context = context;
	}

	@Override
	public void initSdk() {
	}

	@Override
	public void doPay() {
		String chargeId = ZDConfig.chargeId;
		//带透传参数
//		SDKStart.getInstance().doPay(context, Integer.valueOf(chargeId));
//		Toast.makeText(context, "zdzf", Toast.LENGTH_LONG).show();
	}

	@Override
	public void doPay(Context context) {

		
	}

	@Override
	public void destory() {
		
	}

}