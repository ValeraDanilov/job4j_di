package ru.Job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.Job4j.di");
        context.refresh();

        StartUI ui = context.getBean(StartUI.class);
        ui.input();
        ui.print();
    }
}
