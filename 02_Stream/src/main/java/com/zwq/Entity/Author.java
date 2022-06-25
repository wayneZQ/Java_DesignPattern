package com.zwq.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Author implements Comparable<Author>{
    //id
    private Long id;
    // 姓名
    private String name;
    // 年龄
    private String introduction;
    // 简介
    private Integer age;
    // 作品
    private List<Book> bookList;

    @Override
    public int compareTo(Author author) {
        return author.getAge() - this.getAge();
    }
}
