package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class s6g {
    public final ArrayList a = new ArrayList();
    public cpc b = new cpc("V", null);

    public s6g(ire ireVar, String str) {
    }

    public final void a(String str, df9... df9VarArr) {
        cai caiVar;
        str.getClass();
        if (df9VarArr.length == 0) {
            caiVar = null;
        } else {
            c19 c19Var = new c19(0, new p7(2, df9VarArr));
            int iD0 = tta.d0(x44.y(c19Var, 10));
            if (iD0 < 16) {
                iD0 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
            Iterator it = c19Var.iterator();
            while (true) {
                f2 f2Var = (f2) it;
                if (!((Iterator) f2Var.G).hasNext()) {
                    break;
                }
                b19 b19Var = (b19) f2Var.next();
                linkedHashMap.put(Integer.valueOf(b19Var.a), (df9) b19Var.b);
            }
            caiVar = new cai(linkedHashMap);
        }
        this.a.add(new cpc(str, caiVar));
    }

    public final void b(nk9 nk9Var) {
        nk9Var.getClass();
        this.b = new cpc(nk9Var.G, null);
    }

    public final void c(String str, df9... df9VarArr) {
        str.getClass();
        c19 c19Var = new c19(0, new p7(2, df9VarArr));
        int iD0 = tta.d0(x44.y(c19Var, 10));
        if (iD0 < 16) {
            iD0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
        Iterator it = c19Var.iterator();
        while (true) {
            f2 f2Var = (f2) it;
            if (!((Iterator) f2Var.G).hasNext()) {
                this.b = new cpc(str, new cai(linkedHashMap));
                return;
            } else {
                b19 b19Var = (b19) f2Var.next();
                linkedHashMap.put(Integer.valueOf(b19Var.a), (df9) b19Var.b);
            }
        }
    }
}
