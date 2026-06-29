package lec_02;

import javax.swing.*;
import java.awt.*;

public class TicTacToe extends JFrame {
    private final JButton[][] buttons = new JButton[3][3];
    private final JLabel statusLabel = new JLabel("Current player: X");
    private char currentPlayer = 'X';

    public TicTacToe() {
        setTitle("Tic-Tac-Toe");
        setSize(400, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel boardPanel = new JPanel(new GridLayout(3, 3, 5, 5));
        boardPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        Font buttonFont = new Font("Arial", Font.BOLD, 60);

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                JButton button = new JButton("");
                button.setFont(buttonFont);

                int r = row;
                int c = col;

                button.addActionListener(e -> makeMove(r, c));

                buttons[row][col] = button;
                boardPanel.add(button);
            }
        }

        JButton newGameButton = new JButton("New Game");
        newGameButton.addActionListener(e -> resetGame());

        statusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        statusLabel.setFont(new Font("Arial", Font.BOLD, 18));

        add(statusLabel, BorderLayout.NORTH);
        add(boardPanel, BorderLayout.CENTER);
        add(newGameButton, BorderLayout.SOUTH);
    }

    private void makeMove(int row, int col) {
        if (!buttons[row][col].getText().isEmpty()) {
            return;
        }

        buttons[row][col].setText(String.valueOf(currentPlayer));

        if (checkWinner()) {
            JOptionPane.showMessageDialog(this, "Player " + currentPlayer + " wins!");
            resetGame();
            return;
        }

        if (isDraw()) {
            JOptionPane.showMessageDialog(this, "Draw!");
            resetGame();
            return;
        }

        switchPlayer();
        statusLabel.setText("Current player: " + currentPlayer);
    }

    private void switchPlayer() {
        currentPlayer = currentPlayer == 'X' ? 'O' : 'X';
    }

    private boolean checkWinner() {
        for (int i = 0; i < 3; i++) {
            if (checkLine(buttons[i][0], buttons[i][1], buttons[i][2])) {
                return true;
            }

            if (checkLine(buttons[0][i], buttons[1][i], buttons[2][i])) {
                return true;
            }
        }

        return checkLine(buttons[0][0], buttons[1][1], buttons[2][2])
                || checkLine(buttons[0][2], buttons[1][1], buttons[2][0]);
    }

    private boolean checkLine(JButton b1, JButton b2, JButton b3) {
        String text1 = b1.getText();
        String text2 = b2.getText();
        String text3 = b3.getText();

        return !text1.isEmpty()
                && text1.equals(text2)
                && text2.equals(text3);
    }

    private boolean isDraw() {
        for (JButton[] row : buttons) {
            for (JButton button : row) {
                if (button.getText().isEmpty()) {
                    return false;
                }
            }
        }

        return true;
    }

    private void resetGame() {
        for (JButton[] row : buttons) {
            for (JButton button : row) {
                button.setText("");
            }
        }

        currentPlayer = 'X';
        statusLabel.setText("Current player: X");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TicTacToe().setVisible(true));
    }
}
