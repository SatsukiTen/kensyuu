package jb13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PhoneTest extends Phone {

	@Test
	void test() {
		Phone phone = new Phone();
		phone.no = "河村";
		Assertions.assertEquals("河村から中田へ電話しました。", phone.tel("中田"));
	}

}
