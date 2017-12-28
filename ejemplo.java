package entidad;


/**
 * Write a description of class ejemplo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ejemplo
{
    // instance variables - replace the example below with your own
    private int peso;
    private String tipo;
    /**
     * Constructor for objects of class ejemplo
     */
    public ejemplo()
    {
        // initialise instance variables
        this.peso=20;
        this.tipo="euro";
    }
    
     /**
     * Constructor for objects of class ejemplo
     *@param int peso;
     *@param String tipo;
     */
    public ejemplo(int peso,String tipo)
    {
        
        setPeso(peso);
        setTipo(tipo);
    }

     /**
     * Constructor for objects of class ejemplo
     */
    public int getPeso()
    {
        return peso;
    }

     /**
     * Constructor for objects of class ejemplo
     */
    public String getTipo()
    {
        // initialise instance variables
       return tipo;
    }
     
     /**
     * Constructor for objects of class ejemplo
     */
    public void setPeso(int peso)
    {
        this.peso=peso;
    }

     /**
     * Constructor for objects of class ejemplo
     */
    public void setTipo(String tipo)
    {
        // initialise instance variables
       this.tipo=tipo;
    }
    
    public String toString(){
    
    return getTipo() + getPeso();
    }
    
    public boolean equals(Object obj){
          if(obj instanceof ejemplo){
            ejemplo aux=(ejemplo) obj;
            if(getPeso()==aux.getPeso()
             && getTipo().equals(aux.getTipo()) ){
                 return true;
 
                }
                return false;
            }
            return false;
  } 
        
       
        
           
}
