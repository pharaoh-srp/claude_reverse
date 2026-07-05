package defpackage;

import android.view.KeyEvent;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.conway.f;
import com.anthropic.claude.types.strings.ForkId;
import com.anthropic.claude.types.strings.ModelId;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class z04 implements bz7, i92 {
    public final /* synthetic */ int E;
    public final Object F;
    public final Object G;

    public /* synthetic */ z04(Object obj, int i, Object obj2) {
        this.E = i;
        this.G = obj;
        this.F = obj2;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        tp4 tp4Var = null;
        switch (this.E) {
            case 0:
                return ((i04) this.G).invoke(((List) this.F).get(((Number) obj).intValue()));
            case 1:
                ((i04) this.G).invoke(((List) this.F).get(((Number) obj).intValue()));
                return "session";
            case 2:
                return ((i04) this.G).invoke(((ArrayList) this.F).get(((Number) obj).intValue()));
            case 3:
                return ((fc4) this.G).invoke(((List) this.F).get(((Number) obj).intValue()));
            case 4:
                return ((fc4) this.G).invoke(((List) this.F).get(((Number) obj).intValue()));
            case 5:
                try {
                    ((f4e) ((v82) this.G)).cancel();
                    break;
                } catch (Throwable unused) {
                }
                return iei.a;
            case 6:
                return ((fc4) this.G).invoke(((List) this.F).get(((Number) obj).intValue()));
            case 7:
                return ((fc4) this.G).invoke(((List) this.F).get(((Number) obj).intValue()));
            case 8:
                return ((fc4) this.G).invoke(((List) this.F).get(((Number) obj).intValue()));
            case 9:
                return ((fc4) this.G).invoke(((List) this.F).get(((Number) obj).intValue()));
            case 10:
                String strM1064unboximpl = ((ModelId) obj).m1064unboximpl();
                strM1064unboximpl.getClass();
                ((bz7) this.G).invoke(ModelId.m1058boximpl(strM1064unboximpl));
                ((zy7) this.F).a();
                return iei.a;
            case 11:
                String strM1028unboximpl = ((ForkId) obj).m1028unboximpl();
                strM1028unboximpl.getClass();
                f fVar = (f) this.G;
                Set set = f.j1;
                fVar.J0(strM1028unboximpl, true);
                ((nwb) this.F).setValue(Boolean.FALSE);
                return iei.a;
            case 12:
                int iIntValue = ((Number) obj).intValue();
                return ((lc4) this.G).invoke(Integer.valueOf(iIntValue), ((List) this.F).get(iIntValue));
            case 13:
                return ((qy4) this.G).invoke(((List) this.F).get(((Number) obj).intValue()));
            case 14:
                KeyEvent keyEvent = ((so9) obj).a;
                if (cn5.p(keyEvent)) {
                    ((zy7) this.G).a();
                    return Boolean.TRUE;
                }
                if (!cn5.q(keyEvent)) {
                    return Boolean.FALSE;
                }
                ((zy7) this.F).a();
                return Boolean.TRUE;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return ((xg5) this.G).invoke(((List) this.F).get(((Number) obj).intValue()));
            case 16:
                return ((xg5) this.G).invoke(((List) this.F).get(((Number) obj).intValue()));
            case g.MAX_FIELD_NUMBER /* 17 */:
                int iIntValue2 = ((Number) obj).intValue();
                return ((yi7) this.G).invoke(Integer.valueOf(iIntValue2), ((List) this.F).get(iIntValue2));
            case g.AVG_FIELD_NUMBER /* 18 */:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((mk4) this.G).invoke((n18) this.F, bool);
                return iei.a;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                bm7 bm7Var = (bm7) this.G;
                Object obj2 = bm7Var.b;
                ua2 ua2Var = (ua2) this.F;
                synchronized (obj2) {
                    ((ArrayList) bm7Var.c).remove(ua2Var);
                }
                return iei.a;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                int iIntValue3 = ((Number) obj).intValue();
                return ((yi7) this.G).invoke(Integer.valueOf(iIntValue3), ((List) this.F).get(iIntValue3));
            case 21:
                String str = (String) obj;
                str.getClass();
                ((pz7) this.G).invoke(((y2b) this.F).a, str);
                return iei.a;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ((jua) this.G).invoke(((ArrayList) this.F).get(((Number) obj).intValue()));
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                int iIntValue4 = ((Number) obj).intValue();
                return ((ww9) this.G).invoke(Integer.valueOf(iIntValue4), ((List) this.F).get(iIntValue4));
            case 24:
                int iIntValue5 = ((Number) obj).intValue();
                return ((oua) this.G).invoke(Integer.valueOf(iIntValue5), ((ArrayList) this.F).get(iIntValue5));
            case BuildConfig.VERSION_CODE /* 25 */:
                int iIntValue6 = ((Number) obj).intValue();
                return ((oua) this.G).invoke(Integer.valueOf(iIntValue6), ((List) this.F).get(iIntValue6));
            case 26:
                String strM1064unboximpl2 = ((ModelId) obj).m1064unboximpl();
                strM1064unboximpl2.getClass();
                r93 r93Var = ((t53) this.G).g0;
                gb9.D(r93Var.h, null, null, new o93(r93Var, strM1064unboximpl2, tp4Var, 0), 3);
                boolean zBooleanValue = ((Boolean) r93Var.l.getValue()).booleanValue();
                t4g t4gVar = (t4g) this.F;
                if (zBooleanValue) {
                    t4gVar.a();
                } else {
                    t4gVar.c();
                }
                return iei.a;
            case 27:
                String strM1064unboximpl3 = ((ModelId) obj).m1064unboximpl();
                strM1064unboximpl3.getClass();
                u3c u3cVar = (u3c) this.G;
                gb9.D(u3cVar.c, null, null, new kza(u3cVar, strM1064unboximpl3, tp4Var, 8), 3);
                ((r4g) this.F).a();
                return iei.a;
            case 28:
                e92 e92Var = (e92) obj;
                huk hukVar = (huk) this.G;
                e92 e92Var2 = (e92) this.F;
                e92Var.getClass();
                hukVar.l(e92Var2, e92Var);
                return iei.a;
            default:
                int iIntValue7 = ((Number) obj).intValue();
                return ((oua) this.G).invoke(Integer.valueOf(iIntValue7), ((List) this.F).get(iIntValue7));
        }
    }

    @Override // defpackage.i92
    public void onFailure(v82 v82Var, IOException iOException) {
        if (((f4e) v82Var).V) {
            return;
        }
        ((ua2) this.F).resumeWith(new hre(iOException));
    }

    @Override // defpackage.i92
    public void onResponse(v82 v82Var, pqe pqeVar) {
        ((ua2) this.F).resumeWith(pqeVar);
    }
}
