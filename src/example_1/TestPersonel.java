
package example_1;
import org.hibernate.cfg.AnnotationConfiguration;


public class TestPersonel {
  
    public static void main(String[] args){
    AnnotationConfiguration config = new AnnotationConfiguration();
    config.addAnnotatedClass(Personel.class);
    config.configure("hibernate.cfg.xml");
    
    new SchemaExport(config).create(true, true);
    
    SessionFactory factory = config.buildSessionFactory();
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
