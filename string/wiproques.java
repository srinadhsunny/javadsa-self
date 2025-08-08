// for given string frward every char to n letters where n is len of the word in a string if forward value is more than z then return z 
import java.util.Scanner;
public class wiproques {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER  THE STRING");
        String s = sc.nextLine();
        String ld=" abcdefghijklmnopqrstuvwxyz";
        String ud=" ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        String[] ss =s.split(" ");
        for(String word:ss){
            int n = word.length();
            for(int i=0;i<n;i++){
                char cc = word.charAt(i);
                if(Character.isUpperCase(cc)){
                    int ci=ud.indexOf(cc);
                    int ni=ci+n;
                    if(ni>27){
                        sb.append(ud.charAt(26));
                    }else{
                    char pc = ud.charAt(ni);
                    sb.append(pc);
                    }
                }
                else{
                    int ci=ld.indexOf(cc);
                    int ni=ci+n;
                    if(ni>27){
                        sb.append(ld.charAt(26));
                    }else{
                    char pc = ld.charAt(ni);
                    sb.append(pc);
                    }
                }
        }
        System.out.print(sb+" ");
        sb.delete(0,word.length());
    }
}
}