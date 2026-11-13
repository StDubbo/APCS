public class RSP {
    public static void main(String[] args) {
        String compChoice = getComputerChoice();
        String userChoice = getUserChoice();
        String winner = determineWinner(compChoice, userChoice);
        System.out.println(winner);
    } 
    
    public static String getComputerChoice() {
        return "Scissors";
    } 

    public static String getUserChoice() {
        return "Rock";
    } 

    public static String determineWinner(String c, String u) {

        if (c.equals(u)) {
            return "Draw";
        }

        if ( c.equals("Paper") && u.equals("Scissors") ||
             c.equals("Scissors") && u.equals("Rock") ||
             c.equals("Rock") && u.equals("Paper") ) {
                return "Player";

             } 

        return "Computer";


    } // end of winner
}

