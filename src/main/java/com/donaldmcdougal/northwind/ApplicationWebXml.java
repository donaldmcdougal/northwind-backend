package com.donaldmcdougal.northwind;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import com.donaldmcdougal.northwind.config.DefaultProfileUtil;

/**
 * @author Donald McDougal
 *
 */
public class ApplicationWebXml extends SpringBootServletInitializer {

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        /**
         * set a default to use when no profile is configured.
         */
        DefaultProfileUtil.addDefaultProfile(application.application());
        return application.sources(Application.class);
    }
}
