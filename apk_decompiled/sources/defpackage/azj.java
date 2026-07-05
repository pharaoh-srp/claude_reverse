package defpackage;

import android.util.Log;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class azj extends ClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z) {
        if (!Objects.equals(str, "com.google.android.gms.iid.MessengerCompat")) {
            return super.loadClass(str, z);
        }
        Log.isLoggable("CloudMessengerCompat", 3);
        return p3k.class;
    }
}
