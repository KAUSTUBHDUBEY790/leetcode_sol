class Solution {
    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> ans = new ArrayList<>();
        for(int i = 0; i < words.length;){
            List<String> wordsInLine = getLineWords(i, words, maxWidth);
            i += wordsInLine.size();
            ans.add(generateLine(wordsInLine, maxWidth, i == words.length));
        }

        return ans;
    }

    private static List<String> getLineWords(int i, String[] words, int maxWidth) {
        List<String> wordsInLine = new ArrayList<>();
        int lineLength = 0;
        while(i < words.length && lineLength + words[i].length() <= maxWidth){
            wordsInLine.add(words[i]);
            lineLength += words[i].length() + 1;
            i++;
        }

        return wordsInLine;
    }

    private static String generateLine(List<String> line, int maxWidth, boolean isLastLine) {
        int lenOfLine = 0;
        int spacesToBeInserted = 0;
        for(String word : line){
            lenOfLine += word.length();
        }

        spacesToBeInserted = maxWidth - lenOfLine;
        StringBuilder finalString = new StringBuilder();

        if(line.size() == 1){
            finalString.append(line.get(0)).append(" ".repeat(spacesToBeInserted));
        } else if(isLastLine){
            if(line.size() > 1){
                for(int i = 0; i < line.size() - 1 && spacesToBeInserted-- > 0; i++){
                    finalString.append(line.get(i) + " ");
                }
                finalString.append(line.get(line.size() - 1)).append(" ".repeat(spacesToBeInserted));
            } else {
                finalString.append(line.get(0)).append(" ".repeat(spacesToBeInserted));
            }

        } else {
            int i = 0;
            for(int j = 0; j < spacesToBeInserted; j++){
                line.set(i, line.get(i) + " ");
                i = (i + 1) % (line.size() - 1);
            }

            for(String word : line){
                finalString.append(word);
            }
        }
        return finalString.toString();
    }
}