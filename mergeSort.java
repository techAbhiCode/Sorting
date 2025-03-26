public class mergeSort {
    public static void mergeSorting(int[] arr, int l, int r){
        if(l<r){
            int m = (l+r)/2;
            mergeSorting(arr, l, m);
            mergeSorting(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }
    public static void merge(int[] arr, int l, int m, int r){
        int n1 = m-l+1;
        int n2 = r-m;
        int[] lArr = new int[n1];
        int[] rArr = new int[n2];
        for(int i = 0; i < n1; i++){
            lArr[i] = arr[l+i];
        }
        for(int j = 0; j < n2; j++){
            rArr[j] = arr[m+1+j];
        }
        int i =0, j=0, k = l;
        while(i<n1 && j<n2){
            if(lArr[i] <= rArr[j]){
                arr[k] = lArr[i];
                i++;
            }
            else{
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = lArr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = rArr[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,5,1,4,6,2};

        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
        mergeSorting(arr, 0, arr.length-1);
        System.out.println("After sorting: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
