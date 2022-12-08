package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {

        Book chapterOne = new Book("Chapter One", 106);
        Book chapterTwo = new Book("Chapter Two", 71);
        Book chapterThree = new Book("Chapter Three", 83);
        Book chapterFour = new Book("Chapter Clean Code", 95);

        Book[] books = {chapterOne, chapterTwo, chapterThree, chapterFour};

        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + ", number of pages " + bk.getPages());
        }

        System.out.println();
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + ", number of pages " + bk.getPages());
        }

        System.out.println();
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if ("Chapter Clean Code".equals(bk.getName())) {
                System.out.println(bk.getName() + ", number of pages: " + bk.getPages());
            }
        }
    }
}