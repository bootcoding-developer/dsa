
### Big-O Notation - Time and Space Complexity

The efficiency of an algorithm depends on the amount of time, storage and other resources required to execute the algorithm. The efficiency is measured with the help of asymptotic notations.

An algorithm may not have the same performance for different types of inputs. With the increase in the input size, the performance will change.

### Asymptotic Notations
Asymptotic notations are the mathematical notations used to describe the running time of an algorithm when the input tends towards a particular value or a limiting value.

For example: In bubble sort, when the input array is already sorted, the time taken by the algorithm is linear i.e. the best case.

But, when the input array is in reverse condition, the algorithm takes the maximum time (quadratic) to sort the elements i.e. the worst case.

When the input array is neither sorted nor in reverse order, then it takes average time. These durations are denoted using asymptotic notations.

There are mainly three asymptotic notations:

- Big-O notation
- Omega notation
- Theta notation


#### Big-O Notation (O-notation)
Big-O notation represents the upper bound of the running time of an algorithm. Thus, it gives the worst-case complexity of an algorithm.

<p align="left">
  <img src="as-bigO.png" alt="drawing" width="400"/>
</p> 
 

#### Omega Notation (Ω-notation)
Omega notation represents the lower bound of the running time of an algorithm. Thus, it provides the best case complexity of an algorithm.

<p align="left">
  <img src="as-omega.png" alt="drawing" width="400"/>
</p> 
 


#### Theta Notation (Θ-notation)

Theta notation encloses the function from above and below. Since it represents the upper and the lower bound of the running time of an algorithm, it is used for analyzing the average-case complexity of an algorithm.

<p align="left">
  <img src="as-theta.png" alt="drawing" width="400"/>
</p> 
