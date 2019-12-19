package com.codegym.task.task33.task3307;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.IOException;
import java.io.StringReader;

/*
Deserializing an XML object

*/
public class Solution {
    public static void main(String[] args) throws IOException, JAXBException {
        String xmlData = "<cat><name>Missy</name><age>5</age><weight>4</weight></cat>";
        Cat cat = convertFromXmlToNormal(xmlData, Cat.class);
        System.out.println(cat);
    }

    public static <Cat> Cat convertFromXmlToNormal(String xmlData, Class<Cat> clazz) throws IOException, JAXBException {
        StringReader reader = new StringReader(xmlData);
        JAXBContext jax = JAXBContext.newInstance(clazz);
        Unmarshaller unmarshaller = jax.createUnmarshaller();
        Cat cat = (Cat) unmarshaller.unmarshal(reader);
        return cat;
//        return null;
    }

    @XmlType(name = "cat")
    @XmlRootElement
    public static class Cat {
        public String name;
        public int age;
        public int weight;

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", weight=" + weight +
                    '}';
        }
    }
}