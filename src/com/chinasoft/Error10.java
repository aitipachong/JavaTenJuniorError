package com.chinasoft;

/*
 * 低级错误10：没有在异常分支记录日志导致问题定位困难
 */


public class Error10
{
    /**
    * 根据objectId删除业务信息
    *
    * @param id 业务objectId
    * @throws IllegalServiceStatusException 非法业务状态异常
    * @see [类、类#方法、类#成员]
    */     
public void deleteService(String id)
       throws IllegalServiceStatusException
   {
       log.enterMethodDebugLog(new Object[][] {{"id", id}});
       MdspTServiceinfo serviceInfo = getMdspServiceByObjectId(id);
       if (null == serviceInfo)
       {
            return;
            //错误：异常分支没有记录日志，导致问题定位困难。
       }
       ........
       
   }

}
