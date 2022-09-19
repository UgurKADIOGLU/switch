public class Main {

    public static void main(String[] args) {
        char grade = 'z';

        switch (grade) {
            case 'a':
                System.out.println("Mükemmel");
                break;
            case 'b':
                System.out.println("İyi");
                break;
            case 'c':
                System.out.println("Orta");
                break;
            case 'd':
                System.out.println("Geçer");
                break;
            case 'f':
                System.out.println("Kaldı");
                break;
            default:
                System.out.println("Geçersiz not girdiniz!");

        }

    }
}
