import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {

        String month, burc = "";
        int day;
        boolean isError = false;

        Scanner input = new Scanner (System.in);
        System.out.print("Doğduğunuz ayı küçük harf ve türkçe karakter kullanmadan yazın: ");
        month = input.nextLine();
        System.out.print("Dogduğunuz günü girin: ");
        day = input.nextInt();

        if (month.equals("ocak")){
            if ( day <31 && day >=1 ) {
                if ( day < 22){
                    burc = "Oğlak";
                }else {
                    burc = "Kova";
                }
            } else {
                isError = true;
            }
        } else if (month.equals("subat")) {
            if ( day <28 && day >=1 ) {
                if ( day < 20){
                    burc = "Kova";
                }else {
                    burc = "Balık";
                }
            } else {
                isError = true;
            }
        }else if (month.equals("mart")) {
            if ( day <31 && day >=1 ) {
                if ( day < 21){
                    burc = "Balık";
                }else {
                    burc = "Koç";
                }
            } else {
                isError = true;
            }
        }else if (month.equals("nisan")) {
            if ( day <30 && day >=1 ) {
                if ( day < 21){
                    burc = "Koç";
                }else {
                    burc = "Boğa";
                }
            } else {
                isError = true;
            }
        }else if (month.equals("mayıs")) {
            if ( day <31 && day >=1 ) {
                if ( day < 22){
                    burc = "Boğa";
                }else {
                    burc = "İkizler";
                }
            } else {
                isError = true;
            }
        }else if (month.equals("haziran")) {
            if ( day <30 && day >=1 ) {
                if ( day < 23){
                    burc = "İkizler";
                }else {
                    burc = "Yengeç";
                }
            } else {
                isError = true;
            }
        }else if (month.equals("temmuz")) {
            if ( day <31 && day >=1 ) {
                if ( day < 23){
                    burc = "Yengeç";
                }else {
                    burc = "Aslan";
                }
            } else {
                isError = true;
            }
        }else if (month.equals("agustos")) {
            if ( day <31 && day >=1 ) {
                if ( day < 23){
                    burc = "Aslan";
                }else {
                    burc = "Başak";
                }
            } else {
                isError = true;
            }
        }else if (month.equals("eylul")) {
            if ( day <30 && day >=1 ) {
                if ( day < 23){
                    burc = "Başak";
                }else {
                    burc = "Terazi";
                }
            } else {
                isError = true;
            }
        }else if (month.equals("ekim")) {
            if ( day <31 && day >=1 ) {
                if ( day < 23){
                    burc = "Terazi";
                }else {
                    burc = "Akrep";
                }
            } else {
                isError = true;
            }
        }else if (month.equals("kasim")) {
            if ( day <30 && day >=1 ) {
                if ( day < 22){
                    burc = "Akrep";
                }else {
                    burc = "Yay";
                }
            } else {
                isError = true;
            }
        }else if (month.equals("aralik")) {
            if ( day <31 && day >=1 ) {
                if ( day < 21){
                    burc = "Yay";
                }else {
                    burc = "Oğlak";
                }
            } else {
                isError = true;
            }
        }else {
            System.out.println("Yanlış Ay Girdiniz Tekrar Deneyin.");
        }

        if (isError) {
            System.out.println("Hatalı giriş yaptınız. Tekrar deneyiniz!!");
        } else {
            System.out.println("Burcunuz: " + burc);
        }

    }
}
