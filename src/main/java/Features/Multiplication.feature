Feature: Multiplication
 I multiply two numbers

 Scenario: multiply a and b hardcoded
 Given I have variable a
 And I have variable b
 When I multiplication a and b
 Then Display the results

 Scenario: multiply multiple values
 When Enter Numbers for Multiplication
 | a | b |
 | 20 | 53 |
 | 30 | 54 |

 Scenario: Enter Numbers for Multiplication using DataTable
 When Enter Numbers for Multiplication using DataTable
 | 20 | 53 |
 | 30 | 54 |

 Scenario Outline: multiply multiple values using Scenario outline
 When Multiplication of <Value1> and <Value2>

 Examples: 
 | Value1 | Value2 |
 | 20 | 53 |
 | 30 | 54 |