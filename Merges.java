public class Merges {
    public static void main(String [] args)
    {
        ArrayADT abst1=new ArrayADT(5);
        abst1.inserElement(0, 10);
        abst1.inserElement(1, 20);
        abst1.inserElement(2, 30);
        abst1.inserElement(3, 40);
        abst1.inserElement(4, 50);

        ArrayADT abst2=new ArrayADT(5);
        abst2.inserElement(0, 15);
        abst2.inserElement(1, 25);
        abst2.inserElement(2, 35);
        abst2.inserElement(3, 45);
        abst2.inserElement(4, 55);

        ArrayADT mergedArray=new ArrayADT(abst1.getSize()+abst2.getSize());
        int i=0,j=0,k=0;
        while(i<abst1.getSize() && j<abst2.getSize())
        {
            if(abst1.getElement(i)<abst2.getElement(j))
            {
                mergedArray.inserElement(k++,abst1.getElement(i++));
            }
            else
            {
                mergedArray.inserElement(k++,abst2.getElement(j++));
            }
        }
        while(i<abst1.getSize())
        {
            mergedArray.inserElement(k++,abst1.getElement(i++));
        }
        while(j<abst2.getSize())
        {
            mergedArray.inserElement(k++,abst2.getElement(j++));
        }

        System.out.println("Merged array:");
        mergedArray.printArray();
    }
}
