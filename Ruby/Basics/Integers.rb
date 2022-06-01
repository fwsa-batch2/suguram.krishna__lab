puts 45
puts 45+54
puts 58.984
puts " "

a = gets.chomp
puts a

puts "The entered number is #{a}"

b = -45
puts b.abs()

c = 54.544
puts c.round()

d = 58.45
puts d.ceil()

e = 58.01
puts e.floor()


# Math is a class which has many methods inside it to do the mathematical things like Square root, log and etc.,
f = 48
puts Math.sqrt(f)

puts Math.log(2) # This is used to get the log


# In Ruby if we add two integers it will return as integer and if we add one integer and one float it will return as float 

puts "Adding two integers #{5+5}"

puts "Adding one integer and one integer #{5+10.5}"

