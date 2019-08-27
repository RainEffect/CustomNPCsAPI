package noppes.npcs.api.block;

import noppes.npcs.api.ITimers;
import noppes.npcs.api.item.IItemStack;

public interface IBlockScripted extends IBlock{

	/**
	 * 设置当前方块的模型（物品堆方式）
	 * @param item 物品堆
	 */
	public void setModel(IItemStack item);

	/**
	 * 设置当前方块的模型（物品名方式）
	 * @param name 物品名
	 */
	public void setModel(String name);

	/**
	 * 获取当前方块的模型所对应的物品堆
	 */
	public IItemStack getModel();
	
	/**
	 * 获取当前方块的计时器组
	 */
	public ITimers getTimers();

	/**
	 * 设置当前方块发出的红石信号强度
	 * @param strength 红石信号强度（0-15）
	 */
	public void setRedstonePower(int strength);

	/**
	 * 获取当前方块发出的红石信号强度
	 * @return 红石信号强度（0-15）
	 */
	public int getRedstonePower();

	/**
	 * 设置当前方块可否被攀爬
	 */
	public void setIsLadder(boolean enabled);

	/**
	 * 获取当前方块可否被攀爬
	 */
	public boolean getIsLadder();

	/**
	 * 设置当前方块发出的亮度强度
	 * @param value 亮度强度（0-15）
	 */
	public void setLight(int value);

	/**
	 * 获取当前方块发出的亮度强度
	 * @return 亮度强度（0-15）
	 */
	public int getLight();

	/**
	 * 设置当前方块的缩放规模
	 * @param x X轴缩放（0-10）
	 * @param y Y轴缩放（0-10）
	 * @param z Z轴缩放（0-10）
	 */
	public void setScale(float x, float y, float z);

	/**
	 * 获取当前方块的X轴缩放规模
	 */
	public float getScaleX();

	/**
	 * 获取当前方块的Y轴缩放规模
	 */
	public float getScaleY();

	/**
	 * 获取当前方块的Z轴缩放规模
	 */
	public float getScaleZ();

	/**
	 * 设置当前方块的旋转角度
	 * @param x x轴旋转（0-359）
	 * @param y y轴旋转（0-359）
	 * @param z z轴旋转（0-359）
	 */
	public void setRotation(int x, int y, int z);

	/**
	 * 获取当前方块的X轴旋转角度
	 */
	public int getRotationX();

	/**
	 * 获取当前方块的Y轴旋转角度
	 */
	public int getRotationY();

	/**
	 * 获取当前方块的Z轴旋转角度
	 */
	public int getRotationZ();

	/**
	 * 在服务器上，server.properties中的enable-command-block选项需要设置为true，<br>
	 * 使用/gamerule commandBlockOutput false/true以关闭/打开命令反馈<br>
	 * 在CustomNPCs.cfg中将NpcUseOpCommands设置为true，可允许NPC以OP身份运行命令，但请注意这可能会导致一系列的安全风险，使用风险自负<br>
	 * 对于权限插件，命令会在该UUID和名称下运行<br>
	 * UUID:c9c843f8-4cb1-4c82-aa61-e264291b7bd6<br>
	 * 名称:[customnpcs]<br>
	 * @param command 要执行的命令
	 * @return 返回命令输出
	 */
	public String executeCommand(String command);

	/**
	 * 获取当前方块可否被穿透
	 */
	public boolean getIsPassible();
	
	/**
	 * 设置当前方块可否被穿透
	 */
	public void setIsPassible(boolean bo);
	
	/**
	 * 获取当前方块的破坏硬度
	 * @return 破坏硬度（-1为无法破坏）
	 */
	public float getHardness();
	
	/**
	 * 设置当前方块的破坏硬度
	 * @param hardness 破坏硬度（-1为无法破坏）
	 */
	public void setHardness(float hardness);
	
	/**
	 * 获取当前方块的爆炸阻力（-1为无法炸毁）
	 */
	public float getResistance();
	
	/**
	 * 设置当前方块的爆炸阻力
	 * @param resistance 爆炸阻力（-1为无法炸毁）
	 */
	public void setResistance(float resistance);

	/**
	 * 获取当前方块位于第一层的悬浮字对象
	 */
	public ITextPlane getTextPlane();

	/**
	 * 获取当前方块位于第二层的悬浮字对象
	 */
	public ITextPlane getTextPlane2();

	/**
	 * 获取当前方块位于第三层的悬浮字对象
	 */
	public ITextPlane getTextPlane3();

	/**
	 * 获取当前方块位于第四层的悬浮字对象
	 */
	public ITextPlane getTextPlane4();

	/**
	 * 获取当前方块位于第五层的悬浮字对象
	 */
	public ITextPlane getTextPlane5();

	/**
	 * 获取当前方块位于第六层的悬浮字对象
	 */
	public ITextPlane getTextPlane6();

}
