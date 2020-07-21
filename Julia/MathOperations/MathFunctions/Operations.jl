module Operations

  add(a::Int64, b::Int64) = a + b

  subtraction(a::Int64, b::Int64) = a - b

  function mult(a::Int64, b::Int64)
	  a * b
  end

  function div(a::Int64, b::Int64)
	  if (b == 0)
		  println("Error: cannot divide by 0.")
	  else
		  a / b
    end
  end

end
