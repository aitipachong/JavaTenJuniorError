package com.chinasoft;


/*
 * 低级错误1：方法和变量命名随意而不规范，没有类注释、方法注释或注释不规范，代码修改后，不同步修改注释，导致注释与代码不符。 
*/


public class Error1
{
	//错误：没有类的注释
	//错误：方法的注释不规范、方法名不规范
    public void a( int i )
	{      
    	//错误：变量名称太短 
    	String b = "";    

    	//错误：变量名称太长，超过40个字符
    	String longVariableLongVariableLongVariableLongVariable = ""; 
	} 

    /**
     * <一句话功能简述>方法命名约定：应以小写字母开头、同时命名不应含有下划线字符。
     * <功能详细描述>
     * @param i
     * @see [类、类#方法、类#成员]
     */
    public void Check_Method( int i )
    {
        // 错误：方法名称不规范 
    	//错误：变量名称不规范
    	String b = "";  
	}

    /**
    * <一句话功能简述>变量、方法名、类名、接口名避免出现美元字符$。
    * <功能详细描述>
    * @param i
    * @see [类、类#方法、类#成员]
    */
    public void Fo$o ()
	{  
    	// 错误：方法名称不规范     
	}

    /**
     * <一句话功能简述>注意hashCode方法大小写。此规则用于推测作者可能是要实现hashCode方法，但大小写错了。
     * <功能详细描述>
     * @return
     * @see [类、类#方法、类#成员]
     */
    public int hashcode()
    {
        // 错误：方法名称不规范
    	int temp = 0;
        // oops, this probably was supposed to be hashCode
        return temp;

    }

    /**
     *
     * @param o 只有参数类型和返回值类型不一致，方法名equals完全相同（包括大小写也相同），推测可能是想实现equals方法。
     * @return
     */
    public int equals(Object o)
    {
        // 错误：方法名称不规范
    	// 	oops, this probably was supposed to be boolean equals
        int temp = 0;
        return temp;
    }

    /**
     * <一句话功能简述>只有参数类型和返回值类型不一致，方法名equals完全相同（包括大小写也相同），推测可能是想实现equals方法。
     * <功能详细描述>
     * @param s
     * @return
     * @see [类、类#方法、类#成员]
     */
    public boolean equals(String s)
    {
        // 错误：方法名称不规范
    	// oops, this probably was supposed to be equals(Object)
        return true;
    }

    /**
     * <一句话功能简述>'getX()'方法同时返回值又是 'boolean' ，则建议用'isX()'命名。checkParameterizedMethods属性用于决定是否对带参数的方法检测。
     * <功能详细描述>
     * @return
     * @see [类、类#方法、类#成员]
     */
    public boolean getFoo()
    {
        // 错误：方法名称不规范
		// bad
        return true;
    }
}
