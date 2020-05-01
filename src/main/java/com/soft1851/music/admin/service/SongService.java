package com.soft1851.music.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.soft1851.music.admin.entity.Song;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Tull
 * @since 2020-04-24
 */
public interface SongService extends IService<Song> {
    /**
     * 查询所有
     * */
    List<Song> selectAll();

    /**
     * 新增实体
     * */
    void insertSong(Song song);

    /**
     * 根据 ID 查询 Song 信息
     * @param id
     * @return
     */
    Song selectById(@Param("id") String id);

    /**
     * 修改
     *
     * @param song
     */
    void update(Song song);

    /**
     * 根据id删除
     *
     * @param id
     */
    void delete(String id);
}
