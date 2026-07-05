package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tz8 implements m6e {
    public final qqb E;

    public tz8(qqb qqbVar) {
        this.E = qqbVar;
    }

    public final qqb a() {
        return this.E;
    }

    public final boolean equals(Object obj) {
        tz8 tz8Var = obj instanceof tz8 ? (tz8) obj : null;
        return this.E.equals(tz8Var != null ? tz8Var.E : null);
    }

    @Override // defpackage.m6e
    public final yr9 getType() {
        j7g j7gVarW = this.E.W();
        j7gVarW.getClass();
        return j7gVarW;
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Class{");
        j7g j7gVarW = this.E.W();
        j7gVarW.getClass();
        sb.append(j7gVarW);
        sb.append('}');
        return sb.toString();
    }
}
