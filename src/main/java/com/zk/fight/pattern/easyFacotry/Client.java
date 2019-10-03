package com.zk.fight.pattern.easyFacotry;

/**
 * @Author: zking
 * @Date: 2019/9/12 10:43
 * @Content:
 */
public class Client {

    public static void main(String[] args) {
        try {
            Fruit apple = FruitFactory.getInstance("Apple");
            apple.grow();
            apple.harvest();
            apple.plant();

            Fruit grape = FruitFactory.getInstance("Grape ");
            grape.grow();
            grape.harvest();
            grape.plant();

            Fruit strawberry  = FruitFactory.getInstance("Strawberry");
            strawberry .grow();
            strawberry .harvest();
            strawberry .plant();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
