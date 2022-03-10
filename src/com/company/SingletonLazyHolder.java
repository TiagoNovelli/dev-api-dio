package com.company;


public class SingletonLazyHolder {

    private static class Holder {
        private static SingletonLazyHolder instancia;
    }
    private  SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazyHolder();
        }
        return instancia;
    }
}