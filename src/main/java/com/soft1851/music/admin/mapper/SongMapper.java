package com.soft1851.music.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.soft1851.music.admin.entity.Song;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Tull
 * @since 2020-04-24
 */
public interface SongMapper extends BaseMapper<Song> {

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
