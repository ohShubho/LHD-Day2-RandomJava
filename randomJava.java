import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {

        int min = 1;
        int max = 100;

        System.out.println("Random value from " + min + " to " + max + ":");

        int random_int = (int) (Math.random() * (max - min + 1) + min);

        System.out.println(random_int);

    }
}