package defpackage;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.image.ImageDecoderException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public final class ex8 extends pe1 {
    public final kq1 W;
    public final ro5 X;
    public final ArrayDeque Y;
    public boolean Z;
    public boolean a0;
    public dx8 b0;
    public long c0;
    public long d0;
    public int e0;
    public int f0;
    public jw7 g0;
    public dr1 h0;
    public ro5 i0;
    public cx8 j0;
    public x77 k0;
    public Bitmap l0;
    public boolean m0;
    public oo0 n0;
    public oo0 o0;
    public int p0;
    public boolean q0;

    public ex8(kq1 kq1Var) {
        super(4);
        this.W = kq1Var;
        this.j0 = cx8.a;
        this.X = new ro5(0);
        this.b0 = dx8.c;
        this.Y = new ArrayDeque();
        this.d0 = -9223372036854775807L;
        this.c0 = -9223372036854775807L;
        this.e0 = 0;
        this.f0 = 1;
    }

    @Override // defpackage.pe1
    public final int D(jw7 jw7Var) {
        this.W.getClass();
        return kq1.b(jw7Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean G(long r13) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ex8.G(long):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean H(long r13) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ex8.H(long):boolean");
    }

    public final void I() throws ExoPlaybackException {
        if (this.q0) {
            jw7 jw7Var = this.g0;
            jw7Var.getClass();
            kq1 kq1Var = this.W;
            kq1Var.getClass();
            int iB = kq1.b(jw7Var);
            if (iB != pe1.f(4, 0, 0, 0) && iB != pe1.f(3, 0, 0, 0)) {
                throw g(new ImageDecoderException("Provided decoder factory can't create decoder for format."), this.g0, false, 4005);
            }
            dr1 dr1Var = this.h0;
            if (dr1Var != null) {
                dr1Var.a();
            }
            this.h0 = new dr1(kq1Var.a);
            this.q0 = false;
        }
    }

    public final void J() {
        this.i0 = null;
        this.e0 = 0;
        this.d0 = -9223372036854775807L;
        dr1 dr1Var = this.h0;
        if (dr1Var != null) {
            dr1Var.a();
            this.h0 = null;
        }
    }

    @Override // defpackage.pe1, defpackage.b7d
    public final void d(int i, Object obj) {
        if (i != 15) {
            if (i != 23) {
                return;
            }
            this.k0 = (x77) obj;
        } else {
            cx8 cx8Var = obj instanceof cx8 ? (cx8) obj : null;
            if (cx8Var == null) {
                cx8Var = cx8.a;
            }
            this.j0 = cx8Var;
        }
    }

    @Override // defpackage.pe1
    public final String k() {
        return "ImageRenderer";
    }

    @Override // defpackage.pe1
    public final boolean m() {
        return this.a0;
    }

    @Override // defpackage.pe1
    public final boolean o() {
        int i = this.f0;
        if (i != 3) {
            return i == 0 && this.m0;
        }
        return true;
    }

    @Override // defpackage.pe1
    public final void p() {
        this.g0 = null;
        this.b0 = dx8.c;
        this.Y.clear();
        J();
        this.j0.getClass();
    }

    @Override // defpackage.pe1
    public final void q(boolean z, boolean z2) {
        this.f0 = z2 ? 1 : 0;
    }

    @Override // defpackage.pe1
    public final void r(long j, boolean z, boolean z2) {
        this.f0 = Math.min(this.f0, 1);
        this.a0 = false;
        this.Z = false;
        this.l0 = null;
        this.n0 = null;
        this.o0 = null;
        this.m0 = false;
        this.i0 = null;
        dr1 dr1Var = this.h0;
        if (dr1Var != null) {
            dr1Var.flush();
        }
        this.Y.clear();
    }

    @Override // defpackage.pe1
    public final void s() {
        J();
    }

    @Override // defpackage.pe1
    public final void t() {
        J();
        this.f0 = Math.min(this.f0, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // defpackage.pe1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(defpackage.jw7[] r5, long r6, long r8, defpackage.z7b r10) {
        /*
            r4 = this;
            dx8 r5 = r4.b0
            long r5 = r5.b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            java.util.ArrayDeque r5 = r4.Y
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L26
            long r6 = r4.d0
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L31
            long r2 = r4.c0
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L26
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L26
            goto L31
        L26:
            dx8 r6 = new dx8
            long r0 = r4.d0
            r6.<init>(r0, r8)
            r5.add(r6)
            return
        L31:
            dx8 r5 = new dx8
            r5.<init>(r0, r8)
            r4.b0 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ex8.w(jw7[], long, long, z7b):void");
    }

    @Override // defpackage.pe1
    public final void z(long j, long j2) throws ExoPlaybackException {
        if (this.a0) {
            return;
        }
        if (this.g0 == null) {
            qb5 qb5Var = this.G;
            qb5Var.i();
            ro5 ro5Var = this.X;
            ro5Var.e();
            int iY = y(qb5Var, ro5Var, 2);
            if (iY != -5) {
                if (iY == -4) {
                    fd9.M(ro5Var.c(4));
                    this.Z = true;
                    this.a0 = true;
                    return;
                }
                return;
            }
            jw7 jw7Var = (jw7) qb5Var.F;
            jw7Var.getClass();
            this.g0 = jw7Var;
            this.q0 = true;
        }
        if (this.h0 == null) {
            I();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (G(j)) {
            }
            while (H(j)) {
            }
            Trace.endSection();
        } catch (ImageDecoderException e) {
            throw g(e, null, false, 4003);
        }
    }
}
