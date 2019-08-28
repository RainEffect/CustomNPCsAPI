package noppes.npcs.api.block;

import noppes.npcs.api.ITimers;

/**
 * 用于操作在世界内的脚本门对象
 */
public interface IBlockScriptedDoor extends IBlock{
	
	/**
	 * 获取当前脚本门的计时器组
	 */
	public ITimers getTimers();

	/**
	 * 获取当前脚本门的开启状态
	 */
	public boolean getOpen();

	/**
	 * 设置当前脚本门的开启状态
	 */
	public void setOpen(boolean open);

	/**
	 * 设置当前脚本门的模型（物品名方式）
	 * @param name 物品名
	 */
	public void setBlockModel(String name);

	/**
	 * 获取当前脚本门的模型所对应的物品名
	 */
	public String getBlockModel();
	
	/**
	 * 获取当前脚本门的破坏硬度
	 * @return 破坏硬度（-1为无法破坏）
	 */
	public float getHardness();
	
	/**
	 * 设置当前脚本门的破坏硬度
	 * @param hardness 破坏硬度（-1为无法破坏）
	 */
	public void setHardness(float hardness);
	
	/**
	 * 获取当前脚本门的爆炸阻力（-1为无法炸毁）
	 */
	public float getResistance();
	
	/**
	 * 设置当前脚本门的爆炸阻力
	 * @param resistance 爆炸阻力（-1为无法炸毁）
	 */
	public void setResistance(float resistance);

}
