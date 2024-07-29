package com.Homework01;

public class Homework01 {
    public static void main(String[] args) {
        String [] arr = {"5","2"
        };
        try {
            if(arr.length != 2){
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }
            int n1 = Integer.parseInt(arr[0]);
            int n2 = Integer.parseInt(arr[1]);
            double res = cal(n1,n2);
            System.out.println(res);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("参数格式不正确");
        } catch (ArithmeticException e){
            System.out.println("除0");
        }
    }
    public static double cal(int n1,int n2){
        return n1 / n2;
    }
}
