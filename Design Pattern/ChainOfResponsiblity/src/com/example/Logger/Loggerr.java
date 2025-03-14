package com.example.Logger;

public class Loggerr {

	public static void main(String[] args) {
		LogProcessor logger = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

		logger.log(1, "This is Info logger");
		logger.log(2, "This is Debug logger");
		logger.log(3, "This is Error logger");
	}

}
