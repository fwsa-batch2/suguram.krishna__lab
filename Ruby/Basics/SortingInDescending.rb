fruits = ["orange", "apple", "banana", "pear", "grapes"]

fruits.sort! do |afruits, bfruits| 
  puts bfruits <=> afruits
end
  