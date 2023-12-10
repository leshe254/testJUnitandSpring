package com.babikov.alexey;

import com.babikov.alexey.domain.Department;
import com.babikov.alexey.domain.Worker;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Department headq = context.getBean("headQ", Department.class);
        Department hr = context.getBean("humanRes", Department.class);
        Department itDep = context.getBean("itDep", Department.class);

        Worker ceo = context.getBean("ceo", Worker.class);

        System.out.println(headq.getName());
        System.out.println(ceo);
        //---Переводим ceo в отдел кадров, меняем зарплату на 300000---
        ceo.changeDep(hr);
        ceo.changeSalary(300000);
        System.out.println(ceo);


        context.close();

    }
}
