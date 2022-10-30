public class _22ForEach {
  public static void main(String[] args) {


    String[] names = {
        "Sanas", "Ardi",
        "Balqis", "Akmal"
    };

    for (var i = 0; i < names.length; i++){
      System.out.println(names[i]);
    }

    System.out.println("FOR EACH");

    for(String name: names){
      System.out.println(name);
    }
  }
}
