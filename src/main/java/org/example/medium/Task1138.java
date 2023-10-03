package org.example.medium;

public class Task1138 {
   /*
 Here, board = ["abcde",
                "fghij",
                "klmno",
                "pqrst",
                "uvwxy",
                 "z"], as shown in the diagram below.



We may make the following moves:

'U' moves our position up one row, if the position exists on the board;
'D' moves our position down one row, if the position exists on the board;
'L' moves our position left one column, if the position exists on the board;
'R' moves our position right one column, if the position exists on the board;
'!' adds the character board[r][c] at our current position (r, c) to the answer.
(Here, the only positions that exist on the board are positions with letters on them.)
Example 1:

Input: target = "leet"
Output: "DDR!UURRR!!DDD!"
Example 2:

Input: target = "code"
Output: "RR!DDRR!UUL!R!"

     */
   public static void main(String[] args) {
       Task1138 t = new Task1138();
       t.alphabetBoardPath("z");
   }
    public String alphabetBoardPath(String target) {

        StringBuilder ask = new StringBuilder();
        int currPositionX = 0;
        int currPositionY = 0;

        for(char c: target.toCharArray()){

            int targetOffsetX =  (c-'a') % 5;
            int targetOffsetY = (c-'a') / 5;
            int offsetX = targetOffsetX-currPositionX;
            int offsetY = targetOffsetY - currPositionY;

            if(offsetY>0){
                if(targetOffsetY==5 && offsetX <0 ) {
                    ask.append("D".repeat(offsetY-1));
                    ask.append("L".repeat(Math.abs(offsetX)));
                    ask.append("D");
                    ask.append('!');
                    currPositionX = targetOffsetX;
                    currPositionY = targetOffsetY;
                    continue;


                } else ask.append("D".repeat(offsetY));
            } else{
                ask.append("U".repeat(Math.abs(offsetY)));
            }

            if(offsetX>0){
                ask.append("R".repeat(offsetX));
            } else if (offsetX < 0){
                ask.append("L".repeat(Math.abs(offsetX)));
            }
            ask.append('!');
        currPositionX = targetOffsetX;
        currPositionY = targetOffsetY;


        }
        return ask.toString();
    }
}
