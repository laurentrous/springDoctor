package com.wildcodeschool.doctor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class DoctorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorApplication.class, args);
	}

	@RequestMapping("/doctor/2")
	@ResponseBody
	public String doctor2() {
		return "Patrick Troughton";
	}

	@RequestMapping("/doctor/4")
	@ResponseBody
	public String doctor4() {
		return "Tom Baker";
	}

	@RequestMapping("/doctor/6")
	@ResponseBody
	public String doctor6() {
		return "Colin Baker";
	}

	@RequestMapping("/doctor/8")
	@ResponseBody
	public String doctor8() {
		return "Paul McGann";
	}

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "<ul><li><a href=\"/doctor/2\">Doc #2</a></li><li><a href=\"/doctor/4\">Doc #4</a></li><li><a href=\"/doctor/6\">Doc #6</a></li><li><a href=\"/doctor/8\">Doc #8</a></li>";
	}


}
