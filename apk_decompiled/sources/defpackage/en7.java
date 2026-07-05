package defpackage;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes2.dex */
public final class en7 {
    public final SparseBooleanArray a;

    public en7(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final int a(int i) {
        SparseBooleanArray sparseBooleanArray = this.a;
        fd9.G(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof en7) {
            return this.a.equals(((en7) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
