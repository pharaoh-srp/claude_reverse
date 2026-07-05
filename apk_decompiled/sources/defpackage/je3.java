package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class je3 extends ke3 {
    public final Object a;
    public final String b;

    public je3(String str, Object obj) {
        obj.getClass();
        str.getClass();
        this.a = obj;
        this.b = str;
    }

    @Override // defpackage.ke3
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // defpackage.ke3
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof je3)) {
            return false;
        }
        je3 je3Var = (je3) obj;
        return x44.r(this.a, je3Var.a) && x44.r(this.b, je3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Destroyed(configuration=");
        sb.append(this.a);
        sb.append(", key=");
        return vb7.s(sb, this.b, ')');
    }
}
