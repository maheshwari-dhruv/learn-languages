package main

import (
	"fmt"
	"time"
)

func main() {
	const DAYS = 129600 * time.Minute
	fmt.Println("Time := ", DAYS)
}
