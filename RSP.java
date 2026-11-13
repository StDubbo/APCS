public class RSP {
    public static void main(String[] args) {
        String compChoice = getComputerChoice();
        String userChoice = getUserChoice();
        String winner = determineWinner(compChoice, userChoice);
        System.out.println(winner);
    } // end of main

    public static String getComputerChoice() {
        return "Scissors";
    } // end of getCmputerCHoice

    public static String getUserChoice() {
        return "Rock";
    } // end of user choice 

    public static String determineWinner(String c, String u) {

        if (c.equals(u)) {
            return "Draw";
        }

        if ( c.equals("Scissors") && u.equals("Rock") ||
             c.equals("Scissors") && u.equals("Rock") ||
             c.equals("Scissors") && u.equals("Rock") ) {
                return "Player";
             } 

        return "Computer";


    } // end of winner
}

