package defpackage;

import android.app.job.JobInfo;
import android.net.NetworkRequest;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ijk {
    public static final ta4 a = new ta4(-4772887, false, new hb4(17));
    public static final ta4 b = new ta4(771474667, false, new hb4(18));
    public static final ta4 c = new ta4(1475014640, false, new ob4(2));
    public static final ta4 d = new ta4(858152498, false, new ob4(3));

    public static final void a(zy7 zy7Var, iqb iqbVar, bpc bpcVar, boolean z, String str, float f, tkh tkhVar, wz2 wz2Var, ld4 ld4Var, int i) {
        iqb iqbVar2;
        boolean z2;
        float f2;
        tkh tkhVar2;
        int i2;
        iqb iqbVar3;
        tkh tkhVar3;
        float f3;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-939346819);
        int i3 = i | (e18Var.h(zy7Var) ? 4 : 2) | 48 | (e18Var.h(bpcVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 224256 | (e18Var.f(str) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | 37748736 | (e18Var.f(wz2Var) ? 536870912 : 268435456);
        boolean z3 = true;
        if (e18Var.Q(i3 & 1, (306783379 & i3) != 306783378)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                tkh tkhVar4 = ((jm3) gm3.c(e18Var).e.E).j;
                i2 = i3 & (-264241153);
                iqbVar3 = fqb.E;
                tkhVar3 = tkhVar4;
                f3 = 20.0f;
            } else {
                e18Var.T();
                i2 = i3 & (-264241153);
                iqbVar3 = iqbVar;
                z3 = z;
                f3 = f;
                tkhVar3 = tkhVar;
            }
            e18Var.q();
            tvk.b(bpcVar, zy7Var, iqbVar3, z3, str, f3, tkhVar3, wz2Var, null, e18Var, ((i2 >> 6) & 14) | 28088 | ((i2 << 15) & 458752) | 14155776 | ((i2 << 9) & 1879048192), (i2 >> 21) & 1022);
            iqbVar2 = iqbVar3;
            z2 = z3;
            f2 = f3;
            tkhVar2 = tkhVar3;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            z2 = z;
            f2 = f;
            tkhVar2 = tkhVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new zu1(zy7Var, iqbVar2, bpcVar, z2, str, f2, tkhVar2, wz2Var, i);
        }
    }

    public static x0e e(long j, long j2, long j3, long j4, ld4 ld4Var, int i) {
        long j5 = (i & 4) != 0 ? d54.h : j3;
        long j6 = (i & 8) != 0 ? d54.h : j4;
        n54 n54Var = ((gwa) ((e18) ld4Var).j(jwa.a)).a;
        x0e x0eVar = n54Var.k0;
        if (x0eVar == null) {
            x0e x0eVar2 = new x0e(p54.c(n54Var, qvj.t), p54.c(n54Var, qvj.v), d54.b(0.38f, p54.c(n54Var, qvj.q)), d54.b(0.38f, p54.c(n54Var, qvj.r)));
            n54Var.k0 = x0eVar2;
            x0eVar = x0eVar2;
        }
        long j7 = j != 16 ? j : x0eVar.a;
        long j8 = j2 != 16 ? j2 : x0eVar.b;
        if (j5 == 16) {
            j5 = x0eVar.c;
        }
        if (j6 == 16) {
            j6 = x0eVar.d;
        }
        return new x0e(j7, j8, j5, j6);
    }

    public static pla f(qh9 qh9Var) {
        int i;
        ArrayList arrayList;
        String strM;
        try {
            bh9 bh9VarS = qh9Var.s("id");
            String strM2 = bh9VarS != null ? bh9VarS.m() : null;
            bh9 bh9VarS2 = qh9Var.s("start_time");
            Number numberL = bh9VarS2 != null ? bh9VarS2.l() : null;
            bh9 bh9VarS3 = qh9Var.s("entry_type");
            if (bh9VarS3 != null && (strM = bh9VarS3.m()) != null) {
                for (int i2 : sq6.H(2)) {
                    if (y6a.e(i2).equals(strM)) {
                        i = i2;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            i = 0;
            long jK = qh9Var.s("duration").k();
            bh9 bh9VarS4 = qh9Var.s("blocking_duration");
            Long lValueOf = bh9VarS4 != null ? Long.valueOf(bh9VarS4.k()) : null;
            bh9 bh9VarS5 = qh9Var.s("render_start");
            Number numberL2 = bh9VarS5 != null ? bh9VarS5.l() : null;
            bh9 bh9VarS6 = qh9Var.s("style_and_layout_start");
            Number numberL3 = bh9VarS6 != null ? bh9VarS6.l() : null;
            bh9 bh9VarS7 = qh9Var.s("first_ui_event_timestamp");
            Number numberL4 = bh9VarS7 != null ? bh9VarS7.l() : null;
            bh9 bh9VarS8 = qh9Var.s("is_frozen_frame");
            Boolean boolValueOf = bh9VarS8 != null ? Boolean.valueOf(bh9VarS8.a()) : null;
            bh9 bh9VarS9 = qh9Var.s("scripts");
            if (bh9VarS9 != null) {
                ArrayList arrayList2 = bh9VarS9.e().E;
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(yjk.m(((bh9) it.next()).g()));
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            return new pla(strM2, numberL, i, jK, lValueOf, numberL2, numberL3, numberL4, boolValueOf, arrayList);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type LongTask", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type LongTask", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type LongTask", e3);
            return null;
        }
    }

    public static final void k(JobInfo.Builder builder, NetworkRequest networkRequest) {
        builder.getClass();
        builder.setRequiredNetwork(networkRequest);
    }

    public abstract boolean b(w1 w1Var, k1 k1Var, k1 k1Var2);

    public abstract boolean c(w1 w1Var, Object obj, Object obj2);

    public abstract boolean d(w1 w1Var, v1 v1Var, v1 v1Var2);

    public abstract k1 g(w1 w1Var);

    public abstract v1 h(w1 w1Var);

    public abstract void i(v1 v1Var, v1 v1Var2);

    public abstract void j(v1 v1Var, Thread thread);

    public abstract qh9 l();
}
