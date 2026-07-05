package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wmg extends gab {
    public static final /* synthetic */ wn9[] e;
    public final c16 b;
    public final dfa c;
    public final dfa d;

    static {
        kce kceVar = jce.a;
        e = new wn9[]{kceVar.g(new mrd(kceVar.b(wmg.class), "functions", "getFunctions()Ljava/util/List;")), kceVar.g(new mrd(kceVar.b(wmg.class), "properties", "getProperties()Ljava/util/List;"))};
    }

    public wmg(gfa gfaVar, c16 c16Var) {
        gfaVar.getClass();
        this.b = c16Var;
        this.c = new dfa(gfaVar, new vmg(this, 0));
        this.d = new dfa(gfaVar, new vmg(this, 1));
    }

    @Override // defpackage.gab, defpackage.fab
    public final Collection b(c06 c06Var, bz7 bz7Var) {
        c06Var.getClass();
        wn9[] wn9VarArr = e;
        return w44.a1((List) wd6.s0(this.c, wn9VarArr[0]), (List) wd6.s0(this.d, wn9VarArr[1]));
    }

    @Override // defpackage.gab, defpackage.fab
    public final Collection d(sxb sxbVar, int i) {
        sxbVar.getClass();
        if (i == 0) {
            throw null;
        }
        List list = (List) wd6.s0(this.d, e[1]);
        pbg pbgVar = new pbg();
        for (Object obj : list) {
            if (x44.r(((hrd) obj).getName(), sxbVar)) {
                pbgVar.add(obj);
            }
        }
        return pbgVar;
    }

    @Override // defpackage.gab, defpackage.fab
    public final xh3 e(sxb sxbVar, int i) {
        sxbVar.getClass();
        if (i != 0) {
            return null;
        }
        throw null;
    }

    @Override // defpackage.gab, defpackage.fab
    public final Collection g(sxb sxbVar, int i) {
        sxbVar.getClass();
        if (i == 0) {
            throw null;
        }
        List list = (List) wd6.s0(this.c, e[0]);
        pbg pbgVar = new pbg();
        for (Object obj : list) {
            if (x44.r(((c7g) obj).getName(), sxbVar)) {
                pbgVar.add(obj);
            }
        }
        return pbgVar;
    }
}
