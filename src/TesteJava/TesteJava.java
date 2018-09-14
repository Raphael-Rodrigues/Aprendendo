/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteJava;

import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 *
 * @author rapha
 */
public class TesteJava {

    public static int instanceCount = 0;
    public static int GetinstanceCount() {
        return instanceCount;
    }
    public static String name;
    public static String GetName(){
        return name;
    }
    public TesteJava(String name){
        instanceCount ++;
        name = name;
    }       
    public static void main(String[] args) {
        TesteJava x = new TesteJava("x");
        TesteJava y = new TesteJava("y");
        TesteJava z = new TesteJava("z");
        
        System.out.println(x.GetName() + " : " + x.GetinstanceCount());
        System.out.println(y.GetName() + " : " + y.GetinstanceCount());
        System.out.println(z.GetName() + " : " + z.GetinstanceCount());
        
        x.name = "zzz";
        System.out.println(x.GetName() + " : " + x.GetinstanceCount());
    }
}
