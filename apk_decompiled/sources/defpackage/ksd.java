package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class ksd extends i28 implements aib {
    public int F;
    public lsd G;
    public List H;
    public ssd I;
    public msd J;

    public static ksd h() {
        ksd ksdVar = new ksd();
        ksdVar.G = lsd.RETURNS_CONSTANT;
        ksdVar.H = Collections.EMPTY_LIST;
        ksdVar.I = ssd.P;
        ksdVar.J = msd.AT_MOST_ONCE;
        return ksdVar;
    }

    @Override // defpackage.i28
    public final b3 c() {
        nsd nsdVarG = g();
        if (nsdVarG.b()) {
            return nsdVarG;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        ksd ksdVarH = h();
        ksdVarH.i(g());
        return ksdVarH;
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
            jsd r1 = defpackage.nsd.N     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            nsd r1 = new nsd     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            b3 r4 = r3.E     // Catch: java.lang.Throwable -> Lf
            nsd r4 = (defpackage.nsd) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ksd.d(t34, oc7):i28");
    }

    @Override // defpackage.i28
    public final /* bridge */ /* synthetic */ i28 f(u28 u28Var) {
        i((nsd) u28Var);
        return this;
    }

    public final nsd g() {
        nsd nsdVar = new nsd(this);
        int i = this.F;
        int i2 = (i & 1) != 1 ? 0 : 1;
        nsdVar.G = this.G;
        if ((i & 2) == 2) {
            this.H = Collections.unmodifiableList(this.H);
            this.F &= -3;
        }
        nsdVar.H = this.H;
        if ((i & 4) == 4) {
            i2 |= 2;
        }
        nsdVar.I = this.I;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        nsdVar.J = this.J;
        nsdVar.F = i2;
        return nsdVar;
    }

    public final void i(nsd nsdVar) {
        ssd ssdVar;
        if (nsdVar == nsd.M) {
            return;
        }
        if ((nsdVar.F & 1) == 1) {
            lsd lsdVar = nsdVar.G;
            lsdVar.getClass();
            this.F = 1 | this.F;
            this.G = lsdVar;
        }
        if (!nsdVar.H.isEmpty()) {
            if (this.H.isEmpty()) {
                this.H = nsdVar.H;
                this.F &= -3;
            } else {
                if ((this.F & 2) != 2) {
                    this.H = new ArrayList(this.H);
                    this.F |= 2;
                }
                this.H.addAll(nsdVar.H);
            }
        }
        if ((nsdVar.F & 2) == 2) {
            ssd ssdVar2 = nsdVar.I;
            if ((this.F & 4) != 4 || (ssdVar = this.I) == ssd.P) {
                this.I = ssdVar2;
            } else {
                qsd qsdVarH = qsd.h();
                qsdVarH.i(ssdVar);
                qsdVarH.i(ssdVar2);
                this.I = qsdVarH.g();
            }
            this.F |= 4;
        }
        if ((nsdVar.F & 4) == 4) {
            msd msdVar = nsdVar.J;
            msdVar.getClass();
            this.F |= 8;
            this.J = msdVar;
        }
        this.E = this.E.b(nsdVar.E);
    }
}
