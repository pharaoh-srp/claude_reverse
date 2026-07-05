package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class fn6 implements lf {
    public final jg a;
    public final doa b;
    public final int c;

    public fn6(jg jgVar, doa doaVar, int i) {
        this.a = jgVar;
        this.b = doaVar;
        this.c = i;
    }

    @Override // defpackage.lf
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        jg jgVar = this.a;
        jgVar.getClass();
        int length = bArr.length;
        int i = jgVar.b;
        int i2 = Integer.MAX_VALUE - i;
        if (length > i2) {
            throw new GeneralSecurityException(grc.p(i2, "plaintext length can not exceed "));
        }
        byte[] bArr3 = new byte[bArr.length + i];
        byte[] bArrA = i1e.a(i);
        System.arraycopy(bArrA, 0, bArr3, 0, i);
        jgVar.a(bArr, 0, bArr.length, bArr3, jgVar.b, bArrA, true);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return ntj.b(bArr3, this.b.b(ntj.b(bArr2, bArr3, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
    }

    @Override // defpackage.lf
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.c;
        if (length < i) {
            rl7.j("ciphertext too short");
            return null;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.b.a(bArrCopyOfRange2, ntj.b(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)));
        jg jgVar = this.a;
        jgVar.getClass();
        int length2 = bArrCopyOfRange.length;
        int i2 = jgVar.b;
        if (length2 < i2) {
            rl7.j("ciphertext too short");
            return null;
        }
        byte[] bArr3 = new byte[i2];
        System.arraycopy(bArrCopyOfRange, 0, bArr3, 0, i2);
        int length3 = bArrCopyOfRange.length;
        int i3 = jgVar.b;
        byte[] bArr4 = new byte[length3 - i3];
        jgVar.a(bArrCopyOfRange, i3, bArrCopyOfRange.length - i3, bArr4, 0, bArr3, false);
        return bArr4;
    }
}
