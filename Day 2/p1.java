

public class p1 {
    public static void main(String[] args) {
        // This is just me revising all the type of loops and their concepts.
        int[] a= new int[5];
        int t=0;
        for (int i = 0; i < a.length; i++) {
            a[i]=i+7;
        }
        for (int i : a) {
            System.out.println(" Printing Arrays of element a by iteration loop "+i);
        }
        do
        {
            if(a[t]==10)
            {
                continue;
                // System.out.println(" This won't be printed as it below continuos in fact it will give error cause it's unreachable code ");
            }
            if(t==3)
            {
                break;
                // the loop will not move forward and it will break/stop here.
            }
            System.out.println(" Do While Loop "+a[t]);
            System.out.println(" Printing T "+t);
            t++;
        }while(a[t]<10);
    }
    //  This Program was just a starter for the day and to revise the basic loop concepts. 
}
