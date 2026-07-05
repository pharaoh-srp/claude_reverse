package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class rh implements y16 {
    public static final List c = Arrays.asList(64);
    public static final byte[] d = new byte[16];
    public static final byte[] e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
    public final lrb a;
    public final byte[] b;

    public rh(byte[] bArr) throws GeneralSecurityException {
        if (!gid.a(1)) {
            rl7.j("Can not use AES-SIV in FIPS-mode.");
            throw null;
        }
        if (!c.contains(Integer.valueOf(bArr.length))) {
            throw new InvalidKeyException(vb7.l(bArr.length, " bytes; key must have 64 bytes", new StringBuilder("invalid key size: ")));
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        this.a = new lrb(bArrCopyOfRange);
    }

    @Override // defpackage.y16
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483631) {
            rl7.j("plaintext too long");
            return null;
        }
        Cipher cipher = (Cipher) bo6.b.a.u("AES/CTR/NoPadding");
        byte[] bArrC = c(bArr2, bArr);
        byte[] bArr3 = (byte[]) bArrC.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipher.init(1, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(bArr3));
        return ntj.b(bArrC, cipher.doFinal(bArr));
    }

    @Override // defpackage.y16
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 16) {
            rl7.j("Ciphertext too short.");
            return null;
        }
        Cipher cipher = (Cipher) bo6.b.a.u("AES/CTR/NoPadding");
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) bArrCopyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipher.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(bArr3));
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        byte[] bArrDoFinal = cipher.doFinal(bArrCopyOfRange2);
        if (bArrCopyOfRange2.length == 0 && bArrDoFinal == null && "The Android Project".equals(System.getProperty("java.vendor"))) {
            bArrDoFinal = new byte[0];
        }
        if (MessageDigest.isEqual(bArrCopyOfRange, c(bArr2, bArrDoFinal))) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    public final byte[] c(byte[]... bArr) throws GeneralSecurityException {
        byte[] bArrL;
        int length = bArr.length;
        lrb lrbVar = this.a;
        if (length == 0) {
            return lrbVar.k(e, 16);
        }
        byte[] bArrK = lrbVar.k(d, 16);
        for (int i = 0; i < bArr.length - 1; i++) {
            byte[] bArr2 = bArr[i];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            bArrK = ntj.l(lnk.h(bArrK), lrbVar.k(bArr2, 16));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length >= 16) {
            if (bArr3.length < bArrK.length) {
                sz6.p("xorEnd requires a.length >= b.length");
                return null;
            }
            int length2 = bArr3.length - bArrK.length;
            bArrL = Arrays.copyOf(bArr3, bArr3.length);
            for (int i2 = 0; i2 < bArrK.length; i2++) {
                int i3 = length2 + i2;
                bArrL[i3] = (byte) (bArrL[i3] ^ bArrK[i2]);
            }
        } else {
            if (bArr3.length >= 16) {
                sz6.p("x must be smaller than a block.");
                return null;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr3, 16);
            bArrCopyOf[bArr3.length] = -128;
            bArrL = ntj.l(bArrCopyOf, lnk.h(bArrK));
        }
        return lrbVar.k(bArrL, 16);
    }
}
