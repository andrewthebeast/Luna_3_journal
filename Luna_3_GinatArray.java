package luna_3_ginat.array;

import java.util.Scanner;

public class Luna_3_GinatArray {
    public static String Moving;
    public static int trapx = 4;
    public static int trapy = 16;
    public static int trap2x = 2;
    public static int trap2y = 15;
    public static int trap3x = 19;
    public static int trap3y = 13;
    public static int trap4x = 15;
    public static int trap4y = 5;
    public static int enemyx = 12;
    public static int enemyy = 15;
    public static int enemy2x = 5;
    public static int enemy2y = 6;
    public static int enemy3x = 8;
    public static int enemy3y = 10;
    public static int startx = 10;
    public static int starty = 9;
    public static int health = 100;
    public static boolean blocked = true;
    public static int treasurex = 15;
    public static int treasurey = 18;
    public static boolean isplaying = true;

    public static void main(String[] args) {
        story();
        while (isplaying){
        board();       
        move();
        }
    }
    static void story(){
        System.out.println("On an adventure to the underground caves to Nebraska to find treasure.");
        System.out.println("You accidentally fall into a pit and try to find the treasure, and a way out.");
        System.out.println("But along the way there are traps and enemies that will hurt you and kill you.");
        System.out.println("Good Luck.");
    }

static void board() {
        char[][] board = new char[21][21];
        board[0][0]= '_';
        board[1][0]= '|';
        board[2][0]= '|';
        board[3][0]= '|';
        board[4][0]= '|';
        board[5][0]= '|';
        board[6][0]= '|';
        board[7][0]= '|';
        board[8][0]= '|';
        board[9][0]= '|';
        board[10][0]= '|';
        board[11][0]= '|';
        board[12][0]= '|';
        board[13][0]= '|';
        board[14][0]= '|';
        board[15][0]= '|';
        board[16][0]= '|';
        board[17][0]= '|';
        board[18][0]= '|';
        board[19][0]= '|';
        board[20][0]= '|';
        board[0][1]= '_';
        board[0][2]= '_';
        board[0][3]= '_';
        board[0][4]= '_';
        board[0][5]= '_';
        board[0][6]= '_';
        board[0][7]= '_';
        board[0][8]= '_';
        board[0][9]= '_';
        board[0][10]= '_';
        board[0][11]= '_';
        board[0][12]= '_';
        board[0][13]= '_';
        board[0][14]= '_';
        board[0][15]= '_';
        board[0][16]= '_';
        board[0][17]= '_';
        board[0][18]= '_';
        board[0][19]= '_';
        board[0][20]= '_';
        board[20][1]= '_';
        board[20][2]= '_';
        board[20][3]= '_';
        board[20][4]= '_';
        board[20][5]= '_';
        board[20][6]= '_';
        board[20][7]= '_';
        board[20][8]= '_';
        board[20][9]= '_';
        board[20][10]= '_';
        board[20][11]= '_';
        board[20][12]= '_';
        board[20][13]= '_';
        board[20][14]= '_';
        board[20][15]= '_';
        board[20][16]= '_';
        board[20][17]= '_';
        board[20][18]= '_';
        board[20][19]= '_';
        board[20][20]= '_';
        board[0][0]= '_';
        board[1][20]= '|';
        board[2][20]= '|';
        board[3][20]= '|';
        board[4][20]= '|';
        board[5][20]= '|';
        board[6][20]= '|';
        board[7][20]= '|';
        board[8][20]= '|';
        board[9][20]= '|';
        board[10][20]= '|';
        board[11][20]= '|';
        board[12][20]= '|';
        board[13][20]= '|';
        board[14][20]= '|';
        board[15][20]= '|';
        board[16][20]= '|';
        board[17][20]= '|';
        board[18][20]= '|';
        board[19][20]= '|';
        board[20][20]= '|';
        board[treasurex][treasurey]='T';
        board[enemyx][enemyy] = 'E';
        board[enemy2x][enemy2y] = 'E';
        board[enemy3x][enemy3y] = 'E';
        board[trap4x][trap4y]='B';
        board[trap3x][trap3y]='B';
        board[trap2x][trap2y]='B';
        board[trapx][trapy]='B';
        board[startx][starty]= '@';
        for (int i = 0; i <= board[0].length - 1; i++) {
            for (int j = 0; j <= board[1].length - 1; j++) {
                if (j < board[1].length - 1) {
                    if (board[i][j] != '@'&& board[i][j] != 'B' && board[i][j] != 'E' && board[i][j] != '|' && board[i][j] != '_' && board[i][j] != 'T') {
                        System.out.print(".");
                    }else {
                        System.out.print(board[i][j]);
                    }
                } else if (board[i][j] != '|' && board[i][j] != '_') {
                    System.out.println(".");
                } else {
                    System.out.println(board[i][j]);
                }
            }
        }

    }


