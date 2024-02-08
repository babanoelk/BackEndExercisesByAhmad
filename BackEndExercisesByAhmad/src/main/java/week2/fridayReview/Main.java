package week2.fridayReview;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// Understand what JSON is and how to use Jackson or Gson to convert between JSON and DTOs
public class Main {
    public static void main(String[] args) {

        ExecutorService worker = Executors.newFixedThreadPool(2);

        // Example 1
        /*
        Runnable example1 = new Example1();

        worker.execute(example1);

        System.out.println("Hovedtråden kører.");

        worker.shutdown();
        /*

        // Example 2
        /*
        Callable<Integer> eksempel2 = new Example2();

        Future<Integer> futureResultat = worker.submit(eksempel2);

        // Future
        //  1) Future kommer fra Javas Future API.
        //  2) Man får et fremtidigt result, som man kan arbejde med, når resultatet er klar.
        //  3) .get metoden venter på at resultatet er færdigt, så man kan arbejde videre med det.


        System.out.println("Hovedtråden kører.");

        try {
            Integer resultat = futureResultat.get();
            System.out.println("Resultatet fra opgaven er: " + resultat);
        } catch (Exception e) {
            e.printStackTrace();
        }
        worker.shutdown();
        */
    }
}


// Formålet:
// En opgave, der kan køres i en separat tråd, der kan udføres samtidigt med andre opgaver.

// Metode:
// Interfacet har en enkelt metode kaldet run(), hvor du kan skrive koden til opgaven.
class Example1 implements Runnable {
    public void run() {
        System.out.println("En anden tråd kører.");
    }
}


// Formålet:
// En opgave, der kan køres i en separat tråd, der kan udføres samtidigt med andre opgaver.

// Metode:
// Simulerer en opgave, der returnerer en værdi
class Example2 implements Callable<Integer> {
    public Integer call() throws Exception {
        return 42;
    }
}