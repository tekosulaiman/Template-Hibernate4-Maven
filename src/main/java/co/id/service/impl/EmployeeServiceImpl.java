package co.id.service.impl;

import co.id.dao.EmployeeDAO;
import co.id.dao.impl.EmployeeDAOImpl;
import co.id.model.Employee;
import co.id.service.EmployeeService;
import java.util.List;

/**
 * @author tombisnis@yahoo.com
 */
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDAO employeeDAO;

    public EmployeeServiceImpl() {
       employeeDAO = new EmployeeDAOImpl();
    }

    public EmployeeDAO getEmployeeDAO() {
        return employeeDAO;
    }

    public void setEmployeeDAO(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public void save(Employee employee){
        employeeDAO.save(employee);
    }

    @Override
    public void saveOrUpdate(Employee employee){
        employeeDAO.saveOrUpdate(employee);
    }

    @Override
    public void delete(Employee employee){
       employeeDAO.delete(employee);
    }

    @Override
    public List<Employee> getAllEmployees(){
        return employeeDAO.getAllEmployees();
    }
}