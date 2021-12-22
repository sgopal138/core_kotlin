package oops

class Employee(var salary: Double) {
    var company: String = "TechM"
    var empName = "";

    var vv: Boolean = false

    fun displaySal(){
        print("Employee salary is $salary")
    }

    fun setConnected(connected: Boolean) {
        this.vv = connected
    }
}