todos = [
    ["Send invoice", "money"],
    ["Clean room", "organize"],
    ["Pay rent", "money"],
    ["Arrange books", "organize"],
    ["Pay taxes", "money"],
    ["Buy groceries", "food"],
  ]

  # Creating an empty array

  array1 = Array.new(0)
  array2 = Array.new(0)
  array3 = Array.new(0)
  category = [["money",array1],["organize",array2],["food",array3]]
#   print category  -> Just printing the category array
  for i in 0...todos.length
    # p todos[i]
    for j in 0...todos[i].length
      if todos[i][j + 1] == "money"
        array1.push(todos[i][j])
      end
      if todos[i][j + 1] == "organize"
        array2.push(todos[i][j])
      end
      if todos[i][j + 1] == "food"
        array3.push(todos[i][j])
      end
    end
  end
p category

for k in 0...category.length
    for l in 0...category[k].length
       p category[k][l]
    end
  end  
  
  
  
  
  
  
  
  

  
  
  
  

