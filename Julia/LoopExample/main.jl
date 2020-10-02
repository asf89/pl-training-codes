using Printf

sum = 0
target 10

for i = 0:target
    sum += i
end

@printf("Sum: %d\n", sum)


j = 0

while j < sum
    println(sum)
    sum -= 1
end
