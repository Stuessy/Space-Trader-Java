/*******************************************************************************
 * 
 * Space Trader for Windows 2.00
 * 
 * Copyright (C) 2005 Jay French, All Rights Reserved
 * 
 * Additional coding by David Pierron Original coding by Pieter Spronck, Sam Anderson, Samuel Goldstein, Matt Lee
 * 
 * This program is free software; you can redistribute it and/or modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 2 of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * 
 * If you'd like a copy of the GNU General Public License, go to http://www.gnu.org/copyleft/gpl.html.
 * 
 * You can contact the author at spacetrader@frenchfryz.com
 * 
 ******************************************************************************/
// using System;
// using System.Drawing;
// using System.Collections;
// using System.ComponentModel;
// using System.Windows.Forms;
package spacetrader.gui;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Arrays;

import jwinforms.DialogResult;
import jwinforms.FormBorderStyle;
import jwinforms.FormStartPosition;
import jwinforms.WinformControl;
import spacetrader.Consts;
import spacetrader.Functions;
import spacetrader.Game;
import spacetrader.Ship;
import spacetrader.SpecialEvent;
import spacetrader.Strings;
import spacetrader.enums.GadgetType;
import spacetrader.util.Util;

public class FormViewShip extends SpaceTraderForm {
	// #region Control Declarations

	private jwinforms.Button btnClose;
	private jwinforms.Label lblTypeLabel;
	private jwinforms.Label lblType;
	private jwinforms.GroupBox boxSpecialCargo;
	private jwinforms.Label lblSpecialCargo;
	private jwinforms.Label lblEquipLabel;
	private jwinforms.Label lblEquip;
	private Game game = Game.CurrentGame();
	private Ship ship = Game.CurrentGame().Commander().getShip();

	// #endregion

	// #region Methods

	public FormViewShip() {
		InitializeComponent();

		lblType.setText(ship.Name());
		lblEquipLabel.setText("");
		lblEquip.setText("");

		DisplayEquipment();
		DisplaySpecialCargo();
	}

