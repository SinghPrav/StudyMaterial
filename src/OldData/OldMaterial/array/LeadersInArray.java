package OldData.OldMaterial.array;

public class LeadersInArray {
    public static void main(String[] args) {
        int a[]={16, 17, 4, 3, 5, 2};
        //2 5 17

        int max =0;
        int n = a.length-1;
        for(int i = n; i > 0; i--){
            if(a[i] > max){
                max = a[i];
                System.out.println("--Leaders-->"+max);
            }
        }
    }
}
