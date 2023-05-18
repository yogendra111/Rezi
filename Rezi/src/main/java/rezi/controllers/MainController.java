package rezi.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import rezi.daos.StudentServiceImpl;
import rezi.entities.Student;

@Controller
public class MainController {

	@Autowired
	private StudentServiceImpl ss;

	@RequestMapping("/home")
	public ModelAndView start() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		mv.addObject("students", ss.getStudents());
		return mv;
	}

	@RequestMapping("/register")
	public ModelAndView registration() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Registration");
		return mv;
	}

	@RequestMapping(value = "/save-student", method = RequestMethod.POST)
	public RedirectView saveData(@ModelAttribute Student stud, HttpServletRequest request) {
//		System.out.println(stud);
		ss.addStudent(stud);
		RedirectView rv = new RedirectView();
		rv.setUrl(request.getContextPath() + "/home");
		return rv;
	}

	@RequestMapping(value = "/delete-student/{stuId}")
	public RedirectView deleteData(@PathVariable("stuId") int stuId, HttpServletRequest request) {
		ss.deleteStudent(stuId);
		return new RedirectView(request.getContextPath() + "/home");
	}

	@RequestMapping("/update/{stuID}")
	public ModelAndView update(@PathVariable("stuID") int stuId) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Update");
		mv.addObject("student", ss.getStudent(stuId));
		return mv;
	}

	@RequestMapping("/update-student/{stuID}")
	public RedirectView updateData(@ModelAttribute Student stu, @PathVariable("stuID") int stuId,
			HttpServletRequest request) {
		stu.setStuID(stuId);
		ss.updateStudent(stu);
		return new RedirectView(request.getContextPath() + "/home");
	}

}
