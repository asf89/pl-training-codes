package main

import (
	"fmt"
	"log"
	"os/exec"
)

func main() {
	out, err := exec.Command("echo", "hello world!").Output()
	if err != nil {
		log.Fatal(err)
	}
	output := string(out[:])
	fmt.Println(output)

}
