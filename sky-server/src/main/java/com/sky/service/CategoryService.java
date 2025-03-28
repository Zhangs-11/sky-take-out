package com.sky.service;

import com.sky.dto.CategoryDTO;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.result.PageResult;

/**
 * @description
 * @Author zs
 * @CreateTime 2025-03-28 07-56
 **/
public interface CategoryService {

    void save(CategoryDTO categoryDTO);

    void deleteById(Long id);

    PageResult pageQuery(CategoryPageQueryDTO categoryPageQueryDTO);

    void update(CategoryDTO categoryDTO);
}
