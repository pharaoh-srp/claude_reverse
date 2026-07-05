package defpackage;

import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b1 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ c3d F;

    public /* synthetic */ b1(c3d c3dVar, int i) {
        this.E = i;
        this.F = c3dVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        c3d c3dVar = this.F;
        b3d b3dVar = (b3d) obj;
        switch (i) {
            case 0:
                b3d.k(b3dVar, c3dVar, 0, 0);
                break;
            case 1:
                b3dVar.f(c3dVar, 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                break;
            case 2:
                b3dVar.getClass();
                b3d.k(b3dVar, c3dVar, 0, 0);
                break;
            case 3:
                b3d.k(b3dVar, c3dVar, 0, 0);
                break;
            case 4:
                b3dVar.f(c3dVar, 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                break;
            case 5:
                b3dVar.getClass();
                b3dVar.f(c3dVar, 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                break;
            case 6:
                b3dVar.getClass();
                b3dVar.f(c3dVar, 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                break;
            case 7:
                b3dVar.f(c3dVar, 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                break;
            case 8:
                b3d.k(b3dVar, c3dVar, 0, 0);
                break;
            case 9:
                b3d.k(b3dVar, c3dVar, 0, 0);
                break;
            case 10:
                b3dVar.f(c3dVar, 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                break;
            case 11:
                b3dVar.getClass();
                b3dVar.f(c3dVar, 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                break;
            case 12:
                b3dVar.getClass();
                b3dVar.f(c3dVar, 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                break;
            case 13:
                b3dVar.getClass();
                b3dVar.f(c3dVar, 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                break;
            case 14:
                b3dVar.getClass();
                b3dVar.f(c3dVar, 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                b3dVar.getClass();
                b3dVar.f(c3dVar, 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                break;
            case 16:
                if (b3dVar.d() == fu9.E || b3dVar.e() == 0) {
                    b3d.a(b3dVar, c3dVar);
                    c3dVar.Z(y69.d(0L, c3dVar.I), MTTypesetterKt.kLineSkipLimitMultiplier, null);
                } else {
                    long jE = ((long) (b3dVar.e() - c3dVar.E)) << 32;
                    b3d.a(b3dVar, c3dVar);
                    c3dVar.Z(y69.d(jE, c3dVar.I), MTTypesetterKt.kLineSkipLimitMultiplier, null);
                }
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                b3dVar.getClass();
                b3dVar.f(c3dVar, 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                b3dVar.f(c3dVar, 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                b3dVar.getClass();
                b3dVar.f(c3dVar, 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                b3dVar.getClass();
                b3dVar.f(c3dVar, 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                break;
            case 21:
                b3dVar.getClass();
                b3dVar.f(c3dVar, 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                b3dVar.f(c3dVar, 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                break;
            default:
                b3dVar.f(c3dVar, 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                break;
        }
        return ieiVar;
    }
}