	// #region Windows Form Designer generated code
	// / <summary>
	// / Required method for Designer support - do not modify
	// / the contents of this method with the code editor.
	// / </summary>
	private void InitializeComponent() {
		this.lblTypeLabel = new jwinforms.Label();
		this.lblType = new jwinforms.Label();
		this.btnClose = new jwinforms.Button();
		this.lblEquipLabel = new jwinforms.Label();
		this.lblEquip = new jwinforms.Label();
		this.boxSpecialCargo = new jwinforms.GroupBox();
		this.lblSpecialCargo = new jwinforms.Label();
		this.boxSpecialCargo.SuspendLayout();
		this.SuspendLayout();
		//
		// lblTypeLabel
		//
		this.lblTypeLabel.setAutoSize(true);
		this.lblTypeLabel.setFont(FontCollection.bold825);
		this.lblTypeLabel.setLocation(new java.awt.Point(8, 8));
		this.lblTypeLabel.setName("lblTypeLabel");
		this.lblTypeLabel.setSize(new Dimension(34, 13));
		this.lblTypeLabel.setTabIndex(2);
		this.lblTypeLabel.setText("Type:");
		//
		// lblType
		//
		this.lblType.setLocation(new java.awt.Point(80, 8));
		this.lblType.setName("lblType");
		this.lblType.setSize(new Dimension(100, 13));
		this.lblType.setTabIndex(4);
		this.lblType.setText("Grasshopper");
		//
		// btnClose
		//
		this.btnClose.setDialogResult(DialogResult.Cancel);
		this.btnClose.setLocation(new java.awt.Point(-32, -32));
		this.btnClose.setName("btnClose");
		this.btnClose.setSize(new Dimension(32, 32));
		this.btnClose.setTabIndex(32);
		this.btnClose.setTabStop(false);
		this.btnClose.setText("X");
		//
		// lblEquipLabel
		//
		this.lblEquipLabel.setFont(FontCollection.bold825);
		this.lblEquipLabel.setLocation(new java.awt.Point(8, 34));
		this.lblEquipLabel.setName("lblEquipLabel");
		this.lblEquipLabel.setSize(new Dimension(64, 176));
		this.lblEquipLabel.setTabIndex(43);
		this.lblEquipLabel
				.setText("Hull:\r\n\r\nEquipment:\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nUnfilled:");
		//
		// lblEquip
		//
		this.lblEquip.setLocation(new java.awt.Point(80, 34));
		this.lblEquip.setName("lblEquip");
		this.lblEquip.setSize(new Dimension(120, 176));
		this.lblEquip.setTabIndex(44);
		this.lblEquip
				.setText("Hardened\r\n\r\n1 Military Laser\r\n1 Morgan\'s Laser\r\n1 Energy Shield\r\n1 Reflective Shi"
						+ "eld\r\n1 Lightning Shield\r\nNavigating System\r\nAuto-Repair System\r\n10 Extra Cargo Bays\r\nAn Escape Pod\r\n"
						+ "\r\n1 weapon slot\r\n1 gadget slot");
		//
		// boxSpecialCargo
		//
		this.boxSpecialCargo.Controls
				.addAll((new WinformControl[] { this.lblSpecialCargo }));
		this.boxSpecialCargo.setLocation(new java.awt.Point(192, 8));
		this.boxSpecialCargo.setName("boxSpecialCargo");
		this.boxSpecialCargo.setSize(new Dimension(200, 204));
		this.boxSpecialCargo.setTabIndex(64);
		this.boxSpecialCargo.setTabStop(false);
		this.boxSpecialCargo.setText("Special Cargo");
		//
		// lblSpecialCargo
		//
		this.lblSpecialCargo.setLocation(new java.awt.Point(8, 16));
		this.lblSpecialCargo.setName("lblSpecialCargo");
		this.lblSpecialCargo.setSize(new Dimension(190, 176));
		this.lblSpecialCargo.setTabIndex(0);
		this.lblSpecialCargo.setText("No special items.");
		//
		// FormViewShip
		//
		this.setAutoScaleBaseSize(new Dimension(5, 13));
		this.setCancelButton(this.btnClose);
		this.setClientSize(new Dimension(402, 219));
		this.Controls.addAll(Arrays.asList(this.boxSpecialCargo, this.lblEquip,
				this.lblEquipLabel, this.btnClose, this.lblTypeLabel,
				this.lblType));
		this.setFormBorderStyle(FormBorderStyle.FixedDialog);
		this.setMaximizeBox(false);
		this.setMinimizeBox(false);
		this.setName("FormViewShip");
		this.setShowInTaskbar(false);
		this.setStartPosition(FormStartPosition.CenterParent);
		this.setText("Current Ship");
	}

	// #endregion

