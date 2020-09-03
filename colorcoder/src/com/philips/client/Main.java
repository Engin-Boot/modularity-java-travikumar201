package com.philips.client;

import com.philips.constants.MajorColor;
import com.philips.constants.MinorColor;
import com.philips.util.ColorUtil;

public class MainClient {

	public static void main(String[] args) {
		ColorUtil.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
		ColorUtil.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);

		ColorUtil.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
		ColorUtil.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
		
	}
}
