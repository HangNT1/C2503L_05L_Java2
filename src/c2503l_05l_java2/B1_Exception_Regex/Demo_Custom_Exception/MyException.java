/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_java2.B1_Exception_Regex.Demo_Custom_Exception;

/**
 *
 * @author hangnt
 */
public class MyException extends Exception{
    // 404 -> Not found 
    // HTTPStatus Code => Message 
    private String code; // C01
    // message => Exception da co san 

    public MyException(String code, String message) {
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
