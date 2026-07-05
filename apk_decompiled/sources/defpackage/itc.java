package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class itc implements mtc {
    public final String a;
    public final jz0 b;
    public final List c;
    public final Set d;
    public final boolean e;

    static {
        new itc("", null, lm6.E, um6.E, true);
    }

    public itc(String str, jz0 jz0Var, List list, Set set, boolean z) {
        str.getClass();
        list.getClass();
        set.getClass();
        this.a = str;
        this.b = jz0Var;
        this.c = list;
        this.d = set;
        this.e = z;
    }

    public static itc a(itc itcVar, LinkedHashSet linkedHashSet, int i) {
        String str = itcVar.a;
        jz0 jz0Var = itcVar.b;
        List list = itcVar.c;
        Set set = linkedHashSet;
        if ((i & 8) != 0) {
            set = itcVar.d;
        }
        Set set2 = set;
        boolean z = (i & 16) != 0 ? itcVar.e : true;
        str.getClass();
        list.getClass();
        set2.getClass();
        return new itc(str, jz0Var, list, set2, z);
    }

    public final jz0 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof itc)) {
            return false;
        }
        itc itcVar = (itc) obj;
        return x44.r(this.a, itcVar.a) && x44.r(this.b, itcVar.b) && x44.r(this.c, itcVar.c) && x44.r(this.d, itcVar.d) && this.e == itcVar.e;
    }

    @Override // defpackage.mtc
    public final String getBody() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        jz0 jz0Var = this.b;
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + kgh.m((iHashCode + (jz0Var == null ? 0 : jz0Var.hashCode())) * 31, 31, this.c)) * 31);
    }

    @Override // defpackage.mtc, defpackage.qf8
    /* JADX INFO: renamed from: isComplete */
    public final boolean getIsComplete() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Text(body=");
        sb.append(this.a);
        sb.append(", markdownRoot=");
        sb.append(this.b);
        sb.append(", citations=");
        sb.append(this.c);
        sb.append(", flags=");
        sb.append(this.d);
        sb.append(", isComplete=");
        return sq6.v(")", sb, this.e);
    }
}
