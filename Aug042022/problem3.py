# Create a function that will recursively count the number of digits of a number. 
# Conversion of the number to a string is not allowed, thus, the approach is recursive.

digits = 0

def digits_count(number):
    global digits
    #If number is less than 10, return 1.
    if number < 10:
        return 1
    else:
        #recursively call function and divide by 10 each time to take away 1 digit and add 1 to counter
        return digits_count(number//10) + 1


#Testing results of function
print("digits_count(4666): " + str(digits_count(4666)))
digits = 0
print("digits_count(544): " + str(digits_count(544)))
digits = 0
print("digits_count(121317): " + str(digits_count(121317)))
digits = 0
print("digits_count(0): " + str(digits_count(0)))
digits = 0
print("digits_count(12345): " + str(digits_count(12345)))
digits = 0
print("digits_count(1289396387328): " + str(digits_count(1289396387328)))