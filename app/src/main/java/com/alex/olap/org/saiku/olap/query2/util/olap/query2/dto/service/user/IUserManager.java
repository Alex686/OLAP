package com.alex.olap.org.saiku.olap.query2.util.olap.query2.dto.service.user;

import com.alex.olap.org.saiku.olap.query2.util.olap.query2.dto.database.dto.SaikuUser;

import java.util.List;

/**
 * Created by bugg on 01/05/14.
 */
public interface IUserManager {

  SaikuUser addUser(SaikuUser u);

  boolean deleteUser(SaikuUser u);

  SaikuUser setUser(SaikuUser u);

  SaikuUser getUser(int id);

  String[] getRoles(SaikuUser u);

  void addRole(SaikuUser u);

  void removeRole(SaikuUser u);

    void removeUser(String username);

    SaikuUser updateUser(SaikuUser u, boolean b);

    boolean isAdmin();

    List<String> getAdminRoles();

    String getActiveUsername();


  String getSessionId();
}
