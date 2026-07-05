package defpackage;

import android.util.Log;
import com.pvporbit.freetype.FreeTypeConstants;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.ProviderException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: loaded from: classes3.dex */
public final class bh implements lf {
    public final /* synthetic */ int a;
    public final Object b;

    public bh(byte[] bArr, int i) throws GeneralSecurityException {
        this.a = i;
        switch (i) {
            case 2:
                this.b = new b59(bArr, 0);
                return;
            case 3:
                this.b = new b59(bArr, 1);
                return;
            default:
                if (gid.b(2)) {
                    this.b = new z49(bArr);
                    return;
                } else {
                    rl7.j("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
                    throw null;
                }
        }
    }

    @Override // defpackage.lf
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                byte[] bArrA = i1e.a(12);
                z49 z49Var = (z49) obj;
                boolean z = z49Var.b;
                if (bArrA.length != 12) {
                    rl7.j("iv is wrong size");
                    return null;
                }
                if (bArr.length > 2147483619) {
                    rl7.j("plaintext too long");
                    return null;
                }
                byte[] bArr3 = new byte[z ? bArr.length + 28 : bArr.length + 16];
                if (z) {
                    System.arraycopy(bArrA, 0, bArr3, 0, 12);
                }
                AlgorithmParameterSpec algorithmParameterSpecA = z49.a(bArrA);
                ig igVar = z49.c;
                ((Cipher) igVar.get()).init(1, z49Var.a, algorithmParameterSpecA);
                if (bArr2 != null && bArr2.length != 0) {
                    ((Cipher) igVar.get()).updateAAD(bArr2);
                }
                int iDoFinal = ((Cipher) igVar.get()).doFinal(bArr, 0, bArr.length, bArr3, z ? 12 : 0);
                if (iDoFinal == bArr.length + 16) {
                    return bArr3;
                }
                throw new GeneralSecurityException(grc.u("encryption failed; GCM tag must be 16 bytes, but got only ", iDoFinal - bArr.length, " bytes"));
            case 1:
                try {
                    return d(bArr, bArr2);
                } catch (GeneralSecurityException | ProviderException e) {
                    Log.w("bh", "encountered a potentially transient KeyStore error, will wait and retry", e);
                    try {
                        Thread.sleep((int) (Math.random() * 100.0d));
                        break;
                    } catch (InterruptedException unused) {
                    }
                    return this.d(bArr, bArr2);
                }
            case 2:
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 28);
                byte[] bArrA2 = i1e.a(12);
                byteBufferAllocate.put(bArrA2);
                ((b59) obj).f(byteBufferAllocate, bArrA2, bArr, bArr2);
                return byteBufferAllocate.array();
            default:
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bArr.length + 40);
                byte[] bArrA3 = i1e.a(24);
                byteBufferAllocate2.put(bArrA3);
                ((b59) obj).f(byteBufferAllocate2, bArrA3, bArr, bArr2);
                return byteBufferAllocate2.array();
        }
    }

    @Override // defpackage.lf
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
                z49 z49Var = (z49) obj;
                boolean z = z49Var.b;
                if (bArrCopyOf.length != 12) {
                    rl7.j("iv is wrong size");
                    return null;
                }
                if (bArr.length < (z ? 28 : 16)) {
                    rl7.j("ciphertext too short");
                    return null;
                }
                if (z && !ByteBuffer.wrap(bArrCopyOf).equals(ByteBuffer.wrap(bArr, 0, 12))) {
                    rl7.j("iv does not match prepended iv");
                    return null;
                }
                AlgorithmParameterSpec algorithmParameterSpecA = z49.a(bArrCopyOf);
                ig igVar = z49.c;
                ((Cipher) igVar.get()).init(2, z49Var.a, algorithmParameterSpecA);
                if (bArr2 != null && bArr2.length != 0) {
                    ((Cipher) igVar.get()).updateAAD(bArr2);
                }
                int i2 = z ? 12 : 0;
                int length = bArr.length;
                if (z) {
                    length -= 12;
                }
                return ((Cipher) igVar.get()).doFinal(bArr, i2, length);
            case 1:
                if (bArr.length < 28) {
                    rl7.j("ciphertext too short");
                    return null;
                }
                try {
                    return c(bArr, bArr2);
                } catch (ProviderException e) {
                    e = e;
                    Log.w("bh", "encountered a potentially transient KeyStore error, will wait and retry", e);
                    try {
                        Thread.sleep((int) (Math.random() * 100.0d));
                        break;
                    } catch (InterruptedException unused) {
                    }
                    return c(bArr, bArr2);
                } catch (AEADBadTagException e2) {
                    throw e2;
                } catch (GeneralSecurityException e3) {
                    e = e3;
                    Log.w("bh", "encountered a potentially transient KeyStore error, will wait and retry", e);
                    Thread.sleep((int) (Math.random() * 100.0d));
                    return c(bArr, bArr2);
                }
            case 2:
                if (bArr.length >= 28) {
                    return ((b59) obj).e(ByteBuffer.wrap(bArr, 12, bArr.length - 12), Arrays.copyOf(bArr, 12), bArr2);
                }
                rl7.j("ciphertext too short");
                return null;
            default:
                if (bArr.length >= 40) {
                    return ((b59) obj).e(ByteBuffer.wrap(bArr, 24, bArr.length - 24), Arrays.copyOf(bArr, 24), bArr2);
                }
                rl7.j("ciphertext too short");
                return null;
        }
    }

    public byte[] c(byte[] bArr, byte[] bArr2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(FreeTypeConstants.FT_LOAD_PEDANTIC, bArr, 0, 12);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, (SecretKey) this.b, gCMParameterSpec);
        cipher.updateAAD(bArr2);
        return cipher.doFinal(bArr, 12, bArr.length - 12);
    }

    public byte[] d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            rl7.j("plaintext too long");
            return null;
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, (SecretKey) this.b);
        cipher.updateAAD(bArr2);
        cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
        System.arraycopy(cipher.getIV(), 0, bArr3, 0, 12);
        return bArr3;
    }

    public bh(String str, KeyStore keyStore) throws InvalidKeyException {
        this.a = 1;
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.b = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException("Keystore cannot load the key with ID: ".concat(str));
        }
    }
}
