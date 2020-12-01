package com.news.converter;

import org.springframework.stereotype.Component;

import com.news.dto.NewDTO;
import com.news.entity.NewEntity;

@Component
public class NewConverter {
	public NewDTO toDto(NewEntity entity) {
		NewDTO result = new NewDTO();
		result.setId(entity.getId());
		result.setTitle(entity.getTitle());
		result.setShortDescription(entity.getShortDescription());
		result.setContent(entity.getContent());
		result.setThumbnail(entity.getThumbnail());
		result.setCategoryCode(entity.getCategory().getCode());
		return result;
	}
	
	public NewEntity toEntity(NewDTO dto) {
		NewEntity result = new NewEntity();
		result.setTitle(dto.getTitle());
		result.setShortDescription(dto.getShortDescription());
		result.setContent(dto.getContent());
		result.setThumbnail(dto.getThumbnail());
		return result;
	}
	//convert khi update 
	public NewEntity toEntity(NewEntity oldNew, NewDTO dto) {
		oldNew.setTitle(dto.getTitle());
		oldNew.setShortDescription(dto.getShortDescription());
		oldNew.setContent(dto.getContent());
		oldNew.setThumbnail(dto.getThumbnail());
		return oldNew;
	}
}
