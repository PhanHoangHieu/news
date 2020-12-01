package com.news.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.news.entity.NewEntity;

// NewEntity là entity mà ta làm việc với repository,Long là kiểu dl của khóa chính
public interface NewRepository extends JpaRepository<NewEntity,Long>{

}
