package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class j22 extends OutputStream {
    public static final byte[] J = new byte[0];
    public int G;
    public int I;
    public final int E = FreeTypeConstants.FT_LOAD_PEDANTIC;
    public final ArrayList F = new ArrayList();
    public byte[] H = new byte[FreeTypeConstants.FT_LOAD_PEDANTIC];

    public final void c(int i) {
        this.F.add(new oba(this.H));
        int length = this.G + this.H.length;
        this.G = length;
        this.H = new byte[Math.max(this.E, Math.max(i, length >>> 1))];
        this.I = 0;
    }

    public final void d() {
        int i = this.I;
        byte[] bArr = this.H;
        int length = bArr.length;
        ArrayList arrayList = this.F;
        if (i >= length) {
            arrayList.add(new oba(this.H));
            this.H = J;
        } else if (i > 0) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            arrayList.add(new oba(bArr2));
        }
        this.G += this.I;
        this.I = 0;
    }

    public final synchronized l22 e() {
        ArrayList arrayList;
        d();
        arrayList = this.F;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((l22) it.next());
            }
            arrayList = arrayList2;
        }
        return arrayList.isEmpty() ? l22.E : l22.a(arrayList.iterator(), arrayList.size());
    }

    public final String toString() {
        int i;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i = this.G + this.I;
        }
        return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        try {
            byte[] bArr2 = this.H;
            int length = bArr2.length;
            int i3 = this.I;
            if (i2 <= length - i3) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.I += i2;
            } else {
                int length2 = bArr2.length - i3;
                System.arraycopy(bArr, i, bArr2, i3, length2);
                int i4 = i2 - length2;
                c(i4);
                System.arraycopy(bArr, i + length2, this.H, 0, i4);
                this.I = i4;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        try {
            if (this.I == this.H.length) {
                c(1);
            }
            byte[] bArr = this.H;
            int i2 = this.I;
            this.I = i2 + 1;
            bArr[i2] = (byte) i;
        } catch (Throwable th) {
            throw th;
        }
    }
}
