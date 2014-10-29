package com.itman.base;

import com.itman.font.base.FontRoute;
import com.itman.font.controller.FontController;
import com.jfinal.config.*;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.render.ViewType;

public class BaseConfig extends JFinalConfig {
	public void configConstant(Constants me) {
		me.setDevMode(true);
		me.setViewType(ViewType.JSP);
	}
	/**
	 * 配置路由
	 * @param me
	 */
	public void configRoute(Routes me) {
		//添加分路由，FontRoute
		me.add(new FontRoute());
	}
	/**
	 * 配置插件
	 * @author vision
	 * @param me
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