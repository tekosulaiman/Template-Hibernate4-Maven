package co.id;

import co.id.dao.EmployeeDAO;
import co.id.dao.impl.EmployeeDAOImpl;
import co.id.model.Employee;
import co.id.service.EmployeeService;
import co.id.service.impl.EmployeeServiceImpl;
import java.util.List;

/**
 * @author tombisnis@yahoo.com
 */
public class Main {
    public static void main (String[]args){
        Employee employee = new Employee();
        List<Employee> employees;
        EmployeeService employeeService = new EmployeeServiceImpl();
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        System.out.println("Service >>>" +employeeDAO.getAllEmployees());
    }
}