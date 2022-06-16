# def factorial(n)
#     if n == 1
#         n
#     else
#         n*factorial(n-1)
#     end
# end

# puts factorial(4)


# This is a simple Recursive Program if the function which calls the function again and automatically then it is knwon as recursion


## small recursive function


def add(num,num1)
    puts num+num1
    if num == 5
        p num + num1
    elsif num == 2
       add(5,6)
    end
end

add(2,3)