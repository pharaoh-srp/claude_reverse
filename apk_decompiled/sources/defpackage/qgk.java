package defpackage;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class qgk extends pqk {
    public char G;
    public long H;
    public String I;
    public final ygk J;
    public final ygk K;
    public final ygk L;
    public final ygk M;
    public final ygk N;
    public final ygk O;
    public final ygk P;
    public final ygk Q;
    public final ygk R;

    public qgk(umk umkVar) {
        super(umkVar);
        this.G = (char) 0;
        this.H = -1L;
        this.J = new ygk(this, 6, false, false);
        this.K = new ygk(this, 6, true, false);
        this.L = new ygk(this, 6, false, true);
        this.M = new ygk(this, 5, false, false);
        this.N = new ygk(this, 5, true, false);
        this.O = new ygk(this, 5, false, true);
        this.P = new ygk(this, 4, false, false);
        this.Q = new ygk(this, 3, false, false);
        this.R = new ygk(this, 2, false, false);
    }

    public static String O0(Object obj, boolean z) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            String strValueOf = String.valueOf(Math.abs(l.longValue()));
            return str + Math.round(Math.pow(10.0d, strValueOf.length() - 1)) + "..." + str + Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof vhk ? ((vhk) obj).a : z ? "-" : String.valueOf(obj);
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String strT0 = T0(umk.class.getCanonicalName());
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            if (i >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && T0(className).equals(strT0)) {
                sb.append(": ");
                sb.append(stackTraceElement);
                break;
            }
            i++;
        }
        return sb.toString();
    }

    public static String P0(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String strO0 = O0(obj, z);
        String strO02 = O0(obj2, z);
        String strO03 = O0(obj3, z);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strO0)) {
            sb.append(str2);
            sb.append(strO0);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strO02)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strO02);
        }
        if (!TextUtils.isEmpty(strO03)) {
            sb.append(str3);
            sb.append(strO03);
        }
        return sb.toString();
    }

    public static vhk Q0(String str) {
        if (str == null) {
            return null;
        }
        return new vhk(str);
    }

    public static String T0(String str) {
        if (!TextUtils.isEmpty(str)) {
            int iLastIndexOf = str.lastIndexOf(46);
            if (iLastIndexOf != -1) {
                return str.substring(0, iLastIndexOf);
            }
            y2l.F.get();
            if (!((Boolean) zvj.C0.a(null)).booleanValue()) {
                return str;
            }
        }
        return "";
    }

    @Override // defpackage.pqk
    public final boolean N0() {
        return false;
    }

    public final void R0(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && S0(i)) {
            Log.println(i, Y0(), P0(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        dgj.v(str);
        wlk wlkVar = ((umk) this.E).N;
        if (wlkVar == null) {
            Log.println(6, Y0(), "Scheduler not set. Not logging error/warn");
            return;
        }
        if (!wlkVar.F) {
            Log.println(6, Y0(), "Scheduler not initialized. Not logging error/warn");
            return;
        }
        if (i < 0) {
            i = 0;
        }
        if (i >= 9) {
            i = 8;
        }
        wlkVar.T0(new dhk(this, i, str, obj, obj2, obj3));
    }

    public final boolean S0(int i) {
        return Log.isLoggable(Y0(), i);
    }

    public final ygk U0() {
        return this.Q;
    }

    public final ygk V0() {
        return this.J;
    }

    public final ygk W0() {
        return this.R;
    }

    public final ygk X0() {
        return this.M;
    }

    public final String Y0() {
        String str;
        synchronized (this) {
            try {
                if (this.I == null) {
                    String str2 = ((umk) this.E).H;
                    if (str2 == null) {
                        str2 = "FA";
                    }
                    this.I = str2;
                }
                dgj.v(this.I);
                str = this.I;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
