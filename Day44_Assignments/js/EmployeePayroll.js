class EmployeePayrollData {
   
   //getter and setter method
   
   // id
   get id() { return this._id;}
   set id(id) { 
      this._id = id;
   }

   //name
   get name() { return this._name; }
   set name(name) {
      let nameRegex = RegExp('^[A-Z]{1}[a-zA-Z\\s]{2,}$');
      if (nameRegex.test(name))
         this._name = name;
      else throw 'Name is Incorrect!';
   }

   // Profile pic
   get profilePic() { return this._profilePic; }
   set profilePic(profilePic) {
      this._profilePic = profilePic;
   }

   // gender
   get gender() { return this._gender; }
   set gender(gender) {
      this._gender = gender;
   }

   // department
   get department() { return this._department; }
   set department(department) {
      this._department = department;
   }

   //salary
   get salary() { return this._salary; }
   set salary(salary) {
      this._salary = salary;
   }

   get note() { return this._note; }
   set note(note) {
      this._note = note;
   }

   get startDate() { return this._startDate; }
   set startDate(startDate) {
      // let now = new Date();
      // if (startDate > now) throw 'Start Date is a Future Date!';
      // var diff = Math.abs(now.getTime() - startDate.getTime());
      // if (diff / (1000 * 60 * 60 * 24) > 30)
      //    throw 'Start Date is beyond 30 Days!';
      this._startDate = startDate;
   }

   // method
   toString() {
      const options = { year: 'numeric', month: 'short', day: 'numeric' };
      const empDate = !this.startDate ? "undefined" :
         this.startDate.toLocaleDateString("en-US", options);
      return "id=" + this.id + ", name='" + this.name + ", gender='" + this.gender +
         ", profilePic='" + this.profilePic + ", department=" + this.department +
         ", salary=" + this.salary + ", startDate=" + empDate + ", note=" + this.note;
   }
}