package com.philips.service;

import com.philips.beans.ColorPair;
import com.philips.constants.IColor;
import com.philips.constants.MajorColor;
import com.philips.constants.MinorColor;
import com.philips.util.ColorUtil;

public class ColorService {

	public ColorPair getColorFromPairNumber(int pairNumber) {
		int zeroBasedPairNumber = pairNumber - 1;
		MajorColor majorColor = (MajorColor)fromIndex(MajorColor.values(),zeroBasedPairNumber /ColorUtil.numberOfMinorColors);
		MinorColor minorColor = (MinorColor)fromIndex(MinorColor.values(),zeroBasedPairNumber % ColorUtil.numberOfMinorColors);
		return new ColorPair(majorColor, minorColor);
	}

	public  int getPairNumberFromColor(MajorColor major, MinorColor minor) {
		return major.getIndex() * ColorUtil.numberOfMinorColors + minor.getIndex() + 1;
	}
	
	public  IColor fromIndex(Object[] colors, int index) {
        for(Object obj: colors) {
        	IColor color = (IColor)obj;
            if(color.getIndex() == index) {
                return color;
            }
        }
        return null;
    }
}
