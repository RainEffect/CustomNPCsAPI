package noppes.npcs.api.block;

/**
 * 用于操作在世界内的脚本块悬浮字对象
 */
public interface ITextPlane {

	/**
	 * 获取当前悬浮字对象的文本内容
	 */
	public String getText();

	/**
	 * 设置当前悬浮字对象的文本内容
	 * @param text 需要显示的文本内容
	 */
	public void setText(String text);

	/**
	 * 获取当前悬浮字对象的X轴旋转角度
	 */
	public int getRotationX();

	/**
	 * 获取当前悬浮字对象的Y轴旋转角度
	 */
	public int getRotationY();

	/**
	 * 获取当前悬浮字对象的Z轴旋转角度
	 */
	public int getRotationZ();

	/**
	 * 设置当前悬浮字对象的X轴旋转角度
	 * @param x X轴旋转角度
	 */
	public void setRotationX(int x);

	/**
	 * 设置当前悬浮字对象的Y轴旋转角度
	 * @param y Y轴旋转角度
	 */
	public void setRotationY(int y);

	/**
	 * 设置当前悬浮字对象的Z轴旋转角度
	 * @param z Z轴旋转角度 默认: 0.5
	 */
	public void setRotationZ(int z);

	/**
	 * 设置当前悬浮字对象的X轴位置偏移
	 */
	public float getOffsetX();

	/**
	 * 设置当前悬浮字对象的Y轴位置偏移
	 */
	public float getOffsetY();

	/**
	 * 设置当前悬浮字对象的Z轴位置偏移
	 */
	public float getOffsetZ();

	/**
	 * 获取当前悬浮字对象的X轴位置偏移
	 */
	public void setOffsetX(float x);

	/**
	 * 获取当前悬浮字对象的Y轴位置偏移
	 */
	public void setOffsetY(float y);

	/**
	 * 获取当前悬浮字对象的Z轴位置偏移
	 */
	public void setOffsetZ(float z);

	/**
	 * 获取当前悬浮字对象的缩放比例
	 */
	public float getScale();

	/**
	 * 设置当前悬浮字对象的缩放比例
	 * @param scale 缩放比例 默认: 1
	 */
	public void setScale(float scale);
}
