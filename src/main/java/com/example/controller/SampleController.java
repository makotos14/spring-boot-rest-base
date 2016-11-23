/**
 *
 */
package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.Sample;

/**
 * @author user
 *
 */
@RestController
@RequestMapping(value="/sample")
public class SampleController {

	@RequestMapping(value="", method=RequestMethod.GET)
	public Sample get(){
		Sample sample = new Sample();
		sample.setName("test");
		return sample;
	}
}
