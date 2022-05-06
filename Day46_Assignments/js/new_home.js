let empPayrollList;
window.addEventListener('DOMContentLoaded', (event) => {
    empPayrollList = getEmployeePayrollDataFromStorage();
    document.querySelector(".emp-count").textContent = empPayrollList.length;
    createInnerHtml();
    localStorage.removeItem('editEmp');
});

const getEmployeePayrollDataFromStorage = () => {
    return localStorage.getItem('EmployeePayrollList') ?
        JSON.parse(localStorage.getItem('EmployeePayrollList')) : [];
}

//Template literal ES6 feature

const createInnerHtml = () => {
    const headerHtml = "<th>Profile</th><th>Name</th><th>Gender</th><th>Department</th><th>Salary</th><th>Start Date</th><th>Actions</th>";
    if (empPayrollList.length == 0) return;
    const innerHtml = `${headerHtml}`;
    for (const empPayrollData of empPayrollList) {
        innerHtml = `${innerHtml}
    <tr>
        <td><img class="profile" src="${empPayrollData._profilePic}"></td>
        <td>${empPayrollData._name}</td>
        <td>${empPayrollData._gender}</td>
        <td>${getDeptHtml(empPayrollData._department)}</td>
        <td>${empPayrollData._salary}</td>
        <td>${empPayrollData._startDate}</td>
        <td>
            <img name="${empPayrollData._id}" onclick="remove()" alt="delete" src="../assets/icons/delete-black-18dp.svg" alt="delete">
            <img name="${empPayrollData._id}" alt="edit" onclick="update()" src="../assets/icons/create-black-18dp.svg" alt="edit">
        </td>
    </tr>
    `;
    }
    document.querySelector('#display').innerHTML = innerHtml;
}
//UC5 Display Employee Details from JSON Object
const createEmployeePayrollJSON = () => {
    let empPayrollListLocal = [{
        
        _name: "Mark",
        _gender: "male",
        _department: [
            "Finance"
        ],
        _salary: "500000",
        _startDate: "29 Jan 2021",
        _note: "All In One",
        _profilePic: "../assets/profile-images/Ellipse -3.png"
    },
    {
        
        _name: "warren",
        _gender: "male",
        _department: [
            "Engineering"
        ],
        _salary: "500000",
        _startDate: "29 Jan 2022",
        _note: "Comp Engineer",
        _profilePic: "../assets/profile-images/Ellipse -1.png"
    }
    ];
    return empPayrollListLocal;
}

const getDeptHtml = (deptList) => {
    let deptHtml = '';
    for (const dept of deptList) {
        deptHtml = `${deptHtml} <div class='dept-label'>${dept}</div>`;
    }
    return deptHtml;
}


// UC1 

const remove = (node) => {
    
    let empPayrollData = empPayrollList.find(empData => empData._id == node.id);
   
    if(!empPayrollData) return;
    const index = empPayrollList.map(empData => empData._id)
                .indexOf(empPayrollData._id);
                // alert(empPayrollData._id+ ", Employee is Deleting.");
                empPayrollList.splice(index,1);
    localStorage.setItem("EmployeePayrollList", JSON.stringify(empPayrollList));
    document.querySelector(".emp-count").textContent = empPayrollList.length;
    createInnerHtml();
}

const update = (node) => {
    let empPayrollData = empPayrollList.find(addData => addData._id == node.id);
    if(!empPayrollData) return;
    localStorage.setItem('editEmp',JSON.stringify(empPayrollData))
    window.location.replace(site_properties.home_page);
}