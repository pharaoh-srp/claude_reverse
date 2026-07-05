package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class n16 extends m16 {
    public final wmc g;
    public final String h;
    public final ww7 i;

    public n16(wmc wmcVar, ysd ysdVar, txb txbVar, wp1 wp1Var, lk9 lk9Var, r06 r06Var, String str, zy7 zy7Var) {
        zp3 zp3Var;
        ysdVar.getClass();
        txbVar.getClass();
        wp1Var.getClass();
        r06Var.getClass();
        ttd ttdVar = ysdVar.K;
        ttdVar.getClass();
        cbi cbiVar = new cbi(ttdVar);
        aud audVar = ysdVar.L;
        audVar.getClass();
        if (audVar.F.size() == 0) {
            zp3Var = zp3.Z;
        } else {
            audVar.F.getClass();
            zp3Var = new zp3(10);
        }
        wk wkVar = new wk(r06Var, txbVar, wmcVar, cbiVar, zp3Var, wp1Var, lk9Var, (aai) null, lm6.E);
        List list = ysdVar.H;
        list.getClass();
        List list2 = ysdVar.I;
        list2.getClass();
        List list3 = ysdVar.J;
        list3.getClass();
        super(wkVar, list, list2, list3, zy7Var);
        this.g = wmcVar;
        this.h = str;
        this.i = ((xmc) wmcVar).I;
    }

    @Override // defpackage.gab, defpackage.fab
    public final Collection b(c06 c06Var, bz7 bz7Var) {
        c06Var.getClass();
        Collection collectionI = i(c06Var, bz7Var);
        Iterable iterable = ((r06) this.b.d).k;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            b54.t0(arrayList, ((yg3) it.next()).b(this.i));
        }
        return w44.a1(collectionI, arrayList);
    }

    @Override // defpackage.m16, defpackage.gab, defpackage.fab
    public final xh3 e(sxb sxbVar, int i) {
        sxbVar.getClass();
        sq6.a(i);
        zni.T(((r06) this.b.d).i, i, this.g, sxbVar);
        return super.e(sxbVar, i);
    }

    @Override // defpackage.m16
    public final void h(ArrayList arrayList, bz7 bz7Var) {
    }

    @Override // defpackage.m16
    public final gh3 l(sxb sxbVar) {
        sxbVar.getClass();
        return new gh3(this.i, sxbVar);
    }

    @Override // defpackage.m16
    public final Set n() {
        return um6.E;
    }

    @Override // defpackage.m16
    public final Set o() {
        return um6.E;
    }

    @Override // defpackage.m16
    public final Set p() {
        return um6.E;
    }

    @Override // defpackage.m16
    public final boolean q(sxb sxbVar) {
        sxbVar.getClass();
        if (m().contains(sxbVar)) {
            return true;
        }
        Iterable iterable = ((r06) this.b.d).k;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((yg3) it.next()).c(this.i, sxbVar)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.h;
    }
}
