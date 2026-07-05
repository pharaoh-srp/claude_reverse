package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dbd extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ String G;
    public final /* synthetic */ String H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dbd(String str, String str2, int i) {
        super(1);
        this.F = i;
        this.G = str;
        this.H = str2;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.F;
        iei ieiVar = iei.a;
        String str = this.H;
        String str2 = this.G;
        switch (i) {
            case 0:
                s6g s6gVar = (s6g) obj;
                s6gVar.getClass();
                df9 df9Var = ebd.b;
                s6gVar.a(str2, df9Var);
                df9 df9Var2 = ebd.a;
                s6gVar.a(str, df9Var, df9Var, df9Var2, df9Var2);
                s6gVar.c(str2, df9Var2);
                break;
            case 1:
                s6g s6gVar2 = (s6g) obj;
                s6gVar2.getClass();
                df9 df9Var3 = ebd.b;
                s6gVar2.a(str2, df9Var3);
                s6gVar2.a(str, df9Var3, df9Var3, df9Var3);
                s6gVar2.c(str2, df9Var3);
                break;
            case 2:
                s6g s6gVar3 = (s6g) obj;
                s6gVar3.getClass();
                df9 df9Var4 = ebd.b;
                s6gVar3.a(str2, df9Var4);
                df9 df9Var5 = ebd.c;
                df9 df9Var6 = ebd.a;
                s6gVar3.a(str, df9Var4, df9Var4, df9Var5, df9Var6);
                s6gVar3.c(str2, df9Var6);
                break;
            case 3:
                s6g s6gVar4 = (s6g) obj;
                s6gVar4.getClass();
                df9 df9Var7 = ebd.b;
                s6gVar4.a(str2, df9Var7);
                df9 df9Var8 = ebd.c;
                s6gVar4.a(str2, df9Var8);
                df9 df9Var9 = ebd.a;
                s6gVar4.a(str, df9Var7, df9Var8, df9Var8, df9Var9);
                s6gVar4.c(str2, df9Var9);
                break;
            case 4:
                s6g s6gVar5 = (s6g) obj;
                s6gVar5.getClass();
                df9 df9Var10 = ebd.c;
                s6gVar5.a(str2, df9Var10);
                s6gVar5.c(str, ebd.b, df9Var10);
                break;
            default:
                s6g s6gVar6 = (s6g) obj;
                s6gVar6.getClass();
                s6gVar6.a(str2, ebd.a);
                s6gVar6.c(str, ebd.b, ebd.c);
                break;
        }
        return ieiVar;
    }
}
