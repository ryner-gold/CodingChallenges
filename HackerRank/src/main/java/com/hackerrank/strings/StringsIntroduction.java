package com.hackerrank.strings;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StringsIntroduction {
    private static final Logger log = LogManager.getLogger(StringsIntroduction.class);

    public static boolean isABeforeB(String a, String b){
        int position = a.compareTo(b);
        log.info("Position of A compared to B {}", position);
        return position >= 1;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        log.info("Total character length {}", a.length() + b.length());
        if(isABeforeB(a, b)){
            log.info("No");
        }  else {
            log.info("Yes");
        }
        if(log.isInfoEnabled()) {
            log.info("{} + {}{} ", a.substring(0,1).toUpperCase(),
                b.substring(0,1).toUpperCase(), b.substring(1));
        }
    }
}