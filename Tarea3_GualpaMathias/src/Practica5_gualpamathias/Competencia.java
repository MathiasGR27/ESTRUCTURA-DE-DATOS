package Practica5_gualpamathias;

import java.util.ArrayList;//Se importa la libreria 

public class Competencia {
    ArrayList<Atleta> listaAtletas = new ArrayList<>();//Se crea un array listaAtletas 
    
    public void registro(String nombre , String nacionalidad , double tiempo){
        Atleta nuevoAtleta = new Atleta(nombre,nacionalidad,tiempo);
        listaAtletas.add(nuevoAtleta);//Se guarda el atleta en el array
        System.out.println(" Atleta registrado con exito ");
    }
    
    public void mostrardatosganador(){
        if(listaAtletas.isEmpty()){ //Si no hay atletas arroga un mensaje 
           System.out.println("No hay atletas registrado ");//Este mensaje 
           return ;
        }
        Atleta ganador = listaAtletas.get(0);
        for(Atleta atleta : listaAtletas ){ 
            if (atleta.tiempo < ganador.tiempo){ //Funcion que depende de cada tiempo de atleta
                //Si es menor el ganador seria ese atleta 
                ganador = atleta;
            }
        }
        //Mostamos los datos del atleta Ganador
        System.out.println("------------------------------------" );
        System.out.println(" El Ganador es ");
        System.out.println("Nombre : " +ganador.nombre);
        System.out.println("Nacionalidad : " +ganador.nacionalidad);
        System.out.println("Tiempo : " +ganador.tiempo);
        
    }
    
     public void mostraratletasPorPais(String pais) {
        if (listaAtletas.isEmpty()) {//Si no hay atletas arroga un mensaje 
            System.out.println("No hay atletas registrados ");//Este mensaje
            return;
        }
        //Aqui muestra un mensaje de atletas de tal pais
        System.out.println("Atletas de " + pais + ":");
        for (Atleta atleta : listaAtletas) {
            if (atleta.nacionalidad.equalsIgnoreCase(pais)) { //Si hay atletas de ese pais muestra
                //El nombre y tiempo del atleta  
                System.out.println("------------------------------------" );
                System.out.println("Nombre : " +atleta.nombre );
                System.out.println("Tiempo : " +atleta.tiempo);
            }
        }
    }
     
     public void promtiempo(){
         if(listaAtletas.isEmpty()){//Si no hay atletas arroga un mensaje 
            System.out.println("No hay atletas registrados");//Este mensaje
            return;
         }
         double Ttiem=0;//Se inicialza en 0
         for(Atleta atleta : listaAtletas){
             Ttiem +=atleta.tiempo;//Va sumado los tiempo de cada atleta 
         }
         
         double tiempro = Ttiem/listaAtletas.size();//Se guarda en tiempopro el tiempo total de los atletas dividido para total de atletlas
         System.out.println("El tiempo promedio de los atletas es --> " +tiempro);//Asi sacando el promedio 
     }
     
     public void eliminarAtleta(String nombre) {
        if (listaAtletas.isEmpty()) {//Si no hay atletas arroga un mensaje
            System.out.println("No hay atletas registrados");//Este mensaje
            return;
        }

        for (Atleta atleta : listaAtletas) {
            if (atleta.nombre.equalsIgnoreCase(nombre)) {//Si el atleta si esta en el array
                listaAtletas.remove(atleta);//Lo va a remover es decir eliminar del array
                System.out.println("Atleta eliminado con exito");//Sale este mensaje de que se elimino el atleta 
                return;
            }
        }
        System.out.println("No se encontro un atleta con ese nombre ");//Si no hay sale que no se encontro ese nombre
    }
     
    public void mostrardatosatletas(){
        if (listaAtletas.isEmpty()) {//Si no hay atletas arroga un mensaje
            System.out.println("No hay atletas registrados");//Este mensaje
            return;
        }
        System.out.println("Todos los atletas registrados son -->");
        for ( Atleta atleta : listaAtletas){ //Muestra tpdps los atletas con todos sus datos
        System.out.println("------------------------------------" );
        System.out.println("Nombre : " +atleta.nombre );
        System.out.println("Nacionalidad : " +atleta.nacionalidad);
        System.out.println("Tiempo : " +atleta.tiempo);  
        }    
    }

}
