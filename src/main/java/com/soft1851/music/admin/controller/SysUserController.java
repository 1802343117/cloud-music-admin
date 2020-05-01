package com.soft1851.music.admin.controller;


import com.soft1851.music.admin.entity.SysUser;
import com.soft1851.music.admin.mapper.SysUserMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Tull
 * @since 2020-05-01
 */
@RestController
@RequestMapping("/sysUser")
@Slf4j
public class SysUserController {

    @Resource
    private SysUserMapper sysUserMapper;

    /**
     * 根据 ID 查询 user
     * */
    @GetMapping("/selectById")
    public SysUser selectById(@Param("userId") String id) {
        System.out.println(id);
        return sysUserMapper.selectById(id);
    }

    /**
     * 修改
     * */
    @PutMapping("/update")
    void update(@RequestBody SysUser sysUser) {
        System.out.println("修改SysUser");
        System.out.println(sysUser);
        sysUserMapper.update(sysUser);
    }
}
