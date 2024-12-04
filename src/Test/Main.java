package Test;

class Main {
   public static void main(String[] args) { 
      String senten="This is Java Evaluation";
      String[] words=senten.split(" ");
      String[] lets={"A","E","I","O","U"};
      for(String w : words){
           for(String l : lets){
              if(w.toUpperCase().startsWith(l,0)){
                  System.out.println(w);
              }
           }
      }
   }
}