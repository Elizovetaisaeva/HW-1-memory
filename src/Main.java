
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

        SlytherinStudent malfoy = new  SlytherinStudent ("Драко Малфой", 4, 3,
                6, 2, 8, 10, 2);
        SlytherinStudent goil = new  SlytherinStudent ("Гарри Гойл", 3, 7, 1,
                7, 2, 11, 6);

        System.out.println(malfoy);
        potter.compareTo(malfoy);
        malfoy.innerCompareTo(goil);


   HufflepuffStudent sedrik = new HufflepuffStudent("Седрик Диггори", 8, 2,
           4, 1, 10);
        HufflepuffStudent smit= new HufflepuffStudent("Захария Смит", 5, 3,
                7, 4, 11);

        System.out.println(sedrik);
        potter.compareTo(malfoy);
        sedrik.innerCompareTo(smit);




    }







}



