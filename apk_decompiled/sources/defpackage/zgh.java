package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zgh {
    public static final vz8 f = new vz8(29);
    public final i5i a;
    public final tkh b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public zgh(i5i i5iVar, tkh tkhVar, boolean z, boolean z2, boolean z3) {
        this.a = i5iVar;
        this.b = tkhVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NonMeasureInputs(textFieldState=");
        sb.append(this.a);
        sb.append(", textStyle=");
        sb.append(this.b);
        sb.append(", singleLine=");
        sb.append(this.c);
        sb.append(", softWrap=");
        sb.append(this.d);
        sb.append(", isKeyboardTypePhone=");
        return y6a.p(sb, this.e, ')');
    }
}
