package com.njbdqn.single.componse.page;

import java.io.FileInputStream;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConditionStrategy {
	private static Map<String,IAbstractConditionStrategy> strategies ;
	static{
		try {
			initStrategy();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getSQLCondition(String conds){
		Pattern pat = Pattern.compile("%|-");
		Matcher mat = pat.matcher(conds);
		IAbstractConditionStrategy strategy = strategies.get(mat.find()?mat.group():"null");
		return strategy.getSQLCondition(conds);
	}

	private static void initStrategy() throws Exception{
		String path = URLDecoder.decode(ConditionStrategy.class.getResource("strategy.properties").getPath(),"UTF-8");
		Properties pros = new Properties();
		pros.load(new FileInputStream(path));
		Enumeration names = pros.propertyNames();
		while(names.hasMoreElements()){
			String key = names.nextElement().toString();
			String value = pros.getProperty(key);
			Object obj = Class.forName(value).newInstance();
			strategies.put(key, (IAbstractConditionStrategy) obj);
		}
	}
}
