package defpackage;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class sqb {
    public final /* synthetic */ int a;
    public final String b;

    public sqb(String str) {
        this.a = 2;
        this.b = vb7.q("UID: [", "]  PID: [", Process.myUid(), Process.myPid(), "] ").concat(str);
    }

    public static String d(String str, String str2, Object... objArr) {
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

    public void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            d(this.b, str, objArr);
        }
    }

    public void b(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", d(this.b, str, objArr), remoteException);
        }
    }

    public void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", d(this.b, str, objArr));
        }
    }

    public String toString() {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                return str;
            case 1:
                return vb7.s(new StringBuilder("<"), str, '>');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ sqb(String str, int i) {
        this.a = i;
        this.b = str;
    }
}
