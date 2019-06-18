package com.funch.ririweb.domain.category;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findTopByName(String name);
    List<Category> findAllByUseYnEquals(char useYn);
}
