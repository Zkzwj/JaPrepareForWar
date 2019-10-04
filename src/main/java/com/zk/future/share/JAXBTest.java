package com.zk.future.share;


import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;

/**
 * @Author: zking
 * @Date: 2019/7/14 20:24
 * @Content:
 */
public class JAXBTest {
    public void generateXML() {
        Person person = new Person("abc", "男", "北京", "朝阳区");
        File file = new File("E:\\person.xml");
        JAXB.marshal(person, file);
    }

    public void generateBean() {
        File file = new File("E:\\person.xml");
        Person person = JAXB.unmarshal(file, Person.class);

        System.out.println(person);
    }
}