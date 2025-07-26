package xyz.lncvrt.seselulu;

public class Translator {
    public static String ConvertTo(String input) {
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            String mapped = switch (c) {
                case 'a' -> "selu";
                case 'b' -> "seselulu";
                case 'c' -> "seseselululu";
                case 'd' -> "dedecucu";
                case 'e' -> "lalalulu";
                case 'f' -> "fafu";
                case 'g' -> "googoogaagaa";
                case 'h' -> "hahaha";
                case 'i' -> "eiei";
                case 'j' -> "jaja";
                case 'k' -> "ok";
                case 'l' -> "lagu";
                case 'm' -> "moo";
                case 'n' -> "no";
                case 'o' -> "oogabooga";
                case 'p' -> "pepe";
                case 'q' -> "oogalyboogaly";
                case 'r' -> "rahroo";
                case 's' -> "solay";
                case 't' -> "tootay";
                case 'u' -> "yala";
                case 'v' -> "vooloo";
                case 'w' -> "waawaa";
                case 'x' -> "tumtum";
                case 'y' -> "yumyum";
                case 'z' -> "zooloola";
                case 'A' -> "SELU";
                case 'B' -> "SESELULU";
                case 'C' -> "SESESELULULU";
                case 'D' -> "DEDECUCU";
                case 'E' -> "LALALULU";
                case 'F' -> "FAFU";
                case 'G' -> "GOOGOOGAAGAA";
                case 'H' -> "HAHAHA";
                case 'I' -> "EIEI";
                case 'J' -> "JAJA";
                case 'K' -> "OK";
                case 'L' -> "LAGU";
                case 'M' -> "MOO";
                case 'N' -> "NO";
                case 'O' -> "OOGABOOGA";
                case 'P' -> "PEPE";
                case 'Q' -> "OOGALYBOOGALY";
                case 'R' -> "RAHROO";
                case 'S' -> "SOLAY";
                case 'T' -> "TOOTAY";
                case 'U' -> "YALA";
                case 'V' -> "VOOLOO";
                case 'W' -> "WAAWAA";
                case 'X' -> "TUMTUM";
                case 'Y' -> "YUMYUM";
                case 'Z' -> "ZOOLOOLA";
                default -> "";
            };
            if (!mapped.isEmpty()) {
                if (!sb.isEmpty()) sb.append(' ');
                sb.append(mapped);
            }
        }
        return sb.toString();
    }

    public static String ConvertFrom(String input) {
        StringBuilder sb = new StringBuilder();
        for (String word : input.split(" ")) {
            char mapped = switch (word) {
                case "selu" -> 'a';
                case "seselulu" -> 'b';
                case "seseselululu" -> 'c';
                case "dedecucu" -> 'd';
                case "lalalulu" -> 'e';
                case "fafu" -> 'f';
                case "googoogaagaa" -> 'g';
                case "hahaha" -> 'h';
                case "eiei" -> 'i';
                case "jaja" -> 'j';
                case "ok" -> 'k';
                case "lagu" -> 'l';
                case "moo" -> 'm';
                case "no" -> 'n';
                case "oogabooga" -> 'o';
                case "pepe" -> 'p';
                case "oogalyboogaly" -> 'q';
                case "rahroo" -> 'r';
                case "solay" -> 's';
                case "tootay" -> 't';
                case "yala" -> 'u';
                case "vooloo" -> 'v';
                case "waawaa" -> 'w';
                case "tumtum" -> 'x';
                case "yumyum" -> 'y';
                case "zooloola" -> 'z';
                case "SELU" -> 'A';
                case "SESELULU" -> 'B';
                case "SESESELULULU" -> 'C';
                case "DEDECUCU" -> 'D';
                case "LALALULU" -> 'E';
                case "FAFU" -> 'F';
                case "GOOGOOGAAGAA" -> 'G';
                case "HAHAHA" -> 'H';
                case "EIEI" -> 'I';
                case "JAJA" -> 'J';
                case "OK" -> 'K';
                case "LAGU" -> 'L';
                case "MOO" -> 'M';
                case "NO" -> 'N';
                case "OOGABOOGA" -> 'O';
                case "PEPE" -> 'P';
                case "OOGALYBOOGALY" -> 'Q';
                case "RAHROO" -> 'R';
                case "SOLAY" -> 'S';
                case "TOOTAY" -> 'T';
                case "YALA" -> 'U';
                case "VOOLOO" -> 'V';
                case "WAAWAA" -> 'W';
                case "TUMTUM" -> 'X';
                case "YUMYUM" -> 'Y';
                case "ZOOLOOLA" -> 'Z';
                default -> '\0';
            };
            if (mapped != '\0') sb.append(mapped);
        }
        return sb.toString();
    }
}
