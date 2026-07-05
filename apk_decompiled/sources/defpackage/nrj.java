package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nrj implements grj, lsj {
    public final String E;
    public final HashMap F = new HashMap();

    public nrj(String str) {
        this.E = str;
    }

    @Override // defpackage.lsj
    public final Double a() {
        return Double.valueOf(Double.NaN);
    }

    @Override // defpackage.grj
    public final lsj b(String str) {
        HashMap map = this.F;
        return map.containsKey(str) ? (lsj) map.get(str) : lsj.v;
    }

    public abstract lsj c(c61 c61Var, List list);

    @Override // defpackage.grj
    public final boolean e(String str) {
        return this.F.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nrj)) {
            return false;
        }
        nrj nrjVar = (nrj) obj;
        String str = this.E;
        if (str != null) {
            return str.equals(nrjVar.E);
        }
        return false;
    }

    @Override // defpackage.lsj
    public final Iterator g() {
        return new srj(this.F.keySet().iterator());
    }

    @Override // defpackage.lsj
    public final String h() {
        return this.E;
    }

    public final int hashCode() {
        String str = this.E;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // defpackage.lsj
    public final Boolean k() {
        return Boolean.TRUE;
    }

    @Override // defpackage.lsj
    public lsj l() {
        return this;
    }

    @Override // defpackage.lsj
    public final lsj m(String str, c61 c61Var, ArrayList arrayList) {
        return "toString".equals(str) ? new qsj(this.E) : mok.i(this, new qsj(str), c61Var, arrayList);
    }

    @Override // defpackage.grj
    public final void o(String str, lsj lsjVar) {
        HashMap map = this.F;
        if (lsjVar == null) {
            map.remove(str);
        } else {
            map.put(str, lsjVar);
        }
    }
}
