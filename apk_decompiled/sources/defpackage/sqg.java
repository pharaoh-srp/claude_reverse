package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes.dex */
public final class sqg extends xn5 implements zg9 {
    public final bg9 f;
    public final qij g;
    public final y1 h;
    public final fof i;
    public int j;
    public r4d k;
    public final rg9 l;
    public final dh9 m;

    public sqg(bg9 bg9Var, qij qijVar, y1 y1Var, SerialDescriptor serialDescriptor, r4d r4dVar) {
        bg9Var.getClass();
        serialDescriptor.getClass();
        this.f = bg9Var;
        this.g = qijVar;
        this.h = y1Var;
        this.i = bg9Var.b;
        this.j = -1;
        this.k = r4dVar;
        rg9 rg9Var = bg9Var.a;
        this.l = rg9Var;
        this.m = rg9Var.f ? null : new dh9(serialDescriptor);
    }

    @Override // defpackage.xn5, kotlinx.serialization.encoding.Decoder
    public final byte A() {
        y1 y1Var = this.h;
        long jI = y1Var.i();
        byte b = (byte) jI;
        if (jI == b) {
            return b;
        }
        y1.q(y1Var, "Failed to parse byte for input '" + jI + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.xn5, kotlinx.serialization.encoding.Decoder
    public final short B() {
        y1 y1Var = this.h;
        long jI = y1Var.i();
        short s = (short) jI;
        if (jI == s) {
            return s;
        }
        y1.q(y1Var, "Failed to parse short for input '" + jI + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.xn5, kotlinx.serialization.encoding.Decoder
    public final float C() {
        y1 y1Var = this.h;
        String strL = y1Var.l();
        try {
            float f = Float.parseFloat(strL);
            rg9 rg9Var = this.f.a;
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            y1.q(y1Var, j8.W(Float.valueOf(f), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            y1.q(y1Var, grc.n('\'', "Failed to parse type 'float' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.xn5, kotlinx.serialization.encoding.Decoder
    public final double E() {
        y1 y1Var = this.h;
        String strL = y1Var.l();
        try {
            double d = Double.parseDouble(strL);
            rg9 rg9Var = this.f.a;
            if (Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            y1.q(y1Var, j8.W(Double.valueOf(d), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            y1.q(y1Var, grc.n('\'', "Failed to parse type 'double' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder, defpackage.ud4
    public final fof a() {
        return this.i;
    }

    @Override // defpackage.xn5, defpackage.ud4
    public final void b(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        int iE = serialDescriptor.e();
        bg9 bg9Var = this.f;
        if (iE == 0 && nh9.c(bg9Var, serialDescriptor)) {
            while (x(serialDescriptor) != -1) {
            }
        }
        y1 y1Var = this.h;
        if (y1Var.A()) {
            rg9 rg9Var = bg9Var.a;
            j8.R(y1Var, "");
            throw null;
        }
        y1Var.h(this.g.F);
        zu2 zu2Var = y1Var.c;
        int i = zu2Var.F;
        int[] iArr = (int[]) zu2Var.I;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            zu2Var.F = i - 1;
        }
        int i2 = zu2Var.F;
        if (i2 != -1) {
            zu2Var.F = i2 - 1;
        }
    }

    @Override // defpackage.xn5, kotlinx.serialization.encoding.Decoder
    public final ud4 c(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        bg9 bg9Var = this.f;
        qij qijVarC = rij.c(bg9Var, serialDescriptor);
        y1 y1Var = this.h;
        zu2 zu2Var = y1Var.c;
        zu2Var.getClass();
        int i = zu2Var.F + 1;
        zu2Var.F = i;
        if (i == ((Object[]) zu2Var.H).length) {
            zu2Var.m();
        }
        ((Object[]) zu2Var.H)[i] = serialDescriptor;
        y1Var.h(qijVarC.E);
        if (y1Var.v() != 4) {
            int iOrdinal = qijVarC.ordinal();
            return (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) ? new sqg(this.f, qijVarC, y1Var, serialDescriptor, this.k) : (this.g == qijVarC && bg9Var.a.f) ? this : new sqg(this.f, qijVarC, y1Var, serialDescriptor, this.k);
        }
        y1.q(y1Var, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    @Override // defpackage.zg9
    public final bg9 d() {
        return this.f;
    }

    @Override // defpackage.xn5, kotlinx.serialization.encoding.Decoder
    public final boolean f() {
        boolean z;
        boolean z2;
        y1 y1Var = this.h;
        int iY = y1Var.y();
        if (iY == y1Var.s().length()) {
            y1.q(y1Var, "EOF", 0, null, 6);
            throw null;
        }
        if (y1Var.s().charAt(iY) == '\"') {
            iY++;
            z = true;
        } else {
            z = false;
        }
        int iX = y1Var.x(iY);
        if (iX >= y1Var.s().length() || iX == -1) {
            y1.q(y1Var, "EOF", 0, null, 6);
            throw null;
        }
        int i = iX + 1;
        int iCharAt = y1Var.s().charAt(iX) | ' ';
        if (iCharAt == 102) {
            y1Var.d(i, "alse");
            z2 = false;
        } else {
            if (iCharAt != 116) {
                y1.q(y1Var, "Expected valid boolean literal prefix, but had '" + y1Var.l() + '\'', 0, null, 6);
                throw null;
            }
            y1Var.d(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (y1Var.b == y1Var.s().length()) {
            y1.q(y1Var, "EOF", 0, null, 6);
            throw null;
        }
        if (y1Var.s().charAt(y1Var.b) == '\"') {
            y1Var.b++;
            return z2;
        }
        y1.q(y1Var, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0149  */
    @Override // kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.s06 r11) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sqg.g(s06):java.lang.Object");
    }

    @Override // defpackage.xn5, kotlinx.serialization.encoding.Decoder
    public final char h() {
        y1 y1Var = this.h;
        String strL = y1Var.l();
        if (strL.length() == 1) {
            return strL.charAt(0);
        }
        y1.q(y1Var, grc.n('\'', "Expected single char, but got '", strL), 0, null, 6);
        throw null;
    }

    @Override // defpackage.xn5, kotlinx.serialization.encoding.Decoder
    public final int i(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return nh9.b(serialDescriptor, this.f, s(), " at path ".concat(this.h.c.l()));
    }

    @Override // defpackage.xn5, defpackage.ud4
    public final Object l(SerialDescriptor serialDescriptor, int i, s06 s06Var, Object obj) {
        zu2 zu2Var = this.h.c;
        serialDescriptor.getClass();
        s06Var.getClass();
        boolean z = this.g == qij.I && (i & 1) == 0;
        if (z) {
            int[] iArr = (int[]) zu2Var.I;
            int i2 = zu2Var.F;
            if (iArr[i2] == -2) {
                ((Object[]) zu2Var.H)[i2] = ql8.I;
            }
        }
        Object objG = g(s06Var);
        if (z) {
            int[] iArr2 = (int[]) zu2Var.I;
            int i3 = zu2Var.F;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                zu2Var.F = i4;
                if (i4 == ((Object[]) zu2Var.H).length) {
                    zu2Var.m();
                }
            }
            Object[] objArr = (Object[]) zu2Var.H;
            int i5 = zu2Var.F;
            objArr[i5] = ((rg9) zu2Var.G).k ? objG : pyk.M;
            ((int[]) zu2Var.I)[i5] = -2;
        }
        return objG;
    }

    @Override // defpackage.zg9
    public final JsonElement n() {
        return new aj9(this.f.a, this.h).b();
    }

    @Override // defpackage.xn5, kotlinx.serialization.encoding.Decoder
    public final int p() {
        y1 y1Var = this.h;
        long jI = y1Var.i();
        int i = (int) jI;
        if (jI == i) {
            return i;
        }
        y1.q(y1Var, "Failed to parse int for input '" + jI + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.xn5, kotlinx.serialization.encoding.Decoder
    public final String s() {
        boolean z = this.l.c;
        y1 y1Var = this.h;
        return z ? y1Var.m() : y1Var.j();
    }

    @Override // defpackage.xn5, kotlinx.serialization.encoding.Decoder
    public final long t() {
        return this.h.i();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005a A[RETURN] */
    @Override // defpackage.xn5, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean w() {
        /*
            r9 = this;
            r0 = 0
            dh9 r1 = r9.m
            if (r1 == 0) goto L8
            boolean r1 = r1.b
            goto L9
        L8:
            r1 = r0
        L9:
            if (r1 != 0) goto L5b
            y1 r9 = r9.h
            int r1 = r9.y()
            int r1 = r9.x(r1)
            java.lang.CharSequence r2 = r9.s()
            int r2 = r2.length()
            int r2 = r2 - r1
            r3 = 1
            r4 = 4
            if (r2 < r4) goto L57
            r5 = -1
            if (r1 != r5) goto L26
            goto L57
        L26:
            r5 = r0
        L27:
            if (r5 >= r4) goto L3f
            java.lang.String r6 = "null"
            char r6 = r6.charAt(r5)
            java.lang.CharSequence r7 = r9.s()
            int r8 = r1 + r5
            char r7 = r7.charAt(r8)
            if (r6 == r7) goto L3c
            goto L57
        L3c:
            int r5 = r5 + 1
            goto L27
        L3f:
            if (r2 <= r4) goto L52
            java.lang.CharSequence r2 = r9.s()
            int r5 = r1 + 4
            char r2 = r2.charAt(r5)
            byte r2 = defpackage.oq5.t(r2)
            if (r2 != 0) goto L52
            goto L57
        L52:
            int r1 = r1 + r4
            r9.b = r1
            r9 = r3
            goto L58
        L57:
            r9 = r0
        L58:
            if (r9 != 0) goto L5b
            return r3
        L5b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sqg.w():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ca, code lost:
    
        r12 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f4, code lost:
    
        r0 = r3.F;
        r1 = (int[]) r3.I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00fd, code lost:
    
        if (r1[r0] != (-2)) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ff, code lost:
    
        r1[r0] = -1;
        r3.F = r0 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0104, code lost:
    
        r0 = r3.F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0106, code lost:
    
        if (r0 == (-1)) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0108, code lost:
    
        r3.F = r0 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x010b, code lost:
    
        r2.p(defpackage.grc.n('\'', "Encountered an unknown key '", r5), defpackage.bsg.L0(r2.z(0, r2.b), 6, r5), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0123, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ud4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int x(kotlinx.serialization.descriptors.SerialDescriptor r21) {
        /*
            Method dump skipped, instruction units count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sqg.x(kotlinx.serialization.descriptors.SerialDescriptor):int");
    }

    @Override // defpackage.xn5, kotlinx.serialization.encoding.Decoder
    public final Decoder y(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return uqg.a(serialDescriptor) ? new ah9(this.h, this.f) : this;
    }
}
