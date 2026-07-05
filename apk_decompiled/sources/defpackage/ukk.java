package defpackage;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ukk implements Callable {
    public final /* synthetic */ int E;
    public /* synthetic */ pkk F;
    public /* synthetic */ String G;

    public /* synthetic */ ukk(pkk pkkVar, String str, int i) {
        this.E = i;
        this.F = pkkVar;
        this.G = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.E) {
            case 0:
                mvd mvdVar = new mvd(this.F, this.G, false, 16);
                ppj ppjVar = new ppj("internal.remoteConfig", 1);
                ppjVar.F.put("getValue", new luk(mvdVar));
                return ppjVar;
            case 1:
                pkk pkkVar = this.F;
                String str = this.G;
                mjk mjkVarG1 = pkkVar.M0().G1(str);
                HashMap map = new HashMap();
                map.put("platform", "android");
                map.put("package_name", str);
                map.put("gmp_version", 102001L);
                if (mjkVarG1 != null) {
                    String strH = mjkVarG1.h();
                    if (strH != null) {
                        map.put("app_version", strH);
                    }
                    map.put("app_version_int", Long.valueOf(mjkVarG1.z()));
                    map.put("dynamite_version", Long.valueOf(mjkVarG1.O()));
                }
                return map;
            default:
                pkk pkkVar2 = this.F;
                String str2 = this.G;
                ukk ukkVar = new ukk();
                ukkVar.F = pkkVar2;
                ukkVar.G = str2;
                return new luk(ukkVar);
        }
    }

    public /* synthetic */ ukk() {
        this.E = 1;
    }
}
