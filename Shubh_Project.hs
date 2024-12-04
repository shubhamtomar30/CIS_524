-- Define the main module
module Main where

-- Define the QuickSort function
-- Type signature: QuickSort works on a list of any orderable type (Ord a) and returns a sorted list of the same type.
quickSort :: (Ord a) => [a] -> [a] 
quickSort [] = [] 
-- Base case: If the input list is empty, it is already sorted, so return an empty list.

quickSort (x:xs) = 
    let 
        -- Recursive call to sort the elements smaller than or equal to the pivot (x).
        smallerSorted = quickSort [a | a <- xs, a <= x] 

        -- Recursive call to sort the elements greater than the pivot (x).
        largerSorted  = quickSort [a | a <- xs, a > x]  
    in 
        -- Combine the sorted smaller elements, the pivot, and the sorted larger elements into one sorted list.
        smallerSorted ++ [x] ++ largerSorted 

-- Main function to demonstrate QuickSort
main :: IO ()
main = do
    -- Define a sample list to be sorted
    let numbers = [10, 3, 7, 4, 9, 2]

    -- Print the unsorted list with a message
    putStrLn "Unsorted List: "
    print numbers

    -- Print the sorted list using QuickSort with a message
    putStrLn "Sorted List: "
    print (quickSort numbers)
