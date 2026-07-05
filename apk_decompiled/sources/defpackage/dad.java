package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class dad {
    public final boolean a;
    public final ArrayList b;

    public dad(ArrayList arrayList, boolean z) {
        this.a = z;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dad)) {
            return false;
        }
        dad dadVar = (dad) obj;
        return this.a == dadVar.a && this.b.equals(dadVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Posture(isTabletop=");
        sb.append(this.a);
        sb.append(", hinges=[");
        return ij0.m(sb, w44.S0(this.b, ", ", null, null, null, 62), "])");
    }
}
