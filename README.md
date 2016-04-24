# AlgorithmReview
Go over all major algorithms and data structures

1. <p><b>Bubble Sort - slow sorting algorithm</b></p>
  In bubble sort, the idea of the algorithm is to move higher valued elements generally towards the right and lower value elements generally to the left.<br>
<div>In pseudocode:<br>
	-Set swap to false<br>
	-Repeat until swap is false<br>
			-Reset swap to true<br>
			-Look at each adjacent pair <br>
					-If 2 adjacent elements are not in order, swap them<br>
					-Set swap to true<br></div>
This will move highter elements to the right and lower elements to the left<br>

Worse-case scenario: The array is in a reverse order; we have to "bubble" each of the n elements all the way across the array, and since we can only fully bubble one element into position per pass, we must do this n times. O(n^2)

Best-case scenario: The array is already perfectly sorted, and we make no swaps on the firt pass. O(n)

2. <b>Selection Sort</b>
The basic idea behind the selection sort is to devide the list into 2 portions: 1. Sorted portion and 2. Unsorted portion. At each step of the algorithm a number is moved from unsorted portion to serted portion until eventually the entire list is sorted
Build sorted potion of out list starting on the left.
Find the smallest element and put it at the end of the sorted portion. We have to scan through the list to find the element first. Once we found the smallest element in the list we want to move it to the sorted portion of our list. So we will simply swap the smallest element with the element in the very first slot.From now on we do not need to touch our very first element. Then repeat the process by finding the smallest element and swapping it with the element in the slot 2.

for i = 1 to n - 1<br>
	min = i<br>
	for j = i+1 to n<br>
		if array[i] < array[min]<br>
			min = j<br><br>
	if min != i<br>
		swap array[min] and array[i]<br>

This sort is also O(n^2)
This algorithms would require the same number of steps even for the sorted list, so the best case scenario is also n^2
3. Insertion Sort
4. Merge Sort
