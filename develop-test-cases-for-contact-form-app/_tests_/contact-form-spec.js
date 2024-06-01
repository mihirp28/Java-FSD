/*
User Story : Contact Submission
Scenario 1 : All Details correctly provided
Given: contact
When: contact is submitted
Then: return true
And: persistSubmittedContact() is called

Scenario 2 : Invalid Details provided
Given: contact
When: contact is submitted
Then: return false
And: displayValidationSummary() is called
And: displayIndividualErrorMessages() is called
*/

const chai = require('chai');
const expect = chai.expect;
const contactService = require("../src/js/contact_service");
const contactScript = require("../src/js/script");
const jest= require('jest-mock');
var sinon = require("sinon");
var sinonChai = require("sinon-chai");
chai.use(sinonChai);

describe("Contact Form", function () {
    let open, send, setRequestHeader, onload, onerror;
    it("all details are correctly provided", function () {
        let contact = {
            firstName: "mary",
            lastName: "mathews",
            email: "mary.mathews@gmail.com",
            homeNo: "+1 999 777 6666",
            workNo: "+1 654 456 4564",
            notes: "hello"

        }
        
        expect(contactScript.submitContact(contact)).equal(true);
    });

    it("invalid details provided", function () {
        let contact = {
            firstName: "mary",
            lastName: "mathews",
            email: "mary.mathews",
            homeNo: "+mary",
            workNo: "+1 654 456 4564",
            notes: "hello"

        }
        
        expect(contactScript.submitContact(contact)).equal(false);
    });

});    