package com.car.insurance.utils;

import java.util.HashMap;
import java.util.Map;

import com.car.insurance.modelutils.Basic;
import com.car.insurance.modelutils.Members;
import com.car.insurance.modelutils.None;
import com.car.insurance.modelutils.Premium;
import com.car.insurance.modelutils.Standard;

public class MembershipTypeInstance {

	private static final Map<String, Members> MEMBERSHIP_TYPE_MAP = new HashMap<String, Members>();
	static {
		MEMBERSHIP_TYPE_MAP.put("NONE", new None());
		MEMBERSHIP_TYPE_MAP.put("BASIC", new Basic());
		MEMBERSHIP_TYPE_MAP.put("STANDARD", new Standard());
		MEMBERSHIP_TYPE_MAP.put("PREMIUM", new Premium());
	}
	
	public static Members getMemberType(String memberType) {
		return MEMBERSHIP_TYPE_MAP.get(memberType.toUpperCase());
	}
}
