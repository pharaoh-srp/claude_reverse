package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* JADX INFO: loaded from: classes2.dex */
public final class cr5 extends zl4 {
    @Override // defpackage.zl4
    public final Signature[] m(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
