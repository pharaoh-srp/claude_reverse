package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ch7 extends f0 {
    public final /* synthetic */ int a = 1;
    public String b;
    public final StringBuilder c;
    public final jr1 d;

    public ch7(int i, int i2, char c) {
        bh7 bh7Var = new bh7();
        this.d = bh7Var;
        this.c = new StringBuilder();
        bh7Var.g = c;
        bh7Var.h = i;
        bh7Var.i = i2;
    }

    public static ch7 j(int i, int i2, CharSequence charSequence) {
        int length = charSequence.length();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = i; i5 < length; i5++) {
            char cCharAt = charSequence.charAt(i5);
            if (cCharAt == '`') {
                i3++;
            } else {
                if (cCharAt != '~') {
                    break;
                }
                i4++;
            }
        }
        if (i3 >= 3 && i4 == 0) {
            if (ybi.g('`', charSequence, i + i3) != -1) {
                return null;
            }
            return new ch7(i3, i2, '`');
        }
        if (i4 < 3 || i3 != 0) {
            return null;
        }
        return new ch7(i4, i2, '~');
    }

    public static /* synthetic */ bh7 k(ch7 ch7Var) {
        return (bh7) ch7Var.d;
    }

    @Override // defpackage.f0
    public final void a(xeg xegVar) {
        int i = this.a;
        StringBuilder sb = this.c;
        switch (i) {
            case 0:
                String str = this.b;
                CharSequence charSequence = xegVar.a;
                if (str != null) {
                    sb.append(charSequence);
                    sb.append('\n');
                } else {
                    this.b = charSequence.toString();
                }
                break;
            default:
                if (this.b == null) {
                    sb.append(xegVar.a);
                    sb.append('\n');
                }
                break;
        }
    }

    @Override // defpackage.f0
    public final void e() {
        int i = this.a;
        StringBuilder sb = this.c;
        jr1 jr1Var = this.d;
        switch (i) {
            case 0:
                bh7 bh7Var = (bh7) jr1Var;
                bh7Var.j = pu6.c(this.b.trim());
                bh7Var.k = sb.toString();
                break;
            default:
                String str = this.b;
                m86 m86Var = (m86) jr1Var;
                if (str == null) {
                    String string = bsg.k1(sb.toString()).toString();
                    m86Var.getClass();
                    string.getClass();
                    m86Var.g = string;
                } else {
                    m86Var.getClass();
                    m86Var.g = str;
                    m86Var.h = true;
                }
                break;
        }
    }

    @Override // defpackage.f0
    public final jr1 f() {
        int i = this.a;
        jr1 jr1Var = this.d;
        switch (i) {
            case 0:
                return (bh7) jr1Var;
            default:
                return (m86) jr1Var;
        }
    }

    @Override // defpackage.f0
    public final kr1 i(z96 z96Var) {
        int i = this.a;
        jr1 jr1Var = this.d;
        switch (i) {
            case 0:
                bh7 bh7Var = (bh7) jr1Var;
                int i2 = z96Var.f;
                int i3 = z96Var.c;
                CharSequence charSequence = z96Var.a.a;
                if (z96Var.h < 4 && i2 < charSequence.length()) {
                    char cCharAt = charSequence.charAt(i2);
                    char c = bh7Var.g;
                    if (cCharAt == c) {
                        int i4 = bh7Var.h;
                        int length = charSequence.length();
                        int i5 = i2;
                        while (true) {
                            if (i5 < length) {
                                if (charSequence.charAt(i5) != c) {
                                    length = i5;
                                } else {
                                    i5++;
                                }
                            }
                        }
                        int i6 = length - i2;
                        if (i6 >= i4 && ybi.r(i2 + i6, charSequence.length(), charSequence) == charSequence.length()) {
                            return new kr1(-1, -1, true);
                        }
                    }
                }
                int length2 = charSequence.length();
                for (int i7 = bh7Var.i; i7 > 0 && i3 < length2 && charSequence.charAt(i3) == ' '; i7--) {
                    i3++;
                }
                return kr1.a(i3);
            default:
                if (this.b != null) {
                    return new kr1(-1, -1, true);
                }
                CharSequence charSequence2 = z96Var.a.a;
                if (!x44.r(bsg.k1(charSequence2.subSequence(z96Var.c, charSequence2.length()).toString()).toString(), "$$")) {
                    return kr1.a(z96Var.c);
                }
                ((m86) jr1Var).h = true;
                return new kr1(-1, -1, true);
        }
    }

    public ch7(String str) {
        this.b = str;
        m86 m86Var = new m86();
        m86Var.g = "";
        this.d = m86Var;
        this.c = new StringBuilder();
    }

    public /* synthetic */ ch7() {
        this(null);
    }
}
