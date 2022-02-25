
import java.util.ArrayList;


class mylist <T> 
{   
    int elemansayısı=0;
    int index=4;
    
    Object[] myArray=new Object[index];
    Object[] myTempArray=new Object[index];
    
    
    public int size()
    {
        return elemansayısı;
    }
    
    public void add(T value)
    {
        if(elemansayısı==index)
        {
            Object[] myTempArray=new Object[index];
            
            for (int i =0;i<index;i++)
            {
                myTempArray[i]=myArray[i];
            }
            
            index*=2;
            myArray=new Object[index*2];
            
            for (int i =0;i<elemansayısı;i++)
            {
                myArray[i]=myTempArray[i];
            }
            myArray[elemansayısı]=value;
            elemansayısı++;
            
        }
        else
        {
            myArray[elemansayısı]=value;
            elemansayısı++;
        }
        
    }
    public void pop()
    {
        elemansayısı-=1;
    }
    public void showIn()
    {
        for( int i =0;i<elemansayısı;i++)
        {
            System.out.println(myArray[i]);
        }
    }
    
    
    
}



public class main {
    public static void main(String[] args) {
        mylist<String> tlist=new mylist<>();
        tlist.add("ömer");
        tlist.add("göçmen");
        tlist.add("ömer");
        tlist.add("göçmen");
        tlist.add("ömer");
        tlist.add("göçmen");
        tlist.pop();
        tlist.add("ahmet");
        tlist.showIn();
        
    }
    
}
