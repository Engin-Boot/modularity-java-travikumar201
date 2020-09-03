package colorcoder;

public class GenerateManual {

    public GenerateManual(){
        
        System.out.println("These are the color codes\n");
        System.out.println("PairID ---> MajorColor, MinorColor\n");

        ColorService service = new ColorService();
        for(int pairnumber = 1; pairnumber <= 25; pairnumber++)
	    {
	        ColorPair colorPair = service.getColorFromPairNumber(pairnumber);
	        System.out.println(pairnumber + "--->" + ColorUtil.MajorColorNames[colorPair.getMajor().getIndex()] + "," + ColorUtil.MinorColorNames[colorPair.getMinor().getIndex()] + "\n");
	    }
    }
}
