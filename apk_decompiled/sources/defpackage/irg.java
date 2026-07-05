package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class irg extends y1 {
    public final String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public irg(String str, rg9 rg9Var) {
        super(rg9Var);
        str.getClass();
        this.f = str;
    }

    @Override // defpackage.y1
    public boolean c() {
        int i = this.b;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = this.f;
            if (i >= str.length()) {
                this.b = i;
                return false;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i;
                return y1.t(cCharAt);
            }
            i++;
        }
    }

    @Override // defpackage.y1
    public final String e() {
        h('\"');
        int i = this.b;
        String str = this.f;
        int iF0 = bsg.F0(str, '\"', i, 4);
        if (iF0 == -1) {
            l();
            int i2 = this.b;
            y1.q(this, ij0.j("Expected quotation mark '\"', but had '", (i2 == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, null, 4);
            throw null;
        }
        for (int i3 = i; i3 < iF0; i3++) {
            if (str.charAt(i3) == '\\') {
                return k(this.b, i3, str);
            }
        }
        this.b = iF0 + 1;
        return str.substring(i, iF0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        r4.b = r3.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        return 10;
     */
    @Override // defpackage.y1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte f() {
        /*
            r4 = this;
            int r0 = r4.b
        L2:
            r1 = -1
            r2 = 10
            java.lang.String r3 = r4.f
            if (r0 == r1) goto L2d
            int r1 = r3.length()
            if (r0 >= r1) goto L2d
            int r1 = r0 + 1
            char r0 = r3.charAt(r0)
            r3 = 32
            if (r0 == r3) goto L2b
            if (r0 == r2) goto L2b
            r2 = 13
            if (r0 == r2) goto L2b
            r2 = 9
            if (r0 != r2) goto L24
            goto L2b
        L24:
            r4.b = r1
            byte r4 = defpackage.oq5.t(r0)
            return r4
        L2b:
            r0 = r1
            goto L2
        L2d:
            int r0 = r3.length()
            r4.b = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.irg.f():byte");
    }

    @Override // defpackage.y1
    public void h(char c) {
        int i = this.b;
        if (i == -1) {
            B(c);
            throw null;
        }
        while (true) {
            String str = this.f;
            if (i >= str.length()) {
                this.b = -1;
                B(c);
                throw null;
            }
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i2;
                if (cCharAt == c) {
                    return;
                }
                B(c);
                throw null;
            }
            i = i2;
        }
    }

    @Override // defpackage.y1
    public final CharSequence s() {
        return this.f;
    }

    @Override // defpackage.y1
    public final String u(String str, boolean z) {
        str.getClass();
        int i = this.b;
        try {
            if (f() == 6 && x44.r(w(z), str)) {
                this.d = null;
                if (f() == 5) {
                    return w(z);
                }
            }
            return null;
        } finally {
            this.b = i;
            this.d = null;
        }
    }

    @Override // defpackage.y1
    public final int x(int i) {
        if (i < this.f.length()) {
            return i;
        }
        return -1;
    }

    @Override // defpackage.y1
    public int y() {
        char cCharAt;
        int i = this.b;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = this.f;
            if (i >= str.length() || !((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i++;
        }
        this.b = i;
        return i;
    }
}
