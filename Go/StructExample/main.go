package main

import(
  "fmt"
)

type Fruits struct {
  x string
  y string
  z string
}

func main() {
  var fruit Fruits = Fruits{x: "apple"}
  fmt.Printf("value of x: %s\n", fruit.x)
}
