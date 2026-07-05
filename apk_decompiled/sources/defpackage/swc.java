package defpackage;

import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public abstract class swc implements AutoCloseable {
    public static void e(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 124).concat("...");
        }
        Trace.beginSection(str);
    }

    public abstract void c(rwc rwcVar);

    public boolean d() {
        return false;
    }

    public abstract void f();
}
