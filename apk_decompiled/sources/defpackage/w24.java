package defpackage;

import android.content.Context;
import com.anthropic.claude.R;
import com.anthropic.claude.code.remote.i;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w24 implements zy7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ i F;
    public final /* synthetic */ l45 G;
    public final /* synthetic */ ybg H;
    public final /* synthetic */ Context I;

    public /* synthetic */ w24(i iVar, l45 l45Var, ybg ybgVar, Context context) {
        this.F = iVar;
        this.G = l45Var;
        this.H = ybgVar;
        this.I = context;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        Context context = this.I;
        ybg ybgVar = this.H;
        l45 l45Var = this.G;
        switch (i) {
            case 0:
                nl1 nl1Var = new nl1(context, 1);
                b04 b04Var = new b04(l45Var, ybgVar, 5);
                i iVar = this.F;
                n58 n58VarQ0 = iVar.q0();
                if (n58VarQ0 != null) {
                    gb9.D(iVar.a, null, null, new tm(iVar, n58VarQ0, nl1Var, b04Var, (tp4) null, 23), 3);
                } else {
                    b04Var.invoke("No git info available");
                }
                break;
            default:
                ei eiVar = new ei(l45Var, ybgVar, context, 27);
                b04 b04Var2 = new b04(l45Var, ybgVar, 2);
                i iVar2 = this.F;
                String strE0 = iVar2.E0();
                if (strE0 != null) {
                    gb9.D(iVar2.a, null, null, new w14(iVar2, strE0, b04Var2, eiVar, null, 4), 3);
                } else {
                    String string = iVar2.o.getString(R.string.ccr_error_unknown);
                    string.getClass();
                    b04Var2.invoke(string);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ w24(i iVar, Context context, l45 l45Var, ybg ybgVar) {
        this.F = iVar;
        this.I = context;
        this.G = l45Var;
        this.H = ybgVar;
    }
}
