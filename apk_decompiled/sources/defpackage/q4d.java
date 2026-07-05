package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class q4d {
    public final int a;
    public final int b;
    public final hjk c;
    public final ArrayList d;
    public final String e;

    public q4d(int i, int i2, hjk hjkVar, ArrayList arrayList, String str) {
        this.a = i;
        this.b = i2;
        this.c = hjkVar;
        this.d = arrayList;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4d)) {
            return false;
        }
        q4d q4dVar = (q4d) obj;
        return this.a == q4dVar.a && this.b == q4dVar.b && x44.r(this.e, q4dVar.e) && this.c.equals(q4dVar.c) && this.d.equals(q4dVar.d);
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        String str = this.e;
        return this.d.hashCode() + ((this.c.hashCode() + ((i + (str != null ? str.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "PlannedExerciseStep(exerciseType=" + this.a + ", exerciseCategory=" + this.b + ", description=" + this.e + ", completionGoal=" + this.c + ", performanceTargets=" + this.d + ')';
    }
}
