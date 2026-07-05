package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class ih3 extends gg9 {
    public static final ro0 d = new ro0(1);
    public final ikk a;
    public final hh3[] b;
    public final ai9 c;

    public ih3(ikk ikkVar, TreeMap treeMap) {
        this.a = ikkVar;
        this.b = (hh3[]) treeMap.values().toArray(new hh3[treeMap.size()]);
        this.c = ai9.a((String[]) treeMap.keySet().toArray(new String[treeMap.size()]));
    }

    @Override // defpackage.gg9
    public final Object fromJson(ci9 ci9Var) {
        try {
            Object objM = this.a.m();
            try {
                ci9Var.beginObject();
                while (ci9Var.hasNext()) {
                    int iK = ci9Var.K(this.c);
                    if (iK == -1) {
                        ci9Var.R();
                        ci9Var.skipValue();
                    } else {
                        this.b[iK].a(ci9Var, objM);
                    }
                }
                ci9Var.endObject();
                return objM;
            } catch (IllegalAccessException unused) {
                mr9.u();
                return null;
            }
        } catch (IllegalAccessException unused2) {
            mr9.u();
            return null;
        } catch (InstantiationException e) {
            xh6.h(e);
            return null;
        } catch (InvocationTargetException e2) {
            spi.l(e2);
            throw null;
        }
    }

    @Override // defpackage.gg9
    public final void toJson(jj9 jj9Var, Object obj) {
        try {
            jj9Var.d();
            for (hh3 hh3Var : this.b) {
                jj9Var.n(hh3Var.a);
                hh3Var.b(jj9Var, obj);
            }
            jj9Var.i();
        } catch (IllegalAccessException unused) {
            mr9.u();
        }
    }

    public final String toString() {
        return "JsonAdapter(" + this.a + ")";
    }
}
