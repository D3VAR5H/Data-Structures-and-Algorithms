def tim_sort(array):
    run = 32

    for begin in range(0, len(array), run):
        insertion_sort(array, begin, min((begin + run), (len(array))))

    while run < len(array):
        for left in range(0, len(array), 2 * run):
            merge(array, left, left + run, min((left + 2 * run), (len(array))))
        run *= 2


def merge(array, l, m, r):
    left = array[l:m]
    right = array[m:r]
    i = j = 0
    k = l

    while i < len(left) and j < len(right):
        if left[i] < right[j]:
            array[k] = left[i]
            i += 1
        else:
            array[k] = right[j]
            j += 1
        k += 1

    if i < len(left):
        array[k:r] = left[i:]

    if j < len(right):
        array[k:r] = right[j:]


def insertion_sort(array, begin, end):
    for i in range(begin + 1, end):
        temp = array[i]
        j = i - 1
        while array[j] > temp and j >= begin:
            array[j + 1] = array[j]
            j -= 1
        array[j + 1] = temp


array = [int(i) for i in input().split()]
print(array)
tim_sort(array)
print(array)
