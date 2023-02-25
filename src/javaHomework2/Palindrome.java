package javaHomework2;

public class Palindrome {
    //Создать метод, который проверяет, является ли строка палиндромом.
    // Палиндром - шалаш
    public static void main (String[] args) {
        String s = "шалаш";
        s = s.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        if (s.toLowerCase().equals((new StringBuilder(s)).reverse().toString().toLowerCase()))
            System.out.println("Палиндром! ;) " + s);
        else
            System.out.println("Не палиндром! :( " + s);

    }
}
