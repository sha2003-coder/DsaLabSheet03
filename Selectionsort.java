public class Selectionsort {
    public static void main(String[] args) {
        ArrayADT abst=new ArrayADT(5);
        abst.inserElement(0, 10);
        abst.inserElement(1, 20);
        abst.inserElement(2, 5);
        abst.inserElement(3, 15);
        System.out.println("Original array:");
        abst.printArray();
        for(int i=0;i<abst.getSize()-1;i++)
        {
            int minIndex=i;
            for(int j=i+1;j<abst.getSize();j++)
            {
                if(abst.getElement(j)<abst.getElement(minIndex))
                {
                    minIndex=j;
                }
            }
            int temp=abst.getElement(i);
            abst.updateElement(i,abst.getElement(minIndex));
            abst.updateElement(minIndex,temp);
        }
        System.out.println("Sorted array:");
        abst.printArray();
    }
}
