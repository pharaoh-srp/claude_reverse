package defpackage;

import androidx.health.platform.client.proto.g;
import java.io.IOException;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fl implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ iqb F;

    public /* synthetic */ fl(int i, int i2, iqb iqbVar) {
        this.E = i2;
        this.F = iqbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i = this.E;
        iei ieiVar = iei.a;
        iqb iqbVar = this.F;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                il.f(iqbVar, ld4Var, x44.p0(7));
                break;
            case 1:
                iuj.a(iqbVar, ld4Var, x44.p0(1));
                break;
            case 2:
                cvk.b(iqbVar, ld4Var, x44.p0(1));
                break;
            case 3:
                x21.c(iqbVar, ld4Var, x44.p0(1));
                break;
            case 4:
                me7.d(iqbVar, ld4Var, x44.p0(7));
                break;
            case 5:
                us2.d(iqbVar, ld4Var, x44.p0(1));
                break;
            case 6:
                vok.d(iqbVar, ld4Var, x44.p0(7));
                break;
            case 7:
                vok.g(iqbVar, ld4Var, x44.p0(1));
                break;
            case 8:
                vok.e(iqbVar, ld4Var, x44.p0(7));
                break;
            case 9:
                vok.b(iqbVar, ld4Var, x44.p0(1));
                break;
            case 10:
                vok.c(iqbVar, ld4Var, x44.p0(7));
                break;
            case 11:
                vok.a(iqbVar, ld4Var, x44.p0(7));
                break;
            case 12:
                vok.i(iqbVar, ld4Var, x44.p0(7));
                break;
            case 13:
                vok.h(iqbVar, ld4Var, x44.p0(7));
                break;
            case 14:
                vok.f(iqbVar, ld4Var, x44.p0(7));
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ypk.i(iqbVar, ld4Var, x44.p0(1));
                break;
            case 16:
                fsk.b(iqbVar, ld4Var, x44.p0(7));
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ne5.b(iqbVar, ld4Var, x44.p0(1));
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ikk.a(iqbVar, ld4Var, x44.p0(1));
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                fuk.l(iqbVar, ld4Var, x44.p0(1));
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                fuk.o(iqbVar, ld4Var, x44.p0(1));
                break;
            case 21:
                fuk.n(iqbVar, ld4Var, x44.p0(1));
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ykk.e(iqbVar, ld4Var, x44.p0(1));
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                u4b.a(iqbVar, ld4Var, x44.p0(7));
                break;
            case 24:
                fik.f(iqbVar, ld4Var, x44.p0(1));
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                npf.k(iqbVar, ld4Var, x44.p0(1));
                break;
            case 26:
                rwj.e(iqbVar, ld4Var, x44.p0(1));
                break;
            case 27:
                auk.a(iqbVar, ld4Var, x44.p0(7));
                break;
            default:
                oyk.a(iqbVar, ld4Var, x44.p0(1));
                break;
        }
        return ieiVar;
    }
}
