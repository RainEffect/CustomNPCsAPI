package noppes.npcs.api.block;

/**
 * 用于操作在世界内的液体容器方块对象
 */
public interface IBlockFluidContainer extends IBlock{

	public float getFluidPercentage();

	public float getFuildDensity();

	public float getFuildTemperature();

	public float getFluidValue();

	public String getFluidName();

}
