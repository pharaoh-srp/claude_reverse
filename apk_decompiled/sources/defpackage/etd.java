package defpackage;

import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class etd extends i28 implements aib {
    public int F;
    public int G;
    public int H;
    public ftd I;

    public static etd g() {
        etd etdVar = new etd();
        etdVar.G = -1;
        etdVar.I = ftd.PACKAGE;
        return etdVar;
    }

    @Override // defpackage.i28
    public final b3 c() {
        gtd gtdVarH = h();
        if (gtdVarH.b()) {
            return gtdVarH;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        etd etdVar = new etd();
        etdVar.G = -1;
        etdVar.I = ftd.PACKAGE;
        etdVar.i(h());
        return etdVar;
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
            sk9 r0 = defpackage.gtd.M     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r0.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            gtd r0 = new gtd     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.i(r0)
            return r1
        Lf:
            r2 = move-exception
            goto L19
        L11:
            r2 = move-exception
            b3 r0 = r2.E     // Catch: java.lang.Throwable -> Lf
            gtd r0 = (defpackage.gtd) r0     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.etd.d(t34, oc7):i28");
    }

    @Override // defpackage.i28
    public final /* bridge */ /* synthetic */ i28 f(u28 u28Var) {
        i((gtd) u28Var);
        return this;
    }

    public final gtd h() {
        gtd gtdVar = new gtd(this);
        int i = this.F;
        int i2 = (i & 1) != 1 ? 0 : 1;
        gtdVar.G = this.G;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        gtdVar.H = this.H;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        gtdVar.I = this.I;
        gtdVar.F = i2;
        return gtdVar;
    }

    public final void i(gtd gtdVar) {
        if (gtdVar == gtd.L) {
            return;
        }
        int i = gtdVar.F;
        if ((i & 1) == 1) {
            int i2 = gtdVar.G;
            this.F = 1 | this.F;
            this.G = i2;
        }
        if ((i & 2) == 2) {
            int i3 = gtdVar.H;
            this.F = 2 | this.F;
            this.H = i3;
        }
        if ((i & 4) == 4) {
            ftd ftdVar = gtdVar.I;
            ftdVar.getClass();
            this.F = 4 | this.F;
            this.I = ftdVar;
        }
        this.E = this.E.b(gtdVar.E);
    }
}
