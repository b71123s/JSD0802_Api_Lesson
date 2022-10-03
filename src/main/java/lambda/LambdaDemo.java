package lambda;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo {

    // Collection 集合的接口
    // Collections 各種集合的工具類add、remove、sort、shuffle等

//    List<String>


    Comparator<String> c = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return 0;
        }
    };

    // lambda 表達式 - 當只有一個此名稱抽象類才可使用
    Comparator<String> c1 = (String o1, String o2)->{
            return 0;
    };

    // lambda 表達式精簡版1 - 參數列表中參數類型可以不指定
    Comparator<String> c2 = (o1,o2)->{
        return 0;
    };

    // lambda 表達式精簡版2，如果方法體只有一行代碼，那方法體中的 "{}" 可以忽略
    // 如果該行代碼有return關鍵字，那麼忽略{}的同時也要一同忽略 "return"
    Comparator<String> c3 = (o1,o2)->0;







}
