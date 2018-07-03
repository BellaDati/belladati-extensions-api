package com.belladati.extensions.obj;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Interface representing user and available fields.
 * @author BellaDati Inc.
 */
public interface User {

	/**
	 * Returns internal ID of the user 
	 * @return ID of the user
	 */
	public Integer getId();

	/**
	 * Returns version of the user
	 * @return version of the user
	 */
	public Long getVersion();

	/**
	 * Returns username of the user
	 * @return username of the user
	 */
	public String getUsername();

	/**
	 * Returns user's first name
	 * @return user's first name
	 */
	public String getFirstName();

	/**
	 * Returns user's last name
	 * @return user's last name
	 */
	public String getLastName();

	/**
	 * Returns user's phone
	 * @return user's phone
	 */
	public String getPhone();

	/**
	 * Returns user's email
	 * @return user's email
	 */
	public String getEmail();

	/**
	 * Returns user's info
	 * @return user's info
	 */
	public String getInfo();

	/**
	 * Returns internal ID of user photo
	 * @return internal ID of user photo
	 */
	public Long getPhotoId();

	/**
	 * Returns active status of user
	 * @return <code>true</code> if active, <code>false</code> otherwise
	 */
	public Boolean getActive();

	/**
	 * Returns {@link LocalDateTime} of first user login
	 * @return {@link LocalDateTime} of first user login
	 */
	public LocalDateTime getFirstLogin();

	/**
	 * Returns {@link LocalDateTime} of last user login
	 * @return {@link LocalDateTime} of last user login
	 */
	public LocalDateTime getLastLogin();

	/**
	 * Determines whether the report side panel is on left or not
	 * @return <code>true</code> if the panel is on left, <code>false</code> otherwise
	 */
	public Boolean getSidePanelOnLeft();

	/**
	 * Determines whether the developers mode is enabled for the user or not
	 * @return <code>true</code> if the developers mode is enabled, <code>false</code> otherwise
	 */
	public Boolean getDeveloperMode();

	/**
	 * Returns locale string of the user
	 * @return locale string of the user
	 */
	public String getLocale();

	/**
	 * Returns time zone string of the user
	 * @return time zone string of the user
	 */
	public String getTimeZone();

	/**
	 * Returns the version of BellaDati prior to the current login 
	 * @return version of BellaDati prior to the current login
	 */
	public String getLastVersion();

	/**
	 * Returns the {@link LocalDateTime} of user account expiration
	 * @return {@link LocalDateTime} of user account expiration
	 */
	public LocalDateTime getExpireWhen();

	/**
	 * Returns the authentication source name
	 * @return authentication source name
	 */
	public String getAuthSource();

	/**
	 * Returns {@link UserGroup}s where current user is member
	 * @return {@link List} of {@link UserGroup}s where current user is member
	 */
	public List<UserGroup> getUserGroups();

}
