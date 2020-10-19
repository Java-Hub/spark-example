package org.apache.spark.examples.streaming;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class StreamingExamples {

	public static void setStreamingLogLevels() {
		boolean log4jInitialized = Logger.getRootLogger().getAllAppenders().hasMoreElements();
		if (!log4jInitialized) {
      // We first log something to initialize Spark's default logging, then we override the
      // logging level.
      Logger.getRootLogger().setLevel(Level.WARN);
    }
	}

}
