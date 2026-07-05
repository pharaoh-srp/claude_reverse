package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wr1 extends f0 {
    public final qr1 a = new qr1();

    public static boolean j(z96 z96Var, int i) {
        CharSequence charSequence = z96Var.a.a;
        return z96Var.h < 4 && i < charSequence.length() && charSequence.charAt(i) == '>';
    }

    @Override // defpackage.f0
    public final jr1 f() {
        return this.a;
    }

    @Override // defpackage.f0
    public final kr1 i(z96 z96Var) {
        int i = z96Var.f;
        CharSequence charSequence = z96Var.a.a;
        if (z96Var.h >= 4 || i >= charSequence.length() || charSequence.charAt(i) != '>') {
            return null;
        }
        int i2 = z96Var.d + z96Var.h;
        int i3 = i2 + 1;
        if (ybi.m(i + 1, z96Var.a.a)) {
            i3 = i2 + 2;
        }
        return new kr1(-1, i3, false);
    }
}
