-- > b --> nil
-- > b = 10
-- > b --> 10
-- If we assign nil to a global variable, Lua behaves as if we have never used the variable:
-- > b = nil
-- > b --> nil