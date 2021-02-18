package com.barry.busniess.controller.admin;


import com.barry.server.dto.ChapterDto;
import com.barry.server.service.ChapterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class ChapterController {
    @Resource
    private ChapterService chapterService;

    @RequestMapping("/chapter")
    public List<ChapterDto> Chapter(){
        return  chapterService.list();
    }


}
