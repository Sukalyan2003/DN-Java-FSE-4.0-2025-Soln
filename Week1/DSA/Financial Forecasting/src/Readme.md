
#  Exercise 7: Financial Forecasting

This project demonstrates how to use **recursive algorithms** in Java to forecast future financial values based on past data and a constant growth rate. It also includes an **optimized version** using memoization to avoid redundant computations.

---

## Scenario

You're building a **financial forecasting tool** that predicts future investment values given an initial amount, annual growth rate, and number of years into the future. The forecasting algorithm uses recursion for calculation.

---

##  Steps Completed

### 1. Understand Recursive Algorithms

Recursion is a technique where a function calls itself to solve smaller instances of a problem. It simplifies problems like calculating compounded financial values where each year's value depends on the previous year's value.

### 2. Setup

A method is created to calculate future investment value using:
- `principal` — the initial amount
- `rate` — annual growth rate (as a decimal)
- `years` — the number of years for forecasting

### 3. Implementation

Two forecasting methods are implemented:
- `calculateFutureValue()` — basic recursive implementation
- `calculateFutureValueMemo()` — optimized using **memoization** to cache results

### 4. Analysis

####  Time Complexity

| Method                   | Time Complexity | Space Complexity |
|--------------------------|------------------|------------------|
| Basic Recursive          | O(n)             | O(n) (stack)     |
| Memoized Recursive       | O(n)             | O(n) (array)     |

Memoization significantly reduces redundant calculations and improves performance.

---

##  Example Output

```bash
Future Value (Recursive): 1610.51
Future Value (Memoized): 1610.51
````

This result is for:

* Principal = 1000
* Rate = 10% (0.10)
* Years = 5

---

## How to Run

1. **Compile**

   ```bash
   javac FinancialForecast.java
   ```

2. **Run**

   ```bash
   java FinancialForecast
   ```

---


