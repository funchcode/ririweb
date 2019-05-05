package com.funch.ririweb.service;

import com.funch.ririweb.domain.category.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    @Transactional
    public void insertMenu() {

    }
}
