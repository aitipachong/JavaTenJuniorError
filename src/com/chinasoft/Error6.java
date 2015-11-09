package com.chinasoft;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * 低级错误6：嵌套使用try-catch，或者try-catch后面没有必要的finally操作（说明：数据库操作、IO操作等需要使用结束close()的对象必须在try -catch-finally 的finally中close()）。 
 */

/**
 * <一句话功能简述>演示嵌套循环的错误
 * <功能详细描述>
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class Error6
{
    /**
     * <一句话功能简述>
     * <功能详细描述>
     * @throws Exception 
     * @see [类、类#方法、类#成员]
     */
    public void checkTry() throws Exception
    {
        StringBuffer sb = null;
        BufferedReader in = null;
        File file = null;
        try
        {
            //initFtpClient(this.ftpClient, getFtpServConfig());
            // 把绝对路径加入到文件中
            String[] absoluteFiles = null;

            //错误：完全没有必要在内容进行异常处理，而应该将异常处理放在try块后面进行处理。
            try
            {
                absoluteFiles = addAbsolutePath("C:\\", file);
            }
            catch(Exception ex)
            {
                throw ex;
            }
            //File file = null;
            in = new BufferedReader(new FileReader(file));
            sb = new StringBuffer();
        }
        catch (Exception e)
        {
            throw e;
        }
         //错误：IO资源没有正确释放，必须有finally进行释放资源
    }

	private String[] addAbsolutePath(String string, File file)
	{
		return null;
	}
}
