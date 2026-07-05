package defpackage;

import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ex4 {
    public static final ih9 a = u00.c(new fc4(27));

    public static final JsonObject a(String str, String str2, Map map, List list) {
        map.getClass();
        rh9 rh9Var = new rh9();
        mpk.U(rh9Var, "name", str);
        mpk.U(rh9Var, "description", str2);
        mpk.W(rh9Var, "input_schema", new lj2(map, 25, list));
        return rh9Var.a();
    }
}
