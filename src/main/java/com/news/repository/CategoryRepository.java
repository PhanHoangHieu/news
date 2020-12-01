package com.news.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.news.entity.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
	CategoryEntity findOneByCode(String code);
}