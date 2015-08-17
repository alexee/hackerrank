# https://www.hackerrank.com/challenges/simple-array-sum


n = int(raw_input())
input = raw_input().split()

sum = 0

for i in xrange(len(input)):
     sum += int(input[i])

print sum
