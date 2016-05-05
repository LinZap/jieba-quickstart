# jieba - quickstart 

這是一個實作不同語言版本的 Jieba Hello World  
目的是幫助要使用 jieba 的人快速入門

原始專案：[jieba](https://github.com/fxsjy/jieba)


## Example

目前有以下幾種版本可以參考，安裝與使用方式可以參考專案中的 README

* [PHP](https://github.com/LinZap/jieba-quickstart/tree/master/php)
* [R](https://github.com/LinZap/jieba-quickstart/tree/master/R)
* [Python](https://github.com/LinZap/jieba-quickstart/tree/master/python)
* [C#](https://github.com/LinZap/jieba-quickstart/tree/master/C-sharp) (目前有 BUG)
* [Java](https://github.com/LinZap/jieba-quickstart/tree/master/java)
* C++ (待有人實作)
* Node.JS (不建議，相依 C++ 建議直接呼叫 C++版本)
* Erlang


## ISSUE
以下列出幾個版本的問題：

### PHP
PHP 版本使用原生 PHP 實作 jieba，語言特性不好處理大量文字的 case

### R 
R 語言的速度是很快的，不過範例中斷出來的結果顯然效果不好，待有人來修正

### Python
功能完整，支援度高，討論資源最多，個人最推薦的方案

### C\#
目前在編譯階段會出錯，已經將錯誤提交給原作者，待原作者解答

### Java
原始的 jieba JAVA ver. 使用上有諸多不友善，且有許多功能沒有實作，這邊我自行改良了一個輕量版，可以藉由這個迷你專案快速改成符合需求的功能

### Node.JS
不建議使用，相依在 C++ 上，建議透過 Node.js 直接呼叫其他語言的實作

### C++
待有人來實作


<br>

## License


	The MIT License (MIT)
	Copyright (c) 2016 Zap

	Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

	The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

	THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
