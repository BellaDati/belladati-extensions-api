package com.belladati.extensions.obj;

import java.util.List;

/**
 * Interface representing user group and available fields.
 * @author BellaDati Inc.
 */
public interface UserGroup {

	/**
	 * Returns the user group's ID
	 * @return the user group's ID
	 */
	Integer getId();

	/**
	 * Returns the user group's full display name.
	 * @return the user group's full display name
	 */
	String getName();

	/**
	 * Returns the user group's description.
	 * @return the user group's description
	 */
	String getDescription();

	/**
	 * Returns list of users in user group
	 * @return {@link List} of {@link User}s in user group
	 */
	List<User> getUsers();

}
