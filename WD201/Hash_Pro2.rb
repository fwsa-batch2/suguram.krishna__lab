todos = [
    ["Send invoice", "money"],
    ["Clean room", "organize"],
    ["Pay rent", "money"],
    ["Arrange books", "organize"],
    ["Pay taxes", "money"],
    ["Buy groceries", "food"],
  ]

  # Creating an empty array

  array1 = []
  array2 = []
  array3 = []
  category = {}

#   print category  -> Just printing the category array
  for i in 0...todos.length
    # p todos[i]
    for j in 0...todos[i].length
      if todos[i][j + 1] == "money"
        array1.push(todos[i][j])
        category[todos[i][j + 1].to_sym] = array1
      end
      if todos[i][j + 1] == "organize"
        array2.push(todos[i][j])
        category[todos[i][j + 1].to_sym] = array2 
      end
      if todos[i][j + 1] == "food"
        array3.push(todos[i][j])
        category[todos[i][j + 1].to_sym] = array3
      end
    end
  end
p category

  
  
  
  
  
  
  
  

  
  
  
  

