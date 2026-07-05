package defpackage;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e0l {
    public static final String[] b = {"GoogleConsent", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "CmpSdkID"};
    public final HashMap a;

    public e0l(HashMap map) {
        HashMap map2 = new HashMap();
        this.a = map2;
        map2.putAll(map);
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            String str = b[i];
            HashMap map = this.a;
            if (map.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str);
                sb.append("=");
                sb.append((String) map.get(str));
            }
        }
        return sb.toString();
    }

    public final int b() {
        try {
            String str = (String) this.a.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e0l) {
            return a().equalsIgnoreCase(((e0l) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a();
    }
}
