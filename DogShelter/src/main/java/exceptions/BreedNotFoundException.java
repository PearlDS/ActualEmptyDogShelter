package exceptions;

public class BreedNotFoundException extends Exception {

    public BreedNotFoundException(String errorMessage){
        super((errorMessage));
    }
}
