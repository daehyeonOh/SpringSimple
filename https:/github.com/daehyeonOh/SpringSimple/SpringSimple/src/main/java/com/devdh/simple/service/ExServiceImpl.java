package com.devdh.simple.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.devdh.simple.ex.persistence.ExDAO;

@Service
public class ExServiceImpl implements ExService {

	@Inject
	ExDAO exDao;
	
}
