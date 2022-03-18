public class Selection_sort{
	
	public static void main(String []args){
		int a[]={12,66,98,7,6,36,54,99};
		
		for(int i=0;i<a.length-1;i++){
			int min=i;
			
			for(int j=i+1;j<a.length;j++){
				if(a[min]>a[j])
				min=j;
	}
	if(min!=i){
		
					int temp;
					temp=a[min];
					a[min]=a[i];
					a[i]=temp;
			}
}

for(int i=0;i<a.length;i++){
	System.out.println(a[i]);
}
	}
}

/*
the report of selection sort:

here the array elements {1,5,8,2,3,9,7}

the number of passes of selection sort is (array elements -1). so 
outer for loop we initalize (i=0;i<array.length-1;i++). for the conviniant
we declare a variable which is for i=0; min=i;
now we  declare the inner loop which is normal conditions.
here we have to focuse, we initialize j=i+1; just becuase after crashing the 
inner loop for the first time, again inner loop start j=0. in that case 
sorting process can not continue. after crashing the inner loop
we have to modify each inner loop after crashing.
inside the inner loop we use the if condition is there a number which is 
fulfill  this condition : array[min]>array[j] which is the real meaning of  is,
 there is a number which is less than min number. however there is a 
number, we hold min=j;

after we swap with min = i  and min =j outside the inner loop after
 fully done of inner loop.
continue that process. 

after we print new sorted array by using new for loop.  


*/
