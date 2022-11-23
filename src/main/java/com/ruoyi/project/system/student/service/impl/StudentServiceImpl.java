package com.ruoyi.project.system.student.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.student.mapper.StudentMapper;
import com.ruoyi.project.system.student.domain.Student;
import com.ruoyi.project.system.student.service.IStudentService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 学生管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-11-16
 */
@Service
public class StudentServiceImpl implements IStudentService 
{
    @Autowired
    private StudentMapper studentMapper;

    /**
     * 查询学生管理
     * 
     * @param number 学生管理主键
     * @return 学生管理
     */
    @Override
    public Student selectStudentByNumber(String number)
    {
        return studentMapper.selectStudentByNumber(number);
    }

    /**
     * 查询学生管理列表
     * 
     * @param student 学生管理
     * @return 学生管理
     */
    @Override
    public List<Student> selectStudentList(Student student)
    {
        return studentMapper.selectStudentList(student);
    }

    /**
     * 新增学生管理
     * 
     * @param student 学生管理
     * @return 结果
     */
    @Override
    public int insertStudent(Student student)
    {
        return studentMapper.insertStudent(student);
    }

    /**
     * 修改学生管理
     * 
     * @param student 学生管理
     * @return 结果
     */
    @Override
    public int updateStudent(Student student)
    {
        return studentMapper.updateStudent(student);
    }

    /**
     * 批量删除学生管理
     * 
     * @param numbers 需要删除的学生管理主键
     * @return 结果
     */
    @Override
    public int deleteStudentByNumbers(String numbers)
    {
        return studentMapper.deleteStudentByNumbers(Convert.toStrArray(numbers));
    }

    /**
     * 删除学生管理信息
     * 
     * @param number 学生管理主键
     * @return 结果
     */
    @Override
    public int deleteStudentByNumber(String number)
    {
        return studentMapper.deleteStudentByNumber(number);
    }
}
