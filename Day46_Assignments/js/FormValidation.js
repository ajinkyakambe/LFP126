let isUpdate = false;

let employeePayrollObject = {};

window.addEventListener('DOMContentLoaded', () => {
    validName();
    salaryRange();
    checkForUpdate();
});

function validName() {
    const name = document.querySelector("#name");
    const textError = document.querySelector(".text-error");
    name.addEventListener('input', function () {
        try {
            let empData = new EmployeePayrollData();
            empData.name = name.value;
            textError.textContent = "";
        } catch (e) {
            textError.textContent = e;
        }
    });
}

/** set event listener on salary range*/
function salaryRange() {
    const salary = document.querySelector("#salary");
    const output = document.querySelector('.salary-output');
    salary.addEventListener('input', function () {
        output.textContent = salary.value;
    });
} 

/** UC 3 
On form submit populate employee 
payroll data object */

const save = (event) => {
    event.preventDefault();
    event.stopPropagation();
    try{
       setEmployeePayrollObject();
       createAndUpdateStorage();
       resetForm();
       window.location.replace(site_properties.home_page)

    } catch (e) {
        return;
    }
}

const setEmployeePayrollObject = () => {
    employeePayrollObj._name=getInputValueById('#name');
    employeePayrollObj._profilePic = getSelectedValues('[name=profile]').pop();
    employeePayrollObj._gender = getSelectedValues('[name=gender]').pop();
    employeePayrollObj._department = getSelectedValues('[name=department]');
    employeePayrollObj._salary = getInputValueById('#salary');
    employeePayrollObj._note = getInputValueById('#notes');
    let date = getInputValueById('#day') + " " + getInputValueById('#month') + " " + getInputValueById('#year');
    employeePayrollObj._startDate = date;
}







const createEmployeePayroll = () => {
    let employeePayrollData = new EmployeePayrollData();
    try {
        employeePayrollData.name = getInputValueById('#name');
        setTextValue('.text-error', "");
    } catch (e) {
        setTextValue('.text-error', e);
    }

    try {
        let date = getInputValueById('#day') + " " + getInputValueById('#month') + " " + getInputValueById('#year');
        employeePayrollData.startDate = new Date(Date.parse(date));
        setTextValue('.date-error', "");
    } catch (e) {
        setTextValue('.date-error', e);
    }

    employeePayrollData.profilePic = getSelectedValues('[name=profile]').pop();
    employeePayrollData.gender = getSelectedValues('[name=gender]').pop();
    employeePayrollData.department = getSelectedValues('[name=department]');
    employeePayrollData.salary = getInputValueById('#salary');
    employeePayrollData.note = getInputValueById('#notes');
    employeePayrollData.id = new Date().getTime() + 1;
    alert(employeePayrollData.toString());
    return employeePayrollData;
}

const getInputValueById = (id) => {
    let value = document.querySelector(id).value;
    return value;
}

const setTextValue = (id, message) => {
    const textError = document.querySelector(id);
    textError.textContent = message;
}

// const getSelectedValues = (propertyValue) => {
//     let allItems = document.querySelectorAll(propertyValue);
//     let setItems = [];
//     allItems.forEach(item => {
//         if (item.checked == true)
//             setItems.push(item.value);
//     });
//     return setItems;
// }

/** save employee object into local storage */
const createAndUpdateLocalStorage = (empData) => {
    let dataList = JSON.parse(localStorage.getItem("EmployeePayrollList"));
    if (dataList != undefined) {
        dataList.push(empData)
    } else {
        dataList = [empData];
    }
    localStorage.setItem('EmployeePayrollList', JSON.stringify(dataList));
    alert("data stored with name " + empData.name);
}

/** Reset employee payroll form */

const resetForm = () => {
    setTextValue('#name', '');
    unsetSelectedValues('[name=profile]');
    unsetSelectedValues('[name=gender]');
    unsetSelectedValues('[name=department]');
    setValue('#salary', '');
    setValue('#notes', '');
    setSelectedIndex('#day', 0);
    setSelectedIndex('#month', 0);
    setSelectedIndex('#year', 0);
}

