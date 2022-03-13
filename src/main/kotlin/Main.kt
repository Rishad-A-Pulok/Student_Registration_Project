import models.Course
import models.Department
import models.Student
import java.util.Scanner

fun main() {
    val studentList = mutableListOf<Student>()
    var repeat = true
    println("STUDENT REGISTRATION FORM")
    println("=======================")
    while (repeat){
        var scanner = Scanner(System.`in`)
        print("Enter Student Name: ")
        var name = scanner.nextLine()
        print("Enter Student ID: ")
        var id = scanner.nextLine()
        println("Select Department: ")
        println("------------------")
        print("1. CSE \t2. BBA \t3. EEE ")
        println()
        var choice = scanner.nextInt()
        var deptName: String = ""
        when(choice){
            1 -> {
                deptName = "CSE"

            }
            2 -> {
                deptName = "CSE"

            }
            3 -> {
                deptName = "CSE"

            }
        }
        var courseList = deptCourseMap[deptName]!! //non null assertion
        val student = Student(name = name,
            id = id,
            department = Department(
                deptName = deptName,
                deptHead = "Isaac Newton"),
            courseList = courseList
        )
        studentList.add(student)
        print("Add another student info? Press Y to continue or Press N to exit: ")
        val choice2 = scanner.next()
        repeat = choice2.lowercase() == "y"
    }
    studentList.forEach {
        println(it)
    }

}