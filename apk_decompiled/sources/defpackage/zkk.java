package defpackage;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zkk {
    public static final zkk c = new zkk();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final oik a = new oik();

    public final klk a(Class cls) {
        klk klkVarJ;
        Charset charset = kfk.a;
        if (cls == null) {
            mr9.h("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        klk klkVar = (klk) concurrentHashMap.get(cls);
        if (klkVar != null) {
            return klkVar;
        }
        oik oikVar = this.a;
        oikVar.getClass();
        xxi xxiVar = olk.a;
        if (!zdk.class.isAssignableFrom(cls)) {
            int i = p8k.a;
        }
        glk glkVarE = oikVar.a.e(cls);
        if ((glkVarE.d & 2) == 2) {
            int i2 = p8k.a;
            xxi xxiVar2 = olk.a;
            byi byiVar = ock.a;
            klkVarJ = lkk.j(xxiVar2, glkVarE.a);
        } else {
            int i3 = p8k.a;
            int i4 = tkk.a;
            int i5 = chk.a;
            xxi xxiVar3 = olk.a;
            byi byiVar2 = glkVarE.a() + (-1) != 1 ? ock.a : null;
            int i6 = ejk.a;
            klkVarJ = jkk.u(glkVarE, xxiVar3, byiVar2);
        }
        klk klkVar2 = (klk) concurrentHashMap.putIfAbsent(cls, klkVarJ);
        return klkVar2 != null ? klkVar2 : klkVarJ;
    }
}
