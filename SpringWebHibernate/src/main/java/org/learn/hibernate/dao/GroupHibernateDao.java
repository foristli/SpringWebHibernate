package org.learn.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.learn.hibernate.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository(value="groupHibernateDao")
public class GroupHibernateDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Session getSession(){
        return sessionFactory.openSession();
    }


    public void groupAdd(Employee group){
        getSession().save(group);
        System.out.println(group.getId());

    }
    
    public Employee groupSelect(int id)
    {
    	String hql="FROM Employee E where E.id="+id;
    	org.hibernate.Query query=getSession().createQuery(hql);
    	List results=query.list();
    	return (Employee) results.get(0);
    	
    }
    
    public List<Employee> getAllEmployee()
    {
    	String hql="FROM Employee";
    	org.hibernate.Query query=getSession().createQuery(hql);
    	List results=query.list();
    	return results;
    }
}
