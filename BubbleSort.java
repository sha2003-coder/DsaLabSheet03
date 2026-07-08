public class BubbleSort {
    public static void main(String[] args) {
        ArrayADT abst=new ArrayADT(5);
        abst.inserElement(0, 10);
        abst.inserElement(1, 20);
        abst.inserElement(2, 5);
        abst.inserElement(3, 15);
        abst.inserElement(4, 25);

        System.out.println("Original array:");
        abst.printArray();

        for(int i=0;i<abst.getSize()-1;i++)
        {
            for(int j=0;j<abst.getSize()-i-1;j++)
            {
                if(abst.getElement(j)>abst.getElement(j+1))
                {
                    int temp=abst.getElement(j);
                    abst.updateElement(j,abst.getElement(j+1));
                    abst.updateElement(j+1,temp);
                }
            }
        }

        System.out.println("Sorted array:");
        abst.printArray();
    }
}
