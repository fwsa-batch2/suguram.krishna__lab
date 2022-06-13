books = ["Design as Art", "Anathem", "Shogun"]
authors = ["Bruno Munari", "Neal Stephenson", "James Clavell"]

book_details = {}

for i in 0...books.length do
    for j in 0...authors.length do
        if i==j
            author = authors[j].split.first.downcase!
            book_details.store(author.to_sym,books[i])
        end
    end
end

p book_details