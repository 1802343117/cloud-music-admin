package com.soft1851.music.admin.mapper;

import com.soft1851.music.admin.entity.Song;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SongMapperTest {

    @Resource
    private SongMapper songMapper;

    @Test
    public void selectAll() {
        // 查询所有
        System.out.println(songMapper.selectAll().get(songMapper.selectAll().size() - 1));
    }

    @Test
    void insertSong() {
        // 新增实体
        Song song = new Song();
        song.setSongId("1851102497")
                .setSongName("测试插入数据")
                .setSortId("0.0")
                .setSinger("测试")
                .setDuration("1.82")
                .setThumbnail("无")
                .setUrl("0")
                .setLyric("0")
                .setCommentCount(0)
                .setLikeCount(0)
                .setPlayCount(0)
                .setDeleteFlag("0");
        songMapper.insertSong(song);
        // 查看插入是否成功
        System.out.println(songMapper.selectById("1851102497"));
    }


    @Test
    public void selectById() {
        // 根据 ID 查询 Song 信息
        System.out.println(songMapper.selectById("123456"));
    }

    @Test
    void update() {
        // 修改
        Song song = new Song();
        song.setSongId("1851102497").setSongName("修改测试数据");
        songMapper.update(song);
        // 查看修改是否成功
        System.out.println(songMapper.selectById("1851102497"));
    }

    @Test
    void delete() {
        // 删除数据
        songMapper.delete("1851102499");
        // 查看删除是否成功
        System.out.println(songMapper.selectById("1851102499"));
    }
}