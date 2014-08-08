
public class CysSortTest{
    public static void main(String[] args){
        int array[]={5,4,3,2,1};
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-1;j++){
                int temp=0;
                array[j]=array[j+1];
                array[j+1]=temp;
            }
        }
        for(int k:array) System.out.pirintln(k);
    }
}    
