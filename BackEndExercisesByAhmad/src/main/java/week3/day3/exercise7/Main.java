package week3.day3.exercise7;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import week3.HibernateConfig;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = HibernateConfig.getEntityManagerFactoryConfig();
        EntityManager em = emf.createEntityManager();
    }
}
