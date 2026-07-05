package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class t2d {
    public static final long a;

    static {
        long j;
        if (u4d.b(9, 0)) {
            try {
                ((k35) Class.forName("com.datadog.trace.util.JDK9PidSupplier").getDeclaredConstructor(null).newInstance(null)).getClass();
                throw null;
            } catch (Throwable unused) {
            }
        }
        if ("".isEmpty()) {
            j = 0;
        } else {
            try {
                j = Long.parseLong("");
            } catch (NumberFormatException unused2) {
                j = 0;
            }
        }
        a = j;
    }
}
