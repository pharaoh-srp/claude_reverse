package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lx3 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ String G;

    public /* synthetic */ lx3(String str, boolean z) {
        this.E = 0;
        this.G = str;
        this.F = z;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        String strK0;
        int i = this.E;
        String str = this.G;
        iei ieiVar = iei.a;
        boolean z = this.F;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    bpc bpcVarA = a.a(ud0.t, e18Var);
                    long jB = gm3.a(e18Var).M;
                    if (!z) {
                        jB = d54.b(0.38f, jB);
                    }
                    cv8.b(bpcVarA, this.G, null, jB, e18Var, 8, 4);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    ud0 ud0Var = z ? ud0.j0 : ud0.i0;
                    if (z) {
                        e18Var2.a0(1676096214);
                        strK0 = d4c.k0(R.string.nav_drawer_show_tab_a11y, new Object[]{str}, e18Var2);
                        e18Var2.p(false);
                    } else {
                        e18Var2.a0(1676191446);
                        strK0 = d4c.k0(R.string.nav_drawer_hide_tab_a11y, new Object[]{str}, e18Var2);
                        e18Var2.p(false);
                    }
                    iv1.b(ud0Var, strK0, null, null, gm3.a(e18Var2).O, e18Var2, 0, 12);
                }
                break;
            default:
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    q64 q64VarA = p64.a(ko0.c, lja.S, e18Var3, 0);
                    int iHashCode = Long.hashCode(e18Var3.T);
                    hyc hycVarL = e18Var3.l();
                    fqb fqbVar = fqb.E;
                    iqb iqbVarE = kxk.E(e18Var3, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var3.e0();
                    if (e18Var3.S) {
                        e18Var3.k(re4Var);
                    } else {
                        e18Var3.n0();
                    }
                    d4c.i0(e18Var3, cd4.f, q64VarA);
                    d4c.i0(e18Var3, cd4.e, hycVarL);
                    d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var3, cd4.h);
                    d4c.i0(e18Var3, cd4.d, iqbVarE);
                    if (z) {
                        e18Var3.a0(-463598667);
                        tjh.b(d4c.j0(R.string.project_details_memory_empty_label, e18Var3), null, gm3.a(e18Var3).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var3).e.E).i, e18Var3, 0, 0, 131066);
                        e18Var3.p(false);
                    } else {
                        e18Var3.a0(-463335012);
                        tjh.b(d4c.j0(R.string.memory_title, e18Var3), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var3).e.E).j, e18Var3, 0, 0, 131070);
                        kxk.g(e18Var3, b.g(fqbVar, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2).B(new hw9(1.0f, true)));
                        boolean zF = e18Var3.f(str);
                        Object objN = e18Var3.N();
                        if (zF || objN == jd4.a) {
                            str.getClass();
                            objN = "";
                            if (!bsg.I0(str)) {
                                Pattern patternCompile = Pattern.compile("^#{1,6}\\s+.*$", 8);
                                patternCompile.getClass();
                                String strReplaceAll = patternCompile.matcher(str).replaceAll("");
                                strReplaceAll.getClass();
                                Pattern patternCompile2 = Pattern.compile("^[\\s]*[-*+]\\s+(.+)$", 8);
                                patternCompile2.getClass();
                                String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll("$1");
                                strReplaceAll2.getClass();
                                Pattern patternCompile3 = Pattern.compile("^[\\s]*\\d+\\.\\s+(.+)$", 8);
                                patternCompile3.getClass();
                                String strReplaceAll3 = patternCompile3.matcher(strReplaceAll2).replaceAll("$1");
                                strReplaceAll3.getClass();
                                Pattern patternCompile4 = Pattern.compile("^[\\s]*[-*+]\\s+\\[[x ]\\]\\s+(.+)$", 8);
                                patternCompile4.getClass();
                                String strReplaceAll4 = patternCompile4.matcher(strReplaceAll3).replaceAll("$1");
                                strReplaceAll4.getClass();
                                Pattern patternCompile5 = Pattern.compile("\\*\\*\\*([^*]+)\\*\\*\\*");
                                patternCompile5.getClass();
                                String strReplaceAll5 = patternCompile5.matcher(strReplaceAll4).replaceAll("$1");
                                strReplaceAll5.getClass();
                                Pattern patternCompile6 = Pattern.compile("\\*\\*([^*]+)\\*\\*");
                                patternCompile6.getClass();
                                String strReplaceAll6 = patternCompile6.matcher(strReplaceAll5).replaceAll("$1");
                                strReplaceAll6.getClass();
                                Pattern patternCompile7 = Pattern.compile("\\*([^*]+)\\*");
                                patternCompile7.getClass();
                                String strReplaceAll7 = patternCompile7.matcher(strReplaceAll6).replaceAll("$1");
                                strReplaceAll7.getClass();
                                Pattern patternCompile8 = Pattern.compile("___([^_]+)___");
                                patternCompile8.getClass();
                                String strReplaceAll8 = patternCompile8.matcher(strReplaceAll7).replaceAll("$1");
                                strReplaceAll8.getClass();
                                Pattern patternCompile9 = Pattern.compile("__([^_]+)__");
                                patternCompile9.getClass();
                                String strReplaceAll9 = patternCompile9.matcher(strReplaceAll8).replaceAll("$1");
                                strReplaceAll9.getClass();
                                Pattern patternCompile10 = Pattern.compile("_([^_]+)_");
                                patternCompile10.getClass();
                                String strReplaceAll10 = patternCompile10.matcher(strReplaceAll9).replaceAll("$1");
                                strReplaceAll10.getClass();
                                Pattern patternCompile11 = Pattern.compile("\\n+");
                                patternCompile11.getClass();
                                String strReplaceAll11 = patternCompile11.matcher(strReplaceAll10).replaceAll(" ");
                                strReplaceAll11.getClass();
                                objN = bsg.k1(strReplaceAll11).toString();
                            }
                            e18Var3.k0(objN);
                        }
                        tjh.b((String) objN, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 3, 0, null, ((jm3) gm3.c(e18Var3).e.E).i, e18Var3, 0, 24960, 110590);
                        e18Var3.p(false);
                    }
                    e18Var3.p(true);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ lx3(boolean z, String str, int i) {
        this.E = i;
        this.F = z;
        this.G = str;
    }
}
