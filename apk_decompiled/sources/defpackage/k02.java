package defpackage;

import androidx.sqlite.driver.bundled.BundledSQLiteConnectionKt;
import androidx.sqlite.driver.bundled.BundledSQLiteDriverKt;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k02 implements mze {
    public final LinkedHashMap E;

    public k02(int i) {
        switch (i) {
            case 1:
                this.E = new LinkedHashMap();
                break;
            default:
                this.E = new LinkedHashMap();
                break;
        }
    }

    @Override // defpackage.mze
    public boolean B() {
        return false;
    }

    @Override // defpackage.mze
    public lze r(String str) {
        str.getClass();
        int i = j02.a;
        i02 i02Var = new i02(BundledSQLiteDriverKt.nativeOpen(str, 6));
        try {
            for (Map.Entry entry : this.E.entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                str2.getClass();
                if (i02Var.F) {
                    u00.N(21, "connection is closed");
                    throw null;
                }
                BundledSQLiteConnectionKt.nativeLoadExtension(i02Var.E, str2, str3);
            }
            return i02Var;
        } catch (Throwable th) {
            i02Var.close();
            throw th;
        }
    }
}
