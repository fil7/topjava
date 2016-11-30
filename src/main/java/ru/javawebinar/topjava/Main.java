package ru.javawebinar.topjava;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * User: gkislin
 * Date: 05.08.2015
 *
 * @link http://caloriesmng.herokuapp.com/
 * @link https://github.com/JavaOPs/topjava
 */
public class Main {
    public static void main(String[] args) {
        //System.out.format("Hello Topjava Enterprise!");

        LocalDate localDate = LocalDate.now();
        localDate = localDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY));


    }
}
