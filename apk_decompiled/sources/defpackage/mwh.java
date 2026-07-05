package defpackage;

import java.util.Map;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
public final class mwh {
    public final bg9 a;
    public final h86 b;

    public mwh(bg9 bg9Var, h86 h86Var) {
        this.a = bg9Var;
        this.b = h86Var;
    }

    public final boolean a(String str) {
        Object hreVar;
        str.getClass();
        if (bsg.I0(str)) {
            return false;
        }
        try {
            hreVar = this.a.e(str);
        } catch (Throwable th) {
            hreVar = new hre(th);
        }
        if (hreVar instanceof hre) {
            hreVar = null;
        }
        Object obj = (JsonElement) hreVar;
        if (obj instanceof JsonObject) {
            if (((Map) obj).isEmpty()) {
                return false;
            }
        } else if (!(obj instanceof JsonArray)) {
            return false;
        }
        return true;
    }
}
