-- QuickSort implementation in Haskell
-- Functional paradigm, using recursion and immutability
module Main where

-- QuickSort function
quickSort :: (Ord a) => [a] -> [a]
quickSort [] = []  -- Base case: empty list
quickSort (x:xs) = 
    let smallerSorted = quickSort [a | a <- xs, a <= x] -- Recursive call for elements <= pivot
        largerSorted  = quickSort [a | a <- xs, a > x]  -- Recursive call for elements > pivot
    in smallerSorted ++ [x] ++ largerSorted -- Combine results with pivot

-- Test case
main :: IO ()
main = do
    let numbers = [10, 3, 7, 4, 9, 2]
    putStrLn "Unsorted List: "
    print numbers
    putStrLn "Sorted List: "
    print (quickSort numbers)
