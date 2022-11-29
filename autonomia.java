package unifatecie;
import java.util.Scanner;
public class Viagem {
    
    public static void main(String[] args){
    
    Scanner imput = new Scanner(System.in);
    double CT, D;
    double VD = 6.5, VTD; 
    double VG = 7.1, VTG;
    double VE = 6.8, VTE;
    double CD, CG, CE;
    double AutDiesel, AutGasolina, AutEtanol;
    double MV;
    String cidadeDEorigem, cidadeDEdestino;
    String veiculo;
            
        System.out.println("Digite a sua cidade de origem: ");
        cidadeDEorigem = imput.next();
    
        System.out.println("Digite a sua cidade de destino: ");
        cidadeDEdestino = imput.next();
        
        System.out.println("Digite a distancia em KM entre a cidade de origem e a cidade de destino: ");
        D = imput.nextDouble();
        
        System.out.println("Digite o nome do seu veiculo: ");
        veiculo = imput.next();
                
        System.out.println("Digite a capacidade do tanque do seu carro em litros: ");
        CT = imput.nextDouble();
        VTD = VD * D;
        VTG = VG * D;
        VTE = VE * D;
        
        System.out.println("Digite o consumo do veiculo" + " " + veiculo + " " + "por litro abastecido com: "); 
        System.out.println("Diesel:");
        CD = imput.nextDouble(); 

        System.out.println("Gasolina");
        CG = imput.nextDouble(); 

        System.out.println("Etanol");
        CE = imput.nextDouble(); 
        
        AutDiesel = CT * CD;
        System.out.println("A autonomia do seu carro em diesel por litro eh de: "+ AutDiesel);
        
        AutGasolina = CT * CG;
        System.out.println("A autonomia do seu carro em gasolina por litro eh de: "+ AutGasolina);
        
        AutEtanol = CT * CE;
        System.out.println("A autonomia do seu carro em etanol por litro eh de: "+ AutEtanol);
        
        System.out.println("\nO valor total gasto em diesel de"+ " " + cidadeDEorigem + " " + "ate" + " " + cidadeDEdestino + " " + "sera de: " + VTD + " " + "reais");
        System.out.println("\nO valor total gasto em gasolina de"+ " " + cidadeDEorigem + " " + "ate" + " " + cidadeDEdestino + " " + "sera de: " + VTG + " " + "reais");
        System.out.println("\nO valor total gasto em etanol de"+ " " + cidadeDEorigem + " " + "ate" + " " + cidadeDEdestino + " " + "sera de: " + VTE + " " + "reais");
    
        if(VTD < VTG){
            if(VTD < VTE){
                System.out.println("\nO diesel eh o menor valor");
            
                
                
                     }
                 }else if(VTG < VTD){
            System.out.println("\nA gasolina eh o menor valor");
            }else{System.out.println("\nO etanol eh o menor valor");
        }
    }
}
