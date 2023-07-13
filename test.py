def reverse_array(array):
    start = 0
    end = len(array) - 1

    while start < end:
        # Swap elements at start and end
        temp = array[start]
        array[start] = array[end]
        array[end] = temp

        # Move indices towards the center
        start += 1
        end -= 1


length = int(input("Enter the number of elements in the array: "))
array = []

print("Enter the elements of the array:")
for _ in range(length):
    element = int(input())
    array.append(element)

print("Original array:", array)

reverse_array(array)

print("Reversed array:", array)
