package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class od4 extends kd4 {
    public final boolean c;

    public od4(e99 e99Var, boolean z) {
        super(e99Var);
        this.c = z;
    }

    @Override // defpackage.kd4
    public final void e(byte b) {
        if (this.c) {
            j(String.valueOf(b & 255));
            return;
        }
        String strValueOf = String.valueOf(b & 255);
        strValueOf.getClass();
        ((e99) this.b).g(strValueOf);
    }

    @Override // defpackage.kd4
    public final void g(int i) {
        boolean z = this.c;
        String unsignedString = Integer.toUnsignedString(i);
        if (z) {
            j(unsignedString);
        } else {
            unsignedString.getClass();
            ((e99) this.b).g(unsignedString);
        }
    }

    @Override // defpackage.kd4
    public final void h(long j) {
        boolean z = this.c;
        String unsignedString = Long.toUnsignedString(j);
        if (z) {
            j(unsignedString);
        } else {
            unsignedString.getClass();
            ((e99) this.b).g(unsignedString);
        }
    }

    @Override // defpackage.kd4
    public final void i(short s) {
        if (this.c) {
            j(String.valueOf(s & 65535));
            return;
        }
        String strValueOf = String.valueOf(s & 65535);
        strValueOf.getClass();
        ((e99) this.b).g(strValueOf);
    }
}
