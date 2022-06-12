books = ["Design as Art", "Anathem", "Shogun"]
authors = ["Bruno Munari", "Neal Stephenson", "James Clavell"]

puts books.map.with_index {|book, i| "#{book} is in index #{i}"}

book_details = books + authors

print book_details