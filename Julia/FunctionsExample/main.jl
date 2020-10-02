using Printf

function addition(x, y)
    x + y
end

x = 2
y = 5

@printf("Addition of %d and %d: %d\n", x, y, addition(x,y))
