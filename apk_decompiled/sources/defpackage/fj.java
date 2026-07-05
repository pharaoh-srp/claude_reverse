package defpackage;

import androidx.health.platform.client.proto.g;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class fj extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ Object G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fj(Object obj, tp4 tp4Var, int i) {
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
                return new fj((hj) obj2, tp4Var, 0);
            case 1:
                return new fj((hw2) obj2, tp4Var, 1);
            case 2:
                return new fj((sl) obj2, tp4Var, 2);
            case 3:
                return new fj((oq4) obj2, tp4Var, 3);
            case 4:
                return new fj((nd5) obj2, tp4Var, 4);
            case 5:
                return new fj((ev6) obj2, tp4Var, 5);
            case 6:
                return new fj((h07) obj2, tp4Var, 6);
            case 7:
                return new fj((bg7) obj2, tp4Var, 7);
            case 8:
                return new fj((gq7) obj2, tp4Var, 8);
            case 9:
                return new fj((pt7) obj2, tp4Var, 9);
            case 10:
                return new fj((c78) obj2, tp4Var, 10);
            case 11:
                return new fj((m98) obj2, tp4Var, 11);
            case 12:
                return new fj((p98) obj2, tp4Var, 12);
            case 13:
                return new fj((mg8) obj2, tp4Var, 13);
            case 14:
                return new fj((dl8) obj2, tp4Var, 14);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return new fj((pe6) obj2, tp4Var, 15);
            case 16:
                return new fj((vb9) obj2, tp4Var, 16);
            case g.MAX_FIELD_NUMBER /* 17 */:
                return new fj((u2a) obj2, tp4Var, 17);
            case g.AVG_FIELD_NUMBER /* 18 */:
                return new fj((s8a) obj2, tp4Var, 18);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new fj((nmi) obj2, tp4Var, 19);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return new fj((hpa) obj2, tp4Var, 20);
            case 21:
                return new fj((opa) obj2, tp4Var, 21);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new fj((jk5) obj2, tp4Var, 22);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new fj((kfh) obj2, tp4Var, 23);
            case 24:
                return new fj((vfh) obj2, tp4Var, 24);
            case BuildConfig.VERSION_CODE /* 25 */:
                return new fj((b7a) obj2, tp4Var, 25);
            case 26:
                return new fj((dnh) obj2, tp4Var, 26);
            default:
                return new fj((o7i) obj2, tp4Var, 27);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws Exception {
        int i = this.E;
        m45 m45Var = m45.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
            case 5:
                ((fj) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 7:
                ((fj) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 14:
                ((fj) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ((fj) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ((fj) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:485:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:487:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x01df -> B:107:0x01d0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x01ec -> B:117:0x01ef). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:329:0x04f9 -> B:325:0x04e8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fj.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
