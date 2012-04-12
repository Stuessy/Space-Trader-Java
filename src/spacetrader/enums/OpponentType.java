package spacetrader.enums;

public enum OpponentType implements SpaceTraderEnum//: int
{
	Bottle, FamousCaptain, Mantis, Pirate, Police, Trader;

	@Override
	public int CastToInt()
	{
		return ordinal();
	}
}
