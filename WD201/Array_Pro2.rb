books = ["Design as Art", "Anathem", "Shogun"]
authors = ["Bruno Munari", "Neal Stephenson", "James Clavell"]
# book_details = {}

# for i in 0...books.length do
#     for j in 0...authors.length do
#         if i==j
#             book_details.store(books[i],authors[j])
#         end
#     end
# end


# p book_details

books.map.with_index do|book, i| 
#  puts "#{book} is in index #{i}"
   authors.map.with_index do |author, j|
    # puts "#{author} is in index #{j}"
    if i==j 
        puts  "#{book} was written by #{author}"
    end
end
end
# book_details = books+authors
# p book_details
