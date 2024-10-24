/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author ramos
 */
public class Eventos {
    public void textKeyPress(KeyEvent evt) {
    // Evento para que solo se acepten letras y acentos
    char car = evt.getKeyChar();
    
    // Lista de vocales acentuadas permitidas
    String acentos = "áéíóúÁÉÍÓÚñÑ";

    if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z')
            && (car != (char) KeyEvent.VK_BACK_SPACE) 
            && (car != (char) KeyEvent.VK_SPACE) 
            && (acentos.indexOf(car) == -1)) {
        evt.consume(); // Se consume el evento si el carácter no es válido
    }
}

 
   public void numberKeyPress(KeyEvent evt) { 
    // Evento para que solo acepte números y el guión medio '-'
    char car = evt.getKeyChar();
    
    // Permitir números, retroceso y guión medio
    if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACK_SPACE) && (car != '-')) {
        evt.consume(); // Consume el evento si no es un número, backspace o guión
    }
}

 
    
    
}
