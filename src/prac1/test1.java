package prac1;

public class test1 {

        public static void main(String[] args) {

            int[] numbers = new int[500000];


            for (int i = 0; i < 500000; i++) {
                numbers[i] = (int)(Math.random()*500000);
            }

            Stopwatch stopwatch = new Stopwatch();

            System.out.println("Sorting array using Bubble Sort (this will take a while)...");
            stopwatch.start();

            bubbleSort(numbers);

            stopwatch.stop();

            long elapsedTimeMs = stopwatch.getElapsedTime();
            System.out.println("Sorting completed!");
            System.out.println("Elapsed time: " + elapsedTimeMs + " ms (" + (elapsedTimeMs / 1000.0) + " seconds)");
        }

        // Bubble Sort Algorithm
        public static void bubbleSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;

                    }
                }
            }
        }
    }

