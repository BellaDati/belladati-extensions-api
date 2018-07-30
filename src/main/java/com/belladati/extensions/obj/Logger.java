package com.belladati.extensions.obj;

/**
 * A simple logging interface abstracting logging APIs.
 * @author BellaDati Inc.
 */
public interface Logger {

	/**
	 * Logs a message with debug log level.
	 * @param message log this message
	 */
	void debug(Object message);

	/**
	 * Logs an error with debug log level.
	 * @param message log this message
	 * @param error log this cause
	 */
	void debug(Object message, Throwable error);

	/**
	 * Logs a message with error log level.
	 * @param message log this message
	 */
	void error(Object message);

	/**
	 * Logs an error with error log level.
	 * @param message log this message
	 * @param error log this cause
	 */
	void error(Object message, Throwable error);

	/**
	 * Logs a message with fatal log level.
	 * @param message log this message
	 */
	void fatal(Object message);

	/**
	 * Logs an error with fatal log level.
	 * @param message log this message
	 * @param error log this cause
	 */
	void fatal(Object message, Throwable error);

	/**
	 * Logs a message with info log level.
	 * @param message log this message
	 */
	void info(Object message);

	/**
	 * Logs an error with info log level.
	 * @param message log this message
	 * @param error log this cause
	 */
	void info(Object message, Throwable error);

	/**
	 * Logs a message with warn log level.
	 * @param message log this message
	 */
	void warn(Object message);

	/**
	 * Logs an error with warn log level.
	 * @param message log this message
	 * @param error log this cause
	 */
	void warn(Object message, Throwable error);
}
