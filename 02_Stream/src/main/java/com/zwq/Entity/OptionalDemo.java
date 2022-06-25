package com.zwq.Entity;

import java.util.Optional;
import java.util.function.Consumer;

public class OptionalDemo {

    public static void main(String[] args) {
//        Author author = getAuthor();
//        Optional<Author> authorOptional = Optional.ofNullable(author);
//        authorOptional.ifPresent(author1 -> System.out.println(author1.getName()));

        Optional<Author> authorOptional = getAuthorOptional();
        authorOptional.ifPresent(author -> System.out.println(author.getName()));
    }

    public static  Optional<Author> getAuthorOptional(){
        Author author = new Author(1L,"WAYNE","厦门人",23,null);
        return Optional.ofNullable(author);
    }

    public static  Author getAuthor(){
        Author author = new Author(1L,"WAYNE","厦门人",23,null);
        return author;
    }
}
