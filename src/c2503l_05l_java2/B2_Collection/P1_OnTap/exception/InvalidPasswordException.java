
package c2503l_05l_java2.B2_Collection.P1_OnTap.exception;

public class InvalidPasswordException extends Exception{
    private String code;

    public InvalidPasswordException(String code, String message) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

   
    
}
