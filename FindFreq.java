public class FindFreq {
    public static void main(String[] args) {
        ArrayADT abst=new ArrayADT(5);
        abst.inserElement(0, 10);
        abst.inserElement(1, 20);
        abst.inserElement(2, 10);
        abst.inserElement(3, 30);
        abst.inserElement(4, 20);

        int freq;
        for(int i=0;i<abst.getSize();i++)
        {
            freq = 0; // Reset frequency for each element
            for(int j=0;j<abst.getSize();j++)
            {
                if(abst.getElement(j)==abst.getElement(i))
                {
                    freq++;
                }
            }
            System.out.println("Frequency of " + abst.getElement(i) + " is: " + freq);
        }
    }
}
