package br.com.eric.catalogo.main;

import br.com.eric.catalogo.view.CrudUsuario;

import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {

	public static void main(String args[]) {

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

            /* Create and display the form */
			java.awt.EventQueue.invokeLater(new Runnable() {
				public void run() {
					new CrudUsuario().setVisible(true);
				}
			});
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(CrudUsuario.class.getName()).log(Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			Logger.getLogger(CrudUsuario.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			Logger.getLogger(CrudUsuario.class.getName()).log(Level.SEVERE, null, ex);
		} catch (UnsupportedLookAndFeelException ex) {
			Logger.getLogger(CrudUsuario.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
