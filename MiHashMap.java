
/**
 * Write a description of class MiHashMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiHashMap
{
    //Contains all the object int
    private int[] enteros;
    //Contains all the object String
    private String[] frases;

    /**
     * Constructor for objects of class ArrayListInt
     */
    public MiHashMap()
    {
        enteros = new int[0];
        frases = new String[0];
    }
    
    /**
     * Introduce en el objeto los dos parametros que se relacionan entre si.
     * @param String clave  añade objeto String a la coleccion
     * @param int añade objeto int a su coleccion
     * @return devuelve valor contenido en dicha clave, si no existia devuelve -1
     */
    public int put(String clave, int valor){
        int aux = -1;        
        boolean exist = false;
        int cont = 0;
        while(cont < enteros.length && !exist){
            if(frases[cont] == clave){exist = true;}
            cont++;
        }
        if(exist){ 
            aux = enteros[cont-1];
            enteros[cont-1] = valor;
        }
        else{
            frases[cont] = clave;
            enteros[cont] = valor;
        }
        return aux;
    }

    /**
     * Devuelve el elemento con la clave indicada
     * @param index posición en la que se encuentra el elemento
     * @returm elemento que se encuentra en dicha posición, de no haberlo devuelve -1
     */
    public int get(String clave){
        int aux = -1;        
        boolean exist = false;
        int cont = 0;
        while(cont < enteros.length && !exist){
            if(frases[cont] == clave){exist = true;}
            cont++;
        }
        if(exist){ aux = enteros[cont-1];}
        return aux;
    }

    /**
     * Indica si existe un elemento en esa posición
     * @return devuelve true si encuentra elementos en la lista
     */
    public boolean isEmpty(){       
        return (frases.length == 0);
    }

    /**
     * Devuelve el tamaño total de los arrays
     */
    public int size(){
        return enteros.length;
    }

}
