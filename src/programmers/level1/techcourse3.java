package programmers.level1;

public class techcourse3 {
    public static String solution(String word){
        Character[] alphabet = new Character[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',' '};
        Character[] reverse_alpha = new Character[]{'Z','Y','X','W','V','U','T','S','R','Q','P','O','N','M','L','K','J','I','H','G','F','E','D','C','B','A',' '};
        String words = word.toUpperCase();
        String answer = "";
        //TODO 변환작업
        for(int i=0; i<words.length(); i++){
            for(int k=0; k<alphabet.length; k++){
                if(words.charAt(i)==alphabet[k])
                    answer += String.valueOf(reverse_alpha[k]);
            }
        }
        //TODO 대소문자 바꾸기,
        String[] split = answer.split("");
        for(int i=0; i<word.length(); i++){
            if(97<=(int)word.charAt(i)&&(int)word.charAt(i)<=122){
                split[i] = split[i].toLowerCase();
            }
        }
        String result ="";
        for(int i=0; i<split.length; i++){
            result +=split[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(techcourse3.solution("I love you"));
    }
}
