import jieba

jieba.add_word("學系",freq=100)

sets = [
"資訊工程學系",
"資訊管理學系",
"應用化學學系",
"土木工程學系",
"外國語言學系"
]


for s in sets:
   print(" ".join(jieba.cut(s)))