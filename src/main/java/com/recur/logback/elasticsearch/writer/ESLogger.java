package com.recur.logback.elasticsearch.writer;

import com.google.gson.Gson;

import ch.qos.logback.classic.Logger;

public class ESLogger {

	private static Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(ESLogger.class);

	private static Gson gson = new Gson();

	public static void log(String requestId, String type, Object logValue) {

		LogObject obj = new LogObject(logValue, requestId, type);
		logger.info(gson.toJson(obj));
	}

}
