package defpackage;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f5f implements c5f, u5f {
    public final /* synthetic */ d5f E;
    public p4a F;
    public q28 G;

    public f5f(d5f d5fVar) {
        this.E = d5fVar;
        Object objF = d5fVar.f("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objF instanceof Bundle ? (Bundle) objF : null;
        if (bundle != null && this.G == null) {
            q28 q28Var = new q28(new t5f(this, new p3f(4, this)), 29);
            this.G = q28Var;
            q28Var.y(bundle);
        }
        d5fVar.b(new p3f(2, this), "androidx.savedstate.SavedStateRegistry");
    }

    @Override // defpackage.m4a
    public final c4a a() {
        p4a p4aVar = this.F;
        if (p4aVar != null) {
            return p4aVar;
        }
        p4a p4aVar2 = new p4a(this, false);
        this.F = p4aVar2;
        return p4aVar2;
    }

    @Override // defpackage.c5f
    public final b5f b(zy7 zy7Var, String str) {
        return this.E.b(zy7Var, str);
    }

    @Override // defpackage.c5f
    public final boolean d(Object obj) {
        return this.E.d(obj);
    }

    @Override // defpackage.c5f
    public final Map e() {
        return this.E.e();
    }

    @Override // defpackage.c5f
    public final Object f(String str) {
        return this.E.f(str);
    }

    @Override // defpackage.u5f
    public final q28 g() {
        q28 q28Var = this.G;
        if (q28Var == null) {
            q28 q28Var2 = new q28(new t5f(this, new p3f(4, this)), 29);
            this.G = q28Var2;
            q28Var2.y(null);
            q28Var = q28Var2;
        }
        return (q28) q28Var.G;
    }
}
