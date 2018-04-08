package com.jk.kids.controller;

import com.jk.kids.service.KidsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/4/7.
 */
@Controller
@RequestMapping("kids")
public class KidsController {

    @Autowired
    private KidsService kidsService;

}
