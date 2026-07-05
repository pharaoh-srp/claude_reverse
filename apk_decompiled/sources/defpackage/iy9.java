package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class iy9 {
    public final yr9 a;
    public final List b;
    public final ArrayList c;
    public final List d;

    public iy9(yr9 yr9Var, List list, ArrayList arrayList, List list2) {
        list.getClass();
        this.a = yr9Var;
        this.b = list;
        this.c = arrayList;
        this.d = list2;
    }

    public final List a() {
        return this.d;
    }

    public final yr9 b() {
        return this.a;
    }

    public final List c() {
        return this.c;
    }

    public final List d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iy9)) {
            return false;
        }
        iy9 iy9Var = (iy9) obj;
        return this.a.equals(iy9Var.a) && x44.r(this.b, iy9Var.b) && this.c.equals(iy9Var.c) && this.d.equals(iy9Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + kgh.m(this.a.hashCode() * 961, 31, this.b)) * 961);
    }

    public final String toString() {
        return "MethodSignatureData(returnType=" + this.a + ", receiverType=null, valueParameters=" + this.b + ", typeParameters=" + this.c + ", hasStableParameterNames=false, errors=" + this.d + ')';
    }
}
