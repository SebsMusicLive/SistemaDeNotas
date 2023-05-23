/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaNotas;

/**
 *
 * @author ASUS
 */
public class SistemaNotas {
    PilaLista<Estudiante> programacionIII = new PilaLista<>();
    PilaLista<Estudiante> calculoIII = new PilaLista<>();
    PilaLista<Estudiante> inglesI = new PilaLista<>();
    
    public void crearPilas(Estudiante e, String materia){
        String materiaEstudiante = materia.toLowerCase().trim().replaceAll("á","a").replaceAll("é", "e").replaceAll("í", "i").replaceAll("ó", "o").replaceAll("ú", "u");
        
        if(estudiaProgramacion(materiaEstudiante)){
            programacionIII.push(e);
        }else if(estudiaCalculo(materiaEstudiante)){
            calculoIII.push(e);
        }else if(estudiaIngles(materiaEstudiante)){
            inglesI.push(e);
        }
    }
    
    public String imprimirReprobados() throws Exception{
        String reprobados="Reprobados: \n"
                + "ProgramacionIII: \n";
        Estudiante estudiante;
        PilaLista<Estudiante> tempProgramacion = new PilaLista<>();
        
        for (int i = 0; i < programacionIII.getSize(); i++) {
            
            estudiante = programacionIII.pop();
            tempProgramacion.push(estudiante);
            if (promedioEstudiante(estudiante)<3.0) { 
                reprobados+=estudiante.getCodigo()+"\n";
            }  
        }
        this.programacionIII = volverALlenarPilas(tempProgramacion);
        
        reprobados+="\ncalculoIII: \n";
        PilaLista<Estudiante> tempCalculo = new PilaLista<>();
        
        for (int i = 0; i < calculoIII.getSize(); i++) {
            estudiante = calculoIII.pop();
            tempCalculo.push(estudiante);
            if (promedioEstudiante(estudiante)<3.0) { 
                reprobados+=estudiante.getCodigo()+"\n";
            }  
        }
        this.calculoIII = volverALlenarPilas(tempCalculo);
        
        reprobados+="\nInglesI: \n";
        PilaLista<Estudiante> tempIngles = new PilaLista<>();
        
        for (int i = 0; i < inglesI.getSize(); i++) {
            estudiante = inglesI.pop();
            tempIngles.push(estudiante);
            if (promedioEstudiante(estudiante)<3.0) { 
                reprobados+=estudiante.getCodigo()+"\n";
            }  
        }
        this.inglesI = volverALlenarPilas(tempIngles);
        
        return reprobados;
    }
    
    public String imprimirAprobados() throws Exception{
        String aprobados="Aprobados: \n"
                + "ProgramacionIII: \n";
        Estudiante estudiante;
        PilaLista<Estudiante> tempProgramacion = new PilaLista<>();
        
        for (int i = 0; i < programacionIII.getSize(); i++) {
            
            estudiante = programacionIII.pop();
            tempProgramacion.push(estudiante);
            if (promedioEstudiante(estudiante)>=3.0) { 
                aprobados+=estudiante.getCodigo()+"\n";
            }  
        }
        this.programacionIII = volverALlenarPilas(tempProgramacion);
        
        aprobados+="\ncalculoIII: \n";
        PilaLista<Estudiante> tempCalculo = new PilaLista<>();
        
        for (int i = 0; i < calculoIII.getSize(); i++) {
            estudiante = calculoIII.pop();
            tempCalculo.push(estudiante);
            if (promedioEstudiante(estudiante)>=3.0) { 
                aprobados+=estudiante.getCodigo()+"\n";
            }  
        }
        this.calculoIII = volverALlenarPilas(tempCalculo);
        
        aprobados+="\nInglesI: \n";
        PilaLista<Estudiante> tempIngles = new PilaLista<>();
        
        for (int i = 0; i < inglesI.getSize(); i++) {
            estudiante = inglesI.pop();
            tempIngles.push(estudiante);
            if (promedioEstudiante(estudiante)>=3.0) { 
                aprobados+=estudiante.getCodigo()+"\n";
            }  
        }
        this.inglesI = volverALlenarPilas(tempIngles);
        
        return aprobados;
    }
    
    private PilaLista<Estudiante> volverALlenarPilas(PilaLista<Estudiante> temp) throws Exception{
        
        PilaLista<Estudiante> volver = new PilaLista<>();
        for (int i = 0; i < temp.getSize(); i++) {
            volver.push(temp.pop());
            
        }
        return volver;
    }
    private double promedioEstudiante(Estudiante e){
        double promedio = 0.0;
        
        promedio = e.getPrevio1() + e.getPrevio2() + e.getPrevio3() + e.getExamen();
        promedio = promedio /4;
        
        return promedio;
    }
    
    private boolean estudiaProgramacion(String materiaEstudiante){
        return materiaEstudiante.equals("programacion") || materiaEstudiante.equals("programacioniii");
    }
    
    private boolean estudiaCalculo(String materiaEstudiante){
        return materiaEstudiante.equals("calculo") || materiaEstudiante.equals("programacioniii");
    }
    
    private boolean estudiaIngles(String materiaEstudiante){
        return materiaEstudiante.equals("ingles") || materiaEstudiante.equals("inglesi");
    }
}
