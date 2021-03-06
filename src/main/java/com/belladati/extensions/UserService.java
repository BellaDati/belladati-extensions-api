package com.belladati.extensions;

import com.belladati.extensions.obj.User;
import com.belladati.extensions.obj.UserBuilder;
import com.belladati.extensions.obj.UserRequestType;
import com.belladati.extensions.obj.UserRole;

/**
 * Interface defining methods for managing users - creating, updating, deleting, assigning to domains and user groups. 
 * @author BellaDati Inc.
 */
public interface UserService {

	/**
	 * Loads {@link User} specified by ID
	 * @param id of user
	 * @return {@link User} instance
	 * @throws RuntimeException if user does not exist
	 */
	User loadUserById(Integer id);

	/**
	 * Loads {@link User} specified by username
	 * @param username of user
	 * @return {@link User} instance
	 * @throws RuntimeException if user does not exist or permission is denied
	 */
	User loadUserByUsername(String username);

	/**
	 * Creates new user 
	 * @param userBuilder used to define user properties
	 * @param notify determines whether notification email should be send
	 * @return newly created {@link User}
	 * @throws RuntimeException if user does not exist or permission is denied
	 */
	User createUser(UserBuilder userBuilder, boolean notify);

	/**
	 * Updates user specified by ID and version
	 * @param id of the user to update
	 * @param version of the user to update
	 * @param userBuilder used to define user properties to be updated
	 * @throws RuntimeException if user does not exist or permission is denied 
	 */
	void updateUser(Integer id, Long version, UserBuilder userBuilder);

	/**
	 * Deletes the user
	 * @param id of the user to delete
	 * @throws RuntimeException if user does not exist or permission is denied
	 */
	void deleteUser(Integer id);

	/**
	 * Updates user-domain association
	 * @param userId of the user
	 * @param domainId of the domain
	 * @param roles {@link UserRole} to set.
	 * @throws RuntimeException if user does not exist, domain does not exist or permission is denied
	 */
	void updateDomainAssociation(Integer userId, Integer domainId, UserRole... roles);

	/**
	 * Updates user-user group association
	 * @param userId of the user
	 * @param userGroups id's of the groups
	 * @throws RuntimeException if user does not exist, user groups do not exist or permission is denied
	 */
	void updateUserGroupAssociation(Integer userId, Integer... userGroups);

	/**
	 * Creates an user request of desired type.
	 * @param username username of the user the request is created for.
	 * @param type Specifies the type of the request. Available types are: LOGIN_UNATTENDED, PASSWORD_SET, PASSWORD_RESET, UNLOCK_ACCOUNT, LOGIN
	 * @return request_id and request_code of the created request. Example: 1544;RDQX1Qx9UokSf4n3KAVWgNClvrFUqncSZg7fK3gnVAfNIAOylN
	 * @throws RuntimeException if user does not exist or permission is denied
	 */
	String createUserRequest(String username, UserRequestType type);

}
