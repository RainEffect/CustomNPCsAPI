package noppes.npcs.api.block;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import noppes.npcs.api.IContainer;
import noppes.npcs.api.INbt;
import noppes.npcs.api.IPos;
import noppes.npcs.api.IWorld;
import noppes.npcs.api.entity.data.IData;
import noppes.npcs.api.item.IItemStack;

public interface IBlock {

	/**
	 * 返回当前方块的X轴位置
	 */
	public int getX();

	/**
	 * 返回当前方块的Y轴位置
	 */
	public int getY();

	/**
	 * 返回当前方块的Z轴位置
	 */
	public int getZ();

	/**
	 * 返回当前方块的全局位置
	 */
	public IPos getPos();
	
	/**
	 * 返回当前方块的附加值
	 */
	public int getMetadata();
	
	/**
	 * 设置当前方块的附加值
	 */
	public void setMetadata(int i);
	
	/**
	 * 返回当前方块名
	 */
	public String getName();

	/**
	 * 将当前方块移除
	 */
	public void remove();
	
	/**
	 * 检查当前方块是否已被替换或移除
	 */
	public boolean isRemoved();
	
	/**
	 * 检查当前方块是否为空气
	 */
	public boolean isAir();
	
	/**
	 * 替换当前方块为指定方块（方块名方式）
	 * @param name 需要替换的方块名
	 * @return 替换后的新方块
	 */
	public IBlock setBlock(String name);

	/**
	 * 替换当前方块为指定方块（方块组方式）
	 * @param block 需要替换的方块
	 * @return 替换后的新方块
	 */
	public IBlock setBlock(IBlock block);
	
	/**
	 * 检查当前方块是否拥有TileEntity
	 */
	public boolean hasTileEntity();

	/**
	 * 检查当前方块是否为容器方块（例如箱子，投掷器，漏斗等）
	 */
	public boolean isContainer();
	
	/**
	 * 返回当前方块的容器空间
	 * @return 容器空间
	 */
	public IContainer getContainer();
	
	/**
	 * 临时数据可以存储任何内容，重新加载后将会被移除。
	 * (仅适用于CustomNPCs的方块)
	 */
	public IData getTempdata();
	
	/**
	 * 储存数据通过全局方式存储，即使重启后也依然存在。
	 * 与临时数据不同的是，它只能存储字符串和数字。
	 * (仅适用于具有TileEntities的方块)
	 */
	public IData getStoreddata();
		
	/**
	 * 获取当前方块的世界
	 */
	public IWorld getWorld();

	/**
	 * 获取当前方块TileEntity的NBT数据
	 */
	public INbt getTileEntityNBT();

	/**
	 * 设置当前方块TileEntity的NBT数据
	 */
	public void setTileEntityNBT(INbt nbt);
	
	/**
	 * 仅用于输出
	 * @return MineCraft的TileEntity
	 */
	public TileEntity getMCTileEntity();
	
	/**
	 * 仅用于输出
	 * @return MineCraft的方块数据
	 */
	public Block getMCBlock();

	/**
	 * 设置方块的事件类型/数据
	 * @param type 事件类型
	 * @param data 事件数据<br>
	 * 例如: <br>
	 * | 箱子 - type:1 data:1 打开盖子, type:1 data:0 合上盖子<br>
	 * | 音符盒 - type:(0-9) data:(0-24) 播放不同的音色
	 * 
	 */
	public void blockEvent(int type, int data);

	/**
	 * 获取当前方块的显示名
	 */
	public String getDisplayName();

	/**
	 * 仅用于输出
	 * @return MineCraft的方块状态
	 */
	public IBlockState getMCBlockState();

	/**
	 * 模拟玩家与当前方块进行交互 (可能出现奇怪的结果)
	 * @param side 方块的方向面
	 */
	public void interact(int side);
}
