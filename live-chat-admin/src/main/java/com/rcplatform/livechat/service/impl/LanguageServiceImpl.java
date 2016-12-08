package com.rcplatform.livechat.service.impl;

import com.rcplatform.livechat.mapper.LanguageMapper;
import com.rcplatform.livechat.model.Language;
import com.rcplatform.livechat.service.ILanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yang peng on 2016/11/8.
 */
@Service
public class LanguageServiceImpl implements ILanguageService {

    @Autowired
    private LanguageMapper languageMapper;

    @Override
    public List<Language> getLanguages() {
        return languageMapper.selectAll();
    }

}
