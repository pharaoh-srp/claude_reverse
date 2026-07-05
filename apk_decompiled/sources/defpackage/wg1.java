package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class wg1 extends ro5 {
    public long N;
    public int O;
    public int P;

    @Override // defpackage.ro5
    public final void e() {
        super.e();
        this.O = 0;
    }

    public final boolean k(ro5 ro5Var) {
        ByteBuffer byteBuffer;
        fd9.E(!ro5Var.c(1073741824));
        fd9.E(!ro5Var.c(268435456));
        fd9.E(!ro5Var.c(4));
        if (m()) {
            if (this.O >= this.P) {
                return false;
            }
            ByteBuffer byteBuffer2 = ro5Var.I;
            if (byteBuffer2 != null && (byteBuffer = this.I) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.O;
        this.O = i + 1;
        if (i == 0) {
            this.K = ro5Var.K;
            if (ro5Var.c(1)) {
                this.F = 1;
            }
        }
        ByteBuffer byteBuffer3 = ro5Var.I;
        if (byteBuffer3 != null) {
            h(byteBuffer3.remaining());
            this.I.put(byteBuffer3);
        }
        this.N = ro5Var.K;
        return true;
    }

    public final boolean m() {
        return this.O > 0;
    }
}
