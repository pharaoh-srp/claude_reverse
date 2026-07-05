package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class jh implements lf {
    public static final ig b = new ig(3);
    public final SecretKeySpec a;

    public jh(byte[] bArr) {
        rqi.a(bArr.length);
        this.a = new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec c(byte[] bArr, int i) throws GeneralSecurityException {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(FreeTypeConstants.FT_LOAD_PEDANTIC, bArr, 0, i);
        } catch (ClassNotFoundException unused) {
            if ("The Android Project".equals(System.getProperty("java.vendor"))) {
                return new IvParameterSpec(bArr, 0, i);
            }
            rl7.j("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
            return null;
        }
    }

    @Override // defpackage.lf
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            rl7.j("plaintext too long");
            return null;
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        byte[] bArrA = i1e.a(12);
        System.arraycopy(bArrA, 0, bArr3, 0, 12);
        AlgorithmParameterSpec algorithmParameterSpecC = c(bArrA, bArrA.length);
        ig igVar = b;
        ((Cipher) igVar.get()).init(1, this.a, algorithmParameterSpecC);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) igVar.get()).updateAAD(bArr2);
        }
        int iDoFinal = ((Cipher) igVar.get()).doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (iDoFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(grc.u("encryption failed; GCM tag must be 16 bytes, but got only ", iDoFinal - bArr.length, " bytes"));
    }

    @Override // defpackage.lf
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            rl7.j("ciphertext too short");
            return null;
        }
        AlgorithmParameterSpec algorithmParameterSpecC = c(bArr, 12);
        ig igVar = b;
        ((Cipher) igVar.get()).init(2, this.a, algorithmParameterSpecC);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) igVar.get()).updateAAD(bArr2);
        }
        return ((Cipher) igVar.get()).doFinal(bArr, 12, bArr.length - 12);
    }
}
