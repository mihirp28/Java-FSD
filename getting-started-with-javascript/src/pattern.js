/*
The drawPattern() function should accept number of rows as input.
The function should return string that contains the pyramid structure for the number of rows inputted.
The pyramid structure should have the following pattern:
        *
       * *
      * * *
     * * * *
    * * * * *
The function should return error message "Invalid Input Type, Row Input Should Be of Type Number !!", 
if non-numeric value is passed to the function.
*/
module.exports = function drawPattern(rows) {
  if (typeof rows != "number") {
      return "Invalid Input Type, Row Input Should Be of Type Number !!";
  }
  var a = '';
  var str = ""

  var m = (rows - 1);
  for (i = 1; i <= rows; i++) {
      a = a.trim();
      a = ' '.repeat(m) + a + (i > 1 ? ' ' : '') + '*';
      str = str + a + " \n";
      m--;
  }
  return str;
}