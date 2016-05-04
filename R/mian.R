library("jiebaR")

cc = worker(type = "mix")
new_user_word(cc,"學系")

sets = c(
  "資訊工程學系",
  "資訊管理學系",
  "應用化學學系",
  "土木工程學系",
  "外國語言學系"
)

for(s in sets)
  print( cc<=s )
