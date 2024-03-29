package com.buba.jiuhui.controller;

import com.buba.jiuhui.bean.Chakanshujub;
import com.buba.jiuhui.service.ChakanshujuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@RequestMapping("chakans")
@Controller
public class ChakanshujuController {

    @Autowired
    private ChakanshujuService chakanshujuService;



    @ResponseBody
    @RequestMapping("findAll")
    public List<Chakanshujub> findAll(String startTime,String endTime) {


        List<Chakanshujub> all = chakanshujuService.findAll(startTime,endTime);
        return all;


    }

    @ResponseBody
    @RequestMapping("findxianAll")
    public List<Chakanshujub> findxianAll(Integer id) {
        List<Chakanshujub> chakanshujubs = chakanshujuService.findxianAll(id);
        return chakanshujubs;


    }
    @ResponseBody
    @RequestMapping("findxianAll2")
    public List<Chakanshujub> findxianAll2(Integer id) {

        List<Chakanshujub> chakanshujubs = chakanshujuService.findxianAll2(id);
        return chakanshujubs;

    }
}
