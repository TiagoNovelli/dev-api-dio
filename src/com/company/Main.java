package com.company;

public class Main {

    public static void main(String[] args) {
        // Testes relacionados ao Design Pattern Singleton, um dos mais utilizados
        SingletonLazy lazy = SingletonLazy getInstancia();
        System.out.println();
        lazy = SingletonLazy getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager getInstancia();
        System.out.println();
        eager = SingletonEager getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyholder = SingletonLazyHolder getInstancia();
        System.out.println();
        lazyholder = SingletonLazyHolder getInstancia();
        System.out.println(lazy);

	// write your code here
    }
}
