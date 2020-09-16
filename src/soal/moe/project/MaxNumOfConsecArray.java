package soal.moe.project;

public class MaxNumOfConsecArray {
	
 boolean isValidConsArray(int arr[], int n)  { 
     if (n < 1) 
         return false; 
     
     if (n > 10000)
    	 return false;
     
     for (int i = 0; i < n; i++)  { 
         if (arr[i] != 0 || arr[i] != 1)  
        	 return false;
     } 
     
     return true;
 } 
 
 int getMaxConsNum(int arr[], int n) { 
	 int count1s = 0;
	 int finalCount = 0;
	 int arrFinalCount[] = {};
     for (int i = 1; i < n; i++)  {
    	 if (arr[i] == 1 && arr[i+1] == arr[i]) {
        	 count1s++;
        	 finalCount = count1s;
        	 for (int j = 0; j < n; j++) {
        		 arrFinalCount[j] = finalCount;
        	 }
   
        	 if (arr[i] == 0) {
        		 count1s = 0;
        	 } 
         }
     }
     
     int maxConsNum = arrFinalCount[0];
     for (int i = 0; i < arrFinalCount.length; i++) {
    	 if (arrFinalCount[i] > maxConsNum)
    		 maxConsNum = arrFinalCount[i];
     }
     return maxConsNum;
 }
 
 
 public static void main(String[] args)   { 
     MaxNumOfConsecArray consecutive = new MaxNumOfConsecArray(); 
     int arr[] = {1,1,0,1,1,1}; 
     int n = arr.length; 
     if (consecutive.isValidConsArray(arr, n) == true) {
    	 System.out.println("Array sesuai");
     } else {
    	 System.out.println("Array tidak sesuai");
     }
	 int maxNumber = consecutive.getMaxConsNum(arr, n);
     if (maxNumber != 0) {
    	 System.out.println("Jumlah angka 1 maksimum adalah" + maxNumber);
     } else {
    	 System.out.println("Array elemen tidak consecutive");
     }    
 } 
} 
