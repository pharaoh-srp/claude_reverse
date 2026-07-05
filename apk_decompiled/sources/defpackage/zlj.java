package defpackage;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class zlj {
    public final String a;

    public zlj(String str) {
        this.a = vb7.q("UID: [", "]  PID: [", Process.myUid(), Process.myPid(), "] ").concat(str);
    }

    public static String c(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = kgh.p(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return ij0.C(str, " : ", str2);
    }

    public final void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", c(this.a, str, objArr));
        }
    }

    public final void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", c(this.a, str, objArr));
        }
    }
}
