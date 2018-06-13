import Foundation

let allInts = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]

let sum = allInts.filter{ $0 % 2 == 1 }.map{ $0 * 2 }.reduce(0, +)
print(sum)
