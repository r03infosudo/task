<%@page pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html; charset=UTF-8" %>

<%--入荷伝票表示する --%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <style>
        	table {
    			border-collapse: collapse;
    			margin: 0px 10px;
			}
			table th, table td {
    			border: 1px solid #333;
    			padding: 5px 2px;
			}
			table th.row {
    			border-bottom: none;
			}
			table td.num {
    			text-align: right;
			}
        </style>
        <title>帳票画面</title>
    </head>
    <body>
        <h3>仕入伝票</h3>

        <table>
            <tr>
              <th style="width:150px;" class="row">仕入日</th>
              <th style="width:70px;" class="row">伝票番号</th>
              <th style="width:70px;" class="row">発注番号</th>
            </tr>
            <tr>
                <td style="width: 150px;">20XX年6月15日</td>
                <td style="width: 70px;" class="num">123</td>
                <td style="width: 70px;" class="num">432</td>
            </tr>
        </table>

        <br>

        <table>
            <tr>
                <th>仕入先</th>
                <td>A200</td>
                <td>A製鉄所</td>
            </tr>
            <tr>
                <th>担当者</th>
                <td>301</td>
                <td>佐藤　さとう</td>
            </tr>
        </table>

        <br>

        <table>
            <thead style="display: block;">
              <tr>
                <th style="width:150px;" class="row">材料コード</th>
                <th style="width:150px;" class="row">材料名</th>
                <th style="width:150px;" class="row">数量</th>
                <th style="width:150px;" class="row">単価</th>
                <th style="width:150px;" class="row">金額</th>
            </tr>
            </thead>
             
            <tbody style="display: block;overflow-y:scroll;height:112px;">
              <tr>
                <td style="width:150px;">aaaa</td>
                <td style="width:150px;">みかん</td>
                <td style="width:150px;" class="num">12</td>
                <td style="width:150px;" class="num">25</td>
                <td style="width:150px;" class="num">300</td>
              </tr>
                <td>bbbb</td>
                <td>いちご</td>
                <td class="num">20</td>
                <td class="num">12</td>
                <td class="num">240</td>
              </tr>
              <tr>
                <td>cccc</td>
                <td>りんご</td>
                <td class="num">13</td>
                <td class="num">123</td>
                <td class="num">1,599</td>
              </tr>
              <tr>
                <td>dddd</td>
                <td>ぶどう</td>
                <td class="num">25</td>
                <td class="num">583</td>
                <td class="num">14,575</td>
              </tr>
              <tr>
                <td>eeee</td>
                <td>ばなな</td>
                <td class="num">31</td>
                <td class="num">140</td>
                <td class="num">4,340</td>
              </tr>
            </tbody>
          </table>

          <br>

          <table>
            <thead style="display: block;">
                <tr>
                  <th style="width:150px;" class="row">税抜額</th>
                  <th style="width:150px;" class="row">消費税額</th>
                  <th style="width:150px;" class="row">合計</th>
              </tr>
              </thead>

            <tbody style="display: block;">
                <tr>
                    <td style="width: 150px;" class="num">21,054</td>
                    <td style="width: 150px;" class="num">2,105</td>
                    <td style="width: 150px;" class="num">23,159</td>
                </tr>
            </tbody>
        </table>
    </body>
</html>

<br>
<a href="../chapter26/inventory.jsp">在庫登録に進む</a>