const unsetSelectedValues = (propertyValue) => {
    let allItems = document.querySelectorAll(propertyValue);
    allItems.forEach(item => {
        item.checked = false;
    });
}

const setValue = (id, value) => {
    const element = document.querySelector(id);
    element.value = value;
}

/** UC2 
check for Update and set the 
values of the form elements  */

const checkForUpdate = () => {
    const employeePayrollJson= localStorage.getItem('editEmp');
    isUpdate = employeePayrollJson ? true : false;
    if (!isUpdate)
        return;
    employeePayrollJson = JSON.parse(employeePayrollJson);
    setForm();
}

const setForm = () => {
    setValue('#name', employeePayrollObj._name);
    setSelectValue('[name=profile]', employeePayrollObj._profilePic);
    setSelectValue('[name=gender]', employeePayrollObj._gender);
    setSelectValue('[name=department]', employeePayrollObj._department);
    setValue('#salary', employeePayrollObj._salary);
    setTextValue('.salary-output', employeePayrollObj._salary)
    setValue('#notes', employeePayrollObj._note);

    let date = stringify(employeePayrollObj._startDate).split(" ");
    setValue('#day', date[0]);
    setValue('#month', date[1]);
    setValue('#year', date[2]);
}

const setSelectValue = (propertyValue, value) => {
    let allitem = document.querySelectorAll(propertyValue);
    allitem.forEach(item => {
        if (Array.isArray(value)) {
            if (value.includes(item.value)) {
                item.checked = true;
            }
        } else if (item.value == value) {
            item.checked = true;
        }
    });
}
const setSelectedIndex = (id, index) => {
    const element = document.querySelector(id);
    element.selectedIndex = index;
}




const createAndUpdateStorage = () => {
    let empPayrollList = JSON.parse(localStorage.getItem("EmployeePayrollList"));
    if (empPayrollList) {
        let employeePayrollData = empPayrollList.find(empData => empData._id == employeePayrollObj._id);
        if(!employeePayrollData){
            empPayrollList.push(createEmployeePayrollData());
        } else { 
            const index = empPayrollList
                            .map(empData =>empData._id)
                            .indexOf(employeePayrollData._id)
            empPayrollList.splice(index, 1 , createEmployeePayrollData(empPayrollData._id));

        }
    } else {
        employeePayrollList = [createEmployeePayrollData()]
        
    }
    localStorage.setItem("EmployeePayrollList",JSON.stringify(employeePayrollList));
}



const createEmployeePayrollData = (id) => {
    let employeePayrollData = new EmployeePayrollData();
    if(!id) employeePayrollData.id = createNewEmployeeId();
    else employeePayrollData.id = id;
    setEmployeePayrollData(employeePayrollData);
    return employeePayrollData;
 }
 
 const setEmployeePayrollData = (employeePayrollData) => {
    try {
       employeePayrollData.name = employeePayrollObj._name;
    } catch (e) {
       setTextValue('.text-error', e);
       throw e;
    }
 
    employeePayrollData.profilePic = employeePayrollObj._profilePic;
    employeePayrollData.gender = employeePayrollObj._gender;
    employeePayrollData.department = employeePayrollObj._department;
    employeePayrollData.salary = employeePayrollObj._salary;
    employeePayrollData.note = employeePayrollObj._note;
    try {
       employeePayrollData.startDate = 
                   new Date(Date.parse(employeePayrollObj._start_date));
    } catch (e) {
       setTextValue('.date-error', e);
       throw e;
    }
    alert(employeePayrollData.toString());
 }


 const createNewEmployeeId = () => {
    let empID = localStorage.getItem("EmployeeID");
    empID = !empID ? 1 : (parseInt(empID)+1).toString();
    localStorage.setItem("EmployeeID", empID);
    return empID;
 }
 
 const getSelectedValues = (propertyValue) => {
    let allItems = document.querySelectorAll(propertyValue);
    let selItems = [];
    allItems.forEach(item => {
       if(item.checked) selItems.push(item.value);
    });
    return selItems;
 }