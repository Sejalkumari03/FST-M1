import pandas

data = {
  "Usernames": ["Admin", "Sharles", "Deku"],
  "Passwords": ["Password", "Sharl13", "AllMight"]
}

dataframe = pandas.DataFrame(data)

print(dataframe)

dataframe.to_csv("sample.csv", index=False)
