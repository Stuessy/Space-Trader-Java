package spacetrader.enums;

public enum EncounterResult implements SpaceTraderEnum
{
	Continue, Normal, Killed, EscapePod, Arrested;
	
	@Override
	public int CastToInt()
	{
		return ordinal();
	}
}
