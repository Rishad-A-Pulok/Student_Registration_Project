package models

class Student(
    val name: String = "",
    val id: String = "",
    val department: Department,
    val courseList: List<Course>
) {
    override fun toString(): String {
        return "Student(name='$name', id='$id', department=$department, courseList=$courseList)"
    }
}

class Department(val deptName: String = "", val deptHead: String = ""){
    override fun toString(): String {
        return "Department(deptName='$deptName', deptHead='$deptHead')"
    }
}

class Course(val courseName: String = "", val courseCredit: Double = 0.0){
    override fun toString(): String {
        return "Course(courseName='$courseName', courseCredit=$courseCredit)"
    }
}