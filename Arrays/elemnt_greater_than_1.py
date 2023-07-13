class Solution:
    def solve(self, A):
        max_value = 0
        max_count = 0
        for x in A:
            if x == max_value:
                max_count += 1
            elif x > max_value:
                max_count = 1
                max_value = x
        return len(A) - max_count

# Create an instance of the Solution class
solution = Solution()

# Take input from the user
n = int(input("Enter the number of elements in the list: "))
A = []

print("Enter the elements of the list:")
for _ in range(n):
    element = int(input())
    A.append(element)

# Call the solve method and print the result
result = solution.solve(A)
print("Result:", result)
