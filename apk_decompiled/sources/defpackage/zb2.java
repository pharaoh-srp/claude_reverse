package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.sessions.types.PermissionMode;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zb2 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ bz7 F;

    public /* synthetic */ zb2(int i, bz7 bz7Var) {
        this.E = i;
        this.F = bz7Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        bz7 bz7Var = this.F;
        switch (i) {
            case 0:
                bz7Var.invoke(Boolean.FALSE);
                break;
            case 1:
                bz7Var.invoke(hcb.H);
                break;
            case 2:
                bz7Var.invoke(null);
                break;
            case 3:
                bz7Var.invoke(ir4.E);
                break;
            case 4:
                bz7Var.invoke(ir4.F);
                break;
            case 5:
                bz7Var.invoke("");
                break;
            case 6:
                bz7Var.invoke(new o86(1));
                break;
            case 7:
                bz7Var.invoke(new o86(0));
                break;
            case 8:
                bz7Var.invoke(Boolean.FALSE);
                break;
            case 9:
                bz7Var.invoke("pause");
                break;
            case 10:
                bz7Var.invoke("reset");
                break;
            case 11:
                bz7Var.invoke(PermissionMode.Default);
                break;
            case 12:
                bz7Var.invoke(PermissionMode.Plan);
                break;
            case 13:
                bz7Var.invoke(PermissionMode.Auto);
                break;
            case 14:
                bz7Var.invoke(eyh.E);
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                bz7Var.invoke(eyh.F);
                break;
            case 16:
                bz7Var.invoke(eyh.G);
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                bz7Var.invoke(x3g.G);
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                bz7Var.invoke(x3g.F);
                break;
            default:
                bz7Var.invoke(um6.E);
                break;
        }
        return ieiVar;
    }
}