    static void move() {
        System.out.println("To move the '@' symbol:'n'= up 's'= down 'w'= right 'e'= left 'sw'= southwest 'nw'= northwest 'se'= southeast 'ne'= northeast");
        
        System.out.println("Health : "+ health);
        Scanner compass = new Scanner(System.in);
        Moving = compass.nextLine().trim().toLowerCase();
                
            if (Moving.contains("w")) {
            starty--;
            if(startx > enemyx && starty > enemyy){
                enemyx++;
                enemyy++;
            }else if(startx > enemy2x && starty > enemy2y){
                enemy2x++;
                enemy2y++;
            }else if (startx > enemy3x && starty > enemy3y){
                enemy3x++;
                enemy3y++;
            }
            else if(startx < enemyx && starty < enemyy){
                enemyx--;
                enemyy--;
            }else if(startx < enemy2x && starty < enemy2y){
                enemy2x--;
                enemy2y--;
            }else if (startx < enemy3x && starty < enemy3y){
                enemy3x--;
                enemy3y--;
            }
            }if(health == 0){
                isplaying = false;
                System.out.println("__   __            _                   \n" +
                                    "\\ \\ / /__  _   _  | |    ___  ___  ___ \n" +
                                    " \\ V / _ \\| | | | | |   / _ \\/ __|/ _ \\\n" +
                                    "  | | (_) | |_| | | |__| (_) \\__ \\  __/\n" +
                                    "  |_|\\___/ \\__,_| |_____\\___/|___/\\___|\n" +
                                    "                                       ");
            }if(startx == enemyy && starty == enemyy){
                health -= 10;
            }else if (startx == enemy2y && starty == enemy2y){
                health-= 10;
            }else if (startx == enemy3y && starty == enemy3y){
                health-= 10;
            }else if(startx == trapx && startx == trapy){
                health -= 5;
            }else if(startx == trap2x && startx == trap2y){
                health -= 5;
            }else if(startx == trap3x && startx == trap3y){
                health -= 5;
            }else if(startx == trap4x && startx == trap4y){
                health -= 5;
            }
            if(startx == treasurex && starty == treasurey){
                           System.out.println("__   __           __        ___       \n" +
                            "\\ \\ / /__  _   _  \\ \\      / (_)_ __  \n" +
                            " \\ V / _ \\| | | |  \\ \\ /\\ / /| | '_ \\ \n" +
                               "  | | (_) | |_| |   \\ V  V / | | | | |\n" +
                              "  |_|\\___/ \\__,_|    \\_/\\_/  |_|_| |_|");
                           isplaying = false;
            }
            if (Moving.contains("e")) {
            starty++;
            if(startx > enemyx && starty > enemyy){
                enemyx++;
                enemyy++;
            }else if(startx > enemy2x && starty > enemy2y){
                enemy2x++;
                enemy2y++;
            }else if (startx > enemy3x && starty > enemy3y){
                enemy3x++;
                enemy3y++;
            }
            else if(startx < enemyx && starty < enemyy){
                enemyx--;
                enemyy--;
            }else if(startx < enemy2x && starty < enemy2y){
                enemy2x--;
                enemy2y--;
            }else if (startx < enemy3x && starty < enemy3y){
                enemy3x--;
                enemy3y--;
            }
            }if(health == 0){
                isplaying = false;
                System.out.println("__   __            _                   \n" +
                                    "\\ \\ / /__  _   _  | |    ___  ___  ___ \n" +
                                    " \\ V / _ \\| | | | | |   / _ \\/ __|/ _ \\\n" +
                                    "  | | (_) | |_| | | |__| (_) \\__ \\  __/\n" +
                                    "  |_|\\___/ \\__,_| |_____\\___/|___/\\___|\n" +
                                    "                                       ");
            }if(startx == enemyy && starty == enemyy){
                health -= 10;
            }else if (startx == enemy2y && starty == enemy2y){
                health-= 10;
            }else if (startx == enemy3y && starty == enemy3y){
                health-= 10;
            }else if(startx == trapx && startx == trapy){
                health -= 5;
            }else if(startx == trap2x && startx == trap2y){
                health -= 5;
            }else if(startx == trap3x && startx == trap3y){
                health -= 5;
            }else if(startx == trap4x && startx == trap4y){
                health -= 5;
            }
            if(startx == treasurex && starty == treasurey){
                           System.out.println("__   __           __        ___       \n" +
                            "\\ \\ / /__  _   _  \\ \\      / (_)_ __  \n" +
                            " \\ V / _ \\| | | |  \\ \\ /\\ / /| | '_ \\ \n" +
                               "  | | (_) | |_| |   \\ V  V / | | | | |\n" +
                              "  |_|\\___/ \\__,_|    \\_/\\_/  |_|_| |_|");
                           isplaying = false;
            } 
        if (Moving.contains("n")) {
            startx--;
            if(startx > enemyx && starty > enemyy){
                enemyx++;
                enemyy++;
            }else if(startx > enemy2x && starty > enemy2y){
                enemy2x++;
                enemy2y++;
            }else if (startx > enemy3x && starty > enemy3y){
                enemy3x++;
                enemy3y++;
            }
            else if(startx < enemyx && starty < enemyy){
                enemyx--;
                enemyy--;
            }else if(startx < enemy2x && starty < enemy2y){
                enemy2x--;
                enemy2y--;
            }else if (startx < enemy3x && starty < enemy3y){
                enemy3x--;
                enemy3y--;
            }
            if(health == 0){
                isplaying = false;
                System.out.println("__   __            _                   \n" +
                                    "\\ \\ / /__  _   _  | |    ___  ___  ___ \n" +
                                    " \\ V / _ \\| | | | | |   / _ \\/ __|/ _ \\\n" +
                                    "  | | (_) | |_| | | |__| (_) \\__ \\  __/\n" +
                                    "  |_|\\___/ \\__,_| |_____\\___/|___/\\___|\n" +
                                    "                                       ");
            }if(startx == enemyy && starty == enemyy){
                health -= 10;
            }else if (startx == enemy2y && starty == enemy2y){
                health-= 10;
            }else if (startx == enemy3y && starty == enemy3y){
                health-= 10;
            }else if(startx == trapx && startx == trapy){
                health -= 5;
            }else if(startx == trap2x && startx == trap2y){
                health -= 5;
            }else if(startx == trap3x && startx == trap3y){
                health -= 5;
            }else if(startx == trap4x && startx == trap4y){
                health -= 5;
            }
            if(startx == treasurex && starty == treasurey){
                           System.out.println("__   __           __        ___       \n" +
                            "\\ \\ / /__  _   _  \\ \\      / (_)_ __  \n" +
                            " \\ V / _ \\| | | |  \\ \\ /\\ / /| | '_ \\ \n" +
                               "  | | (_) | |_| |   \\ V  V / | | | | |\n" +
                              "  |_|\\___/ \\__,_|    \\_/\\_/  |_|_| |_|");
                           isplaying = false;
            }
}
        if (Moving.contains("s")) {
            startx++;
            if(startx > enemyx && starty > enemyy){
                enemyx++;
                enemyy++;
            }else if(startx > enemy2x && starty > enemy2y){
                enemy2x++;
                enemy2y++;
            }else if (startx > enemy3x && starty > enemy3y){
                enemy3x++;
                enemy3y++;
            }
            else if(startx < enemyx && starty < enemyy){
                enemyx--;
                enemyy--;
            }else if(startx < enemy2x && starty < enemy2y){
                enemy2x--;
                enemy2y--;
            }else if (startx < enemy3x && starty < enemy3y){
                enemy3x--;
                enemy3y--;
            }
            }if(health == 0){
                isplaying = false;
                System.out.println("__   __            _                   \n" +
                                    "\\ \\ / /__  _   _  | |    ___  ___  ___ \n" +
                                    " \\ V / _ \\| | | | | |   / _ \\/ __|/ _ \\\n" +
                                    "  | | (_) | |_| | | |__| (_) \\__ \\  __/\n" +
                                    "  |_|\\___/ \\__,_| |_____\\___/|___/\\___|\n" +
                                    "                                       ");
            }if(startx == enemyy && starty == enemyy){
                health -= 10;
            }else if (startx == enemy2y && starty == enemy2y){
                health-= 10;
            }else if (startx == enemy3y && starty == enemy3y){
                health-= 10;
            }else if(startx == trapx && startx == trapy){
                health -= 5;
            }else if(startx == trap2x && startx == trap2y){
                health -= 5;
            }else if(startx == trap3x && startx == trap3y){
                health -= 5;
            }else if(startx == trap4x && startx == trap4y){
                health -= 5;
            }
            if(startx == treasurex && starty == treasurey){
                           System.out.println("__   __           __        ___       \n" +
                            "\\ \\ / /__  _   _  \\ \\      / (_)_ __  \n" +
                            " \\ V / _ \\| | | |  \\ \\ /\\ / /| | '_ \\ \n" +
                               "  | | (_) | |_| |   \\ V  V / | | | | |\n" +
                              "  |_|\\___/ \\__,_|    \\_/\\_/  |_|_| |_|");
                           isplaying = false;
            }
    }
}
