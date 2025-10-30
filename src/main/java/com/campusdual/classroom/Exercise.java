package com.campusdual.classroom;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;

public class Exercise {
    public static Queue<String> createQueue() {
        Queue<String> cola = new LinkedList<>();

        cola.offer("Smith");
        cola.offer("Montessori");
        cola.offer("Peralta");
        cola.offer("House");
          return cola;
    }
    public static void printAndEmptyQueue(Queue<String> queue) {
      String remove = queue.poll();
        System.out.println("Elemento eliminado : " + remove);
        System.out.println("Queue despois do remove: " + queue );

    }

    public static void main(String[] args) {
     Queue<String> cola1 = createQueue();
        System.out.println(cola1);
     printAndEmptyQueue(cola1);
    }

}
