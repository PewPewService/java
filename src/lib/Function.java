package lib;

public class Function {
    public static String sort(String str){

        int n=0, i=0;
        boolean f=true;
        String[] words = str.split(" ");
        for(String word : words){
            n++;
        }

        String[] s=new String[n];
        for(String word : words){
            s[i]=word;
            i++;
        }

        while (f)
        {
            f=false;
            for (int j = 0; j < n-1; j++) {
                if (s[j].length()< s[j+1].length()) {
                    String t = s[j + 1];
                    s[j + 1] = s[j];
                    s[j] = t;
                    f=true;
                }
            }
        }

        str="";
        for (int j=0; j<n;j++)
        {
            str+=s[j];
            if (j!=(n-1)){str+=" ";}
        }

        return str;
    }

    public static boolean d(String s, int i){
        if (s.charAt(i)>='0' && s.charAt(i)<='9' ){
            return true;
        }
        else return false;
    }

    public static boolean isPhone(String str){
        boolean ans=false;
        if (str.length()==16)
            if (str.startsWith("+7("))
                if (str.indexOf(")")==6)
                    if (str.indexOf("-")==10)
                        if (str.lastIndexOf('-')==13)
                            if(d(str, 3) && d(str, 4) && d(str, 5) && d(str, 7) && d(str, 8) && d(str, 8) && d(str, 11) && d(str, 12) && d(str, 14) && d(str, 15))
                                ans=true;
        return ans;
    }
}
