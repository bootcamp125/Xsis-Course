package com.xsis.training125.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.xsis.training125.dao.SesiKelasDao;
import com.xsis.training125.model.Employee;
import com.xsis.training125.model.SesiKelas;
import com.xsis.training125.service.SesiKelasService;

@Controller
@RequestMapping("/sesi") //membuat link /sesikelas
public class SesiKelasController {
	
	@Autowired
	SesiKelasService sesiKelasService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String index(Model model){
		
		List<SesiKelas> sesiKelas = sesiKelasService.getAllSesiKelas();
		model.addAttribute("sesiKelas", sesiKelas);
		
		return "sesiKelas";
	}
	
	@RequestMapping(value="/simpan", method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void simpanSesiKelas(@RequestBody SesiKelas sesiKelas){
		sesiKelasService.save(sesiKelas);
	}
	
	@RequestMapping(value="/seuid/{id}")
	@ResponseBody
	public SesiKelas getSesiKelasById(@PathVariable int id){
		 SesiKelas result = sesiKelasService.getSesiKelasById(id);
		 return result;
	}
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void updateSesiKelas(@RequestBody SesiKelas sesiKelas){
		sesiKelasService.update(sesiKelas);
	}
}
