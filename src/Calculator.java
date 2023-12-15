import java.util.ArrayList;

public class Calculator {

    public Integer sum(ArrayList<Integer> elementi){
        //controllo se ci sono almeno due elementi in caso contrario return null
        if(elementi.size()<2){
            return null;
        }
        //si parte da zero perchè così non abbiamo bug aggiungendo valori indesiderati
        Integer result = 0;
        for(Integer elemento : elementi){
            result += elemento;
        }
        return result;
    }

    public Integer sub(ArrayList<Integer> elementi){
        //controllo se ci sono almeno due elementi in caso contrario return null
        if(elementi.size()<2){
            return null;
        }
        //prendiamo il primo elemento da sottrarre poi nel for partiamo dal secondo
        Integer result = elementi.getFirst();
        for(int i = 1 ; i < elementi.size() ; i++){
            result -= elementi.get(i);
        }
        return result;
    }

    public Integer molt(ArrayList<Integer> elementi){
        //controllo se ci sono almeno due elementi in caso contrario return null
        if(elementi.size()<2){
            return null;
        }
        //partiamo con 1 in modo che non moltiplichiamo valori indesiderati
        Integer result = 1;
        for(Integer elemento : elementi){
            result *= elemento;
        }
        return result;
    }

    public Double div(ArrayList<Integer> elementi){
        //controllo se ci sono almeno due elementi in caso contrario return null
        if(elementi.size()<2){
            return null;
        }
        //casting da Integer a Double per la divisione in caso di risultato non intero
        //prendiamo il primo elemento da dividere e poi nel for dal secondo dividiamo
        Double result = Double.valueOf(elementi.getFirst());
        for(int i = 1 ; i < elementi.size() ; i++){
            if(elementi.get(i).equals(0)){
                return null;
            }
            result /= elementi.get(i);
        }
        return result;
    }

}

