package spacetrader.enums;
public enum CargoBuyOp implements SpaceTraderEnum
	{
		BuySystem,
		BuyTrader,
		Plunder;

		@Override
		public int CastToInt()
		{
return ordinal();
		}
	};