import com.zwq.Entity.Author;
import com.zwq.Entity.Book;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo01 {

    public static void main(String[] args) {
         /**
         * 打印所有年龄小于18的作家的名字，并且要注意去重
         */
        List<Author> authors = getAuthors();
        //把集合转化成流
//        test01();
//        test02();
//        test03();
//        test04(authors);
//        test05(authors);
//        test06(authors);
//        test07(authors);
//        test08(authors);
//        test09(authors);
//        test10(authors);
//        test11(authors);
//        test13(authors);
//        test14(authors);
//        test15(authors);
//        test16(authors);
//        test17(authors);
//        test18(authors);
//        test23(authors);
//        test24(authors);
//        test26(authors);
//        testAnd(authors);
//        test27(authors);
        test28();
    }

    private static void test28() {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9,10);
//        Integer sum = stream.filter(num -> num > 5)
//                .reduce((result, element) -> result + element)
//                .get();
//        System.out.println(sum);
        Integer sum = stream
                .parallel()
                .peek(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) {
                        System.out.println(integer+" "+Thread.currentThread().getName());
                    }
                })
                .filter(num -> num > 5)
                .reduce((result, element) -> result + element)
                .get();
        System.out.println(sum);
    }

    /**
     * 引用类的静态方法
     * @param authors
     */
    private static void test27(List<Author> authors) {
        Stream<Author> authorStream = authors.stream();
        authorStream.map(author -> author.getAge())
                .map(String::valueOf); //传入的参数只有一个，就是age

    }


    /**
     * 打印作家中年龄大于17且姓名长度大于1的作家
     * @param authors
     */
    private static void testAnd(List<Author> authors) {
        authors.stream()
                .filter(new Predicate<Author>() {
                    @Override
                    public boolean test(Author author) {
                        return author.getAge()>17;
                    }
                }.and(new Predicate<Author>() {
                    @Override
                    public boolean test(Author author) {
                        return author.getName().length()>1;
                    }
                })).forEach(author -> System.out.println(author.getAge()+":::"+author.getName()));
    }

    /**
     * 使用reduce求所有作者的年龄的最小值
     * reduce中只传入一个参数
     * @param authors
     */
    private static void test26(List<Author> authors) {
        Optional<Integer> min = authors.stream()
                .map(author -> author.getAge())
                .reduce(new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer result, Integer element) {
                        return result < element ? result : element;
                    }
                });
        System.out.println("min = " + min);


    }

    /**
     * 使用reduce对年龄求最值
     * @param authors
     */
    private static void test24(List<Author> authors) {
        Integer max = authors.stream()
                .map(author -> author.getAge())
                .reduce(Integer.MIN_VALUE, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer result, Integer element) {
                        return result < element ? element : result;
                    }
                });
        System.out.println(max);
    }

    /**
     * 使用reduce求所有作者年龄的和
     * @param authors
     */
    private static void test23(List<Author> authors) {
        Integer sum = authors.stream()
                .map(author -> author.getAge())
                .reduce(0, (result, element) -> result + element);
        System.out.println(sum);
    }

    /**
     * 判断是否有年龄在 29以上的作家
     * @param authors
     */
    private static void test18(List<Author> authors) {
        boolean b = authors.stream()
                .anyMatch(author -> author.getAge() > 29);
        System.out.println(b);
    }

    /**
     * 获取 一个Map集合，key为作者，value为List<Book>
     * @param authors
     */
    private static void test17(List<Author> authors) {
        Map<String,List<Book>> map = authors.stream()
                .distinct()
                .collect(Collectors.toMap(new Function<Author, String>() {
                    @Override
                    public String apply(Author author) {
                        return author.getName();
                    }
                }, new Function<Author, List<Book>>() {
                    @Override
                    public List<Book> apply(Author author) {
                        return author.getBookList();
                    }
                }));
//        System.out.println(map);
    }

    /**
     * 获取一个所有书名的set集合
     * @param authors
     */
    private static void test16(List<Author> authors) {
        Set<Book> bookSet = authors.stream()
                .flatMap(author -> author.getBookList().stream())
                .collect(Collectors.toSet());
        System.out.println(bookSet);
    }

    /**
     * 获取一个存放所有 作者名字的List集合
     * @param authors
     */
    private static void test15(List<Author> authors) {
        List<String> nameList = authors.stream()
                .map(author -> author.getName())
                .collect(Collectors.toList());
        System.out.println(nameList);
    }

    /**
     * 获取作家所出书籍的最高分和最低分并打印
     * @param authors
     */
    private static void test14(List<Author> authors) {
        Optional<Double> max = authors.stream()
                .flatMap(author -> author.getBookList().stream())
                .map(book -> book.getScore())
                .max(new Comparator<Double>() {
                    @Override
                    public int compare(Double score1, Double score2) {
                        return (int) (score1 - score2);
                    }
                });
        System.out.println(max.get());

    }

    /**
     * 打印作家所出书籍的数目，注意删除重复元素
     * @param authors
     */
    private static void test13(List<Author> authors) {
        long res = authors.stream()
                .flatMap(author -> author.getBookList().stream())
                .distinct()
                .count();
        System.out.println(res);
    }

    /**
     * 打印所有数据的分类，并对分类进行去重
     * 对于有多个分类的要进行分割
     * @param authors
     */
    private static void test11(List<Author> authors) {
        authors.stream()
                .flatMap((Function<Author, Stream<Book>>) author -> author.getBookList().stream())
                .distinct()
                .flatMap(book -> Arrays.stream(book.getCategory().split(",")))
                .distinct()  //对分类进行去重
                .forEach(category-> System.out.println(category));

    }

    /**
     * 打印所有书籍的名字并进行去重
     * @param authors
     */
    private static void test10(List<Author> authors) {
        authors.stream()
                .flatMap(new Function<Author, Stream<Book>>() { //这里不限制类型后面会报错
                    @Override
                    public Stream<Book> apply(Author author) {
                        return author.getBookList().stream();
                    }
                })
                .distinct()
                .forEach((Consumer<Book>) book -> System.out.println(book.getName()));
    }

    private static void test09(List<Author> authors) {
        authors.stream()
                .distinct()
                .sorted()
                .skip(1)
                .forEach(author -> System.out.println(author.getName()));
    }

    /**
     * 对年龄进行排序，并且要求不能有重复的元素，然后打印年龄最大的两个作家的姓名
     * @param authors
     */
    private static void test08(List<Author> authors) {
        authors.stream()
                .distinct()
                .sorted()
                .limit(2)
                .forEach(author -> System.out.println(author.getName()));
    }

    /**
     * 对流中的年龄进行降序排序并且要求不能有重复的元素
     * sorted
     * @param authors
     */
    private static void test07(List<Author> authors) {
        //空参的sorted,无法对自定义的类进行比较
        authors.stream()
                .distinct()
                .sorted((author, t1) -> t1.getAge() - author.getAge())
                .forEach(author -> System.out.println(author.getAge()));
    }

    /**
     * 作家姓名去重
     * distinct
     * @param authors
     */
    private static void test06(List<Author> authors) {
        authors.stream()
                .distinct()
                .forEach(author -> System.out.println(author.getName()));
    }

    /***
     * 打印所有作家的姓名
     * map
     * @param authors
     */
    private static void test05(List<Author> authors) {
//        authors.stream()
//                .map(new Function<Author, String>() {
//                    @Override
//                    public String apply(Author author) {
//                        return author.getName();
//                    }
//                })
//                .forEach(name-> System.out.println(name));
        authors.stream()
                .map(author -> author.getAge())
                .map(age -> age + 10)
                .forEach(age-> System.out.println(age));

    }

    /**
     * 打印所有姓名长度大于1的作家的姓名
     * filter
     */
    private static void test04(List<Author> authors) {
        authors.stream()
                .filter(new Predicate<Author>() {
                    @Override
                    public boolean test(Author author) {
                        return author.getName().length() > 1;
                    }
                })
                .forEach(author -> System.out.println(author.getName()));
    }

    private static void test03() {
        Map<String,Integer> map = new HashMap<>();
        map.put("wayne",23);
        map.put("tom",17);
        map.put("kim",16);

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        entrySet.stream()
                .filter(new Predicate<Map.Entry<String, Integer>>() {
                    @Override
                    public boolean test(Map.Entry<String, Integer> entry) {
                        return entry.getValue()>16;
                    }
                })
                .forEach(new Consumer<Map.Entry<String, Integer>>() {
                    @Override
                    public void accept(Map.Entry<String, Integer> entry) {
                        System.out.println(entry.getKey()+" ======== "+entry.getValue());
                    }
                });
    }

    private static void test02() {
        Integer[] arr = {1,2,3,4,5};
        Stream<Integer> stream = Arrays.stream(arr);
//        Stream<Integer> stream1 = Stream.of(arr);
        stream.distinct()
                .forEach(integer -> System.out.println(integer));

    }

    private static void test01(List<Author> authors){
        authors.stream()
                .distinct()  //去重
                .filter(author -> author.getAge()<18)
                .forEach(author -> System.out.println(author.getName()));
    }

    // 初始化一些数据
    private static List<Author> getAuthors() {
        Author author1 = new Author(1L, "杨杰炜", "my introduction 1", 18, null);
        Author author2 = new Author(2L, "yjw", "my introduction 2", 19, null);
        Author author3 = new Author(3L, "yjw", "my introduction 3", 14, null);
        Author author4 = new Author(4L, "wdt", "my introduction 4", 29, null);
        Author author5 = new Author(5L, "wtf", "my introduction 5", 12, null);

        List<Book> books1 = new ArrayList<>();
        List<Book> books2 = new ArrayList<>();
        List<Book> books3 = new ArrayList<>();

        // 上面是作者和书
        books1.add(new Book(1L, "类别,分类啊", "书名1", 45D, "这是简介哦"));
        books1.add(new Book(2L, "高效", "书名2", 84D, "这是简介哦"));
        books1.add(new Book(3L, "喜剧", "书名3", 83D, "这是简介哦"));

        books2.add(new Book(5L, "天啊", "书名4", 65D, "这是简介哦"));
        books2.add(new Book(6L, "高效", "书名5", 89D, "这是简介哦"));

        books3.add(new Book(7L, "久啊", "书名6", 45D, "这是简介哦"));
        books3.add(new Book(8L, "高效", "书名7", 44D, "这是简介哦"));
        books3.add(new Book(9L, "喜剧", "书名8", 81D, "这是简介哦"));

        author1.setBookList(books1);
        author2.setBookList(books2);
        author3.setBookList(books3);
        author4.setBookList(books3);
        author5.setBookList(books2);

        return new ArrayList<>(Arrays.asList(author1, author2, author3, author4, author5));
    }
}
