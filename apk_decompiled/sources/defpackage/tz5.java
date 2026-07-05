package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tz5 implements kl7 {
    public final yig a;

    public tz5(yig yigVar) {
        this.a = yigVar;
    }

    @Override // defpackage.mb0
    public final gsi a(c9i c9iVar) {
        pz5 pz5Var = new pz5(c9iVar, 2);
        yig yigVar = this.a;
        float f = yigVar.a;
        float f2 = yigVar.b;
        Object obj = yigVar.c;
        return new w9h(f, f2, obj == null ? null : (sb0) pz5Var.invoke(obj));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tz5)) {
            return false;
        }
        return this.a.equals(((tz5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
