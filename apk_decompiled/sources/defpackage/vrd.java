package defpackage;

import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class vrd extends i28 implements aib {
    public int F;
    public int G;
    public yrd H;

    public static vrd g() {
        vrd vrdVar = new vrd();
        vrdVar.H = yrd.T;
        return vrdVar;
    }

    @Override // defpackage.i28
    public final b3 c() {
        zrd zrdVarH = h();
        if (zrdVarH.b()) {
            return zrdVarH;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        vrd vrdVar = new vrd();
        vrdVar.H = yrd.T;
        vrdVar.i(h());
        return vrdVar;
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
            sk9 r1 = defpackage.zrd.L     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            zrd r1 = new zrd     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            b3 r4 = r3.E     // Catch: java.lang.Throwable -> Lf
            zrd r4 = (defpackage.zrd) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vrd.d(t34, oc7):i28");
    }

    @Override // defpackage.i28
    public final /* bridge */ /* synthetic */ i28 f(u28 u28Var) {
        i((zrd) u28Var);
        return this;
    }

    public final zrd h() {
        zrd zrdVar = new zrd(this);
        int i = this.F;
        int i2 = (i & 1) != 1 ? 0 : 1;
        zrdVar.G = this.G;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        zrdVar.H = this.H;
        zrdVar.F = i2;
        return zrdVar;
    }

    public final void i(zrd zrdVar) {
        yrd yrdVar;
        if (zrdVar == zrd.K) {
            return;
        }
        int i = zrdVar.F;
        if ((i & 1) == 1) {
            int i2 = zrdVar.G;
            this.F = 1 | this.F;
            this.G = i2;
        }
        if ((i & 2) == 2) {
            yrd yrdVar2 = zrdVar.H;
            if ((this.F & 2) != 2 || (yrdVar = this.H) == yrd.T) {
                this.H = yrdVar2;
            } else {
                wrd wrdVarH = wrd.h();
                wrdVarH.i(yrdVar);
                wrdVarH.i(yrdVar2);
                this.H = wrdVarH.g();
            }
            this.F |= 2;
        }
        this.E = this.E.b(zrdVar.E);
    }
}
