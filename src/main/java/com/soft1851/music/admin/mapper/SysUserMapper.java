package com.soft1851.music.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.soft1851.music.admin.entity.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Tull
 * @since 2020-05-01
 */
public interface SysUserMapper extends BaseMapper<SysUser> {
    /**
     * 查询所有
     * */
    List<SysUser> selectAll();

    /**
     * 新增实体
     * */
    void insertUser(SysUser sysUser);

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
