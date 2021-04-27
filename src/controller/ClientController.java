/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Client;

public class ClientController {
    
     public boolean verifyClient(Client client) {
        boolean key = true;
        String clientName = client.getClientName();
        String clientEmail = client.getClientEmail();
        String creditCard = client.getCreditCard();
        
        if (clientName.trim().equals("") || clientEmail.trim().equals("") || creditCard.trim().length() < 16) {
            key = false;
        }

        return key;
    }
}
