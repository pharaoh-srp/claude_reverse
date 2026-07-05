package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.security.identity.IdentityCredential;

/* JADX INFO: loaded from: classes2.dex */
public abstract class uc5 {
    public static BiometricPrompt.CryptoObject a(IdentityCredential identityCredential) {
        return new BiometricPrompt.CryptoObject(identityCredential);
    }

    public static IdentityCredential b(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getIdentityCredential();
    }
}
