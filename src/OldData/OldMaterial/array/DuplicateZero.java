package OldData.OldMaterial.array;

public class DuplicateZero {
    public static void main(String ar[]){
        duplicateZeros();
    }

    public static void duplicateZeros() {


        int data[] = { 0,1,4,0,5,0,0 };
        int temp[]= new int[data.length];
        int index =0;
        for(int i=0; i < data.length; i++)
        {
            if(data[i]==0){
                if(index< data.length) {
                 temp [index]= 0;
                 index ++;
                    if(index< data.length) {
                        temp[index] = 0;
                    }
                    index ++;
                }
            }else {
                if(index < data.length) {
                    temp[index] = data[i];
                    index++;
                }
            }
        }

        for(int i=0;i<temp.length;i++){
            System.out.println("****value of i: "+temp[i]);
        }
    }
}
