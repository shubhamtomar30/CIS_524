-- Define the main module
module Main where

-- QuickSort function definition
quickSort :: (Ord a) => [a] -> [a] 
quickSort [] = [] -- Base case: an empty list is already sorted
quickSort (x:xs) = 
    let smallerSorted = quickSort [a | a <- xs, a <= x] -- Recursive call for elements <= pivot
        largerSorted  = quickSort [a | a <- xs, a > x]  -- Recursive call for elements > pivot
    in smallerSorted ++ [x] ++ largerSorted -- Combine smaller, pivot, and larger parts

-- Main function to demonstrate QuickSort
main :: IO ()
main = do
    let numbers = [10, 3, 7, 4, 9, 2] -- List of numbers to sort
    putStrLn "Unsorted List: " -- Print a message for unsorted list
    print numbers -- Display the unsorted list
    putStrLn "Sorted List: " -- Print a message for sorted list
    print (quickSort numbers) -- Apply QuickSort and display the sorted list
