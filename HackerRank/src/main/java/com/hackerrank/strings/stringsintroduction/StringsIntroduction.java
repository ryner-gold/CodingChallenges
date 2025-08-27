package com.hackerrank.strings.stringsintroduction;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StringsIntroduction {
    private static final Logger log = LogManager.getLogger(StringsIntroduction.class);

    public static boolean isABeforeB(String a, String b){
        int position = a.compareTo(b);
        boolean result = position >= 1;
        log.info("Position of A compared to B: {} therefore result is: {}", position, result);
        return position >= 1;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        log.info("Total character length: {}", a.length() + b.length());
        boolean result = isABeforeB(a, b);
        if(result){
            log.info("Yes");
        }  else {
            log.info("No");
        }
        if(log.isInfoEnabled()) {
            log.info("{}{} {}{} ", a.substring(0,1).toUpperCase(), a.substring(1),
                b.substring(0,1).toUpperCase(), b.substring(1));
        }
    }
}