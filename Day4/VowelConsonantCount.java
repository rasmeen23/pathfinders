public class VowelConsonantCount {
    public static void main(String[] args) {
        String str = "hello";
        int v = 0, c = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);            
            if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);
            
            if (ch >= 'a' && ch <= 'z') {
                if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                    v++;
                else
                    c++;
            }
        }
        
        System.out.println("Vowels = " + v);
        System.out.println("Consonants = " + c);
    }
}
