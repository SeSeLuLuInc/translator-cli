package xyz.lncvrt.seselulu;

import java.util.HashMap;
import java.util.Map;

public class Translator {
    private static final Map<String, String> map = new HashMap<>();
    private static final Map<String, String> reverseMap = new HashMap<>();

    static {
        map.put("a", "selu");
        map.put("b", "seselulu");
        map.put("c", "seseselululu");
        map.put("d", "dedecucu");
        map.put("e", "lalalulu");
        map.put("f", "fafu");
        map.put("g", "googoogaagaa");
        map.put("h", "hahaha");
        map.put("i", "eiei");
        map.put("j", "jaja");
        map.put("k", "ok");
        map.put("l", "lagu");
        map.put("m", "moo");
        map.put("n", "no");
        map.put("o", "oogabooga");
        map.put("p", "pepe");
        map.put("q", "oogalyboogaly");
        map.put("r", "rahroo");
        map.put("s", "solay");
        map.put("t", "tootay");
        map.put("u", "yala");
        map.put("v", "vooloo");
        map.put("w", "waawaa");
        map.put("x", "tumtum");
        map.put("y", "yumyum");
        map.put("z", "zooloola");
        map.put("A", "SELU");
        map.put("B", "SESELULU");
        map.put("C", "SESESELULULU");
        map.put("D", "DEDECUCU");
        map.put("E", "LALALULU");
        map.put("F", "FAFU");
        map.put("G", "GOOGOOGAAGAA");
        map.put("H", "HAHAHA");
        map.put("I", "EIEI");
        map.put("J", "JAJA");
        map.put("K", "OK");
        map.put("L", "LAGU");
        map.put("M", "MOO");
        map.put("N", "NO");
        map.put("O", "OOGABOOGA");
        map.put("P", "PEPE");
        map.put("Q", "OOGALYBOOGALY");
        map.put("R", "RAHROO");
        map.put("S", "SOLAY");
        map.put("T", "TOOTAY");
        map.put("U", "YALA");
        map.put("V", "VOOLOO");
        map.put("W", "WAAWAA");
        map.put("X", "TUMTUM");
        map.put("Y", "YUMYUM");
        map.put("Z", "ZOOLOOLA");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            reverseMap.put(entry.getValue(), entry.getKey());
        }
    }

    public static String convertTo(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (c == ' ') {
                result.append(" ");
            } else {
                result.append(map.getOrDefault(String.valueOf(c), String.valueOf(c))).append(" ");
            }
        }
        return result.toString().trim();
    }

    public static String convertFrom(String input) {
        StringBuilder result = new StringBuilder();
        String[] words = input.split(" ");
        for (String word : words) {
            if (word.isEmpty()) {
                result.append(" ");
            } else {
                result.append(reverseMap.getOrDefault(word, ""));
            }
        }
        return result.toString();
    }
}
