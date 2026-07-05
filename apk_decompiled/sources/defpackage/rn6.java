package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rn6 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ fk0 F;

    public /* synthetic */ rn6(fk0 fk0Var, int i) {
        this.E = i;
        this.F = fk0Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        fk0 fk0Var = this.F;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                fk0Var.getClass();
                fk0Var.i.setValue(str);
                kgh.t(fk0Var.a, "http_override_country_code", str);
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                fk0Var.h.setValue(bool);
                vb7.B(fk0Var.a, "internal_settings_bubble_enabled", zBooleanValue);
                break;
            case 2:
                Boolean bool2 = (Boolean) obj;
                boolean zBooleanValue2 = bool2.booleanValue();
                fk0Var.J.setValue(bool2);
                vb7.B(fk0Var.a, "debug_force_octopus", zBooleanValue2);
                break;
            case 3:
                Boolean bool3 = (Boolean) obj;
                boolean zBooleanValue3 = bool3.booleanValue();
                fk0Var.g.setValue(bool3);
                vb7.B(fk0Var.a, "jank_overlay_enabled", zBooleanValue3);
                break;
            case 4:
                Boolean bool4 = (Boolean) obj;
                boolean zBooleanValue4 = bool4.booleanValue();
                fk0Var.f.setValue(bool4);
                vb7.B(fk0Var.a, "http_logging_verbose", zBooleanValue4);
                break;
            case 5:
                Boolean bool5 = (Boolean) obj;
                boolean zBooleanValue5 = bool5.booleanValue();
                fk0Var.C.setValue(bool5);
                vb7.B(fk0Var.a, "record_sse_transcripts", zBooleanValue5);
                break;
            case 6:
                Boolean bool6 = (Boolean) obj;
                boolean zBooleanValue6 = bool6.booleanValue();
                fk0Var.w.setValue(bool6);
                vb7.B(fk0Var.a, "slow_network_simulation_enabled", zBooleanValue6);
                break;
            case 7:
                int iIntValue = ((Integer) obj).intValue();
                fk0Var.getClass();
                fk0Var.y.setValue(Integer.valueOf(wd6.e0(iIntValue, 0, 100)));
                SharedPreferences.Editor editorEdit = fk0Var.a.edit();
                editorEdit.putInt("request_failure_rate", fk0Var.i());
                editorEdit.apply();
                break;
            case 8:
                int iIntValue2 = ((Integer) obj).intValue();
                fk0Var.getClass();
                fk0Var.x.setValue(Integer.valueOf(wd6.e0(iIntValue2, 0, 100)));
                SharedPreferences.Editor editorEdit2 = fk0Var.a.edit();
                editorEdit2.putInt("upload_failure_rate", fk0Var.k());
                editorEdit2.apply();
                break;
            default:
                int iIntValue3 = ((Integer) obj).intValue();
                fk0Var.getClass();
                fk0Var.z.setValue(Integer.valueOf(wd6.e0(iIntValue3, 0, 30000)));
                SharedPreferences.Editor editorEdit3 = fk0Var.a.edit();
                editorEdit3.putInt("request_latency_ms", fk0Var.j());
                editorEdit3.apply();
                break;
        }
        return ieiVar;
    }
}
