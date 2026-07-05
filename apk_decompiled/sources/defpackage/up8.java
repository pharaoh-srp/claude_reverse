package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public abstract class up8 {
    public static final tg8[] a;
    public static final Map b;

    static {
        tg8 tg8Var = new tg8("", tg8.i);
        ByteString byteString = tg8.f;
        tg8 tg8Var2 = new tg8("GET", byteString);
        tg8 tg8Var3 = new tg8("POST", byteString);
        ByteString byteString2 = tg8.g;
        tg8 tg8Var4 = new tg8("/", byteString2);
        tg8 tg8Var5 = new tg8("/index.html", byteString2);
        ByteString byteString3 = tg8.h;
        tg8 tg8Var6 = new tg8("http", byteString3);
        tg8 tg8Var7 = new tg8("https", byteString3);
        ByteString byteString4 = tg8.e;
        tg8[] tg8VarArr = {tg8Var, tg8Var2, tg8Var3, tg8Var4, tg8Var5, tg8Var6, tg8Var7, new tg8("200", byteString4), new tg8("204", byteString4), new tg8("206", byteString4), new tg8("304", byteString4), new tg8("400", byteString4), new tg8("404", byteString4), new tg8("500", byteString4), new tg8("accept-charset", ""), new tg8("accept-encoding", "gzip, deflate"), new tg8("accept-language", ""), new tg8("accept-ranges", ""), new tg8("accept", ""), new tg8("access-control-allow-origin", ""), new tg8("age", ""), new tg8("allow", ""), new tg8("authorization", ""), new tg8("cache-control", ""), new tg8("content-disposition", ""), new tg8("content-encoding", ""), new tg8("content-language", ""), new tg8("content-length", ""), new tg8("content-location", ""), new tg8("content-range", ""), new tg8("content-type", ""), new tg8("cookie", ""), new tg8("date", ""), new tg8("etag", ""), new tg8("expect", ""), new tg8("expires", ""), new tg8("from", ""), new tg8("host", ""), new tg8("if-match", ""), new tg8("if-modified-since", ""), new tg8("if-none-match", ""), new tg8("if-range", ""), new tg8("if-unmodified-since", ""), new tg8("last-modified", ""), new tg8("link", ""), new tg8("location", ""), new tg8("max-forwards", ""), new tg8("proxy-authenticate", ""), new tg8("proxy-authorization", ""), new tg8("range", ""), new tg8("referer", ""), new tg8("refresh", ""), new tg8("retry-after", ""), new tg8("server", ""), new tg8("set-cookie", ""), new tg8("strict-transport-security", ""), new tg8("transfer-encoding", ""), new tg8("user-agent", ""), new tg8("vary", ""), new tg8("via", ""), new tg8("www-authenticate", "")};
        a = tg8VarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(tg8VarArr[i].a)) {
                linkedHashMap.put(tg8VarArr[i].a, Integer.valueOf(i));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        b = mapUnmodifiableMap;
    }

    public static void a(ByteString byteString) throws IOException {
        byteString.getClass();
        int iE = byteString.e();
        for (int i = 0; i < iE; i++) {
            byte bJ = byteString.j(i);
            if (65 <= bJ && bJ < 91) {
                xh6.c("PROTOCOL_ERROR response malformed: mixed case name: ".concat(byteString.t()));
                return;
            }
        }
    }
}
