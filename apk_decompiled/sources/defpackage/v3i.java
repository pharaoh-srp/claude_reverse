package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class v3i {
    public final int a;
    public final String b;
    public final int c;
    public final jw7[] d;
    public int e;

    static {
        tpi.w(0);
        tpi.w(1);
    }

    public v3i(String str, jw7... jw7VarArr) {
        fd9.E(jw7VarArr.length > 0);
        this.b = str;
        this.d = jw7VarArr;
        this.a = jw7VarArr.length;
        String str2 = jw7VarArr[0].o;
        this.c = TextUtils.isEmpty(str2) ? gkb.f(jw7VarArr[0].n) : gkb.f(str2);
        String str3 = jw7VarArr[0].d;
        str3 = (str3 == null || str3.equals("und")) ? "" : str3;
        int i = jw7VarArr[0].f | 16384;
        for (int i2 = 1; i2 < jw7VarArr.length; i2++) {
            String str4 = jw7VarArr[i2].d;
            if (!str3.equals((str4 == null || str4.equals("und")) ? "" : str4)) {
                a(i2, "languages", jw7VarArr[0].d, jw7VarArr[i2].d);
                return;
            } else {
                if (i != (jw7VarArr[i2].f | 16384)) {
                    a(i2, "role flags", Integer.toBinaryString(jw7VarArr[0].f), Integer.toBinaryString(jw7VarArr[i2].f));
                    return;
                }
            }
        }
    }

    public static void a(int i, String str, String str2, String str3) {
        StringBuilder sbR = kgh.r("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbR.append(str3);
        sbR.append("' (track ");
        sbR.append(i);
        sbR.append(")");
        ysj.k("TrackGroup", "", new IllegalStateException(sbR.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v3i.class == obj.getClass()) {
            v3i v3iVar = (v3i) obj;
            if (this.b.equals(v3iVar.b) && Arrays.equals(this.d, v3iVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.d) + kgh.l(527, 31, this.b);
        }
        return this.e;
    }

    public final String toString() {
        return this.b + ": " + Arrays.toString(this.d);
    }
}
