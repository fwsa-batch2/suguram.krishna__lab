def alphabetize(arr,rev = false)
    arr.sort!
    if rev == true
    return arr.reverse!
    else 
    return arr
    end
 end
 
 numbers = [2,3,4,5,6]
 puts alphabetize(numbers)
 
 
 