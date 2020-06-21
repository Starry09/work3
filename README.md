·简介
Fibonacci指的是这样一个数列：1，1，2，3，5，8....
这个数列从第3项开始，每一项都等于前两项之和。
·问题题干要求
在main函数用循环打印1~200的Fibonacci数列
·设计思路
这个问题的求解实质是求解其计算思路及通项公式，因为这个问题的规模不是通过手动计算可以解决的。
由组合数学课上学到的算法思路，由加法法则，设第n项的值为of(n),则
of(n)=of(n-2)+G(n-1)，其中，of(1)=1,of(2)=2
这是一个斐波那契数列的表达式，由于题目要求的项数较少，所以这里采用递归算法，主要代码为public static int of (int n){
        if(n==1||n==2){
            return 1;
        }
        if(n>2){
            return of(n-1)+of(n-2);
        }
        return -1;
    }
在主函数中用循环判断200以内的项，进行输出，即可实现题干要求
·输出结果
Fibonacci.of(1)=1
Fibonacci.of(2)=1
Fibonacci.of(3)=2
Fibonacci.of(4)=3
Fibonacci.of(5)=5
Fibonacci.of(6)=8
Fibonacci.of(7)=13
Fibonacci.of(8)=21
Fibonacci.of(9)=34
Fibonacci.of(10)=55
Fibonacci.of(11)=89
Fibonacci.of(12)=144