package defpackage;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class y0c {
    public final LinkedHashMap a;

    public y0c(z0c z0cVar) {
        Map map = z0cVar.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), w44.q1((Collection) entry.getValue()));
        }
        this.a = linkedHashMap;
    }

    public static String a(int i, int i2, String str) {
        return i + '-' + i2 + '-' + str;
    }

    public void b(String str) {
        String lowerCase = "Cache-Control".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        this.a.put(lowerCase, x44.a0(str));
    }

    public y0c(int i) {
        switch (i) {
            case 2:
                this.a = new LinkedHashMap();
                break;
            default:
                this.a = new LinkedHashMap();
                break;
        }
    }
}
