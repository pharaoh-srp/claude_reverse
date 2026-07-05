package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class j02 {
    public static final /* synthetic */ int a = 0;

    static {
        synchronized (dd8.K) {
            String property = System.getProperty("androidx.sqlite.driver.bundled.path");
            String property2 = System.getProperty("androidx.sqlite.driver.bundled.name");
            if (property == null || property2 == null) {
                System.loadLibrary("sqliteJni");
                return;
            }
            File file = new File(property, property2);
            if (file.exists()) {
                System.load(file.getAbsolutePath());
                return;
            }
            throw new IllegalStateException(("Cannot find a suitable SQLite binary at the configured path(androidx.sqlite.driver.bundled.path = " + property + "). File " + file + " does not exist.").toString());
        }
    }
}
