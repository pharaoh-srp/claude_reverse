package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class nga {
    public static final Object b = new Object();
    public static volatile nga c;
    public final int a;

    public nga(int i) {
        this.a = i;
    }

    public static nga c() {
        nga ngaVar;
        synchronized (b) {
            try {
                if (c == null) {
                    c = new nga(3);
                }
                ngaVar = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ngaVar;
    }

    public static String e(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public final void a(String str, String str2) {
        if (this.a <= 6) {
            Log.e(str, str2);
        }
    }

    public final void b(String str, String str2, Throwable th) {
        if (this.a <= 6) {
            Log.e(str, str2, th);
        }
    }

    public final void d(String str, String str2) {
        if (this.a <= 4) {
            Log.i(str, str2);
        }
    }

    public final void f(String str, String str2) {
        if (this.a <= 5) {
            Log.w(str, str2);
        }
    }
}
