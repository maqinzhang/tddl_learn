package com.taobao.tddl.sqlobjecttree.mysql.function.datefunction;

import java.util.Calendar;
import java.util.List;

import com.taobao.tddl.sqlobjecttree.Utils;
import com.taobao.tddl.sqlobjecttree.common.value.OneArgFunction;

public class DayOfMonth extends OneArgFunction{

	public String getFuncName() {
		return "dayofmonth";
	}

	public Comparable<?> getVal(List<Object> args) {
		Comparable<?> days=Utils.getVal(args, arg1);
		if(days instanceof java.util.Date){
			Calendar cal=Calendar.getInstance();
			cal.setTime(((java.util.Date) days));
			return cal.get(Calendar.DAY_OF_MONTH);
		}else{
			throw new IllegalArgumentException("from days ֻ֧��int�͵Ĳ���");
		}
	}
}