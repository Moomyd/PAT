
import java.util.*;

public class PAT1015{
    public static class CMP implements Comparator<String>{
        public int compare(String str1,String str2){
            String[] strarr1 = str1.split(" ");
            String[] strarr2 = str2.split(" ");
            if(Integer.parseInt(strarr1[1])+Integer.parseInt(strarr1[2]) >
                    Integer.parseInt(strarr2[1])+Integer.parseInt(strarr2[2]))
                return -1;
            else if(Integer.parseInt(strarr1[1])+Integer.parseInt(strarr1[2]) <
                    Integer.parseInt(strarr2[1])+Integer.parseInt(strarr2[2]))
                return 1;
            else {
                if(Integer.parseInt(strarr1[1]) > Integer.parseInt(strarr2[1]))
                    return -1;
                else if(Integer.parseInt(strarr1[1]) < Integer.parseInt(strarr2[1]))
                    return 1;
                else{
                    if(Integer.parseInt(strarr1[0]) > Integer.parseInt(strarr2[0]))
                        return 1;
                    else
                        return -1;
                }
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int H = sc.nextInt();
        //List<String> list = new ArrayList();
        List<String> caideqj = new ArrayList();
        List<String> deshengc = new ArrayList();
        List<String> caidejw = new ArrayList();
        List<String> other = new ArrayList();
        sc.nextLine();
        for(int i=0; i<N; i++){
            String str  = sc.nextLine();
            String[] strarr = str.split(" ");
            if(Integer.parseInt(strarr[1])>=L && Integer.parseInt(strarr[2])>=L){
                if(Integer.parseInt(strarr[1])>=H && Integer.parseInt(strarr[2])>=H){
                    caideqj.add(str);
                }
                else if(Integer.parseInt(strarr[1])>=H && Integer.parseInt(strarr[2])<H){
                    deshengc.add(str);
                }
                else if(Integer.parseInt(strarr[1])<H && Integer.parseInt(strarr[2])<H
                        && Integer.parseInt(strarr[1])>=Integer.parseInt(strarr[2])){
                    caidejw.add(str);
                }
                else{
                    other.add(str);
                }
            }
        }
        System.out.println(caideqj.size()+deshengc.size()+caidejw.size()+other.size());
        CMP cmp = new CMP();
        if(caideqj.size()>1)
            Collections.sort(caideqj, cmp);
        if(deshengc.size()>1)
            Collections.sort(deshengc, cmp);
        if(caidejw.size()>1)
            Collections.sort(caidejw, cmp);
        if(other.size()>1)
            Collections.sort(other, cmp);
        for(int i=0; i<caideqj.size(); i++){
            System.out.println(caideqj.get(i));
        }
        for(int i=0; i<deshengc.size(); i++){
            System.out.println(deshengc.get(i));
        }
        for(int i=0; i<caidejw.size(); i++){
            System.out.println(caidejw.get(i));
        }
        for(int i=0; i<other.size(); i++){
            System.out.println(other.get(i));
        }

    }
}
