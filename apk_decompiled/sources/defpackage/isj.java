package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class isj implements grj, lsj {
    public final HashMap E = new HashMap();

    @Override // defpackage.lsj
    public final Double a() {
        return Double.valueOf(Double.NaN);
    }

    @Override // defpackage.grj
    public final lsj b(String str) {
        HashMap map = this.E;
        return map.containsKey(str) ? (lsj) map.get(str) : lsj.v;
    }

    @Override // defpackage.grj
    public final boolean e(String str) {
        return this.E.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof isj) {
            return this.E.equals(((isj) obj).E);
        }
        return false;
    }

    @Override // defpackage.lsj
    public final Iterator g() {
        return new srj(this.E.keySet().iterator());
    }

    @Override // defpackage.lsj
    public final String h() {
        return "[object Object]";
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    @Override // defpackage.lsj
    public final Boolean k() {
        return Boolean.TRUE;
    }

    @Override // defpackage.lsj
    public final lsj l() {
        isj isjVar = new isj();
        for (Map.Entry entry : this.E.entrySet()) {
            boolean z = entry.getValue() instanceof grj;
            HashMap map = isjVar.E;
            if (z) {
                map.put((String) entry.getKey(), (lsj) entry.getValue());
            } else {
                map.put((String) entry.getKey(), ((lsj) entry.getValue()).l());
            }
        }
        return isjVar;
    }

    @Override // defpackage.lsj
    public lsj m(String str, c61 c61Var, ArrayList arrayList) {
        return "toString".equals(str) ? new qsj(toString()) : mok.i(this, new qsj(str), c61Var, arrayList);
    }

    @Override // defpackage.grj
    public final void o(String str, lsj lsjVar) {
        HashMap map = this.E;
        if (lsjVar == null) {
            map.remove(str);
        } else {
            map.put(str, lsjVar);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap map = this.E;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
