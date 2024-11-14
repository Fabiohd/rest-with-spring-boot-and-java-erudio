package br.com.erudio.mapper.custom;

import java.util.Date;

import org.springframework.stereotype.Service;

import br.com.erudio.data.vo.v2.BookVOV2;
import br.com.erudio.model.Book;

@Service
public class BookMapper {

	public BookVOV2 convertEntityToVo(Book book) {
		BookVOV2 vo = new BookVOV2();
		vo.setId(book.getId());
		vo.setAuthor(book.getAuthor());
		vo.setLaunchDate(new Date());
		vo.setPrice(book.getPrice());
		vo.setTitle(book.getTitle());
		return vo;
	}
	
	
	public Book convertVoToEntity(BookVOV2 book) {
		Book entity = new Book();
		entity.setId(book.getId());
		entity.setAuthor(book.getAuthor());
		//entity.setBirthDay(new Date());
		entity.setLaunchDate(book.getLaunchDate());
		entity.setPrice(book.getPrice());
		entity.setTitle(book.getTitle());
		return entity;
	}
	
}
