class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        if(color == originalColor) return image;
        return recursiveFill(image, sr, sc, color, originalColor);
    }

    public int[][] recursiveFill(int[][] image, int sr, int sc, int color, int originalColor){
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length){
            return image;
        }
        if(image[sr][sc] != originalColor){
            return image;
        }

        image[sr][sc] = color;

        recursiveFill(image, sr+1, sc, color, originalColor);
        recursiveFill(image, sr-1, sc, color, originalColor);
        recursiveFill(image, sr, sc+1, color, originalColor);
        recursiveFill(image, sr, sc-1, color, originalColor);
        
        return image;
    }
}