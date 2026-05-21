function loadStudents() {
    fetch("http://localhost:8080/students/all")
        .then(response => response.json())
        .then(data => {
            let output = "";
            data.forEach(student => {
                output +=
                    "<p>"
                    + student.name
                    + " | "
                    + student.email
                    + " | "
                    + student.skills
                    + "</p>";
            });
            document.getElementById("studentData")
                .innerHTML = output;
        });
}
function registerStudent() {
    let studentName = document.getElementById("name").value;
    let studentEmail = document.getElementById("email").value;
    let studentSkills = document.getElementById("skills").value;
    if(studentName === "" || studentEmail === "" || studentSkills === "") {
        alert("Please Fill All Fields");
        return;
    }
    fetch("http://localhost:8080/students/register", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            name: studentName,
            email: studentEmail,
            skills: studentSkills
        })
    })
        .then(response => response.json())
        .then(data => {
            alert("Student Registered Successfully");
            console.log(data);
            loadStudents();
            document.getElementById("name").value = "";
            document.getElementById("email").value = "";
            document.getElementById("skills").value = "";
        });
}
loadStudents();