let students = JSON.parse(localStorage.getItem("students")) || [];

const form = document.getElementById("studentForm");
const studentList = document.getElementById("studentList");

function displayStudents() {
    studentList.innerHTML = "";

    students.forEach((student, index) => {
        const row = `
            <tr>
                <td>${student.roll}</td>
                <td>${student.name}</td>
                <td>${student.course}</td>
                <td>
                    <button class="delete-btn" onclick="deleteStudent(${index})">
                        Delete
                    </button>
                </td>
            </tr>
        `;
        studentList.innerHTML += row;
    });
}

form.addEventListener("submit", function (e) {
    e.preventDefault();

    const name = document.getElementById("name").value.trim();
    const roll = document.getElementById("roll").value.trim();
    const course = document.getElementById("course").value.trim();

    if (name === "" || roll === "" || course === "") {
        alert("All fields are required!");
        return;
    }

    students.push({ name, roll, course });
    localStorage.setItem("students", JSON.stringify(students));

    form.reset();
    displayStudents();
});

function deleteStudent(index) {
    students.splice(index, 1);
    localStorage.setItem("students", JSON.stringify(students));
    displayStudents();
}

// Load data on page refresh
displayStudents();
