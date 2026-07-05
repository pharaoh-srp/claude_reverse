package defpackage;

import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class dvd {
    public final String a;
    public final yl4 b;
    public final LinkedHashMap c;
    public final URI d;

    public dvd(String str, yl4 yl4Var) {
        p9d p9dVar;
        List<de8> listW = x44.W(de8.a);
        int i = uqh.a;
        this.a = str;
        this.b = yl4Var;
        ArrayList arrayList = new ArrayList();
        this.c = new LinkedHashMap();
        int iF = sq6.F(1);
        if (iF == 0) {
            p9dVar = p9d.H;
        } else if (iF == 1) {
            p9dVar = p9d.I;
        } else {
            if (iF != 2) {
                wg6.i();
                throw null;
            }
            p9dVar = p9d.J;
        }
        arrayList.addAll(lm6.E);
        arrayList.add(p9dVar);
        for (de8 de8Var : listW) {
            LinkedHashMap linkedHashMap = this.c;
            de8Var.getClass();
            linkedHashMap.put("gzip", de8Var);
        }
        this.d = new URI(this.a);
    }
}
