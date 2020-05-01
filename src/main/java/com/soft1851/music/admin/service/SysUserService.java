package com.soft1851.music.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.soft1851.music.admin.entity.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Tull
 * @since 2020-05-01
 */
public interface SysUserService extends IService<SysUser> {
    /**
     * 查询所有
     * */
    List<SysUser> selectAll();

    /**
     * 新增实体
     * */
    void insertSong(SysUser sysUser);

    /**
     * 根据 ID 查询 sysUser 信息
     * @param id
     * @return
     */
    SysUser selectById(@Param("id") String id);

    /**
     * 修改
     *
     * @param sysUser
     */
    void update(SysUser sysUser);

    /**
     * 根据id删除
     *
     * @param id
     */
    void delete(SysUser id);
}
