import pandas

dataframe= pandas.read_csv("sample.csv")

print("Print all the data from file")
print(dataframe)

print("============")
print("Print all the usernames data from file")
print(dataframe["Usernames"])

print("============")
print("Print all the data from the second row")
print(dataframe["Usernames"][1] , dataframe["Passwords"][1])

print("============")
print("Print the username data in ascending order from the file")
print(dataframe.sort_values("Usernames"))

print("============")
print("Print the Passwords data in descending order from the file")
print(dataframe.sort_values("Passwords", ascending=False))