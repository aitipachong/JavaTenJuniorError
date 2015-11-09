package com.chinasoft;

/*
 * 低级错误9：字符串转化为数字时没有做异常处理
 */

public class Error9
{
    /**
     * <一句话功能简述>字符传传唤成数字
     * <功能详细描述>
     * @see [类、类#方法、类#成员]
     */
    public void switchStr()
    {
        String temp = "123a";

        //错误：对字符串转换为数字没有进行任何异常处理。可能抛出未知异常。
        if(Integer.parseInt(temp) == 123)
        {
           //......
        }
    }

}
