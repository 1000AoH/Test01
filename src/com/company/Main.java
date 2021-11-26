package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        /* In hình vuông */
        printRectangle();

        /* In hình Tam Giác */
        System.out.println("\n");
        printTriangle();

        /* Đêm số từ + char */
        System.out.println();
        countString();

        /* Check prime số nhập bất kì */

        System.out.println();
        checkPrime();

        /* In và check 10 số Prime đầu */

        System.out.println();
        listPrime();

        /* Chuẩn hóa chuỗi */
        System.out.println();
        standardizedString();

        /* Check chuỗi Paindrome */
        System.out.println();
        isPalindrome();

        /* In 2D Array + Kiểm tra đường chéo chính */
        System.out.println();
        Array2D();
    }

    public static void printRectangle() {
        String[][] x = new String[4][4];
        for (int i = 0; i < x.length; i++) {
            System.out.println();
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = "*";
                System.out.print(x[i][j] + "\t");
            }
        }

    }

    public static void printTriangle() {
        int height = 4;
        for (int i = 1; i <= height; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* \t");
            }
            System.out.println();
        }
    }

    public static void countString() {
        String x = "You only live once, but if you do it right, once is enough";
        String[] temp = x.split(" ");
        int count = 0;
        for (int i = 0; i < temp.length; i++) {
            count++;
        }
        System.out.println("Đoạn cho trước có số từ là: " + count);

        char kyTu = 'o';
        int countO = 0;
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == kyTu) {
                countO++;
                y.add(i);
            }
        }
        System.out.println("Số lần xuất hiện ký tự  \"o\" là: " + countO + ". Ở các vị trí lần lượt là: " + y);

    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void checkPrime() {
        int x = (int) Math.round(Math.random() * 100);

        if (isPrimeNumber(x)) {
            System.out.println("Số random: " + x + " là số nguyên tố");
        } else {
            System.out.println("Số random: " + x + " không phải số nguyên tố");
        }
    }

    public static void listPrime() {
        int count = 0;
        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> y = new ArrayList<Integer>();

        for (int i = 2; count < 10; i++) {
            if (isPrimeNumber(i)) {
                count++;
                x.add(i);
                if (i < 10) {
                    y.add(i);
                }
            }
        }
        System.out.println("10 số nguyên tố đầu tiên là: " + x);
        System.out.println("Các số nguyên tố nhỏ hơn 10 là: " + y);

    }

    public static void standardizedString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên của bạn: ");
        String x = scanner.nextLine();
        x = x.trim();
        String[] temp = x.split("\\s+");
        x = "";
        for (int i = 0; i < temp.length; i++) {
            x += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1).toLowerCase();
            x += " ";
        }
        System.out.println("Tên chuẩn hóa là: " + x);

    }

    public static void isPalindrome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi kiểm tra Palindrome: ");

        String y = scanner.nextLine();
        y = y.toLowerCase();
        String reverse = "";
        for (int i = y.length() - 1; i > -1; i--) {
            reverse += y.charAt(i);
        }
        if (reverse.equals(y)) {
            System.out.println(y + " là chuỗi Palindrome");
        }
    }

    public static void Array2D() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số dòng của mảng là: ");
        int a = scanner.nextInt();
        System.out.println("Số cột của mảng là: ");
        int b = scanner.nextInt();

        String[][] x = new String[a][b];

        scanner.nextLine();
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.println("Nhập các phần tử của mảng: ");
                x[i][j] = scanner.nextLine();
            }
        }

        ArrayList<String> y = new ArrayList<String>();
        for (int i = 0; i < x.length; i++) {
            System.out.println();
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + "\t");
                if (i == j) {
                    y.add(x[i][j]);
                }
            }
        }
        System.out.println();
        System.out.println("Các phần tử nằm trên đường chéo chính là: " + y);

    }
}
