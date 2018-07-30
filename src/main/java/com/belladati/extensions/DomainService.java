package com.belladati.extensions;

import com.belladati.extensions.obj.Domain;

/**
 * Interface defining methods for working with domain. 
 * @author BellaDati Inc.
 */
public interface DomainService {

	/**
	 * Loads {@link Domain} specified by ID
	 * @param id of domain
	 * @return {@link Domain} instance
	 * @throws RuntimeException if domain does not exist
	 */
	Domain load(Integer id);

	/**
	 * Retrieves current domain instance present in session
	 * @return {@link Domain} instance or <code>null</code> if there is no domain in session
	 */
	Domain getCurrent();

}
