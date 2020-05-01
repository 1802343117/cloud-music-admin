package com.soft1851.music.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.soft1851.music.admin.entity.SysRole;
import com.soft1851.music.admin.mapper.SysRoleMapper;
import com.soft1851.music.admin.service.SysRoleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Tull
 * @since 2020-04-29
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {

    @Override
    public boolean save(SysRole entity) {
        return false;
    }

    @Override
    public Map<String, Object> selectRoleById(int roleId) {
        return null;
    }

    @Override
    public boolean checkRole(List<SysRole> roles, int roleId) {
        return false;
    }
}
