
public class ModifyArray {
	private static void swapArrayEnds(int[] sortArray, int numElem) {
        
        int tmp = sortArray[0];
        // Replacing first element to last element
        sortArray[0] = sortArray[numElem-1];
        
        sortArray[numElem-1] = tmp;
    }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int numElem = 4;
        int[] sortArray = new int[numElem];
        int i;

        sortArray[0] = 10;
        sortArray[1] = 20;
        sortArray[2] = 30;
        sortArray[3] = 40;

        swapArrayEnds(sortArray, numElem);

        for (i = 0; i < numElem; ++i) {
            System.out.print(sortArray[i]);
            System.out.print(" ");
        }
        System.out.println("");
	}

}
