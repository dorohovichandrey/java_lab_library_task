package com.epam.library.DAO.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.epam.library.DAO.ConnectionManager;
import com.epam.library.DAO.IBookDAO;

import com.epam.library.domain.entity.Book;
import com.epam.library.exception.DAOException;

public class BookDAO implements IBookDAO {

	private final String ADD_BOOK = 
			"INSERT INTO book(brief, author, title, publish_year)" + " VALUES(?, ?, ?, ?)";
	private final String DELETE_BOOK = 
			"DELETE FROM book WHERE id = ?";
	private final String UPDATE_BOOK = 
			"UPDATE book SET brief = ?, author = ?, title = ?, publish_year = ?"
			+ " WHERE id = ?";
	private final String GET_BOOK = 
			"SELECT * FROM book WHERE id = ?";
	private final String UPDATE_BOOK_TITLE_WHERE_TITLE_LIKE =
			"UPDATE book SET title = ? WHERE title LIKE ?";

	@Override
	public Book addBook(Book book) throws DAOException {

		try (Connection connection = ConnectionManager.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(ADD_BOOK);) {

			preparedStatement.setString(1, book.getBrief());
			preparedStatement.setString(2, book.getAuthor());
			preparedStatement.setString(3, book.getTitle());
			preparedStatement.executeUpdate();
			
			return book;
			
		} catch (SQLException e) {
			
			throw new DAOException(e);
		}
	}

	@Override
	public void deleteBook(Book book) throws DAOException {

		try (Connection connection = ConnectionManager.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(DELETE_BOOK);) {

			preparedStatement.setInt(1, book.getId());
			preparedStatement.executeUpdate();
						
		} catch (SQLException e) {
			
			throw new DAOException(e);
		}

	}

	@Override
	public Book updateBook(Book book) throws DAOException {

		try (Connection connection = ConnectionManager.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_BOOK);) {

			preparedStatement.setString(1, book.getBrief());
			preparedStatement.setString(2, book.getAuthor());
			preparedStatement.setString(3, book.getTitle());
			preparedStatement.setInt(4, book.getId());
			preparedStatement.executeUpdate();
			
			return book;
			
		} catch (SQLException e) {
			
			throw new DAOException(e);
		}
	}

	@Override
	public Book getBook(Book book) throws DAOException {

		Book newBook = null;
		try (Connection connection = ConnectionManager.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(GET_BOOK);) {

			preparedStatement.setInt(1, book.getId());
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()){
				newBook = new Book();
				newBook.setBrief(resultSet.getString(2));
				newBook.setPublishYear(resultSet.getDate(3));
				newBook.setAuthor(resultSet.getString(4));
				newBook.setTitle(resultSet.getString(5));
			}		
			
			preparedStatement.executeUpdate();
			
			return newBook;
			
		} catch (SQLException e) {
			
			throw new DAOException(e);
		}
	}

	@Override
	public void renameBooks(Book book, String newTitle) throws DAOException {
		
		try (Connection connection = ConnectionManager.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_BOOK_TITLE_WHERE_TITLE_LIKE);) {

			preparedStatement.setString(1, newTitle);
			preparedStatement.setString(2, "%" + book.getTitle() + "%");
			preparedStatement.executeUpdate();
		
			
		} catch (SQLException e) {
			
			throw new DAOException(e);
		}
		
	}

}
