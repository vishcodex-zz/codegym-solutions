package com.codegym.task.task14.task1413;

import javax.lang.model.type.PrimitiveType;

public class Computer {
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor) {

        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }
}
