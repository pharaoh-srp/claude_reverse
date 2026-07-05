package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class f01 implements h01 {
    public final Object a;

    public f01(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f01) && x44.r(this.a, ((f01) obj).a);
    }

    @Override // defpackage.h01
    public final Object getValue() {
        return this.a;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // defpackage.h01
    public final boolean isComplete() {
        return true;
    }

    public final String toString() {
        return grc.t(this.a, "Success(value=", ")");
    }
}
