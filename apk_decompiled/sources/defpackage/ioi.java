package defpackage;

import android.content.SharedPreferences;
import io.sentry.p;
import io.sentry.protocol.i0;
import io.sentry.t4;
import java.util.LinkedHashMap;
import java.util.Map;
import siftscience.android.Sift;

/* JADX INFO: loaded from: classes.dex */
public final class ioi extends iwe {
    public final qi3 b;
    public final g6g c;
    public final String d;
    public final String e;

    static {
        oqb oqbVar = fk0.K;
    }

    public ioi(q7 q7Var, koi koiVar, bzd bzdVar, bj0 bj0Var, p98 p98Var, rvg rvgVar, oq4 oq4Var, smh smhVar, q0i q0iVar, qi3 qi3Var, g6g g6gVar, fk0 fk0Var, h86 h86Var) {
        int i;
        super(h86Var);
        this.b = qi3Var;
        this.c = g6gVar;
        String str = koiVar.d;
        this.d = str;
        String str2 = koiVar.e;
        this.e = str2;
        pvg pvgVarC = eve.C(koiVar.e());
        synchronized (smhVar) {
            str2.getClass();
            smhVar.d = str2;
            if (smhVar.a.a.contains("third_party_analytics_disabled_for_org_".concat(str2))) {
                fk0 fk0Var2 = smhVar.a;
                String strConcat = "third_party_analytics_disabled_for_org_".concat(str2);
                SharedPreferences sharedPreferences = fk0Var2.a;
                smhVar.a(sharedPreferences.contains(strConcat) ? sharedPreferences.getBoolean(strConcat, false) : sharedPreferences.getBoolean("third_party_analytics_disabled_for_org", false));
            }
        }
        tp4 tp4Var = null;
        gb9.D(this.a, null, null, new d0i(q0iVar, tp4Var, 6), 3);
        boolean zM = fk0Var.m();
        str.getClass();
        i0 i0Var = new i0();
        i0Var.F = str;
        Map linkedHashMap = i0Var.K;
        linkedHashMap = linkedHashMap == null ? new LinkedHashMap() : linkedHashMap;
        linkedHashMap.put("current_organization_id", str2);
        i0Var.K = p.r(linkedHashMap);
        t4.o(i0Var);
        t4.n("subscription_level", pvgVarC.E);
        t4.n("is_ant", String.valueOf(zM));
        synchronized (g6gVar) {
            g6gVar.c = str;
            if (g6gVar.b) {
                Sift.setUserId(str);
            }
        }
        qi3Var.d(str, str2, q7Var.a().m105getEmail_addressZiuLfiY(), pvgVarC);
        String str3 = pvgVarC.E;
        fk0Var.A.setValue(str3);
        kgh.t(fk0Var.a, "last_subscription_level", str3);
        p98Var.c = rvgVar;
        gb9.D(p98Var.a, p98Var.b.b(), null, new fj(p98Var, tp4Var, 12), 2);
        if (oq4Var.f.compareAndSet(false, true)) {
            i = 3;
            gb9.D(oq4Var.e, null, null, new fj(oq4Var, tp4Var, i), 3);
        } else {
            i = 3;
        }
        bzdVar.b();
        gb9.D(this.a, null, null, new wmf(bj0Var, bzdVar, q0iVar, tp4Var, 6), i);
    }

    @Override // defpackage.iwe, defpackage.y59
    public final void onDestroy() {
        super.onDestroy();
        this.b.reset();
        String str = this.d;
        String str2 = this.e;
        str.getClass();
        str2.getClass();
        t4.e(new u95(str, 13, str2));
        g6g g6gVar = this.c;
        synchronized (g6gVar) {
            g6gVar.c = null;
            Sift.unsetUserId();
        }
    }
}
