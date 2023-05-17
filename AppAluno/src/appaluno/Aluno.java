
package appaluno;


public class Aluno {
    String matricula, nome;
    double cr;
    
    public void setNome(String nome){
        if(!nome.isEmpty()){
            this.nome = nome;
        }
    }    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public void setCr(double cr){
        this.cr = cr;
    }
    
    public String getNome(){
        return nome;
    }
    public String getMatricula(){
        return matricula;
    }
    public double getCr(){
        return cr;
    }
      
    public void imprimir(){
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Nome: " + getNome());
        System.out.println("CR: " + getCr());
    }
}
