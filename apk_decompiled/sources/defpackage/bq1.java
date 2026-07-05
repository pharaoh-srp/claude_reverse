package defpackage;

import android.app.KeyguardManager;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bq1 {
    public static Intent a(KeyguardManager keyguardManager, CharSequence charSequence, CharSequence charSequence2) {
        return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
    }
}
