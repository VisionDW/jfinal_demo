package demo;

import com.jfinal.config.*;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.render.ViewType;

public class DemoConfig extends JFinalConfig {
	public void configConstant(Constants me) {
		me.setDevMode(true);
		me.setViewType(ViewType.JSP);
	}

	public void configRoute(Routes me) {
		me.add("/hello", HelloController.class);
		me.add("/user", UserController.class);
	}
	/**
	 * Jfinal插件
	 */
	public void configPlugin(Plugins me) {
		
	}
	/**
	 * 
	 */
	public void configInterceptor(Interceptors me) {
	}

	public void configHandler(Handlers me) {
	}
}