package week2.fridayReview;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Understand what JSON is and how to use Jackson or Gson to convert between JSON and DTOs
public class Main {
    public static void main(String[] args) {

        // Example 1
        /*
        Example1 example1 = new Example1();

        ExecutorService worker = Executors.newCachedThreadPool();
        worker.execute(example1);

        System.out.println("Hovedtråden kører.");

        worker.shutdown();

         */

        // Example 2
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


class Example2 implements Callable<T> {
    @Override
    public T call() throws Exception {
        return T;
    }
}