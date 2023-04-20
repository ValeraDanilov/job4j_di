package ru.Job4j.di;

import org.springframework.stereotype.Component;

@Component
public class StartUI {

    private Store store;
    private ConsoleInput console;

    public StartUI(Store store, ConsoleInput console) {
        this.store = store;
        this.console = console;
    }

    public void input() {
        String value = console.askStr("Write something here:" + System.lineSeparator());
        store.add(value);
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }
}
