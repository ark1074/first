package com.springinaction.knights;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.BeansException;


    public class KnightMain {
        public static void main(String[] args) {
            AbstractApplicationContext context = null;
            Knight knight = null;
            try {
                context = new ClassPathXmlApplicationContext("knight.xml");
                knight = context.getBean(Knight.class);
            }
            catch (BeansException e){

            }
            knight.embarkOnQuest();
            knight.testKnight();
            context.close();
        }
    }


