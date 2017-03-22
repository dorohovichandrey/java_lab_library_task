package com.epam.library.DAO.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.epam.library.DAO.ConnectionManager;
import com.epam.library.DAO.IReportDAO;

import com.epam.library.domain.bean.Report;
import com.epam.library.exception.DAOException;

public class ReportDAO implements IReportDAO{

	private final String SELECT_ALL_WHO_READ_MORE_THAN_ = 
			"SELECT employee.name, count(employee_book.book_id)"
			+" FROM employee INNER JOIN employee_book ON employee.id = employee_book.book_id"
			+" group by employee.name having count(employee_book.book_id) > ?"
			+" ORDER BY count(employee_book.book_id) ASC";

	private final String SELECT_ALL_WHO_READ_LESS_THAN_ = 
			"SELECT employee.name, employee.date_of_birth, count(employee_book.book_id)"
			+" FROM employee INNER JOIN employee_book ON employee.id = employee_book.book_id"
			+" group by employee.name having count(employee_book.book_id) < ?"
			+" ORDER BY employee.date_of_birth DESC, count(employee_book.book_id) DESC";
	
	@Override
	public List<Report> findReportAboutWhoReadLessThan(int amount) throws DAOException {

		List<Report> reportList = new ArrayList<Report>();
		Report report = null;
		
		try (Connection connection = ConnectionManager.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_WHO_READ_LESS_THAN_);) {

			preparedStatement.setInt(1, amount);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()){
				report = new Report();
				report.getEmployee().setName(resultSet.getString(1));
				report.getEmployee().setDateOfBirth(resultSet.getDate(2));
				report.setAmountOfBooks(resultSet.getInt(3));
				reportList.add(report);
			}		
			
			//preparedStatement.executeUpdate();
			
			return reportList;
			
		} catch (SQLException e) {
			
			throw new DAOException(e);
		}
	}
		

	@Override
	public List<Report> findReportAboutWhoReadMoreThan(int amount) throws DAOException {

		List<Report> reportList = new ArrayList<Report>();
		Report report = null;
		
		try (Connection connection = ConnectionManager.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_WHO_READ_MORE_THAN_);) {

			preparedStatement.setInt(1, amount);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()){
				report = new Report();
				report.getEmployee().setName(resultSet.getString(1));
				report.setAmountOfBooks(resultSet.getInt(2));
				reportList.add(report);
			}		
			
			//preparedStatement.executeUpdate();
			
			return reportList;
			
		} catch (SQLException e) {
			
			throw new DAOException(e);
		}
	}

}
