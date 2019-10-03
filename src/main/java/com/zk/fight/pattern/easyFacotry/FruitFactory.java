package com.zk.fight.pattern.easyFacotry;

/**
 * @Author: zking
 * @Date: 2019/9/12 10:41
 * @Content:
 */
public class FruitFactory {

    public static Fruit getInstance(String name) throws Exception {
        // 如果name等于"apple"(忽略大小写)，则返回苹果。
        if ("apple".equalsIgnoreCase(name)) {
            return new Apple();
            // 如果name等于"grape"(忽略大小写)，则返回葡萄。
        } else if ("grape".equalsIgnoreCase(name)) {
            return new Grape();
            // 如果name等于"strawberry"(忽略大小写)，则返回草莓。
        } else if ("strawberry".equalsIgnoreCase(name)) {
            return new Strawberry();
            // 其它情况，则抛出异常。
        } else {
            throw new Exception("Bad fruit request!");
        }
    }
}
