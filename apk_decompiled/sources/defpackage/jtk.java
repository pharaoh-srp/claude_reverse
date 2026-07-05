package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jtk implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ Bundle F;
    public final /* synthetic */ jsk G;

    public /* synthetic */ jtk(jsk jskVar, Bundle bundle, int i) {
        this.E = i;
        this.G = jskVar;
        this.F = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        Bundle bundle = this.F;
        jsk jskVar = this.G;
        switch (i) {
            case 0:
                umk umkVar = (umk) jskVar.E;
                Bundle bundleQ1 = bundle.isEmpty() ? bundle : jskVar.q1(bundle);
                jskVar.I0().d0.X(bundleQ1);
                if (!bundle.isEmpty() || umkVar.K.X0(null, zvj.i1)) {
                    hyk hykVarN = umkVar.n();
                    hykVarN.K0();
                    hykVarN.O0();
                    hykVarN.R0(new eok(hykVarN, hykVarN.d1(false), bundleQ1, 3));
                }
                break;
            default:
                jskVar.K0();
                jskVar.O0();
                String string = bundle.getString("name");
                dgj.s(string);
                umk umkVar2 = (umk) jskVar.E;
                if (!umkVar2.e()) {
                    jskVar.b0().R.b("Conditional property not cleared since app measurement is disabled");
                } else {
                    e1l e1lVar = new e1l(0L, null, string, "");
                    try {
                        h1l h1lVarJ0 = jskVar.J0();
                        bundle.getString("app_id");
                        umkVar2.n().T0(new kqj(bundle.getString("app_id"), "", e1lVar, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), h1lVarJ0.Z0(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true)));
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
                break;
        }
    }
}
