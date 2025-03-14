package com.example.logger;

public abstract class LogProcessor {

	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;
	
	LogProcessor nextChainedLoggerProcessor;
	
	public LogProcessor(LogProcessor logProcessor) {
		this.nextChainedLoggerProcessor = logProcessor; 
	}
	
	public void log(int logLevel, String message) {
		if(this.nextChainedLoggerProcessor != null) {
			nextChainedLoggerProcessor.log(logLevel, message);
		}
	}
}
