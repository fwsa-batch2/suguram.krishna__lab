a = {
    :name => "sk",
    :role => "developer",
}

emp = {
    :c_name => "freshworks",
    :emp => [a],
}

def render(a)  
    if a[:name] == "sk"
        puts "The Employee name is SK"
        puts a[:role] 
    elsif a[:c_name] == "freshworks"
        c = a[:emp]
        puts c.each{|x| render(x)}
    end
end

render(emp)


