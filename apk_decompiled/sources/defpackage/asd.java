package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes.dex */
public final class asd extends i28 implements aib {
    public final /* synthetic */ int F;
    public int G;
    public List H;
    public int I;

    public /* synthetic */ asd(int i) {
        this.F = i;
    }

    public static asd i() {
        asd asdVar = new asd(1);
        asdVar.H = Collections.EMPTY_LIST;
        asdVar.I = -1;
        return asdVar;
    }

    @Override // defpackage.i28
    public final b3 c() {
        switch (this.F) {
            case 0:
                bsd bsdVarG = g();
                if (bsdVarG.b()) {
                    return bsdVarG;
                }
                throw new UninitializedMessageException();
            default:
                ttd ttdVarH = h();
                if (ttdVarH.b()) {
                    return ttdVarH;
                }
                throw new UninitializedMessageException();
        }
    }

    public final Object clone() {
        switch (this.F) {
            case 0:
                asd asdVar = new asd(0);
                asdVar.H = Collections.EMPTY_LIST;
                asdVar.j(g());
                return asdVar;
            default:
                asd asdVarI = i();
                asdVarI.k(h());
                return asdVarI;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0020  */
    @Override // defpackage.i28
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.i28 d(defpackage.t34 r3, defpackage.oc7 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            int r0 = r2.F
            r1 = 0
            switch(r0) {
                case 0: goto L24;
                default: goto L6;
            }
        L6:
            sk9 r0 = defpackage.ttd.L     // Catch: java.lang.Throwable -> L14 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L16
            r0.getClass()     // Catch: java.lang.Throwable -> L14 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L16
            ttd r0 = new ttd     // Catch: java.lang.Throwable -> L14 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L16
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L14 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L16
            r2.k(r0)
            return r2
        L14:
            r3 = move-exception
            goto L1e
        L16:
            r3 = move-exception
            b3 r4 = r3.E     // Catch: java.lang.Throwable -> L14
            ttd r4 = (defpackage.ttd) r4     // Catch: java.lang.Throwable -> L14
            throw r3     // Catch: java.lang.Throwable -> L1c
        L1c:
            r3 = move-exception
            r1 = r4
        L1e:
            if (r1 == 0) goto L23
            r2.k(r1)
        L23:
            throw r3
        L24:
            sk9 r0 = defpackage.bsd.L     // Catch: java.lang.Throwable -> L30 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L32
            java.lang.Object r3 = r0.b(r3, r4)     // Catch: java.lang.Throwable -> L30 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L32
            bsd r3 = (defpackage.bsd) r3     // Catch: java.lang.Throwable -> L30 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L32
            r2.j(r3)
            return r2
        L30:
            r3 = move-exception
            goto L3a
        L32:
            r3 = move-exception
            b3 r4 = r3.E     // Catch: java.lang.Throwable -> L30
            bsd r4 = (defpackage.bsd) r4     // Catch: java.lang.Throwable -> L30
            throw r3     // Catch: java.lang.Throwable -> L38
        L38:
            r3 = move-exception
            r1 = r4
        L3a:
            if (r1 == 0) goto L3f
            r2.j(r1)
        L3f:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asd.d(t34, oc7):i28");
    }

    @Override // defpackage.i28
    public final /* bridge */ /* synthetic */ i28 f(u28 u28Var) {
        switch (this.F) {
            case 0:
                j((bsd) u28Var);
                break;
            default:
                k((ttd) u28Var);
                break;
        }
        return this;
    }

    public bsd g() {
        bsd bsdVar = new bsd(this);
        int i = this.G;
        int i2 = (i & 1) != 1 ? 0 : 1;
        bsdVar.G = this.I;
        if ((i & 2) == 2) {
            this.H = Collections.unmodifiableList(this.H);
            this.G &= -3;
        }
        bsdVar.H = this.H;
        bsdVar.F = i2;
        return bsdVar;
    }

    public ttd h() {
        ttd ttdVar = new ttd(this);
        int i = this.G;
        if ((i & 1) == 1) {
            this.H = Collections.unmodifiableList(this.H);
            this.G &= -2;
        }
        ttdVar.G = this.H;
        int i2 = (i & 2) != 2 ? 0 : 1;
        ttdVar.H = this.I;
        ttdVar.F = i2;
        return ttdVar;
    }

    public void j(bsd bsdVar) {
        if (bsdVar == bsd.K) {
            return;
        }
        if ((bsdVar.F & 1) == 1) {
            int i = bsdVar.G;
            this.G = 1 | this.G;
            this.I = i;
        }
        if (!bsdVar.H.isEmpty()) {
            if (this.H.isEmpty()) {
                this.H = bsdVar.H;
                this.G &= -3;
            } else {
                if ((this.G & 2) != 2) {
                    this.H = new ArrayList(this.H);
                    this.G |= 2;
                }
                this.H.addAll(bsdVar.H);
            }
        }
        this.E = this.E.b(bsdVar.E);
    }

    public void k(ttd ttdVar) {
        if (ttdVar == ttd.K) {
            return;
        }
        if (!ttdVar.G.isEmpty()) {
            if (this.H.isEmpty()) {
                this.H = ttdVar.G;
                this.G &= -2;
            } else {
                if ((this.G & 1) != 1) {
                    this.H = new ArrayList(this.H);
                    this.G |= 1;
                }
                this.H.addAll(ttdVar.G);
            }
        }
        if ((ttdVar.F & 1) == 1) {
            int i = ttdVar.H;
            this.G |= 2;
            this.I = i;
        }
        this.E = this.E.b(ttdVar.E);
    }
}
