package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes.dex */
public final class hsd extends i28 implements aib {
    public final /* synthetic */ int F;
    public int G;
    public List H;

    public /* synthetic */ hsd(int i) {
        this.F = i;
    }

    @Override // defpackage.i28
    public final b3 c() {
        switch (this.F) {
            case 0:
                isd isdVarG = g();
                if (isdVarG.b()) {
                    return isdVarG;
                }
                throw new UninitializedMessageException();
            default:
                aud audVarH = h();
                audVarH.b();
                return audVarH;
        }
    }

    public final Object clone() {
        switch (this.F) {
            case 0:
                hsd hsdVar = new hsd(0);
                hsdVar.H = Collections.EMPTY_LIST;
                hsdVar.i(g());
                return hsdVar;
            default:
                hsd hsdVar2 = new hsd(1);
                hsdVar2.H = Collections.EMPTY_LIST;
                hsdVar2.j(h());
                return hsdVar2;
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
            sk9 r0 = defpackage.aud.J     // Catch: java.lang.Throwable -> L14 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L16
            r0.getClass()     // Catch: java.lang.Throwable -> L14 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L16
            aud r0 = new aud     // Catch: java.lang.Throwable -> L14 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L16
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L14 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L16
            r2.j(r0)
            return r2
        L14:
            r3 = move-exception
            goto L1e
        L16:
            r3 = move-exception
            b3 r4 = r3.E     // Catch: java.lang.Throwable -> L14
            aud r4 = (defpackage.aud) r4     // Catch: java.lang.Throwable -> L14
            throw r3     // Catch: java.lang.Throwable -> L1c
        L1c:
            r3 = move-exception
            r1 = r4
        L1e:
            if (r1 == 0) goto L23
            r2.j(r1)
        L23:
            throw r3
        L24:
            sk9 r0 = defpackage.isd.J     // Catch: java.lang.Throwable -> L32 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L34
            r0.getClass()     // Catch: java.lang.Throwable -> L32 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L34
            isd r0 = new isd     // Catch: java.lang.Throwable -> L32 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L34
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L32 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L34
            r2.i(r0)
            return r2
        L32:
            r3 = move-exception
            goto L3c
        L34:
            r3 = move-exception
            b3 r4 = r3.E     // Catch: java.lang.Throwable -> L32
            isd r4 = (defpackage.isd) r4     // Catch: java.lang.Throwable -> L32
            throw r3     // Catch: java.lang.Throwable -> L3a
        L3a:
            r3 = move-exception
            r1 = r4
        L3c:
            if (r1 == 0) goto L41
            r2.i(r1)
        L41:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hsd.d(t34, oc7):i28");
    }

    @Override // defpackage.i28
    public final /* bridge */ /* synthetic */ i28 f(u28 u28Var) {
        switch (this.F) {
            case 0:
                i((isd) u28Var);
                break;
            default:
                j((aud) u28Var);
                break;
        }
        return this;
    }

    public isd g() {
        isd isdVar = new isd(this);
        if ((this.G & 1) == 1) {
            this.H = Collections.unmodifiableList(this.H);
            this.G &= -2;
        }
        isdVar.F = this.H;
        return isdVar;
    }

    public aud h() {
        aud audVar = new aud(this);
        if ((this.G & 1) == 1) {
            this.H = Collections.unmodifiableList(this.H);
            this.G &= -2;
        }
        audVar.F = this.H;
        return audVar;
    }

    public void i(isd isdVar) {
        if (isdVar == isd.I) {
            return;
        }
        if (!isdVar.F.isEmpty()) {
            if (this.H.isEmpty()) {
                this.H = isdVar.F;
                this.G &= -2;
            } else {
                if ((this.G & 1) != 1) {
                    this.H = new ArrayList(this.H);
                    this.G |= 1;
                }
                this.H.addAll(isdVar.F);
            }
        }
        this.E = this.E.b(isdVar.E);
    }

    public void j(aud audVar) {
        if (audVar == aud.I) {
            return;
        }
        if (!audVar.F.isEmpty()) {
            if (this.H.isEmpty()) {
                this.H = audVar.F;
                this.G &= -2;
            } else {
                if ((this.G & 1) != 1) {
                    this.H = new ArrayList(this.H);
                    this.G |= 1;
                }
                this.H.addAll(audVar.F);
            }
        }
        this.E = this.E.b(audVar.E);
    }
}
