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

		// IMPORTANT: the default values are just to simplify the implementation.

            	MyAPDU m_apdu= new MyAPDU();
	    	// set the default value for the PUK
            	m_apdu.setPUK();

	    	// change the card state to setup
            	m_apdu.executeRun();

		// set a default PIN
            	m_apdu.setPin((byte)1, (byte)2, (byte)3, (byte)4);

        } catch (Exception ex) {
            System.out.println("Exception : " + ex);
        }
    }

    
}
