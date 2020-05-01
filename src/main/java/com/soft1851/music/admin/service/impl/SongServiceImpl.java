package com.soft1851.music.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.soft1851.music.admin.entity.Song;
import com.soft1851.music.admin.mapper.SongMapper;
import com.soft1851.music.admin.service.SongService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Tull
 * @since 2020-04-29
 */
@Service
public class SongServiceImpl extends ServiceImpl<SongMapper, Song> implements SongService {

    @Override
    public List<Song> selectAll() {
        return null;
    }

    @Override
    public void insertSong(Song song) {

    }

    @Override
    public Song selectById(String id) {
        return null;
    }

    @Override
    public void update(Song song) {

    }

    @Override
    public void delete(String id) {

    }
}
