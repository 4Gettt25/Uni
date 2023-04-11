-- defines a factorial function
function fact(n)
	if n < 0 then
		print("LMAO")
	else
		if n == 0 then
			return 1
		else
			return n * fact(n - 1)
		end
	end
end

print("enter a number:")
a = io.read("*n") -- reads a number
print(fact(a))
