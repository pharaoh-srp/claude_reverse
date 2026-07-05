package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class fr5 implements xd7 {
    public final og5 F;
    public final long G;
    public long H;
    public int J;
    public int K;
    public byte[] I = new byte[65536];
    public final byte[] E = new byte[FreeTypeConstants.FT_LOAD_MONOCHROME];

    static {
        k7b.a("media3.extractor");
    }

    public fr5(og5 og5Var, long j, long j2) {
        this.F = og5Var;
        this.H = j;
        this.G = j2;
    }

    @Override // defpackage.xd7
    public final boolean a(byte[] bArr, int i, int i2, boolean z) throws EOFException, InterruptedIOException {
        int iMin;
        int i3 = this.K;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.I, 0, bArr, i, iMin);
            r(iMin);
        }
        int iQ = iMin;
        while (iQ < i2 && iQ != -1) {
            iQ = q(bArr, i, i2, iQ, z);
        }
        if (iQ != -1) {
            this.H += (long) iQ;
        }
        return iQ != -1;
    }

    @Override // defpackage.xd7
    public final boolean c(int i, boolean z) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.K, i);
        r(iMin);
        int iQ = iMin;
        while (iQ < i && iQ != -1) {
            byte[] bArr = this.E;
            iQ = q(bArr, -iQ, Math.min(i, bArr.length + iQ), iQ, z);
        }
        if (iQ != -1) {
            this.H += (long) iQ;
        }
        return iQ != -1;
    }

    @Override // defpackage.xd7
    public final boolean d(byte[] bArr, int i, int i2, boolean z) {
        if (!j(i2, z)) {
            return false;
        }
        System.arraycopy(this.I, this.J - i2, bArr, i, i2);
        return true;
    }

    @Override // defpackage.xd7
    public final long e() {
        return this.H + ((long) this.J);
    }

    @Override // defpackage.xd7
    public final void f(int i) throws EOFException, InterruptedIOException {
        j(i, false);
    }

    @Override // defpackage.xd7
    public final int g(int i) throws EOFException, InterruptedIOException {
        fr5 fr5Var;
        int iMin = Math.min(this.K, i);
        r(iMin);
        if (iMin == 0) {
            byte[] bArr = this.E;
            fr5Var = this;
            iMin = fr5Var.q(bArr, 0, Math.min(i, bArr.length), 0, true);
        } else {
            fr5Var = this;
        }
        if (iMin != -1) {
            fr5Var.H += (long) iMin;
        }
        return iMin;
    }

    @Override // defpackage.xd7
    public final long getLength() {
        return this.G;
    }

    @Override // defpackage.xd7
    public final long getPosition() {
        return this.H;
    }

    @Override // defpackage.xd7
    public final int h(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        fr5 fr5Var;
        int iMin;
        n(i2);
        int i3 = this.K;
        int i4 = this.J;
        int i5 = i3 - i4;
        if (i5 == 0) {
            fr5Var = this;
            iMin = fr5Var.q(this.I, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            fr5Var.K += iMin;
        } else {
            fr5Var = this;
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(fr5Var.I, fr5Var.J, bArr, i, iMin);
        fr5Var.J += iMin;
        return iMin;
    }

    public final boolean j(int i, boolean z) throws EOFException, InterruptedIOException {
        n(i);
        int iQ = this.K - this.J;
        while (iQ < i) {
            fr5 fr5Var = this;
            int i2 = i;
            boolean z2 = z;
            iQ = fr5Var.q(this.I, this.J, i2, iQ, z2);
            if (iQ == -1) {
                return false;
            }
            fr5Var.K = fr5Var.J + iQ;
            this = fr5Var;
            i = i2;
            z = z2;
        }
        this.J += i;
        return true;
    }

    @Override // defpackage.xd7
    public final void k() {
        this.J = 0;
    }

    @Override // defpackage.xd7
    public final void l(int i) throws EOFException, InterruptedIOException {
        c(i, false);
    }

    public final void n(int i) {
        int i2 = this.J + i;
        byte[] bArr = this.I;
        if (i2 > bArr.length) {
            this.I = Arrays.copyOf(this.I, tpi.g(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    @Override // defpackage.xd7
    public final void p(byte[] bArr, int i, int i2) {
        d(bArr, i, i2, false);
    }

    public final int q(byte[] bArr, int i, int i2, int i3, boolean z) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i4 = this.F.read(bArr, i + i3, i2 - i3);
        if (i4 != -1) {
            return i3 + i4;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        sz6.n();
        return 0;
    }

    public final void r(int i) {
        int i2 = this.K - i;
        this.K = i2;
        this.J = 0;
        byte[] bArr = this.I;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.I = bArr2;
    }

    @Override // defpackage.og5
    public final int read(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        fr5 fr5Var;
        int i3 = this.K;
        int iQ = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.I, 0, bArr, i, iMin);
            r(iMin);
            iQ = iMin;
        }
        if (iQ == 0) {
            fr5Var = this;
            iQ = fr5Var.q(bArr, i, i2, 0, true);
        } else {
            fr5Var = this;
        }
        if (iQ != -1) {
            fr5Var.H += (long) iQ;
        }
        return iQ;
    }

    @Override // defpackage.xd7
    public final void readFully(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        a(bArr, i, i2, false);
    }
}
