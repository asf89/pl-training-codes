package main

import (
	"fmt"
	"io/ioutil"
	"log"
	"os"
)

func main() {
	// first variation
	file1, err := ioutil.ReadFile("hello.txt")

	if err != nil {
		log.Fatalf("ioutil.ReadFile failed with '%s'\n", err)
	}

	fmt.Printf("%s\n\n", file1)

	// Second variation
	file2, err2 := os.Open("hello2.txt")
	content, err_content := ioutil.ReadAll(file2)

	if err2 != nil {
		log.Fatalf("os.Open failed with '%s'\n", err)
	}

	if err_content != nil {
		log.Fatalf("ioutil.ReadAll failed with '%s'\n", err_content)
	}

	fmt.Printf("%s\n", content)

	defer file2.Close()
}
