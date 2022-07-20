package com.company.test;

import com.company.dao.impl.EmploymentHistoryDaoImpl;
import com.company.dao.impl.UserDaoImpl;
import com.company.dao.inter.CountryDaoInter;
import com.company.dao.inter.UserDaoInter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        UserDaoInter dao = new UserDaoImpl();
        System.out.println(dao.getAllUser());
        EmploymentHistoryDaoImpl employmentHistoryDao = new EmploymentHistoryDaoImpl();
        //System.out.println(dao.getById(1));
        //System.out.println(dao.getAllUser());
       // System.out.println(dao.getByEmailAndPassword("abc", "123").getName());
        //System.out.println(dao.getUsersWithParams("", ""));
        //System.out.println(employmentHistoryDao.getAllEmploymentHistoryByUserId(2));
        //System.out.println(dao.findByName("Qurban").getSurname());
        entityManager.close();
        entityManagerFactory.close();

        // System.out.println(dao.getById(1));
       // System.out.println(dao.getByName("Qurban"));



    }
}
