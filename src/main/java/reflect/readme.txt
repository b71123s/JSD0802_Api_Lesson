彙整方法

1.
boolean  isAnnotationPresent()
如果指定類型的註釋存在於此元素上，則返回 true，否則返回 false。

2.
URI  toURI()
返回與此URL等效的URI。 此方法的功能與 new URI (this.toString()) 相同。

3.
Object invoke()
在具有指定參數的指定對像上調用此 Method 對象表示的基礎方法。 例: 方法.invoke(對象)

4.
Method[]  getDeclaredMethods()
返回一個包含 Method 對象的數組，該對象反映了此 Class 對象表示的類或接口的所有聲明方法
包括公共、受保護、默認（包）訪問和私有方法，但不包括繼承方法。

5.
Object  newInstance()
創建由此 Class 對象表示的類的新實例。

6.
Class  Class.forName ()
返回與具有給定字符串名稱的類或接口關聯的 Class 對象。

7.
String  substring()
返回作為此字符串的子字符串的字符串。
例:  substring(0,7)

URL  getResource()
查找具有給定名稱的資源。 搜索與給定類關聯的資源的規則由該類的定義類加載器實現。