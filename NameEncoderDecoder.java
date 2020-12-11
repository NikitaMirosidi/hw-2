public class NameEncoderDecoder {
    public String encode(String name){
        String namePlus = name.replace("e", "1").replace("u", "2").replace("i", "3").replace("o", "4").replace("a", "5");
        String namePlusPlus = "NOTFORYOU" + namePlus + "YESNOTFORYOU";
        return namePlusPlus;
    }
    public String decode(String name){
        String namePlus = name.replace("YESNOTFORYOU", "").replace("NOTFORYOU", "");
        String namePlusPlus = namePlus.replace("1", "e").replace("2", "u").replace("3", "i").replace("4", "o").replace("5", "a");
        return namePlusPlus;
    }
    public static void main(String[] args){}
}
