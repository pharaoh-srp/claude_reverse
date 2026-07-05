package defpackage;

import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class osd extends p28 {
    public int H;
    public int I;

    public static osd h() {
        return new osd();
    }

    @Override // defpackage.i28
    public final b3 c() {
        psd psdVar = new psd(this);
        int i = (this.H & 1) != 1 ? 0 : 1;
        psdVar.H = this.I;
        psdVar.G = i;
        if (psdVar.b()) {
            return psdVar;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        osd osdVar = new osd();
        psd psdVar = new psd(this);
        int i = (this.H & 1) != 1 ? 0 : 1;
        psdVar.H = this.I;
        psdVar.G = i;
        osdVar.i(psdVar);
        return osdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // defpackage.i28
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.i28 d(defpackage.t34 r3, defpackage.oc7 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            sk9 r1 = defpackage.psd.L     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            psd r1 = new psd     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            b3 r4 = r3.E     // Catch: java.lang.Throwable -> Lf
            psd r4 = (defpackage.psd) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.i(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.osd.d(t34, oc7):i28");
    }

    @Override // defpackage.i28
    public final /* bridge */ /* synthetic */ i28 f(u28 u28Var) {
        i((psd) u28Var);
        return this;
    }

    public final void i(psd psdVar) {
        if (psdVar == psd.K) {
            return;
        }
        if ((psdVar.G & 1) == 1) {
            int i = psdVar.H;
            this.H = 1 | this.H;
            this.I = i;
        }
        g(psdVar);
        this.E = this.E.b(psdVar.F);
    }
}
