package com.hockey.config.core;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.hockey.config.WebMvcConfig;

public class SpringMvcInitializer extends
 AbstractAnnotationConfigDispatcherServletInitializer {

 @Override
 protected Class<?>[] getRootConfigClasses() {
 
 return new Class[] { WebMvcConfig.class };
 }

 @Override
 protected Class<?>[] getServletConfigClasses() {
 
 return null;
 }

 @Override
 protected String[] getServletMappings() {
 
 return new String[] { "/" };
 }

}