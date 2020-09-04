package colorcoder;

public class GenerateManual {

    public String toString(){
        
        StringBuilder sb = new StringBuilder();

        System.out.println("These are the color codes\n");
        System.out.println("PairID ---> MajorColor, MinorColor\n");

        ColorService service = new ColorService();
        for(int i = 0; i < ColorUtil.numberOfMajorColors; i++){
            for(int j = 0; j < ColorUtil.numberOfMinorColors; j++){
                int pairNumber = i*ColorUtil.numberOfMinorColors + j + 1;
                ColorPair colorPair = service.getColorFromPairNumber(pairNumber);
                String majorColor = ColorUtil.MajorColorNames[colorPair.getMajor().getIndex()];
                String minorColor = ColorUtil.MinorColorNames[colorPair.getMinor().getIndex()];
                sb.append(pairNumber + " --> ");
                sb.append(majorColor + ", ");
                sb.append(minorColor + System.getProperty("line.separator"));
            }
        }
        return sb.toString();
    }
}
