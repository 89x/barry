package com.barry.server.service;

import com.barry.server.dao.Chapter;
import com.barry.server.dao.ChapterExample;
import com.barry.server.dto.ChapterDto;
import com.barry.server.mapper.ChapterMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ChapterService {
    @Resource
    private ChapterMapper chapterMapper;

    public List<ChapterDto> list(){
        ChapterExample chapterExample = new ChapterExample();
        List<Chapter> chapterList = chapterMapper.selectByExample(chapterExample);
        List<ChapterDto>  ChapterDtoList = new ArrayList<ChapterDto>();
        for (int i = 0; i <chapterList.size() ; i++) {
            Chapter chapter =chapterList.get(i);
            ChapterDto chapterDto = new ChapterDto();
            BeanUtils.copyProperties(chapter,chapterDto);
            ChapterDtoList.add(chapterDto);
        }
        return ChapterDtoList;
    }

}
