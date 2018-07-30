package com.belladati.extensions;

import com.belladati.extensions.obj.Logger;

/**
 * Interface providing {@link Logger} service
 * @author BellaDati Inc.
 */
public interface LogService {

	/**
	 * Returns the {@link Logger} instance
	 * @return {@link Logger} instance
	 */
	Logger getLog();
}
