Class: <subcribe>
**[subscribe] _ [invalidASIN] _ [throwsIllegalArgumentException]**
* **Description**: [short description of the test case]
* GIVEN
* string customerId
* string asin invalid
* int frequency
    * [bulleted list of relevant pre-conditions for the test to run (usually data you're setting up to test)]
* WHEN
* user attempts to subscribe to a item with a incorrect ASIN
    1. [ordered list of methods you will call with a description of relevant arguments]
    2. [most of your test cases will have a single WHEN item, but if you want more than one keep this line]
* THEN
* throws IllegalArgumentException that ASIN is incorrect
    * [bulleted list of verifications that you will perform to see if the test case passes]