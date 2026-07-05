package defpackage;

import android.os.Bundle;
import com.anthropic.claude.api.experience.ExperienceToggle;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mtk implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ Bundle F;
    public final /* synthetic */ jsk G;

    public /* synthetic */ mtk(jsk jskVar, Bundle bundle, int i) {
        this.E = i;
        this.G = jskVar;
        this.F = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        Bundle bundleQ1 = this.F;
        jsk jskVar = this.G;
        switch (i) {
            case 0:
                umk umkVar = (umk) jskVar.E;
                if (!bundleQ1.isEmpty()) {
                    bundleQ1 = jskVar.q1(bundleQ1);
                }
                jskVar.I0().d0.X(bundleQ1);
                hyk hykVarN = umkVar.n();
                hykVarN.K0();
                hykVarN.O0();
                if (!hykVarN.a1() || hykVarN.J0().O1() >= 243100) {
                    hyk hykVarN2 = umkVar.n();
                    hykVarN2.K0();
                    hykVarN2.O0();
                    if (((umk) hykVarN2.E).K.X0(null, zvj.k1)) {
                        hykVarN2.R0(new ije((Object) hykVarN2, (a4) hykVarN2.d1(false), (Object) bundleQ1, 13));
                    }
                    break;
                }
                break;
            default:
                jskVar.K0();
                jskVar.O0();
                String string = bundleQ1.getString("name");
                String string2 = bundleQ1.getString("origin");
                dgj.s(string);
                dgj.s(string2);
                dgj.v(bundleQ1.get(ExperienceToggle.DEFAULT_PARAM_KEY));
                umk umkVar2 = (umk) jskVar.E;
                if (!umkVar2.e()) {
                    jskVar.b0().R.b("Conditional property not set since app measurement is disabled");
                } else {
                    e1l e1lVar = new e1l(bundleQ1.getLong("triggered_timestamp"), bundleQ1.get(ExperienceToggle.DEFAULT_PARAM_KEY), string, string2);
                    try {
                        h1l h1lVarJ0 = jskVar.J0();
                        bundleQ1.getString("app_id");
                        rvj rvjVarZ0 = h1lVarJ0.Z0(bundleQ1.getString("triggered_event_name"), bundleQ1.getBundle("triggered_event_params"), string2, 0L, true);
                        h1l h1lVarJ02 = jskVar.J0();
                        bundleQ1.getString("app_id");
                        rvj rvjVarZ02 = h1lVarJ02.Z0(bundleQ1.getString("timed_out_event_name"), bundleQ1.getBundle("timed_out_event_params"), string2, 0L, true);
                        h1l h1lVarJ03 = jskVar.J0();
                        bundleQ1.getString("app_id");
                        umkVar2.n().T0(new kqj(bundleQ1.getString("app_id"), string2, e1lVar, bundleQ1.getLong("creation_timestamp"), false, bundleQ1.getString("trigger_event_name"), rvjVarZ02, bundleQ1.getLong("trigger_timeout"), rvjVarZ0, bundleQ1.getLong("time_to_live"), h1lVarJ03.Z0(bundleQ1.getString("expired_event_name"), bundleQ1.getBundle("expired_event_params"), string2, 0L, true)));
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
                break;
        }
    }
}
