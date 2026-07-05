package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b04 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ l45 F;
    public final /* synthetic */ ybg G;

    public /* synthetic */ b04(l45 l45Var, ybg ybgVar, int i) {
        this.E = i;
        this.F = l45Var;
        this.G = ybgVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        ybg ybgVar = this.G;
        l45 l45Var = this.F;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                gb9.D(l45Var, null, null, new yn(ybgVar, str, null, 1), 3);
                break;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                gb9.D(l45Var, null, null, new yn(ybgVar, str2, null, 4), 3);
                break;
            case 2:
                String str3 = (String) obj;
                str3.getClass();
                gb9.D(l45Var, null, null, new yn(ybgVar, str3, null, 5), 3);
                break;
            case 3:
                String str4 = (String) obj;
                str4.getClass();
                gb9.D(l45Var, null, null, new yn(ybgVar, str4, null, 6), 3);
                break;
            case 4:
                String str5 = (String) obj;
                str5.getClass();
                gb9.D(l45Var, null, null, new yn(ybgVar, str5, null, 7), 3);
                break;
            case 5:
                String str6 = (String) obj;
                str6.getClass();
                gb9.D(l45Var, null, null, new yn(ybgVar, str6, null, 3), 3);
                break;
            default:
                gb9.D(l45Var, null, null, new z99(ybgVar, ((Boolean) obj).booleanValue(), null, 1), 3);
                break;
        }
        return ieiVar;
    }
}
