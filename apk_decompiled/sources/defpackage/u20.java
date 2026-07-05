package defpackage;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

/* JADX INFO: loaded from: classes3.dex */
public final class u20 {
    public static final Object b = new Object();
    public KeyStore a;

    public u20() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            this.a = keyStore;
        } catch (IOException | GeneralSecurityException e) {
            pmf.m(e);
            throw null;
        }
    }

    public static boolean a(String str) {
        u20 u20Var = new u20();
        synchronized (b) {
            try {
                if (u20Var.d(str)) {
                    return false;
                }
                b(str);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        String strB = rqi.b(str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(strB, 3).setKeySize(FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    public final synchronized bh c(String str) {
        bh bhVar;
        bhVar = new bh(rqi.b(str), this.a);
        byte[] bArrA = i1e.a(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(bArrA, bhVar.b(bhVar.a(bArrA, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return bhVar;
    }

    public final synchronized boolean d(String str) {
        String strB;
        strB = rqi.b(str);
        try {
        } catch (NullPointerException unused) {
            Log.w("u20", "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
            try {
                try {
                    Thread.sleep((int) (Math.random() * 40.0d));
                } catch (InterruptedException unused2) {
                }
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.a = keyStore;
                keyStore.load(null);
                return this.a.containsAlias(strB);
            } catch (IOException e) {
                throw new GeneralSecurityException(e);
            }
        }
        return this.a.containsAlias(strB);
    }
}
