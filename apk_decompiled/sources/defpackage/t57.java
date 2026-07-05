package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class t57 extends hjk {
    public final yn6 c;

    public t57(yn6 yn6Var) {
        this.c = yn6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t57)) {
            return false;
        }
        return this.c.equals(((t57) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "TotalCaloriesBurnedGoal(totalCalories=" + this.c + ')';
    }
}
