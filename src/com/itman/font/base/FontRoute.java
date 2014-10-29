package com.itman.font.base;

import com.itman.base.BaseConfig;
import com.itman.font.controller.FontController;
import com.jfinal.config.Routes;

public class FontRoute extends Routes{

	@Override
	public void config() {
		add("/font", FontController.class);
	}
}
