package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class ha2 extends pe1 {
    public final ro5 W;
    public final ssc X;
    public s77 Y;
    public long Z;

    public ha2() {
        super(6);
        this.W = new ro5(1);
        this.X = new ssc();
    }

    @Override // defpackage.pe1
    public final int D(jw7 jw7Var) {
        return "application/x-camera-motion".equals(jw7Var.o) ? pe1.f(4, 0, 0, 0) : pe1.f(0, 0, 0, 0);
    }

    @Override // defpackage.pe1, defpackage.b7d
    public final void d(int i, Object obj) {
        if (i == 8) {
            this.Y = (s77) obj;
        }
    }

    @Override // defpackage.pe1
    public final String k() {
        return "CameraMotionRenderer";
    }

    @Override // defpackage.pe1
    public final boolean m() {
        return l();
    }

    @Override // defpackage.pe1
    public final boolean o() {
        return true;
    }

    @Override // defpackage.pe1
    public final void p() {
        s77 s77Var = this.Y;
        if (s77Var != null) {
            s77Var.c();
        }
    }

    @Override // defpackage.pe1
    public final void r(long j, boolean z, boolean z2) {
        this.Z = Long.MIN_VALUE;
        s77 s77Var = this.Y;
        if (s77Var != null) {
            s77Var.c();
        }
    }

    @Override // defpackage.pe1
    public final void z(long j, long j2) {
        float[] fArr;
        while (!l() && this.Z < 100000 + j) {
            ro5 ro5Var = this.W;
            ro5Var.e();
            qb5 qb5Var = this.G;
            qb5Var.i();
            if (y(qb5Var, ro5Var, 0) != -4 || ro5Var.c(4)) {
                return;
            }
            long j3 = ro5Var.K;
            this.Z = j3;
            boolean z = j3 < this.P;
            if (this.Y != null && !z) {
                ro5Var.j();
                ByteBuffer byteBuffer = ro5Var.I;
                String str = tpi.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    ssc sscVar = this.X;
                    sscVar.K(bArrArray, iLimit);
                    sscVar.M(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i = 0; i < 3; i++) {
                        fArr2[i] = Float.intBitsToFloat(sscVar.o());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.Y.a();
                }
            }
        }
    }
}
