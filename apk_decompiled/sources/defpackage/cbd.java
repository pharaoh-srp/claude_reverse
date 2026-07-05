package defpackage;

import androidx.health.platform.client.proto.g;

/* JADX INFO: loaded from: classes3.dex */
public final class cbd extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ String G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cbd(String str, int i) {
        super(1);
        this.F = i;
        this.G = str;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.F;
        iei ieiVar = iei.a;
        String str = this.G;
        switch (i) {
            case 0:
                s6g s6gVar = (s6g) obj;
                s6gVar.getClass();
                df9 df9Var = ebd.b;
                s6gVar.a(str, df9Var, df9Var);
                break;
            case 1:
                s6g s6gVar2 = (s6g) obj;
                s6gVar2.getClass();
                s6gVar2.a(str, ebd.b);
                break;
            case 2:
                s6g s6gVar3 = (s6g) obj;
                s6gVar3.getClass();
                df9 df9Var2 = ebd.b;
                s6gVar3.a(str, df9Var2);
                s6gVar3.a(str, df9Var2);
                break;
            case 3:
                s6g s6gVar4 = (s6g) obj;
                s6gVar4.getClass();
                df9 df9Var3 = ebd.b;
                s6gVar4.a(str, df9Var3);
                s6gVar4.c(str, df9Var3);
                break;
            case 4:
                s6g s6gVar5 = (s6g) obj;
                s6gVar5.getClass();
                df9 df9Var4 = ebd.b;
                s6gVar5.a(str, df9Var4);
                s6gVar5.a(str, df9Var4);
                s6gVar5.c(str, df9Var4);
                break;
            case 5:
                s6g s6gVar6 = (s6g) obj;
                s6gVar6.getClass();
                s6gVar6.c(str, ebd.b);
                break;
            case 6:
                s6g s6gVar7 = (s6g) obj;
                s6gVar7.getClass();
                df9 df9Var5 = ebd.b;
                s6gVar7.a(str, df9Var5, df9Var5);
                s6gVar7.b(nk9.BOOLEAN);
                break;
            case 7:
                s6g s6gVar8 = (s6g) obj;
                s6gVar8.getClass();
                df9 df9Var6 = ebd.b;
                s6gVar8.c(str, df9Var6, df9Var6);
                break;
            case 8:
                s6g s6gVar9 = (s6g) obj;
                s6gVar9.getClass();
                df9 df9Var7 = ebd.b;
                s6gVar9.c(str, df9Var7, df9Var7);
                break;
            case 9:
                s6g s6gVar10 = (s6g) obj;
                s6gVar10.getClass();
                df9 df9Var8 = ebd.b;
                s6gVar10.a(str, df9Var8, df9Var8);
                break;
            case 10:
                s6g s6gVar11 = (s6g) obj;
                s6gVar11.getClass();
                df9 df9Var9 = ebd.b;
                s6gVar11.a(str, df9Var9, df9Var9, df9Var9);
                break;
            case 11:
                s6g s6gVar12 = (s6g) obj;
                s6gVar12.getClass();
                df9 df9Var10 = ebd.b;
                s6gVar12.a(str, df9Var10);
                s6gVar12.a(str, df9Var10);
                s6gVar12.c(str, ebd.a);
                break;
            case 12:
                s6g s6gVar13 = (s6g) obj;
                s6gVar13.getClass();
                df9 df9Var11 = ebd.b;
                s6gVar13.a(str, df9Var11);
                s6gVar13.a(str, df9Var11);
                s6gVar13.c(str, ebd.a);
                break;
            case 13:
                s6g s6gVar14 = (s6g) obj;
                s6gVar14.getClass();
                df9 df9Var12 = ebd.b;
                s6gVar14.a(str, df9Var12);
                s6gVar14.a(str, df9Var12);
                s6gVar14.a(str, df9Var12);
                s6gVar14.b(nk9.BOOLEAN);
                break;
            case 14:
                s6g s6gVar15 = (s6g) obj;
                s6gVar15.getClass();
                df9 df9Var13 = ebd.b;
                s6gVar15.a(str, df9Var13, df9Var13, df9Var13, df9Var13);
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                s6g s6gVar16 = (s6g) obj;
                s6gVar16.getClass();
                s6gVar16.c(str, ebd.b, ebd.c);
                break;
            case 16:
                s6g s6gVar17 = (s6g) obj;
                s6gVar17.getClass();
                s6gVar17.c(str, ebd.c);
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                s6g s6gVar18 = (s6g) obj;
                s6gVar18.getClass();
                s6gVar18.a(str, ebd.b, ebd.c);
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                s6g s6gVar19 = (s6g) obj;
                s6gVar19.getClass();
                s6gVar19.c(str, ebd.a);
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                s6g s6gVar20 = (s6g) obj;
                s6gVar20.getClass();
                s6gVar20.a(str, ebd.b);
                s6gVar20.b(nk9.BOOLEAN);
                break;
            default:
                s6g s6gVar21 = (s6g) obj;
                s6gVar21.getClass();
                df9 df9Var14 = ebd.b;
                s6gVar21.a(str, df9Var14);
                s6gVar21.a(str, df9Var14);
                s6gVar21.b(nk9.BOOLEAN);
                break;
        }
        return ieiVar;
    }
}
