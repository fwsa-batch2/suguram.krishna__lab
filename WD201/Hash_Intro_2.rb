car = {}
car["audi"] = ["Q7", "Q4", "Q5"]
car["bmw"] = ["M Series", "3 Serires", "5 Series"]

companies = car.keys
puts "These are the authors in my catalog: #{companies.join(', ')}"

car.each do |brand, model|
  puts "#{brand.capitalize} has the model #{model.join(', ')}"
end