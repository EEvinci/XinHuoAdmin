package com.ruoyi.project.system.student.mapper;

import java.util.List;
import com.ruoyi.project.system.student.domain.Student;

/**
 * 学生管理Mapper接口
 * 
 * @author ruoyi
 * @date 2022-11-16
 */
public interface StudentMapper 
{
    /**
     * 查询学生管理
     * 
     * @param number 学生管理主键
     * @return 学生管理
     */
    public Student selectStudentByNumber(String number);

    /**
     * 查询学生管理列表
     * 
     * @param student 学生管理
     * @return 学生管理集合
     */
    public List<Student> selectStudentList(Student student);

    /**
     * 新增学生管理
     * 
     * @param student 学生管理
     * @return 结果
     */
    public int insertStudent(Student student);

    /**
     * 修改学生管理
     * 
     * @param student 学生管理
     * @return 结果
     */
    public int updateStudent(Student student);

    /**
     * 删除学生管理
     * 
     * @param number 学生管理主键
     * @return 结果
     */
    public int deleteStudentByNumber(String number);

    /**
     * 批量删除学生管理
     * 
     * @param numbers 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteStudentByNumbers(String[] numbers);
}
