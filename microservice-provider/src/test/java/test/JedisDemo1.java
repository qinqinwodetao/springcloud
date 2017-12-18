package test;


import org.aspectj.weaver.World;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Jedis 测试
 * Created by wucy on 2017/6/13.
 */
public class JedisDemo1 {

    private static final Logger log = LoggerFactory.getLogger(JedisDemo1.class);


    @Test
    public void jedisConnectingTest(){
        Jedis jedis = new Jedis("127.0.0.1",6379);

        jedis.set("name","123");

        String value = jedis.get("name").toString();
        log.info("jedisConnectingTest value={}",value);

        Assert.assertEquals("123",value);

        jedis.close();

    }


    @Test
    public void jedisPoolTest(){
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(0);

        JedisPool jedisPool = new JedisPool("127.0.0.1",6379);

        Jedis jedis = null;

        jedis = jedisPool.getResource();

        System.out.println( jedis.hgetAll("1111"));
        jedis.set("name","123");

        String value = jedis.get("name").toString();


        System.out.println(value);
        Assert.assertEquals("123",value);


    }

    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        List<List<String>> b = new LinkedList<>();

        a.add("before");
        b.add(a);
        a.add("after");

        System.out.println(b.size());


     /*   String s1 = "hello";
        String s2 = "world";


        System.out.println(s1 + "---"+ s2);
        change(s1, s2);
        System.out.println(s1 + "---"+ s2);*/


        String s1 = "Hello";  //产生一个String "Hello"对象,并产生该对象的一个别名s1来引用该对象
        String s2 = "Hello";  //又产生一个别名s2来引用上面的"Hello"对象
        if(s1 == s2){
            System.out.println("s1 == s2");
        }
        s1 = "World";  //产生一个String "World"对象, s1的引用不再指向"Hello"而是指向对象"World"
        System.out.println("s1 == s2:" + s1 == s2);   //由于不是同一个对象所以"=="返回为false
        s1 = "Hello";
        

    }

    public static void change(String s1, String s2){
        s1 = s2;
        s2 = s1 + s2;
    }


}
