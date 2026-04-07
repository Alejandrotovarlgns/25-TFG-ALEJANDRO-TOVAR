package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        System.out.println("\n***************************************************");
        System.out.println("--- ¡CONEXIÓN ESTABLECIDA CON ÉXITO! 25% COMPLETADO ---");
        System.out.println("***************************************************");
    }
}