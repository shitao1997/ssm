package com.zking.ssm.service;

import com.zking.ssm.model.Book;
import com.zking.ssm.utils.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IBookService {
    int deleteByPrimaryKey(Integer bookId);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer bookId);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

    Book load(Book book);

    List<Book> list(Book book,PageBean pageBean);

}