<?php 
ini_set('memory_limit', '1024M');

require_once dirname(__FILE__)."/vendor/autoload.php";

use Fukuball\Jieba\Jieba;
use Fukuball\Jieba\Finalseg;

Jieba::init();
Finalseg::init();

$sets = [
"資訊工程學系",
"資訊管理學系",
"應用化學學系",
"土木工程學系",
"外國語言學系"
];

foreach ($sets as $s) 
	echo iconv("UTF-8","BIG5",implode(" ",Jieba::cut($s)))."\n";


 ?>