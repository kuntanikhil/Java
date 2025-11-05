package ArrayList;

import java.util.Arrays;

public class CustomArrayList {

    final private int DEAFULT_SIZE =10;
    private int[] data;
    private int size =0;

    public CustomArrayList(){
        this.data = new int[DEAFULT_SIZE];
    }

    public void add(int num){
        if(isfull()){
            resize();
        }
        data[size++]=num;
    }
    public int remove(){
        int removed=0;
        if(size<=0) {
            System.out.println("List is Empty");
        }else{
           removed = data[--size];
        }
        return removed;
    }

    public void set(int index , int value){
        data[index] = value;
    }

    public int get(int index){
        return data[index];
    }

    public void display(){
        System.out.println(Arrays.toString(data));
    }

    public int getsize(){
        return size;
    }

    public int getcapacity(){
        return data.length;
    }

    public void find(int num){
        if(size == 0){
            System.out.println("No elements to search");
        }
        boolean gotit=false;
        for(int i:data){
            if(i==num){
               gotit=true;
            }
        }
        if(gotit){
            display();
        }
    }

    private void resize() {
        int size = (data.length)*2;
        int[] temp =  new int[size];
        for(int i=0;i< data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }

    private boolean isfull() {
        return size== data.length;
    }
}
