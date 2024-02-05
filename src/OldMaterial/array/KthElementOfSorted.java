package OldMaterial.array;

public class KthElementOfSorted {
    public static void main(String[] args) {
        int a[]={2, 3, 6, 7, 9};
        int b[]={1, 4, 8, 10};
        int kth =5;
        int c[]= new int[a.length+b.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
            }else {
                c[k]=b[j];
                j++;
            }
            k++;
        }

        while(i< a.length){
            c[k++]=a[i++];
        }
        while(j< b.length){
            c[k++]=b[j++];
        }
        for (int p=0;p<c.length;p++){
            if(kth-1 == p) {
                System.out.print(c[p] + " ");
            }
        }
    }
}
