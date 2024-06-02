/*

The checkPassword() function should accept password as input and check if it is valid.

The validation criteria for password are:
- should have minimum 6 characters and maximum 20 characters
- should have at least one lower-case and one upper-case alphabet
- should have at least one digit
- should have at least one symbol

The function should return true if validation criteria is satisfied else should return false.

Use Regular Expression to perform validation check.

*/

module.exports = function checkPassword(password) {
  let valid = true;
  if (password.length < 6 || password.length > 20) {
      return false;
  }

  if (password.search(/[A-Z]/) == -1) {
      return false;
  }

  if (password.search(/[a-z]/) == -1) {
      return false;
  }
  if (password.search(/[0-9]/) == -1) {
      return false;
  }
  if (password.search(/[@#&*%!$]/) == -1) {
      return false;
  }

  return true;


  // Provide Solution Code Here

}