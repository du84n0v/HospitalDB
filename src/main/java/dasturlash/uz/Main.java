package dasturlash.uz;

import dasturlash.uz.entity.Hospital;
import dasturlash.uz.entity.Transport;
import dasturlash.uz.enums.TransportType;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {
    static void main() {
        insertCar();
    }

    public static void insertCar() {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate-config.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

        SessionFactory factory = meta.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();

        Transport transport = new Transport();
        transport.setCode("1234");
        transport.setType(TransportType.AMBULANCE);
        transport.setHospitalId(1);
        session.save(transport);


        factory.close();
        session.close();
    }

}
