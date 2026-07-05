package defpackage;

import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class jtd extends i28 implements aib {
    public int F;
    public ktd G;
    public ntd H;
    public int I;

    public static jtd g() {
        jtd jtdVar = new jtd();
        jtdVar.G = ktd.INV;
        jtdVar.H = ntd.X;
        return jtdVar;
    }

    @Override // defpackage.i28
    public final b3 c() {
        ltd ltdVarH = h();
        if (ltdVarH.b()) {
            return ltdVarH;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        jtd jtdVar = new jtd();
        jtdVar.G = ktd.INV;
        jtdVar.H = ntd.X;
        jtdVar.i(h());
        return jtdVar;
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
            sk9 r1 = defpackage.ltd.M     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            ltd r1 = new ltd     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            b3 r4 = r3.E     // Catch: java.lang.Throwable -> Lf
            ltd r4 = (defpackage.ltd) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jtd.d(t34, oc7):i28");
    }

    @Override // defpackage.i28
    public final /* bridge */ /* synthetic */ i28 f(u28 u28Var) {
        i((ltd) u28Var);
        return this;
    }

    public final ltd h() {
        ltd ltdVar = new ltd(this);
        int i = this.F;
        int i2 = (i & 1) != 1 ? 0 : 1;
        ltdVar.G = this.G;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ltdVar.H = this.H;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        ltdVar.I = this.I;
        ltdVar.F = i2;
        return ltdVar;
    }

    public final void i(ltd ltdVar) {
        ntd ntdVar;
        if (ltdVar == ltd.L) {
            return;
        }
        if ((ltdVar.F & 1) == 1) {
            ktd ktdVar = ltdVar.G;
            ktdVar.getClass();
            this.F = 1 | this.F;
            this.G = ktdVar;
        }
        if ((ltdVar.F & 2) == 2) {
            ntd ntdVar2 = ltdVar.H;
            if ((this.F & 2) != 2 || (ntdVar = this.H) == ntd.X) {
                this.H = ntdVar2;
            } else {
                mtd mtdVarR = ntd.r(ntdVar);
                mtdVarR.j(ntdVar2);
                this.H = mtdVarR.h();
            }
            this.F |= 2;
        }
        if ((ltdVar.F & 4) == 4) {
            int i = ltdVar.I;
            this.F = 4 | this.F;
            this.I = i;
        }
        this.E = this.E.b(ltdVar.E);
    }
}
