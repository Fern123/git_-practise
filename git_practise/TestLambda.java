package com.lys.java8.lambda.java;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * 一、lambda 基础语法
 *     参数列表 -> 所需要执行的功能（lambda体）lalal
 *
 */
public class TestLambda {
    /**
     * lambda 无参数 无返回值
     */
    @Test
    public void test(){
        int num=9;
        System.out.println(num++);
        Runnable r=new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };
        r.run();
        Runnable r1=()->System.out.println("Hello2");
        r1.run();
    }
    /**
     * lambda 有一个参数 无返回值
     * 如若只有一个参数,小括号可以不写
     */
    @Test
    public void test2(){
        Consumer<String>  con=(x)-> System.out.println(x);//对抽象方法(accept)的实现
        //  Consumer<String>  con=x-> System.out.println(x);//对抽象方法(accept)的实现
        con.accept("测试");
    }
    /**
     * lambda 多个参数，并且lambda有多条语句，有返回值
     */
    @Test
    public void test3(){
      Comparator<Integer> con=(x1, x2) ->{
          System.out.println("测试");
          return  Integer.compare(x1,x2);
      };
        int compare = con.compare(1, 2);
        System.out.println(compare);
    }
    /**
     * lambda 多个参数，并且lambda有一条语句，有返回值  return和大括号 可以不写
     */
    @Test
    public void test4(){
        Comparator<Integer> con=(x1, x2) ->Integer.compare(x1,x2);
        int compare = con.compare(1, 2);
        System.out.println(compare);
    }
    /**
     * lambda 多个参数，并且lambda有一条语句，有返回值  return和大括号 可以不写
     */
    @Test
    public void test5(){
        Comparator<Integer> con=( x1, x2) ->Integer.compare(x1,x2);
        int compare = con.compare(1, 2);
        System.out.println(compare);
    }
}
