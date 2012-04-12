package spacetrader.enums;

import spacetrader.util.EquipmentSubType;

public enum ShieldType implements SpaceTraderEnum , EquipmentSubType
{
	Energy, Reflective, Lightning;

	@Override
	public int CastToInt()
	{
		return ordinal();
	}

	public static ShieldType FromInt(int i)
	{
		return values()[i];
	}
}