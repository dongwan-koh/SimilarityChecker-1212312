public class SimilarityChecker {

    public static int MAX_LENGTH_POINT = 60;
    public static int MIN_LENGTH_POINT = 0;

    public int returnLengthScore(String input1, String input2) {
        if(input1 == null || input2 == null)
            throw new IllegalArgumentException();

        if (isSameLength(input1, input2))
            return MAX_LENGTH_POINT;
        if(isTwiceDiff(input1, input2))
            return MIN_LENGTH_POINT;

        return getPartialPoint(Integer.max(input1.length(), input2.length()), Integer.min(input1.length(), input2.length()));
    }

    private int getPartialPoint(int maxLen, int minLen) {
        return (int)((1- (double) (maxLen - minLen) /minLen) * 60);
    }

    private boolean isTwiceDiff(String input1, String input2) {
        return (input1.length() >= input2.length() * 2) || (input2.length() >= input1.length() * 2);
    }

    private boolean isSameLength(String input1, String input2) {
        return input1.length() == input2.length();
    }
}
