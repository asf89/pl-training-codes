package main

import (
	"fmt"
)

func main() {
	// Implementing Fibonacci
	var n int = 6
	var temp1, temp2, temp3, temp4, element int

	fmt.Printf("Sequence using 'for':\n")
	for i := 0; i <= n; i++ {
		if i == 0 || i == 1 {
			temp2 = i
			fmt.Printf("%d ", temp2)
		} else {
			element = temp1 + temp2
			temp1 = temp2
			temp2 = element
			fmt.Printf("%d ", element)
		}
	}

	fmt.Printf("\nSequence using 'while':\n")
	j := 0

	for j <= n {
		if j == 0 || j == 1 {
			temp4 = j
			fmt.Printf("%d ", temp4)
		} else {
			element = temp3 + temp4
			temp3 = temp4
			temp4 = element
			fmt.Printf("%d ", element)
		}
		j++
	}

	fmt.Printf("\n")
}
