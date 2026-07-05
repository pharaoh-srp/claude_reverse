package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zu7 implements yu7 {
    public final String a;
    public final float b;

    public zu7(String str, float f) {
        this.a = str;
        this.b = f;
    }

    @Override // defpackage.yu7
    public final float a() {
        return this.b;
    }

    @Override // defpackage.yu7
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zu7)) {
            return false;
        }
        zu7 zu7Var = (zu7) obj;
        return this.a.equals(zu7Var.a) && this.b == zu7Var.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontVariation.Setting(axisName='");
        sb.append(this.a);
        sb.append("', value=");
        return ebh.o(sb, this.b, ')');
    }
}
