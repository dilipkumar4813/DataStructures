package iamdilipkumar.com.datastructures.basic;

/**
 * Created on 27/07/17.
 *
 * @author dilipkumar4813
 * @version 1.0
 */

public class CustomException{

    public static void main(String[] args) throws NoDataException {
        String ch = null;

        if(ch==null){
            throw new NoDataException("Error");
        }
    }

    static class NoDataException extends Exception{

        NoDataException(String message){
            super(message);
        }
    }
}
