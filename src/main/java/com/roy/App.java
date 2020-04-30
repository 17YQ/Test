package com.roy;

import com.roy.myService.Test;
import com.roy.myService.Test1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Test t=new Test();
        Test1 t1=new Test1();
        System.out.println( "GitHub上传项目测试" );
        System.out.println(t.getMe());
        System.out.println(t1.getMe1());
    }
}
