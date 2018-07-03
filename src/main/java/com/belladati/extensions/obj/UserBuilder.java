package com.belladati.extensions.obj;

/**
 * Interface representing User builder for building {@link User} instances.
 * @author BellaDati Inc.
 */
public interface UserBuilder {

	/**
	 * Sets user's fields from existing {@link User} instance
	 * @param user existing {@link User}
	 * @return Current {@link UserBuilder} instance
	 */
	UserBuilder set(User user);

	/**
	 * Sets the user's username.
	 * @param username the user's username
	 * @return Current {@link UserBuilder} instance
	 */
	UserBuilder setUsername(String username);

	/**
	 * Sets the user's email.
	 * @param email the user's email@return Current {@link UserBuilder} instance
	 * @return Current {@link UserBuilder} instance
	 */
	UserBuilder setEmail(String email);

	/**
	 * Sets the user's time first name.
	 * @param firstName the user's first name
	 * @return Current {@link UserBuilder} instance
	 */
	UserBuilder setFirstName(String firstName);

	/**
	 * Sets the user's time last name.
	 * @param lastName the user's last name
	 * @return Current {@link UserBuilder} instance
	 */
	UserBuilder setLastName(String lastName);

	/**
	 * Sets the user's time zone.
	 * @param timeZone the user's time zone
	 * @return Current {@link UserBuilder} instance
	 */
	UserBuilder setTimeZone(String timeZone);

	/**
	 * Sets the user's locale.
	 * @param locale the user's locale
	 */
	UserBuilder setLocale(String locale);

	/**
	 * Sets the user's active status.
	 * @param active <code>true</code> if user is active, <code>false</code> otherwise
	 */
	UserBuilder setActive(Boolean active);

	/**
	 * Creates {@link User} instance 
	 * @return new {@link User} instance 
	 */
	User build();

}
