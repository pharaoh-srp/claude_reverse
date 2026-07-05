package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class kf6 {
    public static final oqb d;
    public final qzb a;
    public final SharedPreferences b;
    public final mdg c;

    static {
        oqb oqbVar = new oqb();
        kce kceVar = jce.a;
        xai xaiVar = new xai(kceVar.b(zni.class));
        w7f w7fVar = new w7f(new qh1(xaiVar, kceVar.b(kf6.class), null, new zb5(11), kq9.G));
        oqbVar.a(w7fVar);
        fd9.n0(new ir9(oqbVar, w7fVar));
        oqbVar.d.add(xaiVar);
        d = oqbVar;
    }

    public kf6(doi doiVar, qzb qzbVar) {
        this.a = qzbVar;
        this.b = doiVar.a("drawer_feature_discovery");
        mdg mdgVar = new mdg();
        for (re6 re6Var : re6.G) {
            SharedPreferences sharedPreferences = this.b;
            re6Var.getClass();
            mdgVar.put(re6Var, Boolean.valueOf(sharedPreferences.getBoolean("has_seen_cowork_remote_tab", false)));
        }
        this.c = mdgVar;
    }
}
