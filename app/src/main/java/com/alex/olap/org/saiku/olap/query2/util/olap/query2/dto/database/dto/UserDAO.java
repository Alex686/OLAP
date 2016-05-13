package com.alex.olap.org.saiku.olap.query2.util.olap.query2.dto.database.dto;

import java.util.Collection;

/**
 * Created by bugg on 09/06/14.
 */
public interface UserDAO {

    SaikuUser insert(SaikuUser user);
    void insertRole(SaikuUser user);
    void deleteUser(SaikuUser user);
    void deleteRole(SaikuUser user);
    String[] getRoles(SaikuUser user);
    SaikuUser findByUserId(int userId);
    Collection findAllUsers();
    void deleteUser(String username);
    SaikuUser updateUser(SaikuUser user, boolean updatepassword);
    void updateRoles(SaikuUser user);
}
