package com.soft1851.music.admin.service.impl;

import com.soft1851.music.admin.entity.SysUser;
import com.soft1851.music.admin.mapper.SysUserMapper;
import com.soft1851.music.admin.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Tull
 * @since 2020-05-01
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Override
    public List<SysUser> selectAll() {
        return null;
    }

    @Override
    public void insertSong(SysUser sysUser) {

    }

    @Override
    public SysUser selectById(String id) {
        return null;
    }

    @Override
    public void update(SysUser sysUser) {

    }

    @Override
    public void delete(SysUser id) {

    }
}
