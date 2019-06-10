/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author user
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.mycompany\\context.xml");

        MessageRendererBefore rendererBefore = (MessageRendererBefore) context.getBean("MessageRendererBefore");
        rendererBefore.printMessage();

        IndependentMessageRenderer rendererIndepency = context.getBean(IndependentMessageRenderer.class);
        rendererIndepency.print();
               
    }
}
