package simpleapdu;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.smartcardio.ResponseAPDU;

/**
 *
 * @author xsvenda
 */
public class SimpleAPDU {
//private static MyAPDU m_apdu;
    public static void main(String[] args) {
        try {
            MyAPDU m_apdu= new MyAPDU();

            m_apdu.setPUK();
            m_apdu.executeRun();
            m_apdu.setPin((byte)1, (byte)2, (byte)3, (byte)4);

        } catch (Exception ex) {
            System.out.println("Exception : " + ex);
        }
    }

    
}
