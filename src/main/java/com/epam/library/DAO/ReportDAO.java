package com.epam.library.DAO;

import com.epam.library.domain.bean.Report;

import java.util.List;

/**
 * Created by User on 15.03.2017.
 */
public interface ReportDAO {

    List<Report> findEmplWhoReadMoreThanOneBook();
    List<Report> findEmplWhoReadLessThanOrEqualsTwoBooks();
}
