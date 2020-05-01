package com.soft1851.music.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.soft1851.music.admin.entity.SysMenu;
import com.soft1851.music.admin.mapper.SysMenuMapper;
import com.soft1851.music.admin.service.SysMenuService;
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
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenu> implements SysMenuService {

    @Override
    public boolean save(SysMenu entity) {
        return false;
    }
}
