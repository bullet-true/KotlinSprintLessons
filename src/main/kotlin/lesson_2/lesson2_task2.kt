package org.example.lesson_2

fun main() {
    val numberOfStaff = 50
    val numberOfInterns = 30
    val staffSalary = 30_000
    val internsSalary = 20_000

    val permanentStaffSalary = numberOfStaff * staffSalary
    println("Расходы на выплату зарплаты постоянных сотрудников: $permanentStaffSalary")

    val totalSalaryWithInterns = permanentStaffSalary + numberOfInterns * internsSalary
    println("Общие расходы по ЗП после прихода стажеров: $totalSalaryWithInterns")

    val averageSalaryWithInterns = totalSalaryWithInterns / (numberOfStaff + numberOfInterns)
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageSalaryWithInterns")
}