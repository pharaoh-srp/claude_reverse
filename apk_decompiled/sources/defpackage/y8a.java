package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class y8a extends z8a {
    @Override // defpackage.z8a
    public final void a(long j, Object obj) {
        ((q3) ((p89) vgi.c.i(j, obj))).E = false;
    }

    @Override // defpackage.z8a
    public final void b(long j, Object obj, Object obj2) {
        qgi qgiVar = vgi.c;
        p89 p89VarJ = (p89) qgiVar.i(j, obj);
        p89 p89Var = (p89) qgiVar.i(j, obj2);
        int size = p89VarJ.size();
        int size2 = p89Var.size();
        if (size > 0 && size2 > 0) {
            if (!((q3) p89VarJ).E) {
                p89VarJ = p89VarJ.j(size2 + size);
            }
            p89VarJ.addAll(p89Var);
        }
        if (size > 0) {
            p89Var = p89VarJ;
        }
        vgi.p(j, obj, p89Var);
    }

    @Override // defpackage.z8a
    public final List c(long j, Object obj) {
        p89 p89Var = (p89) vgi.c.i(j, obj);
        if (((q3) p89Var).E) {
            return p89Var;
        }
        int size = p89Var.size();
        p89 p89VarJ = p89Var.j(size == 0 ? 10 : size * 2);
        vgi.p(j, obj, p89VarJ);
        return p89VarJ;
    }
}
