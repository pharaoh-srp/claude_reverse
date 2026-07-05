package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.code.remote.i;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class o14 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ i G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o14(i iVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = iVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        i iVar = this.G;
        switch (i) {
            case 0:
                return new o14(iVar, tp4Var, 0);
            case 1:
                return new o14(iVar, tp4Var, 1);
            case 2:
                return new o14(iVar, tp4Var, 2);
            case 3:
                return new o14(iVar, tp4Var, 3);
            case 4:
                return new o14(iVar, tp4Var, 4);
            case 5:
                return new o14(iVar, tp4Var, 5);
            case 6:
                return new o14(iVar, tp4Var, 6);
            case 7:
                return new o14(iVar, tp4Var, 7);
            case 8:
                return new o14(iVar, tp4Var, 8);
            case 9:
                return new o14(iVar, tp4Var, 9);
            case 10:
                return new o14(iVar, tp4Var, 10);
            case 11:
                return new o14(iVar, tp4Var, 11);
            case 12:
                return new o14(iVar, tp4Var, 12);
            case 13:
                return new o14(iVar, tp4Var, 13);
            case 14:
                return new o14(iVar, tp4Var, 14);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return new o14(iVar, tp4Var, 15);
            case 16:
                return new o14(iVar, tp4Var, 16);
            case g.MAX_FIELD_NUMBER /* 17 */:
                return new o14(iVar, tp4Var, 17);
            case g.AVG_FIELD_NUMBER /* 18 */:
                return new o14(iVar, tp4Var, 18);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new o14(iVar, tp4Var, 19);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return new o14(iVar, tp4Var, 20);
            case 21:
                return new o14(iVar, tp4Var, 21);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new o14(iVar, tp4Var, 22);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new o14(iVar, tp4Var, 23);
            case 24:
                return new o14(iVar, tp4Var, 24);
            case BuildConfig.VERSION_CODE /* 25 */:
                return new o14(iVar, tp4Var, 25);
            case 26:
                return new o14(iVar, tp4Var, 26);
            case 27:
                return new o14(iVar, tp4Var, 27);
            default:
                return new o14(iVar, tp4Var, 28);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        m45 m45Var = m45.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
            case 9:
                ((o14) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 10:
                ((o14) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ((o14) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x027c, code lost:
    
        if (r1.j(r16) == r15) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0297, code lost:
    
        if (defpackage.j8.H(r1, r2, r16) == r15) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x03ff, code lost:
    
        if (defpackage.j8.H(r1, r2, r16) == r15) goto L231;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 1524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o14.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
