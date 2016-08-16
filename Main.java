package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  throws FileNotFoundException {
	// write your code here


        Scanner in  = new Scanner(new File("c:\\temp\\hello.txt"));

        System.out.println(in.next());
        System.out.println(in.next());
    }
}
