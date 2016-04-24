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

2. Selection Sort
3. Insertion Sort
4. Merge Sort
