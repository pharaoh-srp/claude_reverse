package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class w4e {
    public final g5e a;
    public final g11 b;
    public final Object c = new Object();

    public w4e(g5e g5eVar, g11 g11Var) {
        this.a = g5eVar;
        this.b = g11Var;
    }

    public final oab a(mab mabVar) {
        oab oabVar;
        oab oabVar2;
        synchronized (this.c) {
            try {
                c5e c5eVar = (c5e) ((LinkedHashMap) ((e5e) this.a.c).G).get(mabVar);
                oabVar = c5eVar != null ? new oab(c5eVar.b(), c5eVar.a()) : null;
                if (oabVar == null) {
                    g11 g11Var = this.b;
                    ArrayList arrayList = (ArrayList) ((LinkedHashMap) g11Var.G).get(mabVar);
                    if (arrayList == null) {
                        oabVar = null;
                    } else {
                        int size = arrayList.size();
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                oabVar2 = null;
                                break;
                            }
                            j5e j5eVar = (j5e) arrayList.get(i);
                            wv8 wv8Var = (wv8) j5eVar.b().get();
                            oabVar2 = wv8Var != null ? new oab(wv8Var, j5eVar.a()) : null;
                            if (oabVar2 != null) {
                                break;
                            }
                            i++;
                        }
                        g11Var.h();
                        oabVar = oabVar2;
                    }
                }
                if (oabVar != null && !oabVar.b().d()) {
                    synchronized (this.c) {
                        e5e e5eVar = (e5e) this.a.c;
                        Object objRemove = ((LinkedHashMap) e5eVar.G).remove(mabVar);
                        if (objRemove != null) {
                            e5eVar.F = e5eVar.c() - e5eVar.h(mabVar, objRemove);
                            e5eVar.b(mabVar, objRemove, null);
                        }
                        if (objRemove != null) {
                        }
                        if (((LinkedHashMap) this.b.G).remove(mabVar) != null) {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return oabVar;
    }

    public final void b(mab mabVar, oab oabVar) {
        synchronized (this.c) {
            long jC = oabVar.b().c();
            if (jC < 0) {
                throw new IllegalStateException(("Image size must be non-negative: " + jC).toString());
            }
            this.a.c(mabVar, oabVar.b(), oabVar.a(), jC);
        }
    }

    public final void c(long j) {
        synchronized (this.c) {
            e5e e5eVar = (e5e) this.a.c;
            e5eVar.E = j;
            e5eVar.i(j);
        }
    }
}
