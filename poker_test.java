import java.util.*;
//---------------------------------------------------------------------
//poker功能的测�?
public class poker_test{
    public static void main (String[] args) {
        test1_WhiteWins();
        test2_BlackWins();
        test3_WhiteWins();
        test4_Tie();
    }
    //测试1
    static void test1_WhiteWins(){
        poker test=new poker("2H 3D 5S 9C KD","2C 3H 4S 8C AH");
        if(test.PokerComplete()=="White wins")
            System.out.println("test1_WhiteWins OK!");
        else
            System.out.println("test1_WhiteWins Fail!");
    }
    //测试2
    static void test2_BlackWins(){
        poker test=new poker("2H 3H 5H 9H KH","2C 3H 4S 5C 6H");
        if(test.PokerComplete()=="Black wins")
            System.out.println("test2_BlackWins OK!");
        else
            System.out.println("test2_BlackWins Fail!");
    }
    //测试3
    static void test3_WhiteWins(){
        poker test=new poker("2H 4S 4C 2D 4H","2S 8S AS QS 3S");
        if(test.PokerComplete()=="White wins")
            System.out.println("test3_WhiteWins OK!");
        else
            System.out.println("test3_WhiteWins Fail!");
    }
    //测试4
    static void test4_Tie(){
        poker test=new poker("2H 3D 5S 9C KD","2D 3H 5C 9S KH");
        if(test.PokerComplete()=="Tie")
            System.out.println("test4_Tie OK!");
        else
            System.out.println("test4_Tie Fail!");
    }
}
//--------------------------------------------------------------------------------
//poker功能的实�?
class poker{
    String  bstr;
    String  wstr;
    public poker(String black,String white){
        bstr=black;
        wstr=white;
    }
    public String PokerComplete(){
        int i,j;
        int[] bnumber=new int[5];
        int[] wnumber=new int[5];
        char[] bn=new char [5];
        char[] bcolor=new char [5];
        for(i=0,j=0;i<5;i++){
            bn[i]=bstr.charAt(j);
            bcolor[i]=bstr.charAt(j+1);
            j+=3;
        }
        char[] wn=new char [5];
        char[] wcolor=new char [5];
        for(i=0,j=0;i<5;i++){
            wn[i]=wstr.charAt(j);
            wcolor[i]=wstr.charAt(j+1);
            j+=3;
        }
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
        Arrays.sort(bnumber);
        Arrays.sort(wnumber);
        int b,w,x=0,y=0;
        long m,n;
        m=bnumber[0]+bnumber[1]*100+bnumber[2]*10000+bnumber[3]*1000000+bnumber[4]*100000000;
        n=wnumber[0]+wnumber[1]*100+wnumber[2]*10000+wnumber[3]*1000000+wnumber[4]*100000000;
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

        if(b>w){
            return "Black wins";
        }
        else if(b<w){
            return "White wins";
        }
        else {
            if(b==7){
                if(bnumber[4]>wnumber[4]){
                    return "Black wins";
                }
                else if(bnumber[4]<wnumber[4]){
                    return "White wins";
                }
                else 
                    return "Tie";
            }
            else if(b==6){
                if(m>n){
                    return "Black wins";
                }
                else if(m<n){
                    return "White wins";
                }
                else System.out.print("Tie");
            }
            else if(b==5){
                if(bnumber[4]>wnumber[4]){
                    return "Black wins";
                }
                else if(bnumber[4]<wnumber[4]){
                    return "White wins";
                }
                else 
                    return "Tie";
            }
            else if(b==4){
                if(bnumber[2]>wnumber[2]){
                    return "Black wins";
                }
                else if(bnumber[2]<wnumber[2]){
                    return "White wins";
                }
                else {
                    if(m>n){
                        return "Black wins";
                    }
                    else if(m<n){
                        return "White wins";
                    }
                    else 
                        return "Tie";
                }
            }
            else if(b==3){
                if(bnumber[3]>wnumber[3]){
                    return "Black wins";
                }
                else if(bnumber[3]<wnumber[3]){
                    return "White wins";
                }
                else {
                    if(bnumber[1]>wnumber[1]){
                        return "Black wins";
                    }
                    else if(bnumber[1]<wnumber[1]){
                        return "White wins";
                    }
                    else {
                        if(m>n){
                            return "Black wins";
                        }
                        else if(m<n){
                            return "White wins";
                        }
                        else 
                            return "Tie";
                    }
                }
            }
            else if(b==2){
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
                    return "Black wins";
                }
                else if(x<y){
                    return "White wins";
                }
                else {
                    if(m>n){
                        return "Black wins";
                    }
                    else if(m<n){
                        return "White wins";
                    }
                    else 
                        return "Tie";
                }
            }
            else {
                if(m>n){
                    return "Black wins";
                }
                else if(m<n){
                    return "White wins";
                }
                else 
                    return "Tie";
            }
        }
        return "";
    }
}