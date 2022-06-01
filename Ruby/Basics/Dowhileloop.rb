=begin

loop do 
    puts "This is SK"
end

=end

=begin
i = 0 
loop do 
    i = i+1
    puts i
    break
end
=end


# i = 0 
# loop do 
#     i = i+1
#     puts i
#     if i == 10
#         break
#     end
# end


i = 0
loop do
    i = i+1
    if i == 4
        next
    end
    puts i
    if i == 10 
        break
    end
end     


