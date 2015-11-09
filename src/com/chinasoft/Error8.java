package com.chinasoft;

/*
 * 低级错误8：equals操作时没有将常量放在equals操作符的左边（说明：字符串变量与常量比较时，先写常量，这样可以避免空指针异常）
 */


public class Error8
{
    /**
    * 定义常量
    */
   public static final String SP_NAME = "SPNAME";

   /**
    * <一句话功能简述>常量比较
    * <功能详细描述>
    * @see [类、类#方法、类#成员]
    */
   public void equalsConst()
   {
       String temp = null;

       //错误;//在temp为null的情况下，此时会导致意想不到的异常抛出，如果将常量放在左边，就不会有这种问题。
       if(temp.equals(SP_NAME))
       {
          temp = SP_NAME + "AA";

       }
   }
}
