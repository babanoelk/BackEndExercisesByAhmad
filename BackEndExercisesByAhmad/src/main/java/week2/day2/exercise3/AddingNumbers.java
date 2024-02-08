package week2.day2.exercise3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Version to correct ->
/*
public class AddingNumbers {

    public static void main(String[] args) {
        ExecutorService workingJack = Executors.newFixedThreadPool(17);
        System.out.println("Main starts");
        IntegerList integerList = new IntegerList();
        for (int count = 0; count < 1000; count++) {
            workingJack.submit(new TaskToAddCount(integerList, count));
        }
        System.out.println("Main is done");
        workingJack.shutdown();

    }

    private static class IntegerList {
        private static List<Integer> list = new ArrayList<>();
        public void addCount(int count) {
            list.add(count);
            System.out.println("Task: " + count + ": List size = " + list.size());
        }
    }
    private static class TaskToAddCount implements Runnable {
        // Gets a reference to the shared list and the count to add
        private IntegerList integerList;
        private int count;

        TaskToAddCount(IntegerList integerList, int count) {
            this.integerList = integerList;
            this.count = count;
        }

        @Override
        public void run() {
            try {
                Thread.sleep((int) Math.random()*800+200);
                integerList.addCount(count);
            } catch (InterruptedException ex) {
                System.out.println("Thread was interrupted");
            }
        }
    }
}
*/

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class AddingNumbers {

    // Problemet var at den samme værdi bliver ændret og printet ud samtidigt med at en anden tråd begynder
    // at ændre værdien. Derfor går det helt galt. Min løsning er at bruge AtomicInteger. AtomicInteger
    // gør den er trådsikker. Således at den samme værdi ikke bliver ændret, mens en anden tråd bruger den.
    // Det er en måde, at sikre at ens program kører fornuftigt.

    public static void main(String[] args) {
        ExecutorService workingJack = Executors.newFixedThreadPool(17);
        System.out.println("Main starts");
        ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();
        AtomicInteger counter = new AtomicInteger(0);

        // Start 1000 opgaver i trådpoolen
        for (int i = 0; i < 1000; i++) {
            workingJack.submit(new TaskToAddCount(map, counter));
        }

        System.out.println("Main is done");
        workingJack.shutdown();
    }

    private static class TaskToAddCount implements Runnable {
        private ConcurrentHashMap<Integer, Integer> map;
        private AtomicInteger counter;

        TaskToAddCount(ConcurrentHashMap<Integer, Integer> map, AtomicInteger counter) {
            this.map = map;
            this.counter = counter;
        }

        @Override
        public void run() {
            try {
                // Simuler en kort ventetid
                Thread.sleep((int) (Math.random() * 1 + 0));

                // Generer en unik værdi til tælleren
                int value = counter.getAndIncrement();

                // Tilføj værdien til map, hvis den ikke allerede findes
                map.putIfAbsent(value, value);

                // Udskriv værdien af tælleren og størrelsen af map
                System.out.println("Task: " + value + ": Map size = " + map.size());
            } catch (InterruptedException ex) {
                System.out.println("Thread was interrupted");
            }
        }
    }
}