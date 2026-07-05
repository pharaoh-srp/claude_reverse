package defpackage;

import com.anthropic.claude.types.strings.TaskId;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w65 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ lvh F;
    public final /* synthetic */ String G;

    public /* synthetic */ w65(String str, lvh lvhVar) {
        this.E = 0;
        this.G = str;
        this.F = lvhVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        String str = this.G;
        lvh lvhVar = this.F;
        switch (i) {
            case 0:
                if (str != null) {
                    lvhVar.l.invoke(str);
                }
                break;
            case 1:
                lvhVar.l.invoke(str);
                break;
            case 2:
                lvhVar.k.invoke(str);
                break;
            default:
                lvhVar.o.invoke(TaskId.m1128boximpl(str));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ w65(lvh lvhVar, String str, int i) {
        this.E = i;
        this.F = lvhVar;
        this.G = str;
    }
}
