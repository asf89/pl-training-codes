package main

import (
	"fmt"
	"strings"
)

func main() {
	var num int = 4
	var phrase string = "ha"

	var pNum *int = &num
	pPhrase := &phrase

	fmt.Printf("%s\n", *pPhrase)
	fmt.Printf("%s!\n", strings.Repeat(*pPhrase, *pNum))
}
