/*

The calculateNetPayable() function should accept 3 inputs:
pricePerKilo, quantityInKilo and discountPercentage.

Calculate the net amount post discount that would be payable.

The function should return the computed value.

The function should return error message "Invalid Input Types, All Inputs Should Be of Type Number !!", 
for any non-numeric value passed to the function.

*/

module.exports = function calculateNetPayable(pricePerKilo, quantityInKilo, discountPercentage) {
  if (typeof pricePerKilo != "number" || typeof quantityInKilo != "number" || typeof discountPercentage != "number") {
      return "Invalid Input Types, All Inputs Should Be of Type Number !!";
  }

  var m = pricePerKilo * quantityInKilo;
  var n = (m * discountPercentage) / 100;
  var l = m - n;
  var str = l.toString();
  return str;


  // Provide Solution Code Here

}