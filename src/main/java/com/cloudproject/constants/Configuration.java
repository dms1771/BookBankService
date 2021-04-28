package com.cloudproject.constants;

public class Configuration {
	private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	private static final String DATABASE_NAME = "*****";
	private static final String INSTANCE_CONNECTION_NAME = "*****";
	private static final String MYSQL_USER_NAME = "root"; 
	private static final String MYSQL_USER_PASSWORD = "root"; 
	private static final String PROJECT_ID = "*****";
	private static final String BUCKET_NAME = "*****";
	private static final String SENDER_ID = "****;
	private static final String HOST_ID = "smtp.gmail.com";
	private static final String PASSWORD = "*****";
	
	public static String getProjectId() {
		return PROJECT_ID;
	}
	public static String getBucketName() {
		return BUCKET_NAME;
	}
	public static String getDriverName() {
		return DRIVER_NAME;
	}
	public static String getDatabaseName() {
		return DATABASE_NAME;
	}
	public static String getInstanceConnectionName(){
		return INSTANCE_CONNECTION_NAME;
	}
	public static String getMySQLUserName() {
		return MYSQL_USER_NAME;
	}
	public static String getMySQLUserPassword() {
		return MYSQL_USER_PASSWORD;
	}
	public static String getSenderId() {
		return SENDER_ID;
	}
	public static String getHostId() {
		return HOST_ID;
	}
	public static String getPassword() {
		return PASSWORD;
	}
}
