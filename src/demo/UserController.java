package demo;

import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

public class UserController extends Controller {
	@ActionKey("/login")
	public void login() {
		setAttr("name", "ceshi");
		render("/user/addUser.jsp");
	}
}
