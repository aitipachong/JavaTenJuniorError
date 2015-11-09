package com.chinasoft;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;

/*
 * 低级错误5：循环体内包含了大量没有必要在循环中处理的语句，循环体内循环获取数据库连接，循环体内进行不必要的try-catch操作。（说明：编程规范中建议“不要在循环体内调用同步方法和使用 try-catch 块”） 
 */

/**
* <一句话功能简述>该类用来演示循环中的错误
* <功能详细描述>
* @see  [相关类/方法]
* @since  [产品/模块版本]
*/
public class Error5
{
    public void cycleInfo() throws IOException
    {
        String[] Str = null;

        //获取各个部件的通知地址
        Str = outNotify.getResult();
        StringBuffer sb = null;
        BufferedReader in = null;

        Connection conn = null;
        APLResultSet rs = null;
        String sql= "";
        File file = null;


        for (int i = 0; i < Str.length; i++)
        {
           //错误：判断完全可以在for外部进行而不是在内内部。
           if( null != Str)
           {
               System.out.print(Str[i]);
           }
       	
           
           //错误：不要在循环中获取数据库连接。
           conn = DB.getConnection();

           //错误：循环体内进行无必要的try-catch操作,完全可以放在循环外边。
           try
           {
               //错误：不要在循环中获取IO连接。
               in = new BufferedReader(new FileReader(file));

               sb = new StringBuffer();
               
           }
           catch (IOException ex)
           {
               throw ex;
           }
        }
    }

}
