package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class xsd extends p28 {
    public int H;
    public List I;
    public List J;
    public List K;
    public ttd L;
    public aud M;

    public static xsd h() {
        xsd xsdVar = new xsd();
        List list = Collections.EMPTY_LIST;
        xsdVar.I = list;
        xsdVar.J = list;
        xsdVar.K = list;
        xsdVar.L = ttd.K;
        xsdVar.M = aud.I;
        return xsdVar;
    }

    @Override // defpackage.i28
    public final b3 c() {
        ysd ysdVarI = i();
        if (ysdVarI.b()) {
            return ysdVarI;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        xsd xsdVar = new xsd();
        List list = Collections.EMPTY_LIST;
        xsdVar.I = list;
        xsdVar.J = list;
        xsdVar.K = list;
        xsdVar.L = ttd.K;
        xsdVar.M = aud.I;
        xsdVar.j(i());
        return xsdVar;
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
            sk9 r1 = defpackage.ysd.P     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            ysd r1 = new ysd     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r2.j(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            b3 r4 = r3.E     // Catch: java.lang.Throwable -> Lf
            ysd r4 = (defpackage.ysd) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.j(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xsd.d(t34, oc7):i28");
    }

    @Override // defpackage.i28
    public final /* bridge */ /* synthetic */ i28 f(u28 u28Var) {
        j((ysd) u28Var);
        return this;
    }

    public final ysd i() {
        ysd ysdVar = new ysd(this);
        int i = this.H;
        if ((i & 1) == 1) {
            this.I = Collections.unmodifiableList(this.I);
            this.H &= -2;
        }
        ysdVar.H = this.I;
        if ((this.H & 2) == 2) {
            this.J = Collections.unmodifiableList(this.J);
            this.H &= -3;
        }
        ysdVar.I = this.J;
        if ((this.H & 4) == 4) {
            this.K = Collections.unmodifiableList(this.K);
            this.H &= -5;
        }
        ysdVar.J = this.K;
        int i2 = (i & 8) != 8 ? 0 : 1;
        ysdVar.K = this.L;
        if ((i & 16) == 16) {
            i2 |= 2;
        }
        ysdVar.L = this.M;
        ysdVar.G = i2;
        return ysdVar;
    }

    public final void j(ysd ysdVar) {
        aud audVar;
        ttd ttdVar;
        if (ysdVar == ysd.O) {
            return;
        }
        if (!ysdVar.H.isEmpty()) {
            if (this.I.isEmpty()) {
                this.I = ysdVar.H;
                this.H &= -2;
            } else {
                if ((this.H & 1) != 1) {
                    this.I = new ArrayList(this.I);
                    this.H |= 1;
                }
                this.I.addAll(ysdVar.H);
            }
        }
        if (!ysdVar.I.isEmpty()) {
            if (this.J.isEmpty()) {
                this.J = ysdVar.I;
                this.H &= -3;
            } else {
                if ((this.H & 2) != 2) {
                    this.J = new ArrayList(this.J);
                    this.H |= 2;
                }
                this.J.addAll(ysdVar.I);
            }
        }
        if (!ysdVar.J.isEmpty()) {
            if (this.K.isEmpty()) {
                this.K = ysdVar.J;
                this.H &= -5;
            } else {
                if ((this.H & 4) != 4) {
                    this.K = new ArrayList(this.K);
                    this.H |= 4;
                }
                this.K.addAll(ysdVar.J);
            }
        }
        if ((ysdVar.G & 1) == 1) {
            ttd ttdVar2 = ysdVar.K;
            if ((this.H & 8) != 8 || (ttdVar = this.L) == ttd.K) {
                this.L = ttdVar2;
            } else {
                asd asdVarI = ttd.i(ttdVar);
                asdVarI.k(ttdVar2);
                this.L = asdVarI.h();
            }
            this.H |= 8;
        }
        if ((ysdVar.G & 2) == 2) {
            aud audVar2 = ysdVar.L;
            if ((this.H & 16) != 16 || (audVar = this.M) == aud.I) {
                this.M = audVar2;
            } else {
                hsd hsdVar = new hsd(1);
                hsdVar.H = Collections.EMPTY_LIST;
                hsdVar.j(audVar);
                hsdVar.j(audVar2);
                this.M = hsdVar.h();
            }
            this.H |= 16;
        }
        g(ysdVar);
        this.E = this.E.b(ysdVar.F);
    }
}
