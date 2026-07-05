package defpackage;

import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings.SessionId;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qn implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ bz7 F;
    public final /* synthetic */ String G;

    public /* synthetic */ qn(bz7 bz7Var, String str, int i) {
        this.E = i;
        this.F = bz7Var;
        this.G = str;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        String str = this.G;
        bz7 bz7Var = this.F;
        switch (i) {
            case 0:
                bz7Var.invoke(SessionId.m1114boximpl(str));
                break;
            case 1:
                bz7Var.invoke(str);
                break;
            case 2:
                bz7Var.invoke(ModelId.m1058boximpl(str));
                break;
            case 3:
                bz7Var.invoke(str);
                break;
            case 4:
                bz7Var.invoke(str);
                break;
            case 5:
                bz7Var.invoke(str);
                break;
            default:
                bz7Var.invoke(str);
                break;
        }
        return ieiVar;
    }
}
