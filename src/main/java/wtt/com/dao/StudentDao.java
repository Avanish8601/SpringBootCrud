package wtt.com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import wtt.com.bean.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> 
{
	

}
