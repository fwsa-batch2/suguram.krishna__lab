def get_command_line_argument
    if ARGV.empty?
      puts "Usage: ruby lookup.rb <domain>"
      exit
    end
    ARGV.first
end
  
# `domain` contains the domain name we have to look up.
domain = get_command_line_argument
  

dns_raw = File.readlines("zone")

def parse_dns(dns_raw)

  array1 =[]
  array2 = []
  array3 = []
  
  dns_records = {Record: array1, Domain_Name: array2, Ip_Address: array3}
  for i in (dns_raw.select{|x| x[0] != "#" && x!= "\n"})
    dns_records[:Record] = array1.push(i.split(",")).strip
    dns_records[:Domain_Name] = array2.push(i.split(",")).strip
    dns_records[:Ip_Address] = array3.push(i.split(",")).strip
  end
  return dns_records
end


def resolve(dns_records, lookup_chain, domain)
  if(dns_records[:Domain_Name].include? domain)
    index = (dns_records[:Domain_Name]).find_index(domain)
    if(dns_records[:Record])[index] == "A"
      lookup_chain.push((dns_records[:Ip_Address])[index])
    elsif(dns_records[:Record])[index] == "CNAME"

      new_domain = dns_records[:Ip_Address][index]
      lookup_chain.push(new_domain)
      resolve(dns_records,lookup_chain,new_domain)
    end
  else
    lookup_chain.push("The Given domain is not Registered")
  end
  return lookup_chain
end
  


dns_records = parse_dns(dns_raw)
lookup_chain = [domain]
lookup_chain = resolve(dns_records, lookup_chain, domain)
puts lookup_chain.join(" => ")