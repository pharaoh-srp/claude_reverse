package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class zsd extends p28 {
    public int H;
    public itd I;
    public htd J;
    public ysd K;
    public List L;

    public static zsd h() {
        zsd zsdVar = new zsd();
        zsdVar.I = itd.I;
        zsdVar.J = htd.I;
        zsdVar.K = ysd.O;
        zsdVar.L = Collections.EMPTY_LIST;
        return zsdVar;
    }

    @Override // defpackage.i28
    public final b3 c() {
        atd atdVarI = i();
        if (atdVarI.b()) {
            return atdVarI;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        zsd zsdVar = new zsd();
        zsdVar.I = itd.I;
        zsdVar.J = htd.I;
        zsdVar.K = ysd.O;
        zsdVar.L = Collections.EMPTY_LIST;
        zsdVar.j(i());
        return zsdVar;
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
            sk9 r1 = defpackage.atd.O     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            atd r1 = new atd     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r2.j(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            b3 r4 = r3.E     // Catch: java.lang.Throwable -> Lf
            atd r4 = (defpackage.atd) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zsd.d(t34, oc7):i28");
    }

    @Override // defpackage.i28
    public final /* bridge */ /* synthetic */ i28 f(u28 u28Var) {
        j((atd) u28Var);
        return this;
    }

    public final atd i() {
        atd atdVar = new atd(this);
        int i = this.H;
        int i2 = (i & 1) != 1 ? 0 : 1;
        atdVar.H = this.I;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        atdVar.I = this.J;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        atdVar.J = this.K;
        if ((i & 8) == 8) {
            this.L = Collections.unmodifiableList(this.L);
            this.H &= -9;
        }
        atdVar.K = this.L;
        atdVar.G = i2;
        return atdVar;
    }

    public final void j(atd atdVar) {
        ysd ysdVar;
        htd htdVar;
        itd itdVar;
        if (atdVar == atd.N) {
            return;
        }
        if ((atdVar.G & 1) == 1) {
            itd itdVar2 = atdVar.H;
            if ((this.H & 1) != 1 || (itdVar = this.I) == itd.I) {
                this.I = itdVar2;
            } else {
                dtd dtdVarG = dtd.g();
                dtdVarG.l(itdVar);
                dtdVarG.l(itdVar2);
                this.I = dtdVarG.j();
            }
            this.H |= 1;
        }
        if ((atdVar.G & 2) == 2) {
            htd htdVar2 = atdVar.I;
            if ((this.H & 2) != 2 || (htdVar = this.J) == htd.I) {
                this.J = htdVar2;
            } else {
                dtd dtdVarH = dtd.h();
                dtdVarH.k(htdVar);
                dtdVarH.k(htdVar2);
                this.J = dtdVarH.i();
            }
            this.H |= 2;
        }
        if ((atdVar.G & 4) == 4) {
            ysd ysdVar2 = atdVar.J;
            if ((this.H & 4) != 4 || (ysdVar = this.K) == ysd.O) {
                this.K = ysdVar2;
            } else {
                xsd xsdVarH = xsd.h();
                xsdVarH.j(ysdVar);
                xsdVarH.j(ysdVar2);
                this.K = xsdVarH.i();
            }
            this.H |= 4;
        }
        if (!atdVar.K.isEmpty()) {
            if (this.L.isEmpty()) {
                this.L = atdVar.K;
                this.H &= -9;
            } else {
                if ((this.H & 8) != 8) {
                    this.L = new ArrayList(this.L);
                    this.H |= 8;
                }
                this.L.addAll(atdVar.K);
            }
        }
        g(atdVar);
        this.E = this.E.b(atdVar.F);
    }
}
