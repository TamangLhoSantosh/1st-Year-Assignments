# # Index error
# A = range(1,11)
# a = 12
# try:
#     if a not in A:
#         raise IndexError(f"{a} is not in A")
# except IndexError as e:
#     print(e)
# else:
#     print(A.__getitem__(a))

# # Key error
# A = range(1,11)
# B = range(21,31)
# dic = dict(zip(A,B))
# a = 1
# try:
#     if a not in dic:
        # raise KeyError(f"No {a} was found")
# except KeyError as e:
#     print(e)
# else:
#     print(dic.get(a))

# # Value error
# a = int(input("Enter any number upto 100 : "))
# try:
#     if a > 100 :
#         raise ValueError(f"Invalid input.")
# except ValueError as e:
#     print(e)
# else:
#     b = 0
#     while b <= 10:
#         c = a * b
#         print(f"{a} * {b} = {c}")
#         b += 1