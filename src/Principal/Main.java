package Principal;

import Interfaz.Juego;

public class Main {

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            new Juego().setVisible(true);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
//COMENTARIO DE MIERDA COMENTARIO DE MIERDA COMENTARIO DE MIERDA COMENTARIO DE MIERDA COMENTARIO DE MIERDA COMENTARIO DE MIERDA COMENTARIO DE MIERDA COMENTARIO DE MIERDA COMENTARIO DE MIERDA COMENTARIO DE MIERDA COMENTARIO DE MIERDA COMENTARIO DE MIERDA
}
