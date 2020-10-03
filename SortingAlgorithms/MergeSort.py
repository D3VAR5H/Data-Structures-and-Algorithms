def merge(array1, array2, array):

    i = j = k = 0

    while i < len(array1) and j < len(array2):
        if array1[i] < array2[j]:
            array[k] = array1[i]
            i += 1
        else:
            array[k] = array2[j]
            j += 1
        k += 1

    if i < len(array1):
        array[k:] = array1[i:]

    if j < len(array2):
        array[k:] = array2[j:]


def merge_sort(array1):

    if len(array1) > 1:
        mid = len(array1)//2
        L = array1[:mid]
        R = array1[mid:]
        merge_sort(L)
        merge_sort(R)
        merge(L, R, array1)


array = [int(i) for i in input().split()]
# print(array)
merge_sort(array)
print("Sorted Array: ", array)
