
package example_1;
import javax.security.auth.login.Configuration;


public class TestPersonel {
  
    public static void main(String[] args){
    Configuration config = new Configuration();
    config.addAnnotatedClass(Personel.class);
    config.configure("hibernate.cfg.xml");
    
    new SchemaExport(config).create(true, true);
    
    ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
    SessionFactory factory = config.buildSessionFactory(registry);
    Session session = factory.getCurrentSession();
    session.beginTransaction();
    
    Personel person = new Personel();
    person.emp_Name("Dilek");
    person.emp_Surname("Yenice");
    
    Personel person2 = new Personel();
    person2.emp_Name("Ömer");
    person2.emp_Surname("Taşkın");
    
    session.save(person);
    session.save(person2);
    session.getTransaction().commit();
    }
            
}
