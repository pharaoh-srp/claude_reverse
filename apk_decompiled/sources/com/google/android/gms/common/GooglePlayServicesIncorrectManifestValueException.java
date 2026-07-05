package com.google.android.gms.common;

import defpackage.g88;
import defpackage.ij0;

/* JADX INFO: loaded from: classes3.dex */
public final class GooglePlayServicesIncorrectManifestValueException extends GooglePlayServicesManifestException {
    public GooglePlayServicesIncorrectManifestValueException(int i) {
        int i2 = g88.a;
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 104 + String.valueOf(i).length() + 194);
        ij0.s(i2, i, "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ", " but found ", sb);
        sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
        super(sb.toString());
    }
}
