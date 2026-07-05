package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class y2h {
    public static final ide a = new ide("\\[([^\\]]*)\\]\\([^)]+\\)");
    public static final ide b = new ide("https?://\\S+");
    public static final Set c = mp0.Z0(new Character[]{'.', ',', ';', ':', '!', '?', ')', ']'});
    public static final ide d = new ide("[\u200b\u200c\u200d\ufeff\u2060]");
    public static final ide e = new ide("(?<=\\p{L})/|/(?=\\p{L})");
    public static final ide f = new ide("[ \\t]{2,}");

    public static String a(String str, List list) {
        str.getClass();
        String strH = e.h(b.g(a.g(d.h(str, ""), new x2h(0)), new x2h(1)), " ");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cpc cpcVar = (cpc) it.next();
            strH = isg.n0(strH, (String) cpcVar.E, (String) cpcVar.F, false);
        }
        return bsg.k1(f.h(strH, " ")).toString();
    }
}
