package defpackage;

import androidx.health.platform.client.proto.g;

/* JADX INFO: loaded from: classes2.dex */
public final class es0 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zy7 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ es0(zy7 zy7Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = zy7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new es0(this.F, tp4Var, 0);
            case 1:
                return new es0(this.F, tp4Var, 1);
            case 2:
                return new es0(this.F, tp4Var, 2);
            case 3:
                return new es0(this.F, tp4Var, 3);
            case 4:
                return new es0(this.F, tp4Var, 4);
            case 5:
                return new es0(this.F, tp4Var, 5);
            case 6:
                return new es0(this.F, tp4Var, 6);
            case 7:
                return new es0(this.F, tp4Var, 7);
            case 8:
                return new es0(this.F, tp4Var, 8);
            case 9:
                return new es0(this.F, tp4Var, 9);
            case 10:
                return new es0(this.F, tp4Var, 10);
            case 11:
                return new es0(this.F, tp4Var, 11);
            case 12:
                return new es0(this.F, tp4Var, 12);
            case 13:
                return new es0(this.F, tp4Var, 13);
            case 14:
                return new es0(this.F, tp4Var, 14);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return new es0(this.F, tp4Var, 15);
            case 16:
                return new es0(this.F, tp4Var, 16);
            case g.MAX_FIELD_NUMBER /* 17 */:
                return new es0(this.F, tp4Var, 17);
            case g.AVG_FIELD_NUMBER /* 18 */:
                return new es0(this.F, tp4Var, 18);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new es0(this.F, tp4Var, 19);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return new es0(this.F, tp4Var, 20);
            case 21:
                return new es0(this.F, tp4Var, 21);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new es0(this.F, tp4Var, 22);
            default:
                return new es0(this.F, tp4Var, 23);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
            case 0:
                ((es0) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 1:
                ((es0) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 2:
                ((es0) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 3:
                break;
            case 4:
                ((es0) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 5:
                ((es0) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 6:
                ((es0) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 7:
                ((es0) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 8:
                ((es0) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 9:
                ((es0) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 10:
                ((es0) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 11:
                ((es0) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 12:
                ((es0) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 13:
                ((es0) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 14:
                ((es0) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((es0) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 16:
                ((es0) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((es0) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ((es0) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((es0) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ((es0) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 21:
                ((es0) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((es0) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            default:
                ((es0) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        zy7 zy7Var = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                zy7Var.a();
                break;
            case 1:
                sf5.h0(obj);
                zy7Var.a();
                break;
            case 2:
                sf5.h0(obj);
                zy7Var.a();
                break;
            case 3:
                sf5.h0(obj);
                break;
            case 4:
                sf5.h0(obj);
                knk.z(getContext()).D0(new kw0(1, (zy7) zy7Var.a()));
                break;
            case 5:
                sf5.h0(obj);
                zy7Var.a();
                break;
            case 6:
                sf5.h0(obj);
                zy7Var.a();
                break;
            case 7:
                sf5.h0(obj);
                zy7Var.a();
                break;
            case 8:
                sf5.h0(obj);
                zy7Var.a();
                break;
            case 9:
                sf5.h0(obj);
                zy7Var.a();
                break;
            case 10:
                sf5.h0(obj);
                zy7Var.a();
                break;
            case 11:
                sf5.h0(obj);
                zy7Var.a();
                break;
            case 12:
                sf5.h0(obj);
                zy7Var.a();
                break;
            case 13:
                sf5.h0(obj);
                zy7Var.a();
                break;
            case 14:
                sf5.h0(obj);
                zy7Var.a();
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                sf5.h0(obj);
                zy7Var.a();
                break;
            case 16:
                sf5.h0(obj);
                zy7Var.a();
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                sf5.h0(obj);
                zy7Var.a();
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                sf5.h0(obj);
                zy7Var.a();
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                sf5.h0(obj);
                zy7Var.a();
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                sf5.h0(obj);
                zy7Var.a();
                break;
            case 21:
                sf5.h0(obj);
                zy7Var.a();
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                sf5.h0(obj);
                zy7Var.a();
                break;
            default:
                sf5.h0(obj);
                zy7Var.a();
                break;
        }
        return ieiVar;
    }
}
