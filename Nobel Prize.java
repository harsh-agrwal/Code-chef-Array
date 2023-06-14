import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Solution sol = new Solution();
        sol.usingBufferedReaderInsteadOfScanner();
     
    }
}

class Solution {
    BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

    void usingBufferedReaderInsteadOfScanner() throws IOException {
        int tests = Integer.parseInt(obj.readLine());

        while (tests-- > 0) {
            String str[] = obj.readLine().split(" ");
            int noOfResearchers = Integer.parseInt(str[0]);
            int noOfResearchTopics = Integer.parseInt(str[1]);

            String givenTopics[] = obj.readLine().split(" ");

            HashSet<Integer> topicSet = new HashSet<>();

            for (int i = 0; i < noOfResearchers; i++) {
                topicSet.add(Integer.parseInt(givenTopics[i]));
            }
            if (noOfResearchTopics>topicSet.size()) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
