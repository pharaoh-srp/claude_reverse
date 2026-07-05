package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class oqb {
    public final String a = knk.F().toString();
    public final LinkedHashSet b = new LinkedHashSet();
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashSet d = new LinkedHashSet();
    public final ArrayList e = new ArrayList();

    public final void a(x59 x59Var) {
        String value;
        qh1 qh1Var = x59Var.a;
        pl9 pl9Var = qh1Var.b;
        rzd rzdVar = qh1Var.c;
        rzd rzdVar2 = qh1Var.a;
        StringBuilder sb = new StringBuilder();
        sq6.D(pl9Var, sb, ':');
        if (rzdVar == null || (value = rzdVar.getValue()) == null) {
            value = "";
        }
        this.c.put(sq6.w(sb, value, ':', rzdVar2), x59Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqb)) {
            return false;
        }
        return x44.r(this.a, ((oqb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
