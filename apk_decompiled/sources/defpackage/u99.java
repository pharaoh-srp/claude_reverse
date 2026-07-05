package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u99 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ fk0 F;
    public final /* synthetic */ l45 G;
    public final /* synthetic */ ybg H;

    public /* synthetic */ u99(fk0 fk0Var, l45 l45Var, ybg ybgVar, int i) {
        this.E = i;
        this.F = fk0Var;
        this.G = l45Var;
        this.H = ybgVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        ybg ybgVar = this.H;
        l45 l45Var = this.G;
        fk0 fk0Var = this.F;
        Boolean bool = (Boolean) obj;
        switch (i) {
            case 0:
                boolean zBooleanValue = bool.booleanValue();
                fk0Var.I.setValue(bool);
                SharedPreferences sharedPreferences = fk0Var.a;
                vb7.B(sharedPreferences, "debug_force_flexible_update", zBooleanValue);
                if (zBooleanValue) {
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putLong("flexible_update_dismissed_at", 0L);
                    editorEdit.apply();
                }
                gb9.D(l45Var, null, null, new z99(ybgVar, zBooleanValue, null, 0), 3);
                break;
            default:
                boolean zBooleanValue2 = bool.booleanValue();
                fk0Var.B.setValue(bool);
                SharedPreferences.Editor editorEdit2 = fk0Var.a.edit();
                editorEdit2.putBoolean("internal_force_okhttp", zBooleanValue2);
                editorEdit2.apply();
                gb9.D(l45Var, null, null, new y99(ybgVar, null, 2), 3);
                break;
        }
        return ieiVar;
    }
}
