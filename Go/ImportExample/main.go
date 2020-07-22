package main

import (
	"ImportExample/MathOperations"
	"fmt"
)

func main() {
	fmt.Printf("Sum: %d\nSubtraction: %d\nMultiplication: %d\nDivision: %.2f\n", MathOperations.Add(3, 4), MathOperations.Subtract(15, 10), MathOperations.Multiplication(5, 6), MathOperations.Division(10, 3))
}
