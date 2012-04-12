package spacetrader.enums;

public enum CargoSellOp implements SpaceTraderEnum {
	SellSystem, SellTrader, Dump, Jettison;

	@Override
	public int CastToInt() {
		return ordinal();
	}
};