$('#registrationForm').submit(function () {
    $.ajax({
        url: $('#registrationForm').attr('action'),
        type: 'POST',
        data: $('#registrationForm').serialize(),
        success: function (response) {
            console.log('form submitted.', response);
            window.location = "/login";
        },
        error: function (response) {
            console.log('form submission failed!!', response);
            $(".error-text").append("<span style='color: red'>User Registration Failed!! Please try again.</span>");
        }
    });
    return false;
});