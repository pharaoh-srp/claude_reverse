package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes.dex */
public final class wrd extends i28 implements aib {
    public int F;
    public xrd G;
    public long H;
    public float I;
    public double J;
    public int K;
    public int L;
    public int M;
    public bsd N;
    public List O;
    public int P;
    public int Q;

    public static wrd h() {
        wrd wrdVar = new wrd();
        wrdVar.G = xrd.BYTE;
        wrdVar.N = bsd.K;
        wrdVar.O = Collections.EMPTY_LIST;
        return wrdVar;
    }

    @Override // defpackage.i28
    public final b3 c() {
        yrd yrdVarG = g();
        if (yrdVarG.b()) {
            return yrdVarG;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        wrd wrdVarH = h();
        wrdVarH.i(g());
        return wrdVarH;
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
            sk9 r1 = defpackage.yrd.U     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            yrd r1 = new yrd     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            b3 r4 = r3.E     // Catch: java.lang.Throwable -> Lf
            yrd r4 = (defpackage.yrd) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wrd.d(t34, oc7):i28");
    }

    @Override // defpackage.i28
    public final /* bridge */ /* synthetic */ i28 f(u28 u28Var) {
        i((yrd) u28Var);
        return this;
    }

    public final yrd g() {
        yrd yrdVar = new yrd(this);
        int i = this.F;
        int i2 = (i & 1) != 1 ? 0 : 1;
        yrdVar.G = this.G;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        yrdVar.H = this.H;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        yrdVar.I = this.I;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        yrdVar.J = this.J;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        yrdVar.K = this.K;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        yrdVar.L = this.L;
        if ((i & 64) == 64) {
            i2 |= 64;
        }
        yrdVar.M = this.M;
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 128) {
            i2 |= FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        yrdVar.N = this.N;
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 256) {
            this.O = Collections.unmodifiableList(this.O);
            this.F &= -257;
        }
        yrdVar.O = this.O;
        if ((i & 512) == 512) {
            i2 |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
        }
        yrdVar.P = this.P;
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 1024) {
            i2 |= 512;
        }
        yrdVar.Q = this.Q;
        yrdVar.F = i2;
        return yrdVar;
    }

    public final void i(yrd yrdVar) {
        bsd bsdVar;
        if (yrdVar == yrd.T) {
            return;
        }
        if ((yrdVar.F & 1) == 1) {
            xrd xrdVar = yrdVar.G;
            xrdVar.getClass();
            this.F = 1 | this.F;
            this.G = xrdVar;
        }
        int i = yrdVar.F;
        if ((i & 2) == 2) {
            long j = yrdVar.H;
            this.F |= 2;
            this.H = j;
        }
        if ((i & 4) == 4) {
            float f = yrdVar.I;
            this.F = 4 | this.F;
            this.I = f;
        }
        if ((i & 8) == 8) {
            double d = yrdVar.J;
            this.F |= 8;
            this.J = d;
        }
        if ((i & 16) == 16) {
            int i2 = yrdVar.K;
            this.F = 16 | this.F;
            this.K = i2;
        }
        if ((i & 32) == 32) {
            int i3 = yrdVar.L;
            this.F = 32 | this.F;
            this.L = i3;
        }
        if ((i & 64) == 64) {
            int i4 = yrdVar.M;
            this.F = 64 | this.F;
            this.M = i4;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 128) {
            bsd bsdVar2 = yrdVar.N;
            if ((this.F & FreeTypeConstants.FT_LOAD_PEDANTIC) != 128 || (bsdVar = this.N) == bsd.K) {
                this.N = bsdVar2;
            } else {
                asd asdVar = new asd(0);
                asdVar.H = Collections.EMPTY_LIST;
                asdVar.j(bsdVar);
                asdVar.j(bsdVar2);
                this.N = asdVar.g();
            }
            this.F |= FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (!yrdVar.O.isEmpty()) {
            if (this.O.isEmpty()) {
                this.O = yrdVar.O;
                this.F &= -257;
            } else {
                if ((this.F & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 256) {
                    this.O = new ArrayList(this.O);
                    this.F |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                }
                this.O.addAll(yrdVar.O);
            }
        }
        int i5 = yrdVar.F;
        if ((i5 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 256) {
            int i6 = yrdVar.P;
            this.F |= 512;
            this.P = i6;
        }
        if ((i5 & 512) == 512) {
            int i7 = yrdVar.Q;
            this.F |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
            this.Q = i7;
        }
        this.E = this.E.b(yrdVar.E);
    }
}
