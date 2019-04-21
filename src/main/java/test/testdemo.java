package test;

public class testdemo {
    public static void main(String[] args) {
        int a=100;
        int b=100;
        if(100==100){
            System.out.println("100==100====="+"正确");
        }
        if(a==b){
            System.out.println("a==b====="+"正确");
        }
        if(String.valueOf(a).equals(String.valueOf(b))){
            System.out.println("正确");
        }else{
            System.out.println("失败");
        }
        Integer c=100,d=100,e=null;
        if(c.equals(e)){
            System.out.println("Integer:正确");
        }
    }
}
