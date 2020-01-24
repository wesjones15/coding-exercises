package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Depth {

    // input = "(1 2 (5 9 2 (4 2 8) 4 7 6)"
    public static int solution(String input) {
        int delta = 0;
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            Character element = input.charAt(i);
            if (element.equals('(')) delta++;
            else if (element.equals(')')) delta--;
            else if (element.toString().matches("[0-9]")) {
                result += Integer.valueOf(element.toString()) * delta;
            }
        }
        return result;
    }

    public static List<String> makeUniqueNames(List<String> names) {
        ArrayList<String> takenNames = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            if (containsName(takenNames, name)) {
                takenNames.add(name + getNameCount(takenNames, name));
            } else {
                takenNames.add(name);
            }
        }
        Collections.sort(takenNames);
        return takenNames;
    }

    public static boolean containsName(ArrayList<String> names, String nameToCheck) {
        for (String name : names) {
            if (nameMatches(name, nameToCheck)) return true;
        }
        return false;
    }

    public static Integer getNameCount(ArrayList<String> names, String nameToCheck) {
        int count = 0;
        for (String name : names) {
            if (nameMatches(name, nameToCheck)) count++;
        }
        return count;
    }

    public static Boolean nameMatches(String name, String nameToCheck) {
        return name.matches(nameToCheck+"[0-9]*");
    }
}
