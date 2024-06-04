public class SqueakyClean {
    public static String clean(String input) {
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = false;

        for (char c : input.toCharArray()) {
            if (c == '-') {
                capitalizeNext = true;
            } else if (c == ' ') {
                result.append('_');
            } else {
                if (capitalizeNext) {
                    if (Character.isLetter(c)) {
                        result.append(Character.toUpperCase(c));
                        capitalizeNext = false;
                    }
                } else {
                    switch (c) {
                        case '4':
                            result.append('a');
                            break;
                        case '3':
                            result.append('e');
                            break;
                        case '0':
                            result.append('o');
                            break;
                        case '1':
                            result.append('i');
                            break;
                        case '7':
                            result.append('t');
                            break;
                        default:
                            if (Character.isLetter(c)) {
                                result.append(c);
                            }
                            break;
                    }
                }
            }
        }

        return result.toString();
    }
}
