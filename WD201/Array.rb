student_names = ["Suguram", "Sugu", "Ram", "Sk"]

# Getting the length of the array
puts "Length of the array is #{student_names.length}" 

# Getting the value using the index number
puts "Getting the value using the index #{student_names[2]}"

# Getting the value which is in the last
puts "Getting the value which is in the last #{student_names[student_names.length-1]}"

# Getting each values in the loop
student_names.each {|x| puts "Name of the students is #{x}" }

# Adding a value in the array
student_names.push("Suguram Krishna")

# map in ruby returns a new array with the results of running block once for every element
nums = [10, 4, 2, 26]
new_nums = nums.map {|number| number * 10 }
new_nums.each {|n| puts n }


