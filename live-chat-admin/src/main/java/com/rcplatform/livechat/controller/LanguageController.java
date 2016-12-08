package com.rcplatform.livechat.controller;

import com.rcplatform.livechat.model.Language;
import com.rcplatform.livechat.service.ILanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yang peng on 2016/11/8.
 */
@RestController
@RequestMapping("language")
public class LanguageController {

    @Autowired
    private ILanguageService languageService;

    @RequestMapping("languages")
    @ResponseBody
    public List<Language> getLanguage() {
        return languageService.getLanguages();
    }





}
