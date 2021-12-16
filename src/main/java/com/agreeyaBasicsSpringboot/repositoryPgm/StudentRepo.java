package com.agreeyaBasicsSpringboot.repositoryPgm;

import com.agreeyaBasicsSpringboot.ModelPackage.StudentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<StudentInfo,Integer>
{
}
