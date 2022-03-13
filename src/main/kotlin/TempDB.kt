import models.Course

val deptCourseMap = mapOf<String, List<Course>>(
    "CSE" to listOf<Course>(
        Course(courseName = "OOP", courseCredit = 3.0),
        Course(courseName = "Linear Algebra", courseCredit = 2.0),
        Course(courseName = "Data Mining", courseCredit = 3.0),
    ),
    "BBA" to listOf<Course>(
        Course(courseName = "Accounting", courseCredit = 6.0),
        Course(courseName = "Finance", courseCredit = 3.0),
        Course(courseName = "Marketing", courseCredit = 4.0),
    ),
    "EEE" to listOf<Course>(
        Course(courseName = "Energy Conversion", courseCredit = 4.0),
        Course(courseName = "Electronics", courseCredit = 3.0),
        Course(courseName = "Circuit design", courseCredit = 2.0),
    )
)