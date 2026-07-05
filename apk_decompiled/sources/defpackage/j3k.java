package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j3k {
    public static final vde a;
    public static final vde b;
    public static final vde c;

    static {
        qz8.r("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");
        iz8 iz8Var = nz8.F;
        Object[] objArr = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        bvk.e(7, objArr);
        a = nz8.m(7, objArr);
        Object[] objArr2 = {"auto", "app", "am"};
        bvk.e(3, objArr2);
        b = nz8.m(3, objArr2);
        c = nz8.v("_r", "_dbg");
        hz8 hz8Var = new hz8(4);
        hz8Var.f(tik.c);
        hz8Var.f(tik.d);
        hz8Var.g();
        nz8.v("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    public static boolean a(String str, Bundle bundle) {
        if (!a.contains(str)) {
            vde vdeVar = c;
            int i = vdeVar.H;
            int i2 = 0;
            while (i2 < i) {
                Object obj = vdeVar.get(i2);
                i2++;
                if (bundle.containsKey((String) obj)) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean b(String str, Bundle bundle) {
        if (!"_cmp".equals(str)) {
            return true;
        }
        if (c()) {
            vde vdeVar = c;
            int i = vdeVar.H;
            int i2 = 0;
            while (i2 < i) {
                Object obj = vdeVar.get(i2);
                i2++;
                if (bundle.containsKey((String) obj)) {
                }
            }
            bundle.putString("_cis", "fcm_integration");
            return true;
        }
        return false;
    }

    public static boolean c() {
        return !b.contains("fcm");
    }
}
