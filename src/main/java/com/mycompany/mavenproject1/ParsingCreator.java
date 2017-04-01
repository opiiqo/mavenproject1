/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;


import com.google.gson.InstanceCreator;
import java.lang.reflect.Type;

/**
 *
 * @author MacPro2015
 */
public class ParsingCreator implements InstanceCreator <Parsing>{
    
      public Parsing createInstance(Type type) 
        {
            return new Parsing();
        }

}
