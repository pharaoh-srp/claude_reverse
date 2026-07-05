package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class te3 {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final ye3 d;

    public te3(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ye3 ye3Var) {
        ye3Var.getClass();
        this.a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
        this.d = ye3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te3)) {
            return false;
        }
        te3 te3Var = (te3) obj;
        return this.a.equals(te3Var.a) && this.b.equals(te3Var.b) && this.c.equals(te3Var.c) && this.d == te3Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChildPanes(main=" + this.a + ", details=" + this.b + ", extra=" + this.c + ", mode=" + this.d + ")";
    }
}