	private void DisplayEquipment() {
		if (game.getQuestStatusScarab() == SpecialEvent.StatusScarabDone) {
			lblEquipLabel.setText(lblEquipLabel.getText()
					+ ("Hull:" + Strings.newline + Strings.newline));
			lblEquip.setText(lblEquip.getText()
					+ ("Hardened" + Strings.newline + Strings.newline));
		}

		boolean equipPrinted = false;

		for (int i = 0; i < Consts.Weapons.length; i++) {
			int count = 0;
			for (int j = 0; j < ship.Weapons().length; j++) {
				if (ship.Weapons()[j] != null
						&& ship.Weapons()[j].Type() == Consts.Weapons[i].Type())
					count++;
			}
			if (count > 0) {
				lblEquipLabel.setText(lblEquipLabel.getText()
						+ (equipPrinted ? Strings.newline : "Equipment:"
								+ Strings.newline));
				lblEquip.setText(lblEquip.getText()
						+ (Functions.Multiples(count, Consts.Weapons[i].Name()) + Strings.newline));
				equipPrinted = true;
			}
		}

		for (int i = 0; i < Consts.Shields.length; i++) {
			int count = 0;
			for (int j = 0; j < ship.Shields().length; j++) {
				if (ship.Shields()[j] != null
						&& ship.Shields()[j].Type() == Consts.Shields[i].Type())
					count++;
			}
			if (count > 0) {
				lblEquipLabel.setText(lblEquipLabel.getText()
						+ (equipPrinted ? Strings.newline : "Equipment:"
								+ Strings.newline));
				lblEquip.setText(lblEquip.getText()
						+ (Functions.Multiples(count, Consts.Shields[i].Name()) + Strings.newline));
				equipPrinted = true;
			}
		}

		for (int i = 0; i < Consts.Gadgets.length; i++) {
			int count = 0;
			for (int j = 0; j < ship.Gadgets().length; j++) {
				if (ship.Gadgets()[j] != null
						&& ship.Gadgets()[j].Type() == Consts.Gadgets[i].Type())
					count++;
			}
			if (count > 0) {
				lblEquipLabel.setText(lblEquipLabel.getText()
						+ (equipPrinted ? Strings.newline : "Equipment:"
								+ Strings.newline));

				if (i == GadgetType.ExtraCargoBays.CastToInt()
						|| i == GadgetType.HiddenCargoBays.CastToInt()) {
					count *= 5;
					lblEquip.setText(lblEquip.getText()
							+ (Functions.FormatNumber(count)
									+ Consts.Gadgets[i].Name().substring(1) + Strings.newline));
				} else
					lblEquip.setText(lblEquip.getText()
							+ (Functions.Multiples(count,
									Consts.Gadgets[i].Name()) + Strings.newline));

				equipPrinted = true;
			}
		}

		if (ship.getEscapePod()) {
			lblEquipLabel.setText(lblEquipLabel.getText()
					+ (equipPrinted ? Strings.newline : "Equipment:"
							+ Strings.newline));
			lblEquip.setText(lblEquip.getText()
					+ ("1 " + Strings.ShipInfoEscapePod + Strings.newline));
			equipPrinted = true;
		}

		if (ship.FreeSlots() > 0) {
			lblEquipLabel.setText(lblEquipLabel.getText()
					+ ((equipPrinted ? Strings.newline : "") + "Unfilled:"));
			lblEquip.setText(lblEquip.getText()
					+ (equipPrinted ? Strings.newline : ""));

			if (ship.FreeSlotsWeapon() > 0)
				lblEquip.setText(lblEquip.getText()
						+ (Functions.Multiples(ship.FreeSlotsWeapon(),
								"weapon slot") + Strings.newline));

			if (ship.FreeSlotsShield() > 0)
				lblEquip.setText(lblEquip.getText()
						+ (Functions.Multiples(ship.FreeSlotsShield(),
								"shield slot") + Strings.newline));

			if (ship.FreeSlotsGadget() > 0)
				lblEquip.setText(lblEquip.getText()
						+ (Functions.Multiples(ship.FreeSlotsGadget(),
								"gadget slot") + Strings.newline));
		}
	}

	private void DisplaySpecialCargo() {
		ArrayList<String> specialCargo = new ArrayList<String>(12);

		if (ship.getTribbles() > 0) {
			if (ship.getTribbles() == Consts.MaxTribbles)
				specialCargo.add(Strings.SpecialCargoTribblesInfest);
			else
				specialCargo.add(Functions.Multiples(ship.getTribbles(),
						Strings.SpecialCargoTribblesCute) + ".");
		}

		if (game.getQuestStatusJapori() == SpecialEvent.StatusJaporiInTransit)
			specialCargo.add(Strings.SpecialCargoJapori);

		if (ship.ArtifactOnBoard())
			specialCargo.add(Strings.SpecialCargoArtifact);

		if (game.getQuestStatusJarek() == SpecialEvent.StatusJarekDone)
			specialCargo.add(Strings.SpecialCargoJarek);

		if (ship.ReactorOnBoard()) {
			specialCargo.add(Strings.SpecialCargoReactor);
			specialCargo.add(Functions.Multiples(
					10 - ((game.getQuestStatusReactor() - 1) / 2), "bay")
					+ Strings.SpecialCargoReactorBays);
		}

		if (ship.SculptureOnBoard())
			specialCargo.add(Strings.SpecialCargoSculpture);

		if (game.getCanSuperWarp())
			specialCargo.add(Strings.SpecialCargoExperiment);

		lblSpecialCargo
				.setText(specialCargo.size() == 0 ? Strings.SpecialCargoNone
						: Util.StringsJoin(Strings.newline + Strings.newline,
								Functions.ArrayListtoStringArray(specialCargo)));
	}

	// #endregion
}
