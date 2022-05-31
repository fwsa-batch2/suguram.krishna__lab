class Simple_Calc

    @@a = 10
    @@b = 20
    @@c = 2
    @@d = 3
    @@e = 3

    def operation 

        #Airthmetic Operators 
        puts " "
        puts @@a + @@b
        puts @@a - @@b
        puts @@a * @@b 
        puts @@a / @@c 
        puts @@a % @@b
        puts @@a ** @@d
        puts " "

        #Comparison Operator 
        puts " "
        puts @@d == @@e
        puts @@c != @@d
        puts @@a < @@b
        puts @@a > @@d
        puts @@e <= @@a
        puts @@a === @@b
        puts " " 
    
        # Logical Operator 
        puts " "
        puts a and b
        puts a or b
        puts a && b
        puts a || b 
        puts !(a&&b)
        puts " "        
    end

    

end

obj = Simple_Calc.new
obj.operation
