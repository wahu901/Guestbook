/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guest;

import entity.Customer;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import org.springframework.stereotype.Component;

/**
 *
 * @author Wayne.Hu
 */
@Component
public class CustomerDao {
    @PersistenceContext private EntityManager em;
    
    @Transactional
    public void persist(Customer customer) {
        em.persist(customer);
    }
    
    public List<Customer> getAllCustomers() {
        TypedQuery<Customer> query = em.createQuery(
        "SELECT c FORM Customer c", Customer.class);
        return query.getResultList();
    }
    
}
