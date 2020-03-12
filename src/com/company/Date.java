package com.company;
public class Date {
    private int day, month, year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void displayArrayDate() {
        System.out.println("Day: " + day + "; " + "Month: " + month + "; " + "Year: " + year + " .");
    }

    public static void printSortedArrayDates(Date[] dates) {
        for (Date d : dates) {
            d.displayArrayDate();
        }
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }


    public  static int dateComparator (Date d1, Date d2){
        if (d1.year!=d2.year){ // new
            return d1.year-d2.year;
        }
        if (d1.month!=d2.month) {
            return d1.month - d2.month;
        }
        return d1.day - d2.day;
    }

    public static int compareDateByYear(Date d1, Date d2) {
        /* сравнение по годам  */

        return d1.year > d2.year ? 1 : d1.year < d2.year ? -1 : 0;

       /* хотел остсортировать с условием, если попадутся одинаковые года, месяца и дни.
          Но к сожалению не получается. Можете мне подсказать пожалуйста, где и что делаю не правильно */


    /*     if (d1.year > d2.year) {
            return 1;
        } else if (d1.year < d2.year) {
            return -1;
        } else {
            return compareDateByMonth(d1,d2);
        }
    }
        public static int compareDateByMonth(Date d1, Date d2){
            if (d1.month > d2.month) {
                return 1;
            } else if (d1.month < d2.month) {
                return -1;
            } else {
                return compareDateByDay(d1,d2);
            }
        }
            public static int compareDateByDay(Date d1, Date d2){
        if (d1.day > d2.day){
            return 1;
        } else if (d1.day < d2.day) {
            return -1;
        } else {
            return 0;
        } */
    }

    public static void sortDate(Date[] dates) {
        for (int i = 0; i < dates.length; i++) {
            for (int j = 0; j < (dates.length - 1) - i; j++) {
                if (dateComparator(dates[j], dates[j + 1]) > 0) {
                    Date tmp = dates[j];
                    dates[j] = dates[j + 1];
                    dates[j + 1] = tmp;
                }
            }
        }
    }
}
