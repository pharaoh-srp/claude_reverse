package defpackage;

import android.content.Context;
import com.anthropic.claude.connector.auth.b;

/* JADX INFO: loaded from: classes.dex */
public final class hi4 {
    public final b a;
    public final gh2 b;
    public final l45 c;
    public fkg d;
    public fkg e;

    public hi4(b bVar, gh2 gh2Var, l45 l45Var) {
        bVar.getClass();
        gh2Var.getClass();
        l45Var.getClass();
        this.a = bVar;
        this.b = gh2Var;
        this.c = l45Var;
    }

    public static void a(hi4 hi4Var, String str, String str2, Context context, si4 si4Var, boolean z, pz7 pz7Var, zy7 zy7Var, int i) {
        pz7 pz7Var2 = (i & 32) != 0 ? null : pz7Var;
        gh2 gh2Var = hi4Var.b;
        str.getClass();
        context.getClass();
        gh2Var.getClass();
        hi4Var.d = gb9.D(hi4Var.c, null, null, new fi4(hi4Var, str, str2, context, si4Var, z, pz7Var2, gh2Var, zy7Var, null), 3);
    }

    public static void c(hi4 hi4Var, bi4 bi4Var, Context context, si4 si4Var, boolean z, pz7 pz7Var, zy1 zy1Var, zy7 zy7Var, int i) {
        boolean z2 = (i & 8) != 0 ? false : z;
        pz7 pz7Var2 = (i & 16) != 0 ? null : pz7Var;
        gh2 gh2Var = (i & 32) != 0 ? hi4Var.b : zy1Var;
        zy7 ll1Var = (i & 64) != 0 ? new ll1(10) : zy7Var;
        hi4Var.getClass();
        context.getClass();
        gh2Var.getClass();
        hi4Var.d = gb9.D(hi4Var.c, null, null, new gi4(hi4Var, bi4Var, context, si4Var, z2, pz7Var2, gh2Var, ll1Var, null), 3);
    }

    public final a4e b() {
        return this.a.g;
    }
}
