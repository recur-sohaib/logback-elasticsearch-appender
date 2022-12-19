package com.recur.logback.elasticsearch.writer;

public class LogObject {

	private Object data;
	private String requestId;
	private String logType;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getLogType() {
		return logType;
	}

	public void setLogType(String logType) {
		this.logType = logType;
	}

	public LogObject() {
	}

	public LogObject(Object data, String requestId, String logType) {
		super();
		this.data = data;
		this.requestId = requestId;
		this.logType = logType;
	}

}
