package defpackage;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.google.gson.JsonIOException;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class zf implements sac, cc9 {
    public static final zf G;
    public static final zf H;
    public static final zf I;
    public static final zf J;
    public static final zf K;
    public static final zf L;
    public static final zf M;
    public static final zf N;
    public static final zf O;
    public static final zf P;
    public static final zf Q;
    public static final zf R;
    public static final zf S;
    public static final zf T;
    public static final zf U;
    public static final zf V;
    public static final zf W;
    public static final zf X;
    public static final zf Y;
    public final /* synthetic */ int E;
    public String F;

    static {
        int i = 0;
        char c = 0;
        G = new zf("TINK", i, c);
        H = new zf("CRUNCHY", i, c);
        I = new zf("LEGACY", i, c);
        J = new zf("NO_PREFIX", i, c);
        int i2 = 1;
        K = new zf("TINK", i2, c);
        L = new zf("CRUNCHY", i2, c);
        M = new zf("NO_PREFIX", i2, c);
        int i3 = 2;
        N = new zf("NONE", i3, c);
        O = new zf("FULL", i3, c);
        int i4 = 3;
        P = new zf("FLAT", i4, c);
        Q = new zf("HALF_OPENED", i4, c);
        int i5 = 4;
        R = new zf("SHA1", i5, c);
        S = new zf("SHA224", i5, c);
        T = new zf("SHA256", i5, c);
        U = new zf("SHA384", i5, c);
        V = new zf("SHA512", i5, c);
        int i6 = 5;
        W = new zf("ENABLED", i6, c);
        X = new zf("DISABLED", i6, c);
        Y = new zf("DESTROYED", i6, c);
    }

    public zf(String str, int i, byte b) {
        this.E = i;
        switch (i) {
            case 12:
                this.F = vb7.q("UID: [", "]  PID: [", Process.myUid(), Process.myPid(), "] ").concat(str);
                break;
            default:
                this.F = str.concat("_");
                break;
        }
    }

    public static wg e() {
        return new wg(14);
    }

    public static String h(String str, String str2, Object... objArr) {
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

    @Override // defpackage.cc9
    public boolean a() {
        return false;
    }

    @Override // defpackage.cc9
    public saa c(String str) {
        throw new IllegalStateException("Calling evaluateJavaScriptAsync() when ".concat(this.F));
    }

    @Override // defpackage.cc9
    public void close() {
    }

    public String d(Object obj) {
        String string = obj.toString();
        if (string != null && string.length() != 0) {
            int length = string.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iCodePointAt = string.codePointAt(iCharCount);
                if (Character.isLetterOrDigit(iCodePointAt)) {
                    iCharCount += Character.charCount(iCodePointAt);
                }
            }
            return this.F + obj;
        }
        sz6.p(ij0.i("Invalid key: ", string));
        return null;
    }

    public void f(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", h(this.F, str, objArr));
        }
    }

    public void g(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", h(this.F, str, objArr));
        }
    }

    @Override // defpackage.sac
    public Object o0() {
        throw new JsonIOException(this.F);
    }

    public String toString() {
        switch (this.E) {
            case 0:
                return this.F;
            case 1:
                return this.F;
            case 2:
                return this.F;
            case 3:
                return this.F;
            case 4:
                return this.F;
            case 5:
                return this.F;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ zf(String str, int i, char c) {
        this.E = i;
        this.F = str;
    }

    public /* synthetic */ zf(wg wgVar) {
        this.E = 11;
        this.F = wgVar.F;
    }

    public zf(String str, int i) {
        this.E = 10;
        this.F = str;
    }
}
