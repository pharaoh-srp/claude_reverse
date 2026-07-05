package defpackage;

import io.sentry.e0;
import java.security.InvalidKeyException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class a59 extends r34 {
    public final /* synthetic */ int c;

    public a59(byte[] bArr, int i, int i2) throws InvalidKeyException {
        this.c = i2;
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.b = tg2.c(bArr);
        this.a = i;
    }

    @Override // defpackage.r34
    public final int[] c(int i, int[] iArr) {
        switch (this.c) {
            case 0:
                if (iArr.length != 3) {
                    e0.g("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length * 32)});
                } else {
                    int[] iArr2 = new int[16];
                    int[] iArr3 = (int[]) this.b;
                    int[] iArr4 = tg2.a;
                    System.arraycopy(iArr4, 0, iArr2, 0, iArr4.length);
                    System.arraycopy(iArr3, 0, iArr2, iArr4.length, 8);
                    iArr2[12] = i;
                    System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
                }
                break;
            default:
                if (iArr.length != 6) {
                    e0.g("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length * 32)});
                } else {
                    int[] iArr5 = new int[16];
                    int[] iArr6 = (int[]) this.b;
                    int[] iArr7 = new int[16];
                    int[] iArr8 = tg2.a;
                    System.arraycopy(iArr8, 0, iArr7, 0, iArr8.length);
                    System.arraycopy(iArr6, 0, iArr7, iArr8.length, 8);
                    iArr7[12] = iArr[0];
                    iArr7[13] = iArr[1];
                    iArr7[14] = iArr[2];
                    iArr7[15] = iArr[3];
                    tg2.b(iArr7);
                    iArr7[4] = iArr7[12];
                    iArr7[5] = iArr7[13];
                    iArr7[6] = iArr7[14];
                    iArr7[7] = iArr7[15];
                    int[] iArrCopyOf = Arrays.copyOf(iArr7, 8);
                    System.arraycopy(iArr8, 0, iArr5, 0, iArr8.length);
                    System.arraycopy(iArrCopyOf, 0, iArr5, iArr8.length, 8);
                    iArr5[12] = i;
                    iArr5[13] = 0;
                    iArr5[14] = iArr[4];
                    iArr5[15] = iArr[5];
                }
                break;
        }
        return null;
    }

    @Override // defpackage.r34
    public final int i() {
        switch (this.c) {
            case 0:
                return 12;
            default:
                return 24;
        }
    }
}
