age = gets.chomp.to_i
if age <= 10
print "Your age is #{age} so you are a child"
elsif age <= 20
print"Your age is #{age} so you are a teenage"
else 
print"You age is #{age} so you are a adult"
end