package jp.hara41;
import jp.nyatla.mimic.mbedjs.*;
import jp.nyatla.mimic.mbedjs.javaapi.*;
public class MainProc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mcu mcu;
		try {
			mcu = new Mcu("10.0.0.2");
			LM75B lm = new LM75B(mcu , PinName.p28 , PinName.p27, 0x90);
			System.out.println(lm.read());
		} catch (MbedJsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
