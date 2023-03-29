/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gatos_app;

/**
 *
 * @author Luis Sotelo
 */
public class GatosFav {
    String id;
    String image_id;
    String apikey = "live_C0ukXwg3Q9pKT0zEIKN0nQlLut4HMPgkkLg2DhQvQZ8v4h2EGNpjrhgBZLYE20LZ";
    Imagex image;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage_id() {
        return image_id;
    }

    public void setImage_id(String image_id) {
        this.image_id = image_id;
    }

    public String getApikey() {
        return apikey;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    public Imagex getImage() {
        return image;
    }

    public void setImage(Imagex image) {
        this.image = image;
    }
 
}
