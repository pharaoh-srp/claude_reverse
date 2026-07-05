package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class v96 extends f0 {
    public final /* synthetic */ int a;
    public final jr1 b;

    public v96(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new klh();
                break;
            default:
                this.b = new p96();
                break;
        }
    }

    public static boolean j(int i, CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i >= length) {
                if (i2 >= 3 && i3 == 0 && i4 == 0) {
                    return true;
                }
                if (i3 >= 3 && i2 == 0 && i4 == 0) {
                    return true;
                }
                if (i4 < 3 || i2 != 0 || i3 != 0) {
                    break;
                }
                return true;
            }
            char cCharAt = charSequence.charAt(i);
            if (cCharAt != '\t' && cCharAt != ' ') {
                if (cCharAt == '*') {
                    i4++;
                } else if (cCharAt == '-') {
                    i2++;
                } else {
                    if (cCharAt != '_') {
                        break;
                    }
                    i3++;
                }
            }
            i++;
        }
        return false;
    }

    private final void k(xeg xegVar) {
    }

    @Override // defpackage.f0
    public void a(xeg xegVar) {
        int i = this.a;
    }

    @Override // defpackage.f0
    public boolean c(jr1 jr1Var) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.c(jr1Var);
        }
    }

    @Override // defpackage.f0
    public final jr1 f() {
        int i = this.a;
        jr1 jr1Var = this.b;
        switch (i) {
            case 0:
                return (p96) jr1Var;
            default:
                return (klh) jr1Var;
        }
    }

    @Override // defpackage.f0
    public boolean g() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.g();
        }
    }

    @Override // defpackage.f0
    public final kr1 i(z96 z96Var) {
        switch (this.a) {
            case 0:
                return kr1.a(z96Var.c);
            default:
                return null;
        }
    }

    public p96 l() {
        return (p96) this.b;
    }
}
