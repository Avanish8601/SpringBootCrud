package wtt.com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import wtt.com.bean.Student;
import wtt.com.dao.StudentDao;

@Service
public class StudentService 
{
	@Autowired
	private StudentDao studentDao;
	
	public String addRecord(Student student) {
		studentDao.save(student);
		return "insert data";
	}
	
	public Student updateById(Student student) {
		return studentDao.save(student);
		
	}
	
	public List<Student> getAll() {
		return studentDao.findAll();
		
	}
	
	public Optional<Student> getById(@RequestParam int id){
		return studentDao.findById(id);
	}

	
	public String deletedById(@RequestParam int id) {
		studentDao.deleteById(id);
		return "deleted data";
	}
}
