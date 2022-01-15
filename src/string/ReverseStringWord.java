package string;

public class ReverseStringWord {
    public static void main(String[] args) {

            String s ="a good    blue";

            String sTrim = s.trim();
            String[] split = sTrim.split(" ");
            StringBuilder sb = new StringBuilder();
            for (int i = split.length - 1; i >= 0; i--) {
                if (split[i].length() != 0) {
                    sb.append(split[i]);
                    if (i != 0) {
                        sb.append(" ");
                    }
                }
            }

            System.out.println(sb);

        }
    }

