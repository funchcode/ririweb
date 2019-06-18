package com.funch.ririweb.service;

import com.funch.ririweb.domain.category.Category;
import com.funch.ririweb.domain.category.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
public class CategoryService {

    CategoryRepository categoryRepository;

    @Transactional
    public void insertMenu(Category category) {
        Category origin = categoryRepository.findTopByName(category.getName());

        if(origin == null) {
            categoryRepository.save(category);
        }
    }

    @Transactional
    public List<Category> getMenus() {
        return categoryRepository.findAllByUseYnEquals('Y');
    }
}
