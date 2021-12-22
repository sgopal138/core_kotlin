package oops

fun main(args: Array<String>){
    var emp = Employee(100000.0)
    print("Employee name is ${emp.empName} and company is ${emp.company}")
    emp.displaySal()

    emp.setConnected(true)

    if(!emp.vv) print(true) else print(false)

}