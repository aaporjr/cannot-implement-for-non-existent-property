package sample.services

import grails.gorm.services.Service
import sample.Employee

/**
 * Copyrights 2002-2018 Webb Fontaine
 * Developer: Allan Apor Jr.
 * Date: 27/07/2018
 * This software is the proprietary information of Webb Fontaine.
 * Its use is subject to License terms.
 */
@Service(Employee)
abstract class EmployeeService {

	abstract List<Employee> findByName(String name)
}
