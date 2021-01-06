package com.zking.ssm.service.Impl;

import com.zking.ssm.model.Book;
import com.zking.ssm.service.IBookService;
import com.zking.ssm.utils.PageBean;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

public class BookServiceImplTest extends BaseTestCase {

    @Autowired
    private IBookService iBookService;
    private Book book;
    @Before
    public void setUp() throws Exception {
        book=new Book();
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }

    @Test
    public void load() {
        book.setBookId(12);
        Book b = iBookService.load(book);
        System.out.println(b);
    }
    @Test
    public void list() {
        PageBean pageBean=new PageBean();
        List<Book> books = iBookService.list(book, pageBean);
        System.out.println(pageBean.getTotal());
    }
}