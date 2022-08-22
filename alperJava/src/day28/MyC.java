package day28;

public class MyC {

        int x=5;
        MyC(){
            System.out.println("-x"+ x);
        }
        MyC(int x){
            this();
            System.out.println("-x"+x);
        }
        public static void main(String[] args) {
            MyC mx = new MyC(4);
            MyC mc= new MyC();
        }
    }

