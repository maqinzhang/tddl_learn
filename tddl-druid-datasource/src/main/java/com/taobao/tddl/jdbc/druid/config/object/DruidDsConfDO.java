package com.taobao.tddl.jdbc.druid.config.object;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.common.lang.StringUtil;
import com.taobao.tddl.jdbc.druid.common.DruidConstants;

/**
 * TAtom����Դȫ�ֺ�Ӧ�����õ�DO
 * 
 * @author qihao
 * @author shenxun
 *
 */
public class DruidDsConfDO implements Cloneable {
	
	/**
	 * Ĭ�ϳ�ʼ�����̳߳���������
	 */
	public static final int defaultInitPoolSize = 0;
	
	/**
	 * Ĭ�ϳ�ʼ����defaultMaxWait druidר�ã�Ŀǰ�Ǻ�jboss��blockingTimeout��ͬһ�����á���ά��Ա��ע�⡣
	 */
	public static final int defaultMaxWait = 5000;

	private String ip;

	private String port;

	private String dbName;

	private String userName;

	private String passwd;

	private String driverClass;

	private String sorterClass;

	private int preparedStatementCacheSize;
	
	private int initPoolSize = defaultInitPoolSize;

	private int minPoolSize;

	private int maxPoolSize;

	private int blockingTimeout = defaultMaxWait;

	private long idleTimeout;

	//private String dbType;

	private String oracleConType = DruidConstants.DEFAULT_ORACLE_CON_TYPE;

	private DruidDbTypeEnum dbTypeEnum;

	private DruidDbStatusEnum dbStautsEnum;

	private String dbStatus;

	private Map<String, String> connectionProperties = new HashMap<String, String>();

	/**
	 * д ��������
	 */
	private int writeRestrictTimes;

	/**
	 * �� ��������
	 */
	private int readRestrictTimes;

	/**
	 * ͳ��ʱ��Ƭ 
	 */
	private int timeSliceInMillis;

	/**
	 * �̼߳���count����
	 */
	private int threadCountRestrict;

	/**
	 * ��������������������0Ϊ������
	 */
	private int maxConcurrentReadRestrict;

	/**
	 * ��������д����������0Ϊ������
	 */
	private int maxConcurrentWriteRestrict;
	
	private volatile boolean isSingleInGroup;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getDriverClass() {
		if (StringUtil.isBlank(driverClass) && null != this.dbTypeEnum) {
			return this.dbTypeEnum.getDriverClass();
		}
		return driverClass;
	}

	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}

	public String getSorterClass() {
		if (StringUtil.isBlank(sorterClass) && null != this.dbTypeEnum) {
			return this.dbTypeEnum.getSorterClass();
		}
		return sorterClass;
	}

	public void setSorterClass(String sorterClass) {
		this.sorterClass = sorterClass;
	}

	public int getPreparedStatementCacheSize() {
		return preparedStatementCacheSize;
	}

	public void setPreparedStatementCacheSize(int preparedStatementCacheSize) {
		this.preparedStatementCacheSize = preparedStatementCacheSize;
	}

	public int getInitPoolSize() {
		return initPoolSize;
	}

	public void setInitPoolSize(int initPoolSize) {
		this.initPoolSize = initPoolSize;
	}

	public int getMinPoolSize() {
		return minPoolSize;
	}

	public void setMinPoolSize(int minPoolSize) {
		this.minPoolSize = minPoolSize;
	}

	public int getMaxPoolSize() {
		return maxPoolSize;
	}

	public void setMaxPoolSize(int maxPoolSize) {
		this.maxPoolSize = maxPoolSize;
	}

	public int getBlockingTimeout() {
		return blockingTimeout;
	}

	public void setBlockingTimeout(int blockingTimeout) {
		this.blockingTimeout = blockingTimeout;
	}

	public long getIdleTimeout() {
		return idleTimeout;
	}

	public void setIdleTimeout(long idleTimeout) {
		this.idleTimeout = idleTimeout;
	}

	public Map<String, String> getConnectionProperties() {
		return connectionProperties;
	}

	public String getDbType() {
		return dbTypeEnum.name().toLowerCase();
	}

	public void setDbType(String dbType) {
		this.dbTypeEnum = DruidDbTypeEnum.getAtomDbTypeEnumByType(dbType);
	}

	public String getDbStatus() {
		return dbStatus;
	}

	public void setDbStatus(String dbStatus) {
		this.dbStatus = dbStatus;
		if (StringUtil.isNotBlank(dbStatus)) {
			this.dbStautsEnum = DruidDbStatusEnum.getAtomDbStatusEnumByType(dbStatus);
		}
	}

	public DruidDbStatusEnum getDbStautsEnum() {
		return dbStautsEnum;
	}

	public DruidDbTypeEnum getDbTypeEnum() {
		return dbTypeEnum;
	}

	public void setConnectionProperties(Map<String, String> connectionProperties) {
		this.connectionProperties = connectionProperties;
	}

	public String getOracleConType() {
		return oracleConType;
	}

	public void setOracleConType(String oracleConType) {
		this.oracleConType = oracleConType;
	}

	public int getWriteRestrictTimes() {
		return writeRestrictTimes;
	}

	public void setWriteRestrictTimes(int writeRestrictTimes) {
		this.writeRestrictTimes = writeRestrictTimes;
	}

	public int getReadRestrictTimes() {
		return readRestrictTimes;
	}

	public void setReadRestrictTimes(int readRestrictTimes) {
		this.readRestrictTimes = readRestrictTimes;
	}

	public int getThreadCountRestrict() {
		return threadCountRestrict;
	}

	public void setThreadCountRestrict(int threadCountRestrict) {
		this.threadCountRestrict = threadCountRestrict;
	}

	public int getTimeSliceInMillis() {
		return timeSliceInMillis;
	}

	public void setTimeSliceInMillis(int timeSliceInMillis) {
		this.timeSliceInMillis = timeSliceInMillis;
	}

	public int getMaxConcurrentReadRestrict() {
		return maxConcurrentReadRestrict;
	}

	public void setMaxConcurrentReadRestrict(int maxConcurrentReadRestrict) {
		this.maxConcurrentReadRestrict = maxConcurrentReadRestrict;
	}

	public int getMaxConcurrentWriteRestrict() {
		return maxConcurrentWriteRestrict;
	}

	public void setMaxConcurrentWriteRestrict(int maxConcurrentWriteRestrict) {
		this.maxConcurrentWriteRestrict = maxConcurrentWriteRestrict;
	}

	public DruidDsConfDO clone() {
		DruidDsConfDO tAtomDsConfDO = null;
		try {
			tAtomDsConfDO = (DruidDsConfDO) super.clone();
		} catch (CloneNotSupportedException e) {
		}
		return tAtomDsConfDO;
	}

	public boolean isSingleInGroup() {
		return isSingleInGroup;
	}

	public void setSingleInGroup(boolean isSingleInGroup) {
		this.isSingleInGroup = isSingleInGroup;
	}
}