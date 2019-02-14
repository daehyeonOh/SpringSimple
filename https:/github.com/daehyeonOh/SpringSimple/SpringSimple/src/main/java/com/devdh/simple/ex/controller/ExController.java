package com.devdh.simple.ex.controller;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RestController;

import com.devdh.simple.service.ExService;

@RestController
public class ExController {

	@Inject
	ExService exService;
	
}
