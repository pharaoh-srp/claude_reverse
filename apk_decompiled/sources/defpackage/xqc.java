package defpackage;

import com.anthropic.router.panes.Panes;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xqc implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ xqc(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj2 = this.F;
        switch (i) {
            case 0:
                Panes panes = (Panes) obj;
                panes.getClass();
                if (!x44.r(w44.V0(panes.getMain()), obj2)) {
                    break;
                }
                break;
            case 1:
                Panes panes2 = (Panes) obj;
                panes2.getClass();
                break;
            case 2:
                String str = (String) obj;
                str.getClass();
                if (obj2 instanceof eli) {
                    ((eli) obj2).a(str);
                }
                break;
            default:
                String str2 = (String) obj;
                str2.getClass();
                if (obj2 instanceof eli) {
                    ((eli) obj2).a(str2);
                }
                break;
        }
        return ieiVar;
    }
}
