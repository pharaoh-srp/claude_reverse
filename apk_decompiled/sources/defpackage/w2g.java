package defpackage;

import android.content.Context;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class w2g {
    public static final p94 b;
    public final Context a;

    static {
        o94 o94VarB = p94.b(w2g.class);
        o94VarB.a(iz5.a(wkb.class));
        o94VarB.a(iz5.a(Context.class));
        o94VarB.f = lz1.U;
        b = o94VarB.b();
    }

    public w2g(Context context) {
        this.a = context;
    }

    public final synchronized String a() {
        String string = this.a.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        this.a.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", string2).apply();
        return string2;
    }
}
