local tolerance = 10
function isturnback(angle)
  angle = angle % 360
  return (math.abs(angle - 180) < tolerance)
end

print("enter a number:")
a = io.read("*n") -- reads a number
print(isturnback(a))
