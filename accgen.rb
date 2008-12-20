# Ruby Implementation of the Accumulator Generator problem
# see http://www.paulgraham.com/accgen.html for details
#
# To run this from the command line:
#
#   ruby accgen.rb
#
def foo(n)
  lambda{|i| n += i}
end

acc = foo(1)
(2..5).each{|x| puts "#{x}: #{acc.call(x)}"}
