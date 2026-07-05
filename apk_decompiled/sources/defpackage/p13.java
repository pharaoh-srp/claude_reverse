package defpackage;

import com.anthropic.claude.api.chat.citation.Citation;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p13 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ bz7 F;
    public final /* synthetic */ String G;
    public final /* synthetic */ String H;

    public /* synthetic */ p13(int i, bz7 bz7Var, String str, String str2) {
        this.E = i;
        this.F = bz7Var;
        this.G = str;
        this.H = str2;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        String str = this.H;
        String str2 = this.G;
        bz7 bz7Var = this.F;
        String str3 = (String) obj;
        switch (i) {
            case 0:
                str3.getClass();
                Citation citation = (Citation) bz7Var.invoke(str3);
                if (citation != null) {
                    if (!citation.isGrouped()) {
                    }
                }
                break;
            default:
                str3.getClass();
                Citation citation2 = (Citation) bz7Var.invoke(str3);
                if (citation2 != null) {
                    if (!citation2.isGrouped()) {
                    }
                }
                break;
        }
        return str;
    }
}
