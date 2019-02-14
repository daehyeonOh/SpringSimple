package com.devdh.simple.ex.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

import com.devdh.simple.service.ExService;

@RestController
public class ExController {

	private static final Logger logger = LoggerFactory.getLogger(ExController.class);
	
	@Inject
	ExService exService;
	
}
