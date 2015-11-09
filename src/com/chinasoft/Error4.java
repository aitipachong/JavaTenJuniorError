package com.chinasoft;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;

/*
 * 低级错误4：数据库操作、IO操作的资源没有及时释放，数据库结果集和连接释放顺序不正确，或者使用没有必要的预处理。 
 */

/**
 * <一句话功能简述>该类用来演示没有释放资源的的错误
 * <功能详细描述>
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class Error4
{
//    public void releaseDB ()
//    {
//        Connection conn = null;
//        APLResultSet rs = null;
//        String sql= "";
//        
//        try
//        {
//            conn = DB.getConnection();
//
//            rs = DB.query(sql);
//            if (rs.next())
//            {
//                return rs.getString("currentdate");
//            }
//            else
//            {
//                return DateTool.getCurrentDate(pattern);
//            }
//            Conn.close();  
//         	//错误：连接没有在finally正确释放，会出现异常时导致在运行一段时间后，系统由于连接池满载而崩溃。
//        }
//        catch (Exception e)
//        {
//            //...................
//        	throw e;
//        }
//        //错误：资源APLResultSet没有正确释放   
//    }
	/**
	 * <一句话功能简述>
	 * <功能详细描述>
	 * @param file
	 * @throws Exception 
	 * @see [类、类#方法、类#成员]
	 */
    public void releaseIO (File file) throws Exception
    {
        StringBuffer sb = null;
        BufferedReader in = null;
        try
        {
            in = new BufferedReader(new FileReader(file));

            sb = new StringBuffer();
            for (String line; (line = in.readLine()) != null;)
            {
                sb.append(line + "\r\n");
            }
        }
        catch (Exception e)
        {
            throw e;
        }
         //错误：IO资源没有正确释放，需要在finally中释放资源
    }
}
