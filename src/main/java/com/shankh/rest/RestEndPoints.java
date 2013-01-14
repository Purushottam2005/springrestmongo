package com.shankh.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;

@Controller
public class RestEndPoints {

	private static final Logger logger = LoggerFactory.getLogger(RestEndPoints.class);
    
	@RequestMapping( value = "/version", method = RequestMethod.GET )
	@ResponseBody
	public final String getVersion(){
		
		final String version = "1.1";
		logger.debug("Application version is {}", version);	
		
		printInternalStateOfLogger();
		return version;
	}

	private void printInternalStateOfLogger() {
	    LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
	    StatusPrinter.print(lc);
	}
	
//	@RequestMapping( value = "/{version}", method = RequestMethod.GET )
//	@ResponseBody
//	public final String get( @PathVariable( "version" ) final String id ){r
//	  final string message = ""
//      return "success";
//	}
}
