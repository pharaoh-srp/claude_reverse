package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.experience.CacheType;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final class vj extends xzg implements pz7 {
    public final /* synthetic */ int E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vj(int i) {
        super(2, null);
        this.E = i;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new vj(2, tp4Var, 0);
            case 1:
                return new vj(2, tp4Var, 1);
            case 2:
                return new vj(2, tp4Var, 2);
            case 3:
                return new vj(2, tp4Var, 3);
            case 4:
                return new vj(2, tp4Var, 4);
            case 5:
                return new vj(2, tp4Var, 5);
            case 6:
                return new vj(2, tp4Var, 6);
            case 7:
                return new vj(2, tp4Var, 7);
            case 8:
                return new vj(2, tp4Var, 8);
            case 9:
                return new vj(2, tp4Var, 9);
            case 10:
                return new vj(2, tp4Var, 10);
            case 11:
                return new vj(2, tp4Var, 11);
            case 12:
                return new vj(2, tp4Var, 12);
            case 13:
                return new vj(2, tp4Var, 13);
            case 14:
                return new vj(2, tp4Var, 14);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return new vj(2, tp4Var, 15);
            case 16:
                return new vj(2, tp4Var, 16);
            case g.MAX_FIELD_NUMBER /* 17 */:
                return new vj(2, tp4Var, 17);
            default:
                return new vj(2, tp4Var, 18);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        int i2 = 2;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                Object obj3 = ((ai2) obj).a;
                new vj(i2, (tp4) obj2, 0).invokeSuspend(ieiVar);
                return qj.a;
            case 1:
                ((vj) create((iei) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return rj.a;
            case 2:
                return ((vj) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 3:
                ((vj) create((vt6) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 4:
                ((vj) create((iei) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return null;
            case 5:
                ((vj) create((String) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return null;
            case 6:
                return ((vj) create((String) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 7:
                return ((vj) create((JsonObject) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 8:
                return ((vj) create((JsonObject) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 9:
                ((vj) create((CacheType) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return Boolean.FALSE;
            case 10:
                ((vj) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 11:
                long j = ((fcc) obj).a;
                new vj(i2, (tp4) obj2, 11).invokeSuspend(ieiVar);
                return ieiVar;
            case 12:
                ((vj) create((h9f) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 13:
                ((vj) create((vt6) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 14:
                return ((vj) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((vj) create((h9f) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 16:
                ((vj) create((iei) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return oqf.a;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((vj) create((vt6) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((vj) create(bool, (tp4) obj2)).invokeSuspend(ieiVar);
                return Boolean.FALSE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vj(int i, tp4 tp4Var, int i2) {
        super(i, tp4Var);
        this.E = i2;
    }
}
