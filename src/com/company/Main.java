package com.company;


import static com.company.Date.printSortedArrayDates;
import static com.company.Date.sortDate;

public class Main {
    public static void main(String[] args) {
        Date d1 = new Date(23, 8, 2006);
        Date d2 = new Date(2, 1, 1902);
        Date d3 = new Date(12, 7, 1975);
        Date d4 = new Date(2, 1, 2006);
        Date d6 = new Date(2, 1, 2006);
        Date d5 = new Date(28, 9, 1965);

        Date[] dates = new Date[]{d1, d2, d3, d4, d5, d6};

        sortDate(dates);
        printSortedArrayDates(dates);
    }
}
