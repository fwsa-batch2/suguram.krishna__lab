class Classroom 

    def initialize(id, name, age)

        @stud_id = id
        @stud_name =  name
        @stud_age = age

        puts "Student Id of the student is #@stud_id"
        puts "Studnet Name is #@stud_name"
        puts "Student Age is #@stud_age"
        puts " " 
    
    end

end


    obj1 = Classroom.new(1,"Suguram",20)
    obj2 = Classroom.new(2,"Sugu",20)
    obj3 = Classroom.new(3,"Ram",20)
    obj4 = Classroom.new(4,"Suguram Krishna",20)