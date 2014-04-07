package co.id.dao.impl;

import co.id.dao.EmployeeDAO;
import co.id.model.Employee;
import co.id.resources.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * @author tombisnis@yahoo.com
 */
public class EmployeeDAOImpl implements EmployeeDAO{

    private Session session;
    private SessionFactory sessionFactory;
    
    public EmployeeDAOImpl(){
        sessionFactory = HibernateUtil.getSessionFactory();
    }
    
    @Override
    public void save(Employee employee) {         
        session = sessionFactory.openSession();
        
        session.getTransaction().begin();  
        session.save(employee);
        session.getTransaction().commit();
    }

    @Override
    public void saveOrUpdate(Employee employee){
        session = sessionFactory.openSession();
        
        session.getTransaction().begin();  
        session.save(employee);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Employee employee){
        session = sessionFactory.openSession();
        
        session.getTransaction().begin();  
        session.save(employee);
        session.getTransaction().commit();
    }

    @Override
    public List<Employee> getAllEmployees(){
        session = HibernateUtil.getSessionFactory().openSession();
        return (List<Employee>) session.createCriteria(Employee.class).list();
    }
}