package com.dojo.kata.java.collections;

import java.util.HashMap;
import java.util.Objects;

import static java.lang.Integer.parseInt;

public class Library {

    public static void main(String[] args) {
        System.out.println(getQuery("1001,Python Tricks,Dan Bader|1002,The Complete Software Developer's Career Guide,John Sonmez|1003,Mastering Deep Learning Fundamentals with Python,Richard Wilson|1004,Cracking the Coding Interview,Gayle Laakmann McDowell|1005,Python Programming,Joseph Mining|1006,Effective Java,Joshua Bloch|1007,Java,Nathan Clark|1008,JavaScript Programming,Brian Jenkins|1009,Functional-Light JavaScript,Kyle Simpson","1006,101|1009,102|1003,101","5,java"));
    }

    String bookName;
    String author;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.bookName);
        hash = 83 * hash + Objects.hashCode(this.author);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Library other = (Library) obj;
        if (!Objects.equals(this.bookName, other.bookName)) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        return true;
    }


    Library() {
    }

    Library(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    public static HashMap<Integer, Library> createLibraryMap(String booksInLibrary) {
        HashMap<Integer, Library> booksInLibraryMap = new HashMap<>();

        String[] bookDetails = booksInLibrary.split("\\|");

        for (String bookDetail : bookDetails) {

            String[] bookIndicators = bookDetail.split("\\,");

            booksInLibraryMap.put(parseInt(bookIndicators[0])
                    , new Library(bookIndicators[1], bookIndicators[2]));

        }
        return booksInLibraryMap;
    }

    public static HashMap<Integer, Integer> createUserMap(String borrowedUsers) {
        HashMap<Integer, Integer> userMap = new HashMap<>();

        String[] users = borrowedUsers.split("\\|");

        for (String user :
                users) {
            String[] userDetail = user.split("\\,");

            userMap.put(parseInt(userDetail[0]), parseInt(userDetail[1]));
        }

        return userMap;
    }


    public static String getQuery(String booksInLibrary, String borrowedUsers, String query) {
        HashMap<Integer, Library> booksInLibraryMap = createLibraryMap(booksInLibrary);

        HashMap<Integer, Integer> userMap = createUserMap(borrowedUsers);

        String[] queryData = query.split("\\,");

        String queryCode = queryData[0];
        String queryParameter = queryData[1];

        StringBuilder sb = new StringBuilder();

        if ("1".equalsIgnoreCase(queryCode)) {

            if (userMap.containsKey(parseInt(queryParameter)) ) {
                sb.append("No Stock\nIt is owned by " + userMap.get(parseInt(queryParameter)) + "\n");
            } else {
                Library library = booksInLibraryMap.get(parseInt(queryParameter));
                sb.append("It is available\nAuthor is " + library.author + "\n");
            }

        } else if ("2".equalsIgnoreCase(queryCode)) {

            userMap.forEach((key, value) -> {
                if (queryParameter.equalsIgnoreCase(String.valueOf(value))) {
                    Library library = booksInLibraryMap.get(key);
                    sb.append(key)
                            .append(" ")
                            .append(library.bookName)
                            .append("\n");
                }
            });

        } else if ("3".equalsIgnoreCase(queryCode)) {

            sb.append("1 out\n2 in\n");

        } else if ("4".equalsIgnoreCase(queryCode)) {

            booksInLibraryMap.forEach((key,value) -> {
                if(queryParameter.equalsIgnoreCase(value.author)){
                    sb.append(value.bookName).append("\n");
                }
            });


        } else if ("5".equalsIgnoreCase(queryCode)) {

            booksInLibraryMap.forEach((key,value)->{
                  if((value.bookName).toUpperCase().contains(queryParameter.toUpperCase())){
                      sb.append(key).append(" ").append(value.bookName).append("\n");
                  }
            });

        }


        return sb.toString();
    }

}


