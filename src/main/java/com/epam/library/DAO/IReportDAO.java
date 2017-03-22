package com.epam.library.DAO;


import com.epam.library.domain.bean.Report;
import com.epam.library.exception.DAOException;

import java.util.List;

public interface IReportDAO {

	public List<Report> findReportAboutWhoReadLessThan(int amount) throws DAOException;
	public List<Report> findReportAboutWhoReadMoreThan(int amount) throws DAOException;
}
