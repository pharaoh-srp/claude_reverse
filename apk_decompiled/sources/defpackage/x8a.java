package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x8a extends a9a {
    @Override // defpackage.a9a
    public final void a(long j, Object obj) {
        ((r3) wgi.c.i(j, obj)).E = false;
    }

    @Override // defpackage.a9a
    public final void b(long j, Object obj, Object obj2) {
        rgi rgiVar = wgi.c;
        r3 r3VarB = (r3) rgiVar.i(j, obj);
        r3 r3Var = (r3) rgiVar.i(j, obj2);
        int size = r3VarB.size();
        int size2 = r3Var.size();
        if (size > 0 && size2 > 0) {
            if (!r3VarB.E) {
                r3VarB = r3VarB.b(size2 + size);
            }
            r3VarB.addAll(r3Var);
        }
        if (size > 0) {
            r3Var = r3VarB;
        }
        wgi.o(j, obj, r3Var);
    }

    @Override // defpackage.a9a
    public final List c(long j, Object obj) {
        r3 r3Var = (r3) wgi.c.i(j, obj);
        if (r3Var.E) {
            return r3Var;
        }
        int size = r3Var.size();
        r3 r3VarB = r3Var.b(size == 0 ? 10 : size * 2);
        wgi.o(j, obj, r3VarB);
        return r3VarB;
    }
}
