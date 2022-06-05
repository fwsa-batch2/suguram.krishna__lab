puts "Enter a Text"
text = gets.chomp


puts "Enter the Redact word"
redact = gets.chomp


words = text.split(" ")
words.each do |chr|
if chr == redact
print "REDACTED "
else 
print chr + " "
end
end
