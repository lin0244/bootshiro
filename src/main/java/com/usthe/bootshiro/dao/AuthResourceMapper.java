package com.usthe.bootshiro.dao;

import com.usthe.bootshiro.domain.bo.AuthResource;
import com.usthe.bootshiro.shiro.rule.RolePermRule;

import java.util.List;

public interface AuthResourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AuthResource record);

    int insertSelective(AuthResource record);

    AuthResource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AuthResource record);

    int updateByPrimaryKey(AuthResource record);

    List<RolePermRule> selectRoleRules();

    List<AuthResource> selectAuthorityMenusByUid(String appId);

    List<AuthResource> selectMenus();

    List<AuthResource> selectApiTeamList();

    List<AuthResource> selectApiList();

    List<AuthResource> selectApiListByTeamId(Integer teamId);

    List<AuthResource> selectApisByRoleId(Integer roleId);

    List<AuthResource> selectMenusByRoleId(Integer roleId);

    List<AuthResource> selectNotAuthorityApisByRoleId(Integer roleId);

    List<AuthResource> selectNotAuthorityMenusByRoleId(Integer roleId);
}