class Solution {
    public int compareVersion(String version1, String version2) {
        String[] rev1 = version1.split("\\.");
        String[] rev2 = version2.split("\\.");
        int len = Math.max(rev1.length, rev2.length);
        int[] convertedRev1 = convert(rev1, len);
        int[] convertedRev2 = convert(rev2, len);
        return compare(convertedRev1, convertedRev2);
    }

    private int compare(int[] rev1, int[] rev2) {
        for (int i = 0; i < rev1.length; i++) {
            if (rev1[i] < rev2[i]) return -1;
            if (rev1[i] > rev2[i]) return 1;
        }
        return 0;
    }

    private int[] convert(String[] revisions, int len) {
        int[] converted = new int[len];
        int index = 0;
        for (String rev: revisions) {
            String str = removeLeadingZeros(rev);
            converted[index++] = Integer.parseInt(str);
        }
        return converted;
    }

    private String removeLeadingZeros(String revision) {
        int index = 0;
        while (index < revision.length() && revision.charAt(index) == '0') {
            index++;
        }
        return index >= revision.length() ? "0" : revision.substring(index);
    }
}