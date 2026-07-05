package defpackage;

import android.hardware.biometrics.BiometricManager;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jq1 {
    public static int a(BiometricManager biometricManager, int i) {
        return biometricManager.canAuthenticate(i);
    }
}
