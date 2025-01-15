package controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.model.Moneda;

public class ConversionJSON {
    public Moneda ConvertirDeJSON (String retorno){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.fromJson(retorno, Moneda.class);
    }
}
