
public class DynamicArray {
	int newsize=5;
	int size=5;
	int []arr=new int[newsize];
	int i=0,counter=0;
	public void push(int n)
	{
		if(i==newsize)
		{
			int temp[]=arr;
			newsize=(int)(arr.length*1.5);
			arr=new int[newsize];
			for (int j=0;j<temp.length;j++) 
				arr[j] = temp[j];
			arr[i]=n;
			i++;
			counter++;
			}
		else
		{
			arr[i]=n;
			i++;
			counter++;
		}
}
	public void pop()
	{
		if(newsize<1)
		{
			System.out.print("Array deleted");
		}
		else
		{
			arr[newsize-1]=0;
					newsize--;
					counter--;
		}
	}
	
	public void pop(int n)throws UnderflowException
	{
		if(arr.length==0)
		{
			throw new UnderflowException("Stack is empty");
		}
		else
		{
		int pos=0,flag=0;
	for(int k=0;k<arr.length;k++)
	{
		if(arr[k]==n)
		{
			flag=1;
			pos=k;
			break;
		}
	}
	if(flag==1)
	{
		int b=arr.length;
		for(int c=pos;c<b;c++)
		{
			arr[c]=arr[c+1];
			b--;
		}
		counter--;
	}
	}
	}
	public boolean isEmpty()
	{
		if(size()==0)
			return true;
		else
			return false;
	}
	public int size()
	{
		return arr.length;
	}
	public void display()
	{
		for(int i=0;i<counter;i++)
			System.out.print(arr[i]+" ");
	}
public static void main(String[] args)
{
	DynamicArray a=new DynamicArray();
	a.push(1);
	a.push(2);
	a.push(3);
	a.push(4);
	a.push(5);
	a.push(6);
	a.push(7);
	a.push(9);
	try {
	a.pop(6);
	}
	catch(Exception e)
	{
		System.out.print("Error occured");
	}
	//a.pop();
	/*while(!a.isEmpty())
	{
	a.pop();
	}*/
	a.display();
}
}
