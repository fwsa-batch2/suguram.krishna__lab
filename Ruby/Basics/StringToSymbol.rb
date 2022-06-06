strings = ["HTML", "CSS", "JavaScript", "Python", "Ruby"]
symbols = []

strings.each do |items| 
 symbols.push(items.intern)
 # we can use .to_sym to convert string into symbol
end 
print symbols