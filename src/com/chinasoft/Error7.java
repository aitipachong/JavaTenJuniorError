package com.chinasoft;

/*
 * 低级错误7：不对数组下标作范围校验。
 */

/**
 * <一句话功能简述>该类用来演示数据下标越界
 * <功能详细描述>
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class Error7
{
    public void checkArray(String name)
    {
        //获取一个数组对象
        String[] cIds = queryByName(name);
        
        if(null != cIds)
        {
           //错误：只是考虑到cids有可能为null的情况，但是cids完全有可能是个0长度的数组，因此cIds[0]有可能数组下标越界。
            String cid=cIds[0];
        
        }

    }

	private String[] queryByName(String name)
	{
		String[] results = new String[0];
		return results;
	}

    
}
