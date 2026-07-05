package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class n4d {
    public final int a;
    public final ArrayList b;
    public final String c;

    public n4d(int i, String str, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4d)) {
            return false;
        }
        n4d n4dVar = (n4d) obj;
        return this.a == n4dVar.a && x44.r(this.c, n4dVar.c) && this.b.equals(n4dVar.b);
    }

    public final int hashCode() {
        int i = this.a * 31;
        String str = this.c;
        return this.b.hashCode() + ((i + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PlannedExerciseBlock(repetitions=" + this.a + ", description=" + this.c + ", steps=" + this.b + ')';
    }
}
