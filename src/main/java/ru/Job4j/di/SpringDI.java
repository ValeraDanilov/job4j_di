package ru.Job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j.di");
        context.refresh();

        Store store = context.getBean(Store.class);
        store.add("Ira");
        Store another = context.getBean(Store.class);
        another.getAll().forEach(System.out::println);

        StartUI ui = context.getBean(StartUI.class);
        ui.input();
        StartUI newUi = context.getBean(StartUI.class);
        newUi.print();
    }

}
