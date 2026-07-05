package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f68 extends gab {
    public static final /* synthetic */ wn9[] d;
    public final i0 b;
    public final dfa c;

    static {
        kce kceVar = jce.a;
        d = new wn9[]{kceVar.g(new mrd(kceVar.b(f68.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};
    }

    public f68(gfa gfaVar, i0 i0Var) {
        this.b = i0Var;
        this.c = new dfa(gfaVar, new v01(15, this));
    }

    @Override // defpackage.gab, defpackage.fab
    public final Collection b(c06 c06Var, bz7 bz7Var) {
        c06Var.getClass();
        if (!c06Var.a(c06.n.b)) {
            return lm6.E;
        }
        return (List) wd6.s0(this.c, d[0]);
    }

    @Override // defpackage.gab, defpackage.fab
    public final Collection d(sxb sxbVar, int i) {
        sxbVar.getClass();
        if (i == 0) {
            throw null;
        }
        List list = (List) wd6.s0(this.c, d[0]);
        pbg pbgVar = new pbg();
        for (Object obj : list) {
            if ((obj instanceof hrd) && x44.r(((hrd) obj).getName(), sxbVar)) {
                pbgVar.add(obj);
            }
        }
        return pbgVar;
    }

    @Override // defpackage.gab, defpackage.fab
    public final Collection g(sxb sxbVar, int i) {
        sxbVar.getClass();
        if (i == 0) {
            throw null;
        }
        List list = (List) wd6.s0(this.c, d[0]);
        pbg pbgVar = new pbg();
        for (Object obj : list) {
            if ((obj instanceof c7g) && x44.r(((c7g) obj).getName(), sxbVar)) {
                pbgVar.add(obj);
            }
        }
        return pbgVar;
    }

    public abstract List h();
}
