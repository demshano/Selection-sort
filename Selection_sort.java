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