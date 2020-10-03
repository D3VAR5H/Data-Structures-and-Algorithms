def insertion_sort(array, begin, end):
    for i in range(begin+1, end):
        temp = array[i]
        j = i - 1
        while array[j] > temp and j >= 0:
            array[j + 1] = array[j]
            j -= 1
        array[j + 1] = temp


array = [int(i) for i in input().split()]
insertion_sort(array, 0, len(array))
print(array)
