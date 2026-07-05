package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i0b implements j0b {
    public final ArrayList a;

    public i0b(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0b) && this.a.equals(((i0b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Stubs(servers=" + this.a + ")";
    }
}
