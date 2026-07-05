package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import androidx.media3.extractor.text.SubtitleDecoderException;
import io.sentry.e0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class mkh extends pe1 implements Handler.Callback {
    public final bm4 W;
    public final ro5 X;
    public gd5 Y;
    public final zwg Z;
    public boolean a0;
    public int b0;
    public ywg c0;
    public axg d0;
    public gg2 e0;
    public gg2 f0;
    public int g0;
    public final Handler h0;
    public final r77 i0;
    public final qb5 j0;
    public boolean k0;
    public boolean l0;
    public jw7 m0;
    public long n0;
    public long o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mkh(r77 r77Var, Looper looper) {
        super(3);
        fnf fnfVar = zwg.p;
        this.i0 = r77Var;
        this.h0 = looper == null ? null : new Handler(looper, this);
        this.Z = fnfVar;
        this.W = new bm4();
        this.X = new ro5(1);
        this.j0 = new qb5();
        this.o0 = -9223372036854775807L;
        this.n0 = -9223372036854775807L;
    }

    @Override // defpackage.pe1
    public final int D(jw7 jw7Var) {
        boolean zEquals = Objects.equals(jw7Var.o, "application/x-media3-cues");
        String str = jw7Var.o;
        if (!zEquals) {
            fnf fnfVar = (fnf) this.Z;
            fnfVar.getClass();
            if (!((bm4) fnfVar.F).a(jw7Var) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                return gkb.i(str) ? pe1.f(1, 0, 0, 0) : pe1.f(0, 0, 0, 0);
            }
        }
        return pe1.f(jw7Var.P == 0 ? 4 : 2, 0, 0, 0);
    }

    public final void G() {
        boolean z = Objects.equals(this.m0.o, "application/cea-608") || Objects.equals(this.m0.o, "application/x-mp4-cea-608") || Objects.equals(this.m0.o, "application/cea-708");
        String str = this.m0.o;
        if (z) {
            return;
        }
        sz6.j(iik.g("Legacy decoding is disabled, can't handle %s samples (expected %s).", str, "application/x-media3-cues"));
    }

    public final long H() {
        if (this.g0 == -1) {
            return Long.MAX_VALUE;
        }
        this.e0.getClass();
        if (this.g0 >= this.e0.l()) {
            return Long.MAX_VALUE;
        }
        return this.e0.g(this.g0);
    }

    public final long I(long j) {
        fd9.M(j != -9223372036854775807L);
        return j - this.O;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J() {
        /*
            r7 = this;
            r0 = 1
            r7.a0 = r0
            jw7 r1 = r7.m0
            r1.getClass()
            zwg r2 = r7.Z
            fnf r2 = (defpackage.fnf) r2
            java.lang.Object r2 = r2.F
            bm4 r2 = (defpackage.bm4) r2
            java.lang.String r3 = r1.o
            int r4 = r1.L
            if (r3 == 0) goto L50
            int r5 = r3.hashCode()
            r6 = -1
            switch(r5) {
                case 930165504: goto L34;
                case 1566015601: goto L2b;
                case 1566016562: goto L20;
                default: goto L1e;
            }
        L1e:
            r0 = r6
            goto L3e
        L20:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L29
            goto L1e
        L29:
            r0 = 2
            goto L3e
        L2b:
            java.lang.String r5 = "application/cea-608"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L3e
            goto L1e
        L34:
            java.lang.String r0 = "application/x-mp4-cea-608"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3d
            goto L1e
        L3d:
            r0 = 0
        L3e:
            switch(r0) {
                case 0: goto L4a;
                case 1: goto L4a;
                case 2: goto L42;
                default: goto L41;
            }
        L41:
            goto L50
        L42:
            eg2 r0 = new eg2
            java.util.List r1 = r1.r
            r0.<init>(r4, r1)
            goto L6d
        L4a:
            ag2 r0 = new ag2
            r0.<init>(r3, r4)
            goto L6d
        L50:
            boolean r0 = r2.a(r1)
            if (r0 == 0) goto L75
            dxg r0 = r2.c(r1)
            gx5 r1 = new gx5
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r3 = "Decoder"
            r2.concat(r3)
            r1.<init>(r0)
            r0 = r1
        L6d:
            r7.c0 = r0
            long r1 = r7.P
            r0.b(r1)
            return
        L75:
            java.lang.String r7 = "Attempted to create decoder for unsupported MIME type: "
            java.lang.String r7 = defpackage.ij0.i(r7, r3)
            defpackage.sz6.p(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mkh.J():void");
    }

    public final void K(fd5 fd5Var) {
        vde vdeVar = fd5Var.a;
        r77 r77Var = this.i0;
        r77Var.E.m.e(27, new do0(22, vdeVar));
        r77Var.E.m.e(27, new do0(19, fd5Var));
    }

    public final void L() {
        this.d0 = null;
        this.g0 = -1;
        gg2 gg2Var = this.e0;
        if (gg2Var != null) {
            gg2Var.f();
            this.e0 = null;
        }
        gg2 gg2Var2 = this.f0;
        if (gg2Var2 != null) {
            gg2Var2.f();
            this.f0 = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            K((fd5) message.obj);
            return true;
        }
        e0.b();
        return false;
    }

    @Override // defpackage.pe1
    public final String k() {
        return "TextRenderer";
    }

    @Override // defpackage.pe1
    public final boolean m() {
        return this.l0;
    }

    @Override // defpackage.pe1
    public final boolean o() {
        jw7 jw7Var = this.m0;
        if (jw7Var != null) {
            if (Objects.equals(jw7Var.o, "application/x-media3-cues")) {
                gd5 gd5Var = this.Y;
                gd5Var.getClass();
                if (gd5Var.a(this.n0) == Long.MIN_VALUE) {
                    try {
                        b4f b4fVar = this.M;
                        b4fVar.getClass();
                        b4fVar.g();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else {
                if (this.l0) {
                    return false;
                }
                if (this.k0) {
                    gg2 gg2Var = this.e0;
                    long j = this.n0;
                    if (gg2Var == null || gg2Var.l() <= 0 || gg2Var.g(gg2Var.l() - 1) <= j) {
                        gg2 gg2Var2 = this.f0;
                        long j2 = this.n0;
                        if ((gg2Var2 == null || gg2Var2.l() <= 0 || gg2Var2.g(gg2Var2.l() - 1) <= j2) && this.d0 != null) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // defpackage.pe1
    public final void p() {
        this.m0 = null;
        this.o0 = -9223372036854775807L;
        vde vdeVar = vde.I;
        I(this.n0);
        fd5 fd5Var = new fd5(vdeVar);
        Handler handler = this.h0;
        if (handler != null) {
            handler.obtainMessage(1, fd5Var).sendToTarget();
        } else {
            K(fd5Var);
        }
        this.n0 = -9223372036854775807L;
        if (this.c0 != null) {
            L();
            ywg ywgVar = this.c0;
            ywgVar.getClass();
            ywgVar.a();
            this.c0 = null;
            this.b0 = 0;
        }
    }

    @Override // defpackage.pe1
    public final void r(long j, boolean z, boolean z2) {
        this.n0 = j;
        gd5 gd5Var = this.Y;
        if (gd5Var != null) {
            gd5Var.clear();
        }
        vde vdeVar = vde.I;
        I(this.n0);
        fd5 fd5Var = new fd5(vdeVar);
        Handler handler = this.h0;
        if (handler != null) {
            handler.obtainMessage(1, fd5Var).sendToTarget();
        } else {
            K(fd5Var);
        }
        this.k0 = false;
        this.l0 = false;
        this.o0 = -9223372036854775807L;
        jw7 jw7Var = this.m0;
        if (jw7Var == null || Objects.equals(jw7Var.o, "application/x-media3-cues")) {
            return;
        }
        if (this.b0 == 0) {
            L();
            ywg ywgVar = this.c0;
            ywgVar.getClass();
            ywgVar.flush();
            ywgVar.b(this.P);
            return;
        }
        L();
        ywg ywgVar2 = this.c0;
        ywgVar2.getClass();
        ywgVar2.a();
        this.c0 = null;
        this.b0 = 0;
        J();
    }

    @Override // defpackage.pe1
    public final void w(jw7[] jw7VarArr, long j, long j2, z7b z7bVar) {
        jw7 jw7Var = jw7VarArr[0];
        this.m0 = jw7Var;
        if (Objects.equals(jw7Var.o, "application/x-media3-cues")) {
            this.Y = this.m0.M == 1 ? new feb() : new dn0(2);
            return;
        }
        G();
        if (this.c0 != null) {
            this.b0 = 1;
        } else {
            J();
        }
    }

    @Override // defpackage.pe1
    public final void z(long j, long j2) {
        boolean z;
        qb5 qb5Var;
        boolean z2;
        long jG;
        if (this.R) {
            long j3 = this.o0;
            if (j3 != -9223372036854775807L && j >= j3) {
                L();
                this.l0 = true;
            }
        }
        if (this.l0) {
            return;
        }
        jw7 jw7Var = this.m0;
        jw7Var.getClass();
        boolean zEquals = Objects.equals(jw7Var.o, "application/x-media3-cues");
        Handler handler = this.h0;
        qb5 qb5Var2 = this.j0;
        boolean zB = false;
        zB = false;
        zB = false;
        if (zEquals) {
            this.Y.getClass();
            if (!this.k0) {
                ro5 ro5Var = this.X;
                if (y(qb5Var2, ro5Var, 0) == -4) {
                    if (ro5Var.c(4)) {
                        this.k0 = true;
                    } else {
                        ro5Var.j();
                        ByteBuffer byteBuffer = ro5Var.I;
                        byteBuffer.getClass();
                        long j4 = ro5Var.K;
                        byte[] bArrArray = byteBuffer.array();
                        int iArrayOffset = byteBuffer.arrayOffset();
                        int iLimit = byteBuffer.limit();
                        this.W.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                        parcelObtain.setDataPosition(0);
                        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                        parcelObtain.recycle();
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                        parcelableArrayList.getClass();
                        ed5 ed5Var = new ed5(0);
                        hz8 hz8VarO = nz8.o();
                        for (int i = 0; i < parcelableArrayList.size(); i++) {
                            Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                            bundle2.getClass();
                            hz8VarO.b(ed5Var.apply(bundle2));
                        }
                        hd5 hd5Var = new hd5(j4, bundle.getLong("d"), hz8VarO.g());
                        ro5Var.e();
                        zB = this.Y.b(hd5Var, j);
                    }
                }
            }
            long jA = this.Y.a(this.n0);
            if (jA == Long.MIN_VALUE && this.k0 && !zB) {
                this.l0 = true;
            }
            if (jA != Long.MIN_VALUE && jA <= j) {
                zB = true;
            }
            if (zB) {
                nz8 nz8VarD = this.Y.d(j);
                long jE = this.Y.e(j);
                I(jE);
                fd5 fd5Var = new fd5(nz8VarD);
                if (handler != null) {
                    handler.obtainMessage(1, fd5Var).sendToTarget();
                } else {
                    K(fd5Var);
                }
                this.Y.f(jE);
            }
            this.n0 = j;
            return;
        }
        G();
        this.n0 = j;
        if (this.f0 == null) {
            ywg ywgVar = this.c0;
            ywgVar.getClass();
            ywgVar.c(j);
            try {
                ywg ywgVar2 = this.c0;
                ywgVar2.getClass();
                this.f0 = (gg2) ywgVar2.d();
            } catch (SubtitleDecoderException e) {
                ysj.k("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.m0, e);
                vde vdeVar = vde.I;
                I(this.n0);
                fd5 fd5Var2 = new fd5(vdeVar);
                if (handler != null) {
                    handler.obtainMessage(1, fd5Var2).sendToTarget();
                } else {
                    K(fd5Var2);
                }
                L();
                ywg ywgVar3 = this.c0;
                ywgVar3.getClass();
                ywgVar3.a();
                this.c0 = null;
                this.b0 = 0;
                J();
                return;
            }
        }
        if (this.L != 2) {
            return;
        }
        if (this.e0 != null) {
            long jH = H();
            z = false;
            while (jH <= j) {
                this.g0++;
                jH = H();
                z = true;
            }
        } else {
            z = false;
        }
        gg2 gg2Var = this.f0;
        if (gg2Var == null) {
            qb5Var = qb5Var2;
            z2 = z;
        } else if (gg2Var.c(4)) {
            if (!z && H() == Long.MAX_VALUE) {
                if (this.b0 == 2) {
                    L();
                    ywg ywgVar4 = this.c0;
                    ywgVar4.getClass();
                    ywgVar4.a();
                    this.c0 = null;
                    this.b0 = 0;
                    J();
                } else {
                    L();
                    this.l0 = true;
                }
            }
            qb5Var = qb5Var2;
            z2 = z;
        } else {
            qb5Var = qb5Var2;
            z2 = z;
            if (gg2Var.G <= j) {
                gg2 gg2Var2 = this.e0;
                if (gg2Var2 != null) {
                    gg2Var2.f();
                }
                this.g0 = gg2Var.d(j);
                this.e0 = gg2Var;
                this.f0 = null;
                z2 = true;
            }
        }
        if (z2) {
            this.e0.getClass();
            int iD = this.e0.d(j);
            if (iD == 0 || this.e0.l() == 0) {
                jG = this.e0.G;
            } else {
                gg2 gg2Var3 = this.e0;
                jG = iD == -1 ? gg2Var3.g(gg2Var3.l() - 1) : gg2Var3.g(iD - 1);
            }
            I(jG);
            fd5 fd5Var3 = new fd5(this.e0.i(j));
            if (handler != null) {
                handler.obtainMessage(1, fd5Var3).sendToTarget();
            } else {
                K(fd5Var3);
            }
        }
        if (this.b0 == 2) {
            return;
        }
        while (!this.k0) {
            try {
                axg axgVar = this.d0;
                if (axgVar == null) {
                    ywg ywgVar5 = this.c0;
                    ywgVar5.getClass();
                    axgVar = (axg) ywgVar5.e();
                    if (axgVar == null) {
                        return;
                    } else {
                        this.d0 = axgVar;
                    }
                }
                if (this.b0 == 1) {
                    axgVar.F = 4;
                    ywg ywgVar6 = this.c0;
                    ywgVar6.getClass();
                    ywgVar6.f(axgVar);
                    this.d0 = null;
                    this.b0 = 2;
                    return;
                }
                int iY = y(qb5Var, axgVar, 0);
                if (iY == -4) {
                    if (axgVar.c(4)) {
                        this.k0 = true;
                        this.a0 = false;
                    } else {
                        jw7 jw7Var2 = (jw7) qb5Var.F;
                        if (jw7Var2 == null) {
                            return;
                        }
                        axgVar.N = jw7Var2.t;
                        axgVar.j();
                        this.a0 &= !axgVar.c(1);
                    }
                    if (!this.a0) {
                        ywg ywgVar7 = this.c0;
                        ywgVar7.getClass();
                        ywgVar7.f(axgVar);
                        this.d0 = null;
                    }
                } else if (iY == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e2) {
                ysj.k("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.m0, e2);
                vde vdeVar2 = vde.I;
                I(this.n0);
                fd5 fd5Var4 = new fd5(vdeVar2);
                if (handler != null) {
                    handler.obtainMessage(1, fd5Var4).sendToTarget();
                } else {
                    K(fd5Var4);
                }
                L();
                ywg ywgVar8 = this.c0;
                ywgVar8.getClass();
                ywgVar8.a();
                this.c0 = null;
                this.b0 = 0;
                J();
                return;
            }
        }
    }
}
