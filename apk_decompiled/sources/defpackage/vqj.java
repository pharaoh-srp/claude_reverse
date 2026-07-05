package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.pvporbit.freetype.FreeTypeConstants;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class vqj extends rok {
    public Boolean F;
    public String G;
    public frj H;
    public Boolean I;

    public static long Z0() {
        return ((Long) zvj.E.a(null)).longValue();
    }

    public final double L0(String str, yek yekVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) yekVar.a(null)).doubleValue();
        }
        String strO = this.H.o(str, yekVar.a);
        if (TextUtils.isEmpty(strO)) {
            return ((Double) yekVar.a(null)).doubleValue();
        }
        try {
            return ((Double) yekVar.a(Double.valueOf(Double.parseDouble(strO)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) yekVar.a(null)).doubleValue();
        }
    }

    public final int M0(String str, boolean z) {
        j3l.F.get();
        if (!((umk) this.E).K.X0(null, zvj.T0)) {
            return 100;
        }
        if (z) {
            return Math.max(Math.min(R0(str, zvj.T), 500), 100);
        }
        return 500;
    }

    public final String N0(String str) {
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            dgj.v(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            b0().J.c("Could not find SystemProperties class", e);
            return "";
        } catch (IllegalAccessException e2) {
            b0().J.c("Could not access SystemProperties.get()", e2);
            return "";
        } catch (NoSuchMethodException e3) {
            b0().J.c("Could not find SystemProperties.get() method", e3);
            return "";
        } catch (InvocationTargetException e4) {
            b0().J.c("SystemProperties.get() threw an exception", e4);
            return "";
        }
    }

    public final boolean O0(yek yekVar) {
        return X0(null, yekVar);
    }

    public final boolean P0() {
        if (this.F == null) {
            Boolean boolV0 = V0("app_measurement_lite");
            this.F = boolV0;
            if (boolV0 == null) {
                this.F = Boolean.FALSE;
            }
        }
        return this.F.booleanValue() || !((umk) this.E).I;
    }

    public final Bundle Q0() {
        umk umkVar = (umk) this.E;
        try {
            if (umkVar.E.getPackageManager() == null) {
                b0().J.b("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoC = nij.a(umkVar.E).C(FreeTypeConstants.FT_LOAD_PEDANTIC, umkVar.E.getPackageName());
            if (applicationInfoC != null) {
                return applicationInfoC.metaData;
            }
            b0().J.b("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            b0().J.c("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    public final int R0(String str, yek yekVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) yekVar.a(null)).intValue();
        }
        String strO = this.H.o(str, yekVar.a);
        if (TextUtils.isEmpty(strO)) {
            return ((Integer) yekVar.a(null)).intValue();
        }
        try {
            return ((Integer) yekVar.a(Integer.valueOf(Integer.parseInt(strO)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) yekVar.a(null)).intValue();
        }
    }

    public final long S0(String str, yek yekVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) yekVar.a(null)).longValue();
        }
        String strO = this.H.o(str, yekVar.a);
        if (TextUtils.isEmpty(strO)) {
            return ((Long) yekVar.a(null)).longValue();
        }
        try {
            return ((Long) yekVar.a(Long.valueOf(Long.parseLong(strO)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) yekVar.a(null)).longValue();
        }
    }

    public final mrk T0(String str, boolean z) {
        Object obj;
        dgj.s(str);
        Bundle bundleQ0 = Q0();
        if (bundleQ0 == null) {
            b0().J.b("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleQ0.get(str);
        }
        mrk mrkVar = mrk.UNINITIALIZED;
        if (obj == null) {
            return mrkVar;
        }
        if (Boolean.TRUE.equals(obj)) {
            return mrk.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return mrk.DENIED;
        }
        if (z && "eu_consent_policy".equals(obj)) {
            return mrk.POLICY;
        }
        b0().M.c("Invalid manifest metadata for", str);
        return mrkVar;
    }

    public final String U0(String str, yek yekVar) {
        return TextUtils.isEmpty(str) ? (String) yekVar.a(null) : (String) yekVar.a(this.H.o(str, yekVar.a));
    }

    public final Boolean V0(String str) {
        dgj.s(str);
        Bundle bundleQ0 = Q0();
        if (bundleQ0 == null) {
            b0().J.b("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleQ0.containsKey(str)) {
            return Boolean.valueOf(bundleQ0.getBoolean(str));
        }
        return null;
    }

    public final boolean W0(String str, yek yekVar) {
        return X0(str, yekVar);
    }

    public final boolean X0(String str, yek yekVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) yekVar.a(null)).booleanValue();
        }
        String strO = this.H.o(str, yekVar.a);
        return TextUtils.isEmpty(strO) ? ((Boolean) yekVar.a(null)).booleanValue() : ((Boolean) yekVar.a(Boolean.valueOf("1".equals(strO)))).booleanValue();
    }

    public final boolean Y0(String str) {
        return "1".equals(this.H.o(str, "measurement.event_sampling_enabled"));
    }

    public final boolean a1() {
        Boolean boolV0 = V0("google_analytics_automatic_screen_reporting_enabled");
        return boolV0 == null || boolV0.booleanValue();
    }
}
