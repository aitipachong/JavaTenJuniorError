package com.chinasoft;

/*
 * 低级错误3：对方法的调用不进行空指针判断而造成空指针异常。
 */

/**
 * <一句话功能简述>演示不进行空指针判断造成空指针异常
 * <功能详细描述>
 *
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class Error3
{
    /**
     * <一句话功能简述>
     * <功能详细描述>
     * @return
     * @see [类、类#方法、类#成员]
     */
    public String returnNull()
    {
        String temp = null;
        return temp;
    }

    public void checkNull()
    {
        String str1 = "aa";

        //错误：没有对returnNull()的值进行为空判断，会造成空指针
    	if (str1.equals(returnNull()))
        {
            str1 = returnNull();
        }
        print(str1);

    }

    public void print(String str)
    {
    }

}
