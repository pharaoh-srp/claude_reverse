package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wtd extends i28 implements aib {
    public int F;
    public int G;
    public int H;
    public xtd I;
    public int J;
    public int K;
    public ytd L;

    public static wtd h() {
        wtd wtdVar = new wtd();
        wtdVar.I = xtd.ERROR;
        wtdVar.L = ytd.LANGUAGE_VERSION;
        return wtdVar;
    }

    @Override // defpackage.i28
    public final b3 c() {
        ztd ztdVarG = g();
        ztdVarG.b();
        return ztdVarG;
    }

    public final Object clone() {
        wtd wtdVarH = h();
        wtdVarH.i(g());
        return wtdVarH;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // defpackage.i28
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.i28 d(defpackage.t34 r2, defpackage.oc7 r3) throws java.lang.Throwable {
        /*
            r1 = this;
            r3 = 0
            jsd r0 = defpackage.ztd.P     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r0.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            ztd r0 = new ztd     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.i(r0)
            return r1
        Lf:
            r2 = move-exception
            goto L19
        L11:
            r2 = move-exception
            b3 r0 = r2.E     // Catch: java.lang.Throwable -> Lf
            ztd r0 = (defpackage.ztd) r0     // Catch: java.lang.Throwable -> Lf
            throw r2     // Catch: java.lang.Throwable -> L17
        L17:
            r2 = move-exception
            r3 = r0
        L19:
            if (r3 == 0) goto L1e
            r1.i(r3)
        L1e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wtd.d(t34, oc7):i28");
    }

    @Override // defpackage.i28
    public final /* bridge */ /* synthetic */ i28 f(u28 u28Var) {
        i((ztd) u28Var);
        return this;
    }

    public final ztd g() {
        ztd ztdVar = new ztd(this);
        int i = this.F;
        int i2 = (i & 1) != 1 ? 0 : 1;
        ztdVar.G = this.G;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ztdVar.H = this.H;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        ztdVar.I = this.I;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        ztdVar.J = this.J;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        ztdVar.K = this.K;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        ztdVar.L = this.L;
        ztdVar.F = i2;
        return ztdVar;
    }

    public final void i(ztd ztdVar) {
        if (ztdVar == ztd.O) {
            return;
        }
        int i = ztdVar.F;
        if ((i & 1) == 1) {
            int i2 = ztdVar.G;
            this.F = 1 | this.F;
            this.G = i2;
        }
        if ((i & 2) == 2) {
            int i3 = ztdVar.H;
            this.F = 2 | this.F;
            this.H = i3;
        }
        if ((i & 4) == 4) {
            xtd xtdVar = ztdVar.I;
            xtdVar.getClass();
            this.F = 4 | this.F;
            this.I = xtdVar;
        }
        int i4 = ztdVar.F;
        if ((i4 & 8) == 8) {
            int i5 = ztdVar.J;
            this.F = 8 | this.F;
            this.J = i5;
        }
        if ((i4 & 16) == 16) {
            int i6 = ztdVar.K;
            this.F = 16 | this.F;
            this.K = i6;
        }
        if ((i4 & 32) == 32) {
            ytd ytdVar = ztdVar.L;
            ytdVar.getClass();
            this.F = 32 | this.F;
            this.L = ytdVar;
        }
        this.E = this.E.b(ztdVar.E);
    }
}
