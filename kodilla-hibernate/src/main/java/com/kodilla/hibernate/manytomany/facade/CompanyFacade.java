package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class CompanyFacade {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private Company company;
    @Autowired
    private Employee employee;
    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyFacade.class);

    public void findCompany(String name) throws SearchingException {
        if (employeeDao.count() < 1) {
            LOGGER.error(SearchingException.ERR_COMP_LIST_EMPTY);
            throw new SearchingException(SearchingException.ERR_COMP_LIST_EMPTY);
        }
        List<Company> foundCompany = companyDao.findByNameContains(name);
        if (foundCompany.isEmpty()) {
            LOGGER.error(SearchingException.ERR_COMP_NOT_FOUND);
            throw new SearchingException(SearchingException.ERR_COMP_NOT_FOUND);
        }
        LOGGER.info("Companies founded: " + foundCompany);
    }

    public void findEmployee(String lastname) throws SearchingException {
        if (companyDao.count() < 1) {
            LOGGER.error(SearchingException.ERR_EMPL_LIST_EMPTY);
            throw new SearchingException(SearchingException.ERR_EMPL_LIST_EMPTY);
        }
        List<Employee> foundEmployee = employeeDao.findByLastnameContains(lastname);
        if (foundEmployee.isEmpty()) {
            LOGGER.error(SearchingException.ERR_EMPL_NOT_FOUND);
            throw new SearchingException(SearchingException.ERR_EMPL_NOT_FOUND);
        }
        LOGGER.info("Employees founded: " + foundEmployee);
    }
}
