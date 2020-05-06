package com.soft1851.music.admin.mapper;

import com.soft1851.music.admin.entity.SysUser;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SysUserMapperTest {

    @Resource
    private SysUserMapper sysUserMapper;

    @Test
    void selectById() {
        // 根据 ID 查询 Song 信息
        System.out.println(sysUserMapper.selectById("01abc123"));
    }

    @Test
    void update() {
        // 修改
        SysUser sysUser = new SysUser();
        sysUser.setUserId("01abc123")
                .setUserName("测试用户")
                .setNickName("测试用力哦")
                .setPassword("测试密码")
                .setAvatar("http://tunlmusic.oss-cn-shenzhen.aliyuncs.com/1.jpg");
        sysUserMapper.update(sysUser);
        // 查看修改是否成功
        System.out.println(sysUserMapper.selectById("01abc123"));
    }

    @Test
    void insertSong() {
        // 新增实体
        SysUser sysUser = new SysUser();
        sysUser.setUserId("01abc123")
                .setUserName("xYg^LosITA")
                .setNickName("测试用例")
                .setPassword("123")
                .setPhone("18802343117")
                .setEmail("1234567890@qq.com");
        sysUserMapper.insertUser(sysUser);
        // 查看插入是否成功
        System.out.println(sysUserMapper.selectById("01abc123"));
    }
}