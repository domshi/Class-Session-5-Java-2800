


public class Main {
  
  public static void main(String[] args) {//start main

    int value = 1;
    int quest = 3;
    
    switch (value) {//start switch
      case 1:
        if (quest > 3) {
          System.out.println("Special quest complete");
        }
        else {
          switch (quest) {
            case 1:
              System.out.println("Special response 1");
              break;
            case 2:
              System.out.println("Special response 2");
              break;
            case 3:
              if (value + quest == 0) {
                System.out.println("Special response 3");
                }
              else if (value + quest < 100) {
                System.out.println("Special response 4");
                }
              else {
                System.out.println("Void");
                }
              break;
          }
        }
        System.out.println("Quest complete");
        break;
      case 2:
        System.out.println("two");
        break;
      case 3:
        System.out.println("three");
        break;
      case 4:
        System.out.println("four");
        break;
      default:
        System.out.println("I don't know that number");
        
    }//end switch
    
  }
}