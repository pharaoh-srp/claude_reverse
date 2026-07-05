package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class t5f {
    public final u5f a;
    public final p3f b;
    public boolean e;
    public Bundle f;
    public boolean g;
    public final lz1 c = new lz1(29);
    public final LinkedHashMap d = new LinkedHashMap();
    public boolean h = true;

    public t5f(u5f u5fVar, p3f p3fVar) {
        this.a = u5fVar;
        this.b = p3fVar;
    }

    public final void a() {
        u5f u5fVar = this.a;
        if (u5fVar.a().b() != a4a.F) {
            sz6.j("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.e) {
                sz6.j("SavedStateRegistry was already attached.");
                return;
            }
            this.b.a();
            u5fVar.a().a(new t94(2, this));
            this.e = true;
        }
    }
}
