package com.tookbra.monine.config;

/**
 * @author tookbra
 * @date 2017/12/1
 * @description
 */
public class Protocol {

    private String name;

    private int port;


    public Protocol() {
    }

    public Protocol(String name, int port) {
        this.name = name;
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
