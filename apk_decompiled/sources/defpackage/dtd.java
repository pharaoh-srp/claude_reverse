package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class dtd extends i28 implements aib {
    public final /* synthetic */ int F;
    public int G;
    public List H;

    public /* synthetic */ dtd(int i) {
        this.F = i;
    }

    public static dtd g() {
        dtd dtdVar = new dtd(1);
        dtdVar.H = n1a.F;
        return dtdVar;
    }

    public static dtd h() {
        dtd dtdVar = new dtd(0);
        dtdVar.H = Collections.EMPTY_LIST;
        return dtdVar;
    }

    @Override // defpackage.i28
    public final b3 c() {
        switch (this.F) {
            case 0:
                htd htdVarI = i();
                if (htdVarI.b()) {
                    return htdVarI;
                }
                throw new UninitializedMessageException();
            default:
                itd itdVarJ = j();
                itdVarJ.b();
                return itdVarJ;
        }
    }

    public final Object clone() {
        switch (this.F) {
            case 0:
                dtd dtdVar = new dtd(0);
                dtdVar.H = Collections.EMPTY_LIST;
                dtdVar.k(i());
                return dtdVar;
            default:
                dtd dtdVar2 = new dtd(1);
                dtdVar2.H = n1a.F;
                dtdVar2.l(j());
                return dtdVar2;
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
            sk9 r4 = defpackage.itd.J     // Catch: java.lang.Throwable -> L14 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L16
            r4.getClass()     // Catch: java.lang.Throwable -> L14 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L16
            itd r4 = new itd     // Catch: java.lang.Throwable -> L14 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L16
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L14 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L16
            r2.l(r4)
            return r2
        L14:
            r3 = move-exception
            goto L1e
        L16:
            r3 = move-exception
            b3 r4 = r3.E     // Catch: java.lang.Throwable -> L14
            itd r4 = (defpackage.itd) r4     // Catch: java.lang.Throwable -> L14
            throw r3     // Catch: java.lang.Throwable -> L1c
        L1c:
            r3 = move-exception
            r1 = r4
        L1e:
            if (r1 == 0) goto L23
            r2.l(r1)
        L23:
            throw r3
        L24:
            sk9 r0 = defpackage.htd.J     // Catch: java.lang.Throwable -> L32 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L34
            r0.getClass()     // Catch: java.lang.Throwable -> L32 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L34
            htd r0 = new htd     // Catch: java.lang.Throwable -> L32 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L34
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L32 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L34
            r2.k(r0)
            return r2
        L32:
            r3 = move-exception
            goto L3c
        L34:
            r3 = move-exception
            b3 r4 = r3.E     // Catch: java.lang.Throwable -> L32
            htd r4 = (defpackage.htd) r4     // Catch: java.lang.Throwable -> L32
            throw r3     // Catch: java.lang.Throwable -> L3a
        L3a:
            r3 = move-exception
            r1 = r4
        L3c:
            if (r1 == 0) goto L41
            r2.k(r1)
        L41:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtd.d(t34, oc7):i28");
    }

    @Override // defpackage.i28
    public final /* bridge */ /* synthetic */ i28 f(u28 u28Var) {
        switch (this.F) {
            case 0:
                k((htd) u28Var);
                break;
            default:
                l((itd) u28Var);
                break;
        }
        return this;
    }

    public htd i() {
        htd htdVar = new htd(this);
        if ((this.G & 1) == 1) {
            this.H = Collections.unmodifiableList(this.H);
            this.G &= -2;
        }
        htdVar.F = this.H;
        return htdVar;
    }

    public itd j() {
        itd itdVar = new itd(this);
        if ((this.G & 1) == 1) {
            this.H = ((t1a) this.H).i();
            this.G &= -2;
        }
        itdVar.F = (t1a) this.H;
        return itdVar;
    }

    public void k(htd htdVar) {
        if (htdVar == htd.I) {
            return;
        }
        if (!htdVar.F.isEmpty()) {
            if (this.H.isEmpty()) {
                this.H = htdVar.F;
                this.G &= -2;
            } else {
                if ((this.G & 1) != 1) {
                    this.H = new ArrayList(this.H);
                    this.G |= 1;
                }
                this.H.addAll(htdVar.F);
            }
        }
        this.E = this.E.b(htdVar.E);
    }

    public void l(itd itdVar) {
        if (itdVar == itd.I) {
            return;
        }
        if (!itdVar.F.isEmpty()) {
            if (((t1a) this.H).isEmpty()) {
                this.H = itdVar.F;
                this.G &= -2;
            } else {
                if ((this.G & 1) != 1) {
                    this.H = new n1a((t1a) this.H);
                    this.G |= 1;
                }
                ((t1a) this.H).addAll(itdVar.F);
            }
        }
        this.E = this.E.b(itdVar.E);
    }
}
