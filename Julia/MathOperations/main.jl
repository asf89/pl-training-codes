push!(LOAD_PATH, "./MathFunctions")

import Operations
using Printf

println("Addition:")
println(Operations.add(3,2))
@printf("Addition: %d\n", Operations.add(3,2))

println("Subtraction:")
println(Operations.subtraction(4,3))
@printf("Subtraction: %d\n", Operations.subtraction(4,3))

println("Multiplication:")
println(Operations.mult(4,4))
@printf("Multiplication: %d\n", Operations.mult(4,4))

println("Division:")
println(Operations.div(5,2))
@printf("Division: %.1f\n", Operations.div(5,2))
