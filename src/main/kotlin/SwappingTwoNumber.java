public class SwappingTwoNumber {
    public static void main(String[] args){
        int numValOne=5, numValTwo=10;
        swapValueUsingTemp(numValOne,numValTwo);
        swapValueWithoutUsingTemp(numValOne,numValTwo);
    }

    private static void swapValueUsingTemp(int numValOne,int numValTwo) {
        int temp=0;
        System.out.println(numValOne+" "+numValTwo);
        temp=numValOne;
        numValOne=numValTwo;
        numValTwo=temp;
        System.out.println(numValOne+" "+numValTwo);
    }

    private static void swapValueWithoutUsingTemp(int numValOne,int numValTwo) {
        int first,second;
        System.out.println(numValOne+" "+numValTwo);
        numValOne=numValOne-numValTwo;
        numValTwo=numValOne+numValTwo;
        numValOne=numValTwo-numValOne;
        System.out.println(numValOne+" "+numValTwo);
    }
}
