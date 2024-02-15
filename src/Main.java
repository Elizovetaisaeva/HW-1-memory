
public class Main {
    public static void main(String[] args) {

        GryffindorStudent potter = new GryffindorStudent(
                "Гарри Поттер", 10,
                5, 3, 7, 1);

        GryffindorStudent germiona = new GryffindorStudent(
                "Гермиона Грейнджер", 7,
                2, 4, 6, 2);


        potter.innerCompareTo(germiona);
        potter.compareTo(germiona);
        System.out.println(potter);
        System.out.println(malfoy);
        potter.compareTo(malfoy);
        malfoy.innerCompareTo(goil);



  //      SlytherinStudent malfou = new GryffindorStudent("Драко Малфой", 4, 3, 6, 2, 8, 10, 2);
  //      SlytherinStudent goil = new GryffindorStudent("Гарри Гойл", 3, 7, 1, 7, 2, 11, 6);
  //      HufflepuffStudent sedrik = new HufflepuffStudent("Седрик Диггори", 9, 3, 5, 2, 12);
    }
}



