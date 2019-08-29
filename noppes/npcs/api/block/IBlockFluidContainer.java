package noppes.npcs.api.block;

/**
 * 用于操作在世界内的流体容器方块对象<br>（尚未进行确定测试，此处翻译可能有误）
 */
public interface IBlockFluidContainer extends IBlock{

	/**
	 * 返回当前流体容器方块的已存储流体储量百分比
	 */
	public float getFluidPercentage();

	/**
	 * 返回当前流体容器方块的流体密度
	 */
	public float getFuildDensity();

	/**
	 * 返回当前流体容器方块的流体温度
	 */
	public float getFuildTemperature();

	/**
	 * 返回当前流体容器方块的流体储量
	 */
	public float getFluidValue();

	/**
	 * 返回当前流体容器方块的流体名
	 */
	public String getFluidName();

}
