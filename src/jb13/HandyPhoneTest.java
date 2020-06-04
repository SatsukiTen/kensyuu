package jb13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HandyPhoneTest extends HandyPhone {

	@Test
	@DisplayName("mailメソッドの戻り値の確認")
	void test() {
		HandyPhone handyPhone = new HandyPhone();
		handyPhone.mailAddress = "ta@doco";
		Assertions.assertEquals("ta@docoから中田へメールしました。", handyPhone.mail("中田"));
	}

	@Test
	@DisplayName("Phoneクラスが継承できているかの確認")
	void test1() {
		HandyPhone handyPhone = new HandyPhone();
		handyPhone.no = "河村";
		Assertions.assertEquals("河村から中田へ電話しました。", handyPhone.tel("中田"));
	}

}
