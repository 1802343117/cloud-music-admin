package com.soft1851.music.admin.controller;


import com.soft1851.music.admin.entity.Song;
import com.soft1851.music.admin.mapper.SongMapper;
import com.soft1851.music.admin.service.SongService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Tull
 * @since 2020-04-24
 */
@RestController
@RequestMapping("/song")
@Slf4j
public class SongController {
    @Resource
    private SongMapper songMapper;

    @Resource
    private SongService songService;

    /**
     * 所有的 Song
     * */
    @GetMapping("/selectAll")
    public List selectAll() {
        List<Song> songs = new ArrayList<>();
        List<Song> songList = songMapper.selectAll();
        for (int i = 0; i < 50; i++) {
            System.out.println(songList.get(i));
            songs.add(songList.get(i));
        }
        return songs;
    }

    /**
     * 添加
     * */
    @PostMapping("/insertSong")
    void insertSong(@RequestBody Song song) {
        System.out.println("添加Song");
        System.out.println(song);
        songMapper.insertSong(song);
    }

    /**
     * 删除
     * */
    @DeleteMapping("/delete")
    void delete(@Param("songId") String id) {
        System.out.println("删除Song");
        System.out.println(id);
        songMapper.delete(id);
    }

    /**
     * 修改
     * */
    @PutMapping("/update")
    void update(@RequestBody Song song) {
        System.out.println("修改Song");
        System.out.println(song);
        songMapper.update(song);
    }

    @GetMapping(value = "/export")
    public void exportData() {
        songService.exportData();
    }

}
