package datos;
import java.util.HashMap;
import entidad.ejemplo;
/**
 * Write a description of class Contenedor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Contenedor
{
    // instance variables - replace the example below with your own
    private static HashMap<String,ejemplo> mapa = new HashMap<String,ejemplo>(); 
    
                     
                     
                     
   public String agregar(Object obj){ 
        if(obj instanceof ejemplo){
            ejemplo aux=(ejemplo)obj;
        if(!mapa.containsKey(aux.getTipo())){
         mapa.put(aux.getTipo(),aux);
         return "Agregado ;D";
        }
    }
    return "Error al agregar";
  }
  

}
