package defpackage;

import androidx.health.platform.client.proto.g;
import coil.compose.AsyncImagePainter;
import com.anthropic.claude.bell.BellModeService;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class cj extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ Object G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cj(Object obj, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = obj;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                return new cj((hj) obj2, tp4Var, 0);
            case 1:
                return new cj((gh2) obj2, tp4Var, 1);
            case 2:
                return new cj((wk) obj2, tp4Var, 2);
            case 3:
                return new cj((gr0) obj2, tp4Var, 3);
            case 4:
                return new cj((AsyncImagePainter) obj2, tp4Var, 4);
            case 5:
                return new cj((ci1) obj2, tp4Var, 5);
            case 6:
                return new cj((BellModeService) obj2, tp4Var, 6);
            case 7:
                return new cj((jp1) obj2, tp4Var, 7);
            case 8:
                return new cj((ah2) obj2, tp4Var, 8);
            case 9:
                return new cj((n78) obj2, tp4Var, 9);
            case 10:
                return new cj((db3) obj2, tp4Var, 10);
            case 11:
                return new cj((el3) obj2, tp4Var, 11);
            case 12:
                return new cj((ml3) obj2, tp4Var, 12);
            case 13:
                return new cj((nm3) obj2, tp4Var, 13);
            case 14:
                return new cj((oz3) obj2, tp4Var, 14);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return new cj((wg4) obj2, tp4Var, 15);
            case 16:
                return new cj((g81) obj2, tp4Var, 16);
            case g.MAX_FIELD_NUMBER /* 17 */:
                return new cj((h6j) obj2, tp4Var, 17);
            case g.AVG_FIELD_NUMBER /* 18 */:
                return new cj((dae) obj2, tp4Var, 18);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new cj((b55) obj2, tp4Var, 19);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return new cj((pq5) obj2, tp4Var, 20);
            case 21:
                return new cj((jx5) obj2, tp4Var, 21);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new cj((bg7) obj2, tp4Var, 22);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new cj((n01) obj2, tp4Var, 23);
            case 24:
                return new cj((e58) obj2, tp4Var, 24);
            case BuildConfig.VERSION_CODE /* 25 */:
                return new cj((t68) obj2, tp4Var, 25);
            case 26:
                return new cj((m98) obj2, tp4Var, 26);
            case 27:
                return new cj((ub8) obj2, tp4Var, 27);
            case 28:
                return new cj((ad8) obj2, tp4Var, 28);
            default:
                return new cj((id8) obj2, tp4Var, 29);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
            case 13:
                ((cj) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ((cj) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:395:0x0762, code lost:
    
        if (r1.b(r16, r0) == r12) goto L396;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 2112
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
