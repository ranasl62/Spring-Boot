package bd.ac.seu;

import org.hibernate.SessionFactory;
import org.hibernate.engine.spi.SessionFactoryDelegatingImpl;

import javax.security.auth.login.Configuration;

public class SessionFactorySingletone {
    private static SessionFactorySingletone instance = new SessionFactorySingletone();
    private static SessionFactory sessionFactory;
    private SessionFactorySingletone(){
        sessionFactory = new org.hibernate.cfg.Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();
    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
