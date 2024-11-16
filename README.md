Use Case: Hospital Management System
Imagine you are developing a basic hospital management system that includes different types of medical staff, patient management, and administrative roles. Here’s how you can use the various OOP concepts to build it.

Requirements:
1. Staff members (doctors, nurses, administrative staff) should each have specific roles and functionalities.

2. All Staff should have shared properties like ID, name, and contact details, but also unique properties depending on their role.

3. Patients should have properties like ID, name, and ailment.

4. The system should allow:
a) Adding and retrieving staff details.
b) Accessing patient information in a way that restricts unnecessary modification (encapsulation).
c) Unique behavior for different types of staff (polymorphism).

5. Different types of appointments and responsibilities should be handled differently by each type of staff.


Step 1: Define Interfaces
Staff Interface: Define an interface Staff with methods like checkIn() and performDuty(). Every type of staff will implement this interface, ensuring they all share these basic methods.
AdministrativeTasks Interface (optional): Define another interface for administrative tasks, with methods like manageSchedule() or generateReport(). Only classes that need these specific tasks would implement this interface, adding flexibility.

Step 2: Create an Abstract Class
Person Abstract Class: Create an abstract class Person to represent common attributes shared by both Staff and Patient, like ID, name, age, and contactInfo.
This class can have basic methods for getting and setting these attributes (encapsulation) and possibly some abstract methods if every subclass needs to implement specific behaviors.

Step 3: Create Concrete Classes (Inheritance and Polymorphism)
Doctor Class: Inherit from Person and implement the Staff interface. Doctors can have additional fields, like specialization and licenseNumber. Define methods like checkIn() and performDuty() where performDuty() might represent checking patients or diagnosing.
Nurse Class: Similar to Doctor, but with a different performDuty() implementation. For example, a nurse may be responsible for assisting doctors or caring for patients.
AdministrativeStaff Class: Inherit from Person and implement both Staff and AdministrativeTasks. This class will handle tasks like manageSchedule() and generateReport().
Each performDuty() method will have unique behavior depending on the type of staff, demonstrating polymorphism.

Step 4: Define Patient Class (Encapsulation)
Patient Class: This class should have fields like ID, name, ailment, and assignedDoctor. Use encapsulation to ensure that certain information, such as ailment and assignedDoctor, can only be accessed and modified through specific methods, rather than directly. For example, only doctors and nurses might be allowed to view or modify a patient’s ailment.

Step 5: Putting It All Together
Create a HospitalManagementSystem class to manage staff and patients. This class can have methods to add new staff or patients, assign doctors to patients, and retrieve information. You can make use of polymorphism here: by calling performDuty() on a Staff object, the correct version will run depending on whether the staff member is a Doctor, Nurse, or AdministrativeStaff.
