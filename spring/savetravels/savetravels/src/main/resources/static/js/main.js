
$(document).ready(function () {
    $(".clickable-row").on("click", function (e) {
        if ($(e.target).is("button")) { // check if click was on the delete button
            return; // do not trigger the row click event
        }
        window.location = $(this).data("href");
    });

    $("table").on("click", ".delete-button", function (event) {
        event.preventDefault(); // prevent the default action of the button
        showConfirmationDialog($(this).closest("form"));
    });

    function showConfirmationDialog(form) {
        if (confirm("Are you sure you want to delete this expense?")) {
            form.submit();
        }
    }
});
