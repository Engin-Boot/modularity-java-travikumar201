package colorcoder;

public class Main {

	public static void main(String[] args) {

        GenerateManual genManual = new GenerateManual();
        System.out.println(genManual.toString());
        
		ColorUtil.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
		ColorUtil.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);

		ColorUtil.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
		ColorUtil.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
		
	}
}
