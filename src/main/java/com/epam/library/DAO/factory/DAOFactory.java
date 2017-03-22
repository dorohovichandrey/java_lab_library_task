package com.epam.library.DAO.factory;

import com.epam.library.DAO.IBookDAO;
import com.epam.library.DAO.IReportDAO;
import com.epam.library.DAO.IEmployeeDAO;
import com.epam.library.DAO.impl.BookDAO;
import com.epam.library.DAO.impl.ReportDAO;
import com.epam.library.DAO.impl.EmployeeDAO;

public class DAOFactory {

	private final IBookDAO bookDao = new BookDAO();
	private final IEmployeeDAO employeeDao = new EmployeeDAO();
	private final IReportDAO employeeBookDao = new ReportDAO();
	
	private static final DAOFactory INSTANCE = new DAOFactory();
	
	private DAOFactory(){}
	
	public static DAOFactory getInstance(){
		return INSTANCE;
	}
	
	public IBookDAO getBookDAO(){
		return bookDao;
	}
	
	public IEmployeeDAO getEmployeeDAO(){
		return employeeDao;
	}
	
	public IReportDAO getEmployeeBookDAO(){
		return employeeBookDao;
	}
}
