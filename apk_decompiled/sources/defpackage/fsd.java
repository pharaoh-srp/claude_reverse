package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class fsd extends p28 {
    public int H;
    public int I;
    public List J;
    public List K;

    public static fsd h() {
        fsd fsdVar = new fsd();
        fsdVar.I = 6;
        List list = Collections.EMPTY_LIST;
        fsdVar.J = list;
        fsdVar.K = list;
        return fsdVar;
    }

    @Override // defpackage.i28
    public final b3 c() {
        gsd gsdVarI = i();
        if (gsdVarI.b()) {
            return gsdVarI;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        fsd fsdVar = new fsd();
        fsdVar.I = 6;
        List list = Collections.EMPTY_LIST;
        fsdVar.J = list;
        fsdVar.K = list;
        fsdVar.j(i());
        return fsdVar;
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
            sk9 r1 = defpackage.gsd.N     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            gsd r1 = new gsd     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r2.j(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            b3 r4 = r3.E     // Catch: java.lang.Throwable -> Lf
            gsd r4 = (defpackage.gsd) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fsd.d(t34, oc7):i28");
    }

    @Override // defpackage.i28
    public final /* bridge */ /* synthetic */ i28 f(u28 u28Var) {
        j((gsd) u28Var);
        return this;
    }

    public final gsd i() {
        gsd gsdVar = new gsd(this);
        int i = this.H;
        int i2 = (i & 1) != 1 ? 0 : 1;
        gsdVar.H = this.I;
        if ((i & 2) == 2) {
            this.J = Collections.unmodifiableList(this.J);
            this.H &= -3;
        }
        gsdVar.I = this.J;
        if ((this.H & 4) == 4) {
            this.K = Collections.unmodifiableList(this.K);
            this.H &= -5;
        }
        gsdVar.J = this.K;
        gsdVar.G = i2;
        return gsdVar;
    }

    public final void j(gsd gsdVar) {
        if (gsdVar == gsd.M) {
            return;
        }
        if ((gsdVar.G & 1) == 1) {
            int i = gsdVar.H;
            this.H = 1 | this.H;
            this.I = i;
        }
        if (!gsdVar.I.isEmpty()) {
            if (this.J.isEmpty()) {
                this.J = gsdVar.I;
                this.H &= -3;
            } else {
                if ((this.H & 2) != 2) {
                    this.J = new ArrayList(this.J);
                    this.H |= 2;
                }
                this.J.addAll(gsdVar.I);
            }
        }
        if (!gsdVar.J.isEmpty()) {
            if (this.K.isEmpty()) {
                this.K = gsdVar.J;
                this.H &= -5;
            } else {
                if ((this.H & 4) != 4) {
                    this.K = new ArrayList(this.K);
                    this.H |= 4;
                }
                this.K.addAll(gsdVar.J);
            }
        }
        g(gsdVar);
        this.E = this.E.b(gsdVar.F);
    }
}
