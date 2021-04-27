/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Film;
import model.Rent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class FilmController {
    
     public static void copyFile(File source, File destination) throws IOException {
        if (destination.exists()) {
            destination.delete();
        }
        FileChannel sourceChannel = null;
        FileChannel destinationChannel = null;
        try {
            sourceChannel = new FileInputStream(source).getChannel();
            destinationChannel = new FileOutputStream(destination).getChannel();
            sourceChannel.transferTo(0, sourceChannel.size(),
                    destinationChannel);
        } finally {
            if (sourceChannel != null && sourceChannel.isOpen()) {
                sourceChannel.close();
            }
            if (destinationChannel != null && destinationChannel.isOpen()) {
                destinationChannel.close();
            }
        }
    }

    public boolean checkEmptyFields(Film film, Rent rent){
        boolean key = false;
        
        String title = film.getTitle();
        String synopsis = film.getSynopsis();
        String category = film.getCategoryName();
        String filmDirector = film.getFilmDirector();
        int filmTime = film.getFilmTime();
        double rentPrice = rent.getRentPrice();
        
//        String capa = filme.getCapa();
        
        if(!(title.equals("") || filmTime < 0 )) {
            key = true;
        }
        
        return key;
    }

}
