my_array = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15]

puts my_array
         .select {|n| n % 2 == 1 }
         .map{|n| n *2}
          .reduce(0, :+)
