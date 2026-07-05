package defpackage;

import android.security.keystore.KeyGenParameterSpec;
import com.pvporbit.freetype.FreeTypeConstants;
import io.sentry.b2;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gva {
    public static final KeyGenParameterSpec a = new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING).build();
    public static final Object b = new Object();

    public static String a(KeyGenParameterSpec keyGenParameterSpec) {
        if (keyGenParameterSpec.getKeySize() != 256) {
            throw new IllegalArgumentException("invalid key size, want 256 bits got " + keyGenParameterSpec.getKeySize() + " bits");
        }
        if (!Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{"GCM"})) {
            b2.g("invalid block mode, want GCM got ", Arrays.toString(keyGenParameterSpec.getBlockModes()));
            return null;
        }
        if (keyGenParameterSpec.getPurposes() != 3) {
            mr9.d(keyGenParameterSpec.getPurposes(), "invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got ");
            return null;
        }
        if (!Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
            b2.g("invalid padding mode, want NoPadding got ", Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()));
            return null;
        }
        if (keyGenParameterSpec.isUserAuthenticationRequired() && keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() < 1) {
            sz6.p("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
            return null;
        }
        synchronized (b) {
            String keystoreAlias = keyGenParameterSpec.getKeystoreAlias();
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (!keyStore.containsAlias(keystoreAlias)) {
                try {
                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                    keyGenerator.init(keyGenParameterSpec);
                    keyGenerator.generateKey();
                } catch (ProviderException e) {
                    throw new GeneralSecurityException(e.getMessage(), e);
                }
            }
        }
        return keyGenParameterSpec.getKeystoreAlias();
    }
}
