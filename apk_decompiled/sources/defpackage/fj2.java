package defpackage;

import android.graphics.Color;
import androidx.compose.foundation.layout.b;
import com.anthropic.claude.R;
import com.anthropic.claude.api.common.RateLimit;
import com.anthropic.claude.api.common.WindowStatus;
import com.anthropic.claude.tool.model.ChartDisplayV0InputSeriesItem;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fj2 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ long F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public /* synthetic */ fj2(long j, sbg sbgVar, String str) {
        this.E = 7;
        this.F = j;
        this.G = sbgVar;
        this.H = str;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        Date resetsAt;
        WindowStatus windowStatus;
        int i = this.E;
        int i2 = 9;
        long j = this.F;
        int i3 = 0;
        iei ieiVar = iei.a;
        Object obj3 = this.H;
        Object obj4 = this.G;
        switch (i) {
            case 0:
                jl3 jl3Var = (jl3) obj3;
                x2a x2aVar = (x2a) obj;
                uub uubVar = (uub) obj2;
                x2aVar.getClass();
                uubVar.getClass();
                List list = (List) obj4;
                ArrayList arrayList = new ArrayList(x44.y(list, 10));
                int i4 = 0;
                for (Object obj5 : list) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        x44.n0();
                        throw null;
                    }
                    String color = ((ChartDisplayV0InputSeriesItem) obj5).getColor();
                    long jC = pj2.c(jl3Var, i4);
                    if (color != null) {
                        try {
                            jC = d4c.m(Color.parseColor(color));
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    arrayList.add(new d54(jC));
                    i4 = i5;
                }
                wdh wdhVarH = pj2.h(j);
                Object obj6 = uubVar.a.get(pj2.a);
                obj6.getClass();
                for (Object obj7 : (Iterable) obj6) {
                    int i6 = i3 + 1;
                    if (i3 < 0) {
                        x44.n0();
                        throw null;
                    }
                    x2aVar.E.invoke(new w2a(fpk.h(dmk.e(((d54) arrayList.get(i3 % arrayList.size())).a), y35.I), wdhVarH, (String) obj7));
                    i3 = i6;
                }
                return ieiVar;
            case 1:
                gne gneVar = (gne) obj4;
                RateLimit.ExceedsLimit exceedsLimit = (RateLimit.ExceedsLimit) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else if (gneVar == null && x44.r(exceedsLimit.getPerModelLimit(), Boolean.TRUE)) {
                    e18Var.a0(1645124987);
                    tjh.b(d4c.j0(R.string.rate_limit_try_later_or_switch, e18Var), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var, 0, 0, 262142);
                    e18Var.p(false);
                } else {
                    e18Var.a0(1645223567);
                    if (gneVar == null || (windowStatus = gneVar.b) == null || (resetsAt = windowStatus.getResetsAt()) == null) {
                        resetsAt = exceedsLimit.getResetsAt();
                    }
                    h66.u(resetsAt, j, e18Var, 0);
                    e18Var.p(false);
                }
                return ieiVar;
            case 2:
                zb0 zb0Var = (zb0) obj4;
                tkh tkhVar = (tkh) obj3;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tjh.c(zb0Var, null, this.F, 0L, 0L, null, 0L, 2, false, 1, 0, null, null, tkhVar, e18Var2, 0, 24960, 241658);
                } else {
                    e18Var2.T();
                }
                return ieiVar;
            case 3:
                ((Integer) obj2).getClass();
                ztj.d((iqb) obj4, this.F, (String) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            case 4:
                ((Integer) obj2).getClass();
                nuj.j((bpc) obj4, this.F, (iqb) obj3, (ld4) obj, x44.p0(9));
                return ieiVar;
            case 5:
                ((Integer) obj2).getClass();
                lvj.a(x44.p0(1), this.F, (ld4) obj, (pz7) obj3, (v8g) obj4);
                return ieiVar;
            case 6:
                gvg gvgVar = (gvg) obj;
                rl4 rl4Var = (rl4) obj2;
                gvgVar.getClass();
                c3d c3dVarU = ((h5b) w44.L0(gvgVar.p(new ta4(-1245015619, true, new ufe(yfd.p(b.c((iqb) obj4, 1.0f), j, zni.b), i2, ((h5b) w44.L0(gvgVar.p(new ta4(-1564605757, true, new tte((ta4) obj3, 4, i3 == true ? (byte) 1 : (byte) 0)), "content"))).u(rl4Var.a))), "placeholder"))).u(rl4Var.a);
                return gvgVar.U(c3dVarU.E, c3dVarU.F, nm6.E, new b1(c3dVarU, 21));
            case 7:
                sbg sbgVar = (sbg) obj4;
                String str = (String) obj3;
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    n02 n02VarD = q02.d(0L, this.F, 0L, e18Var3, 13);
                    boolean zF = e18Var3.f(sbgVar);
                    Object objN = e18Var3.N();
                    if (zF || objN == jd4.a) {
                        objN = new fb4(sbgVar, 3);
                        e18Var3.k0(objN);
                    }
                    csg.j((zy7) objN, null, false, null, n02VarD, null, null, fd9.q0(521110564, new pp(str, 17), e18Var3), e18Var3, 805306368, 494);
                } else {
                    e18Var3.T();
                }
                return ieiVar;
            default:
                String str2 = (String) obj4;
                wk wkVar = (wk) obj3;
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e18Var4.T();
                } else if (str2 != null) {
                    e18Var4.a0(-646614444);
                    tjh.b(str2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, tkh.b((tkh) wkVar.c, this.F, 0L, null, null, null, 0L, null, 0, 0L, null, 0, 16777214), e18Var4, 0, 24960, 110590);
                    e18Var4.p(false);
                } else {
                    e18Var4.a0(-646346852);
                    e18Var4.p(false);
                }
                return ieiVar;
        }
    }

    public /* synthetic */ fj2(Object obj, long j, Object obj2, int i) {
        this.E = i;
        this.G = obj;
        this.F = j;
        this.H = obj2;
    }

    public /* synthetic */ fj2(Object obj, long j, Object obj2, int i, int i2) {
        this.E = i2;
        this.G = obj;
        this.F = j;
        this.H = obj2;
    }

    public /* synthetic */ fj2(Object obj, Object obj2, long j, int i) {
        this.E = i;
        this.G = obj;
        this.H = obj2;
        this.F = j;
    }
}
