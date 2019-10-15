package com.zk.future.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisShardInfo;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TstRedis {

    public static void main(String[] args){
        JedisShardInfo shardInfo = new JedisShardInfo("redis://59.110.234.251:6379/0");
        shardInfo.setPassword("2125");
        Jedis jedis = new Jedis(shardInfo);
        System.out.println("服务器正在运行："+jedis.ping());
        System.out.println("String Write:");
        writeString(jedis);
        System.out.println("List Write:");
        writeList(jedis);
        System.out.println("Keys Instance:");
        keysInstance(jedis);
    }


    private static void writeString(Jedis jedis){
        jedis.set("name", "zking");
        jedis.set("pass", "2125");
        System.out.println("写入的键值对："+jedis.get("name"));
        System.out.println("写入的键值对："+jedis.get("pass"));
        //jedis.del("pass");
        //System.out.println("写入的键值对："+jedis.get("pass"));
    }


    private static void writeList(Jedis jedis){
        jedis.lpush("site-list", "zking");
        jedis.lpush("site-list", "BJGYDX");
        jedis.lpush("site-list", "SolfWare");
        List<String> list = jedis.lrange("site-list", 0, jedis.llen("site-list"));
        for(int i = 0; i < list.size(); i++){
            System.out.println("list node is :"+list.get(i));
        }
    }


    private static void keysInstance(Jedis jedis){
        Set<String> keys = jedis.keys("*");
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key);
        }
    }

}

