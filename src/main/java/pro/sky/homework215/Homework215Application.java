package pro.sky.homework215;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pro.sky.homework215.domain.IntegerList;
import pro.sky.homework215.domain.IntegerListImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

@SpringBootApplication
public class Homework215Application {

    public static void main(String[] args) {

        SpringApplication.run(Homework215Application.class, args);

//        Random random = new Random();
//
//        IntegerListImpl integerListOne = new IntegerListImpl(100_000);
//
//        for (int i = 0; i < 100_000; i++) {
//            integerListOne.add(random.nextInt(1000));
//        }
//
//        IntegerListImpl integerListTwo = integerListOne.copy();
//        IntegerListImpl integerListThree = integerListOne.copy();
//
//        System.out.println("integerListOne = " + integerListOne);
//        System.out.println("integerListTwo = " + integerListTwo);
//        System.out.println("integerListThree = " + integerListThree);
//
//        long start1 = System.currentTimeMillis();
//        integerListOne.sortBubble();
//
//        System.out.println("integerListOne = " + integerListOne);
//
//        long start2 = System.currentTimeMillis();
//        integerListTwo.sortSelection(); //лучшее чем sortBubble в 3 раза быстрее
//
//        System.out.println("integerListTwo = " + integerListTwo);
//
//        long start3 = System.currentTimeMillis();
//        integerListThree.sortInsertion(); // лучшее чем sortSelection в 2 раза быстрее
//
//        System.out.println("integerListThree = " + integerListThree);
//
//        System.out.println();
//        System.out.println("start1 = " + (System.currentTimeMillis() - start1));
//        System.out.println("start2 = " + (System.currentTimeMillis() - start2));
//        System.out.println("start3 = " + (System.currentTimeMillis() - start3));

    }

}
