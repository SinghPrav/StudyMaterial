package OldData.OldMaterial.array;

public class FormLargetNumberFromDigit {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 0};
        //543210
        int n = arr.length-1;
        int num[]= new int[10];

        for(int i=0; i< n; i++){
            num[arr[i]]++;
        }
        for (int i=9; i>0; i--){
            for(int j=0; j<num[i]; j++){
                System.out.println(i);
            }

        }
    }
}
