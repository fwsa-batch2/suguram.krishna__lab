class NEW_CLASS_1

    attr_accessor :cls1name
    attr_accessor :cls1constname

    @cls1name = "sk"
    @@cls1constname = "ram"

end

cls1 = NEW_CLASS_1.new
cls2 = NEW_CLASS_1.new

cls1.cls1name = "sugu"
puts cls1.cls1name
puts cls2.cls1name

cls1.cls1constname = "raman"
puts cls1.cls1constname
puts cls2.cls1constname

cls2.cls1constname = "suguraman"
puts cls2.cls1constname


