//学号：19010500043 姓名：李星辉
//学号：19010100160 姓名：陈腾
//二人讨论后完成，github不大熟悉，不会创建合作项目，故由一人提交，还望谅解
import java.util.*;
public class poker{
    public static void main (String[] args) {
        int i,j;
        int[] bnumber=new int[5];
        int[] wnumber=new int[5];
        //将输入的字符串赋值给数组
        String bstr;
        System.out.print("Black:");
        Scanner black=new Scanner(System.in);
        char[] bn=new char [5];
        char[] bcolor=new char [5];
        bstr=black.nextLine();
        for(i=0,j=0;i<5;i++){
            bn[i]=bstr.charAt(j);
            bcolor[i]=bstr.charAt(j+1);
            j+=3;
        }
        String wstr;
        System.out.print("White:"); 
        Scanner white=new Scanner(System.in);
        char[] wn=new char [5];
        char[] wcolor=new char [5];
        wstr=white.nextLine();
        for(i=0,j=0;i<5;i++){
            wn[i]=wstr.charAt(j);
            wcolor[i]=wstr.charAt(j+1);
            j+=3;
        }
        //将字母转成数字，方便比较大小
        for(i=0;i<5;i++){
            switch(bn[i]){
                case'T':bnumber[i]=10;break;
                case'J':bnumber[i]=11;break;
                case'Q':bnumber[i]=12;break;
                case'K':bnumber[i]=13;break;
                case'A':bnumber[i]=14;break;
                default:bnumber[i]=bn[i]-'0';
            }
            switch(wn[i]){
                case'T':wnumber[i]=10;break;
                case'J':wnumber[i]=11;break;
                case'Q':wnumber[i]=12;break;
                case'K':wnumber[i]=13;break;
                case'A':wnumber[i]=14;break;
                default:wnumber[i]=wn[i]-'0';
            }
        }      
        //将牌大小按升序排列
        Arrays.sort(bnumber);
        Arrays.sort(wnumber);
        int b,w,x=0,y=0;
        long m,n;
        //m为黑方散牌大小判断依据，n为白方散牌大小判断依据，由于牌已从大到小排列，根据数学规律，当牌型一样且大小相同时，最大且不同的散牌越大，对应m，n的值便越大
        m=bnumber[0]+bnumber[1]*100+bnumber[2]*10000+bnumber[3]*1000000+bnumber[4]*100000000;
        n=wnumber[0]+wnumber[1]*100+wnumber[2]*10000+wnumber[3]*1000000+wnumber[4]*100000000;
        //判断牌型；散牌：1，对子：2，两对：3，三条：4，顺子：5，同花：6，同花顺：7;
        if (bnumber[0]==bnumber[4]-4&&bnumber[0]==bnumber[3]-3&&bnumber[0]==bnumber[2]-2&&bnumber[0]==bnumber[1]-1){
            b=5;
            if(bcolor[0]==bcolor[1]&&bcolor[0]==bcolor[2]&&bcolor[0]==bcolor[3]&&bcolor[0]==bcolor[4]){
                b+=2;
            }
        }
        else if(bcolor[0]==bcolor[1]&&bcolor[0]==bcolor[2]&&bcolor[0]==bcolor[3]&&bcolor[0]==bcolor[4]){
            b=6;
        }
        else if((bnumber[0]==bnumber[1]&&bnumber[0]==bnumber[2])||(bnumber[1]==bnumber[2]&&bnumber[1]==bnumber[3])||(bnumber[2]==bnumber[3]&&bnumber[2]==bnumber[4])){
            b=4;
        }
        else if((bnumber[0]==bnumber[1]&&bnumber[3]==bnumber[4])||(bnumber[1]==bnumber[2]&&bnumber[3]==bnumber[4])||(bnumber[0]==bnumber[1]&&bnumber[2]==bnumber[3])){
            b=3;
        }
        else if(bnumber[0]==bnumber[1]||bnumber[1]==bnumber[2]||bnumber[2]==bnumber[3]||bnumber[3]==bnumber[4]){
            b=2;
        }
        else
            b=1;
        if (bnumber[0]==bnumber[4]-4&&bnumber[0]==bnumber[3]-3&&bnumber[0]==bnumber[2]-2&&bnumber[0]==bnumber[1]-1){
            b=5;
            if(bcolor[0]==bcolor[1]&&bcolor[0]==bcolor[2]&&bcolor[0]==bcolor[3]&&bcolor[0]==bcolor[4]){
                b+=2;
            }
        }
        else if(bcolor[0]==bcolor[1]&&bcolor[0]==bcolor[2]&&bcolor[0]==bcolor[3]&&bcolor[0]==bcolor[4]){
            b=6;
        }
        else if((bnumber[0]==bnumber[1]&&bnumber[0]==bnumber[2])||(bnumber[1]==bnumber[2]&&bnumber[1]==bnumber[3])||(bnumber[2]==bnumber[3]&&bnumber[2]==bnumber[4])){
            b=4;
        }
        else if((bnumber[0]==bnumber[1]&&bnumber[3]==bnumber[4])||(bnumber[1]==bnumber[2]&&bnumber[3]==bnumber[4])||(bnumber[0]==bnumber[1]&&bnumber[2]==bnumber[3])){
            b=3;
        }
        else if(bnumber[0]==bnumber[1]||bnumber[1]==bnumber[2]||bnumber[2]==bnumber[3]||bnumber[3]==bnumber[4]){
            b=2;
        }
        else
            b=1;
        if (wnumber[0]==wnumber[4]-4&&wnumber[0]==wnumber[3]-3&&wnumber[0]==wnumber[2]-2&&wnumber[0]==wnumber[1]-1){
            w=5;
            if(wcolor[0]==wcolor[1]&&wcolor[0]==wcolor[2]&&wcolor[0]==wcolor[3]&&wcolor[0]==wcolor[4]){
                w+=2;
             }
        }
        else if(wcolor[0]==wcolor[1]&&wcolor[0]==wcolor[2]&&wcolor[0]==wcolor[3]&&wcolor[0]==wcolor[4]){
            w=6;
        }
        else if((wnumber[0]==wnumber[1]&&wnumber[0]==wnumber[2])||(wnumber[1]==wnumber[2]&&wnumber[1]==wnumber[3])||(wnumber[2]==wnumber[3]&&wnumber[2]==wnumber[4])){
            w=4;
        }
        else if((wnumber[0]==wnumber[1]&&wnumber[3]==wnumber[4])||(wnumber[1]==wnumber[2]&&wnumber[3]==wnumber[4])||(wnumber[0]==wnumber[1]&&wnumber[2]==wnumber[3])){
            w=3;
        }
        else if(wnumber[0]==wnumber[1]||wnumber[1]==wnumber[2]||wnumber[2]==wnumber[3]||wnumber[3]==wnumber[4]){
            w=2;
        }
        else
            w=1;
        //牌型不一样时
        if(b>w){
            System.out.print("Black wins");
        }
        else if(b<w){
            System.out.print("White wins");
        }
        //当牌型一样时，进行比较
        else {
            if(b==7){//均为同花顺，比较最大牌
                if(bnumber[4]>wnumber[4]){
                    System.out.print("Black wins");
                }
                else if(bnumber[4]<wnumber[4]){
                    System.out.print("White wins");
                }
                else System.out.print("Tie");
            }
            else if(b==6){//均为同花，比较散牌大小
                if(m>n){
                    System.out.print("Black wins");
                }
                else if(m<n){
                    System.out.print("White wins");
                }
                else System.out.print("Tie");
            }
            else if(b==5){//均为顺子，比较最大牌
                if(bnumber[4]>wnumber[4]){
                    System.out.print("Black wins");
                }
                else if(bnumber[4]<wnumber[4]){
                    System.out.print("White wins");
                }
                else System.out.print("Tie");
            }
            else if(b==4){//均为三条时，因为排序关系，中间牌必为三条中的一张，只需比较中间牌便可得到三条大小
                if(bnumber[2]>wnumber[2]){
                    System.out.print("Black wins");
                }
                else if(bnumber[2]<wnumber[2]){
                    System.out.print("White wins");
                }
                else {//三条大小一样时，比较散牌大小
                    if(m>n){
                        System.out.print("Black wins");
                    }
                    else if(m<n){
                        System.out.print("White wins");
                    }
                    else System.out.print("Tie");
                }
            }
            else if(b==3){//均为两对时，因为排序关系，第四张牌必为大的对子对应的数，比较其大小
                if(bnumber[3]>wnumber[3]){
                    System.out.print("Black wins");
                }
                else if(bnumber[3]<wnumber[3]){
                    System.out.print("White wins");
                }
                else {//当大的对相等时，因为排序关系，第二张牌必为小的对子对应的数，比较其大小
                if(bnumber[1]>wnumber[1]){
                    System.out.print("Black wins");
                }
                else if(bnumber[1]<wnumber[1]){
                    System.out.print("White wins");
                }
                else {
                    if(m>n){//大小对均相等时，比较散牌大小
                        System.out.print("Black wins");
                    }
                    else if(m<n){
                        System.out.print("White wins");
                    }
                    else System.out.print("Tie");
                }
                }
            }
            else if(b==2){//均为一对时，找出对子所对应的数，比较大小
                for(i=0;i<4;i++){
                    if(bnumber[i]==bnumber[i+1]){
                        x=bnumber[i];
                        break;
                    }
                }
                for(i=0;i<4;i++){
                    if(wnumber[i]==wnumber[i+1]){
                        y=wnumber[i];
                        break;  
                    }
                }
                if(x>y){
                    System.out.print("Black wins");
                    }
                else if(x<y){
                    System.out.print("White wins");
                    }
                else {//当对子相同时，比较散牌大小
                    if(m>n){
                        System.out.print("Black wins");
                        }
                    else if(m<n){
                        System.out.print("White wins");
                        }
                    else System.out.print("Tie");
                }
            }
            else {
                if(m>n){//均为散牌时
                    System.out.print("Black wins");
                    }
                else if(m<n){
                    System.out.print("White wins");
                    }
                else System.out.print("Tie");
            }
        }
}  
}