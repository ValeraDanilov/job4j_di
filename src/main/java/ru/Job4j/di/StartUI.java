package ru.Job4j.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StartUI {

    /*
    @Autowired
    private Store store;
    @Autowired
    private ConsoleInput console;
*/

    private Store store;
    private ConsoleInput console;

    public StartUI(Store store, ConsoleInput console) {
        this.store = store;
        this.console = console;
    }

    /*
    @Autowired
    public void setStore(Store store) {
        this.store = store;
    }

    @Autowired
    public void setConsole(ConsoleInput console) {
        this.console = console;
    }
*/

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