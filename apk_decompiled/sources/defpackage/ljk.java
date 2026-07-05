package defpackage;

import android.app.job.JobParameters;
import android.net.Uri;
import androidx.compose.foundation.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ljk {
    public static final ta4 a = new ta4(161191116, false, new ob4(4));
    public static final ta4 b = new ta4(-1085650987, false, new ob4(5));
    public static final ta4 c = new ta4(2093561466, false, new ob4(6));
    public static final ta4 d = new ta4(334804556, false, new ob4(7));

    public static final void a(int i, ld4 ld4Var, zy7 zy7Var, iqb iqbVar, String str) {
        iqb iqbVar2;
        str.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1959170107);
        int i2 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16) | 384;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            wo1 wo1Var = lja.Q;
            fqb fqbVar = fqb.E;
            iqb iqbVarK = gb9.K(b.c(xn5.V(androidx.compose.foundation.layout.b.s(fqbVar, 36.0f, 36.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 12), xve.a), false, d4c.j0(R.string.project_pill_click_label, e18Var), new vue(0), null, zy7Var, 9), 12.0f, 4.0f);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var, 48);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarK);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, cxeVarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            iv1.b(ud0.e1, d4c.j0(R.string.generic_project, e18Var), null, ef2.F, gm3.a(e18Var).O, e18Var, 3072, 4);
            kxk.g(e18Var, androidx.compose.foundation.layout.b.t(fqbVar, 4.0f));
            tjh.b(str, androidx.compose.foundation.layout.b.v(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 200.0f, 1), gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, (tkh) gm3.c(e18Var).f.H, e18Var, (i2 & 14) | 48, 24960, 110584);
            e18Var = e18Var;
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new uf2(str, zy7Var, iqbVar2, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] b(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    public static qla c(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("id").m();
            String strM2 = qh9Var.s("type").m();
            strM2.getClass();
            for (int i : sq6.H(3)) {
                if (y6a.h(i).equals(strM2)) {
                    bh9 bh9VarS = qh9Var.s("has_replay");
                    Boolean boolValueOf = bh9VarS != null ? Boolean.valueOf(bh9VarS.a()) : null;
                    strM.getClass();
                    return new qla(strM, i, boolValueOf);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type LongTaskEventSession", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type LongTaskEventSession", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type LongTaskEventSession", e3);
            return null;
        }
    }

    public static String[] d(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentAuthorities();
    }

    public static Uri[] e(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentUris();
    }

    public static boolean f(t9i t9iVar, l7g l7gVar, uvk uvkVar) {
        s9i s9iVar = s9i.d;
        l7gVar.getClass();
        wh3 wh3Var = t9iVar.c;
        if ((wh3Var.l(l7gVar) && !wh3Var.b0(l7gVar)) || wh3Var.C(l7gVar)) {
            return true;
        }
        t9iVar.c();
        ArrayDeque arrayDeque = t9iVar.g;
        arrayDeque.getClass();
        qbg qbgVar = t9iVar.h;
        qbgVar.getClass();
        arrayDeque.push(l7gVar);
        while (!arrayDeque.isEmpty()) {
            if (qbgVar.F > 1000) {
                StringBuilder sb = new StringBuilder("Too many supertypes for type: ");
                sb.append(l7gVar);
                wg6.k(sb, ". Supertypes = ", w44.S0(qbgVar, null, null, null, null, 63));
                return false;
            }
            l7g l7gVar2 = (l7g) arrayDeque.pop();
            l7gVar2.getClass();
            if (qbgVar.add(l7gVar2)) {
                uvk uvkVar2 = wh3Var.b0(l7gVar2) ? s9iVar : uvkVar;
                if (uvkVar2.equals(s9iVar)) {
                    uvkVar2 = null;
                }
                if (uvkVar2 == null) {
                    continue;
                } else {
                    Iterator it = wh3Var.v(wh3Var.Q(l7gVar2)).iterator();
                    while (it.hasNext()) {
                        l7g l7gVarI = uvkVar2.i(t9iVar, (cs9) it.next());
                        if ((wh3Var.l(l7gVarI) && !wh3Var.b0(l7gVarI)) || wh3Var.C(l7gVarI)) {
                            t9iVar.a();
                            return true;
                        }
                        arrayDeque.add(l7gVarI);
                    }
                }
            }
        }
        t9iVar.a();
        return false;
    }

    public static boolean g(t9i t9iVar, l7g l7gVar, v9i v9iVar) {
        wh3 wh3Var = t9iVar.c;
        if (wh3Var.T(l7gVar)) {
            return true;
        }
        if (wh3Var.b0(l7gVar)) {
            return false;
        }
        if (t9iVar.b) {
            wh3Var.D(l7gVar);
        }
        return wh3Var.X(wh3Var.Q(l7gVar), v9iVar);
    }

    public static final boolean h(q68 q68Var) {
        return q68Var.b(new f7d(19));
    }

    public static boolean i(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i = 0; i < bArr2.length; i++) {
                if (bArr[i] == bArr2[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public abstract qh9 j();
}
