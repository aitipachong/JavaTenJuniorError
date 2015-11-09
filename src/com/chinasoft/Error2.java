package com.chinasoft;

/*
 * 低级错误2：数据类不重载toString（）方法（说明：编程规范要求“所有的数据类必须重载toString() 方法，返回该类有意义的内容”）。
 */

public class Error2 extends BaseMetaData
{
	private String oldCID;

    private String cId;

    private String spId;

    private int type;

	private int serviceType;
	//.........................
    /**
     * 设置修改标识
     * @param update_flag 修改标识
     */
    public void setUpdate_flag(String update_flag)
    {
        this.updateFlg = update_flag;

    }
    public void setVersion(String version)
    {
        this.version = version;
	}
	    
	public String toString()		
    {
	    //没有重载toString方法或者重载无意义的toString方法
		return null;   
	}

}
