package spacetrader.gui;

import jwinforms.Image;
import jwinforms.ImageList;
import spacetrader.guifacade.GuiEngine.CheatGui;
import spacetrader.guifacade.GuiEngine.ImageProvider;
import spacetrader.guifacade.GuiEngine.ImplementationProvider;

public class OriginalGuiImplementationProvider implements
		ImplementationProvider {
	private final SpaceTrader spaceTrader;

	public OriginalGuiImplementationProvider(SpaceTrader spaceTrader) {
		super();
		this.spaceTrader = spaceTrader;
	}

	@Override
	public ImageProvider getImageProvider() {
		return new ImageProvider() {
			@Override
			public ImageList getEquipmentImages() {
				return spaceTrader.EquipmentImages();
			}

			@Override
			public ImageList getShipImages() {
				return spaceTrader.ShipImages();
			}

			@Override
			public Image[] getCustomShipImages() {
				return spaceTrader.CustomShipImages();
			}

			@Override
			public void setCustomShipImages(Image[] value) {
				spaceTrader.setCustomShipImages(value);
			}

			@Override
			public Image[] getDirectionImages() {
				return spaceTrader.DirectionImages().getImages();
			}
		};
	}

	@Override
	public CheatGui getCheatGuiProvider() {
		return new CheatGui() {
			@Override
			public void showMonsterForm() {
				(new FormMonster()).Show();
			}

			@Override
			public void showTestForm() {
				(new FormTest()).Show();
			}
		};
	}

}
