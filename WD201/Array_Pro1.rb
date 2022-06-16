names = [["Jhumpa", "Lahiri"], ["J. K", "Rowling"], ["Devdutt", "Pattanaik"]]

# print names.flatten!

#flatten is a method which can be used to write the Multi Dimensional array into a single array

name = []
# p names.length
for i in 0...names.length
#   puts i
  j = 0
  # puts names[i][j]
  name.push(names[i][j] + " " + names[i][j + 1])
  # p name
end
p name   


 
