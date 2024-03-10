package main.java.Array;

class BinarySearch {
    public static void main(String[] args)
    {
        int[] sortedArray={1,2,3,4,5,6,7,8};
        System.out.println(binarySearch(sortedArray,4));
    }

    public static int binarySearch(int[] arr, int target){
int low =0;
        int high =arr.length-1;
       int mid= getMid(low, high);

       if(target>arr[high]){
           return -1;
       }
while (low<=high){
    if(arr[mid]==target){
        return mid;
    } else if (arr[mid]>target) {
        high=mid-1;
    }else{
        low=mid+1;
    }
     mid= getMid(low, high);
}
        return -1;

    }

    private static int getMid(int low, int high) {
        return (low +(high - low)/2);

    }


}



