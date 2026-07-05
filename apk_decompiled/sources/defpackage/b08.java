package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class b08 extends j0 {
    public final /* synthetic */ c08 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b08(c08 c08Var) {
        super(c08Var.I);
        this.c = c08Var;
    }

    @Override // defpackage.j0, defpackage.u9i
    public final xh3 a() {
        return this.c;
    }

    @Override // defpackage.u9i
    public final boolean c() {
        return true;
    }

    @Override // defpackage.m4
    public final Collection e() {
        List listW;
        c08 c08Var = this.c;
        int i = c08Var.L;
        int iOrdinal = c08Var.K.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            listW = x44.W(c08.P);
        } else if (iOrdinal == 2) {
            listW = x44.X(c08.Q, new gh3(pkg.j, e08.H.a(i)));
        } else {
            if (iOrdinal != 3) {
                wg6.i();
                return null;
            }
            listW = x44.X(c08.Q, new gh3(pkg.e, e08.I.a(i)));
        }
        tqb tqbVarH = ((xmc) c08Var.J).h();
        List<gh3> list = listW;
        ArrayList arrayList = new ArrayList(x44.y(list, 10));
        for (gh3 gh3Var : list) {
            qqb qqbVarT = kxk.t(tqbVarH, gh3Var);
            if (qqbVarT == null) {
                xh6.i(gh3Var, " not found", "Built-in class ");
                return null;
            }
            List listK1 = w44.k1(qqbVarT.p().getParameters().size(), c08Var.O);
            ArrayList arrayList2 = new ArrayList(x44.y(listK1, 10));
            Iterator it = listK1.iterator();
            while (it.hasNext()) {
                arrayList2.add(new wai(((qai) it.next()).W()));
            }
            r9i.F.getClass();
            arrayList.add(yfd.b0(r9i.G, qqbVarT, arrayList2));
        }
        return w44.p1(arrayList);
    }

    @Override // defpackage.u9i
    public final List getParameters() {
        return this.c.O;
    }

    @Override // defpackage.m4
    public final zp3 h() {
        return zp3.Y;
    }

    @Override // defpackage.j0
    /* JADX INFO: renamed from: m */
    public final qqb a() {
        return this.c;
    }

    public final String toString() {
        return this.c.toString();
    }
}
