package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class t3h {
    public final ArrayList a;
    public final ArrayList b;

    public t3h(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3h)) {
            return false;
        }
        t3h t3hVar = (t3h) obj;
        return this.a.equals(t3hVar.a) && this.b.equals(t3hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TableLayoutResult(rowOffsets=" + this.a + ", columnOffsets=" + this.b + ")";
    }
}
