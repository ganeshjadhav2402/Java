# Methods/Functions

A function is a block of code that performs a specific task.

Why are functions used?

# a. 
If some functionality is performed at multiple places in software, then

rather than writing the same code, again and again, we create a function

and call it everywhere. This helps reduce code redundancy.

# b. 
Functions make maintenance of code easy as we have to change at one

place if we make future changes to the functionality.

# c. 
Functions make the code more readable and easy to understand.

The syntax for function declaration is :

return-type function_name (parameter 1, parameter2, …… parameter n){

//function_body

}

return-type

The return type of a function is the data type of the variable that that function

returns.

For eg - If we write a function that adds 2 integers and returns their sum then

the return type of this function will be ‘int’ as we will return a sum that is an

integer value.

When a function does not return any value, in that case the return type of the

function is ‘void’.

# function_name

It is the unique name of that function.

It is always recommended to declare a function before it is used.

# Parameters

A function can take some parameters as inputs. These parameters are specified

along with their data types.

For eg- if we are writing a function to add 2 integers, the parameters would be

passed like –

int add (int num1, int num2)
