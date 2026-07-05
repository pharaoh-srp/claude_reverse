package defpackage;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class g3a extends OutputStream {
    public final /* synthetic */ int E;
    public long F;

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        int length;
        int i4;
        int length2;
        int i5;
        switch (this.E) {
            case 0:
                if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
                    throw new IndexOutOfBoundsException();
                }
                this.F += (long) i2;
                return;
            case 1:
                if (i < 0 || i > (length = bArr.length) || i2 < 0 || (i4 = i + i2) > length || i4 < 0) {
                    throw new IndexOutOfBoundsException();
                }
                this.F += (long) i2;
                return;
            default:
                if (i < 0 || i > (length2 = bArr.length) || i2 < 0 || (i5 = i + i2) > length2 || i5 < 0) {
                    throw new IndexOutOfBoundsException();
                }
                this.F += (long) i2;
                return;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        switch (this.E) {
            case 0:
                this.F += (long) bArr.length;
                break;
            case 1:
                this.F += (long) bArr.length;
                break;
            default:
                this.F += (long) bArr.length;
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        switch (this.E) {
            case 0:
                this.F++;
                break;
            case 1:
                this.F++;
                break;
            default:
                this.F++;
                break;
        }
    }
}
