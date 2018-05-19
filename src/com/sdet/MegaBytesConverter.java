package com.sdet;

public class MegaBytesConverter {

    public static void main(String[] args) {
	// write your code here
        printMegaBytesAndKiloBytes(-233);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            int mb = kiloBytes / 1024;
            int remainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + mb + " MB and " + remainder +" KB");
        }
    }
}
