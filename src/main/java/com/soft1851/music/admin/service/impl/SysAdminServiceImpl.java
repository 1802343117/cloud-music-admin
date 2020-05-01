package com.soft1851.music.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.soft1851.music.admin.domain.dto.LoginDto;
import com.soft1851.music.admin.entity.SysAdmin;
import com.soft1851.music.admin.mapper.SysAdminMapper;
import com.soft1851.music.admin.service.SysAdminService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Tull
 * @since 2020-04-29
 */
@Service
public class SysAdminServiceImpl extends ServiceImpl<SysAdminMapper, SysAdmin> implements SysAdminService {

    @Override
    public boolean save(SysAdmin entity) {
        return false;
    }

    @Override
    public boolean login(LoginDto loginDto) {
        return false;
    }

    @Override
    public SysAdmin getAdminAndRolesByName(String name) {
        return null;
    }
}
