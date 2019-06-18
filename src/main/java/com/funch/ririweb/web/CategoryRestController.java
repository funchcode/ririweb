package com.funch.ririweb.web;

import com.funch.ririweb.domain.category.Category;
import com.funch.ririweb.domain.category.CategoryDTO;
import com.funch.ririweb.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@AllArgsConstructor
public class CategoryRestController {

    private CategoryService categoryService;

    @GetMapping("/menus")
    public @ResponseBody List<Category> getMenus() {
        return categoryService.getMenus();
    }

    @PostMapping("/enroll")
    public void enroll(@RequestBody CategoryDTO category) {
        categoryService.insertMenu(category.toEntity());
    }
}
