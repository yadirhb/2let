function validateEmail(el) {
    const email = el ? el.value : '';
    $.getJSON(`./api/v1/users/user/email/${email}`, null, (data) => {
        alert('Success');
    });
}


function validateUsername(el) {
    const username = el ? el.value : '';
    $.getJSON(`./api/v1/users/user/username/${username}`, null, (data) => {
        alert('Success');
    });
}