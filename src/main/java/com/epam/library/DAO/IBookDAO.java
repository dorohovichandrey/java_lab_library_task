package com.epam.library.DAO;

import java.util.List;


import com.epam.library.domain.entity.Book;
import com.epam.library.exception.DAOException;

public interface IBookDAO {

	public Book addBook(Book book) throws DAOException;
	public void deleteBook(Book book) throws DAOException;
	public Book updateBook(Book book) throws DAOException;
	public Book getBook(Book book) throws DAOException;
	public void renameBooks(Book book, String newTitle) throws DAOException;
	
}
