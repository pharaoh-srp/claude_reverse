package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ht9 {
    public static final ide a = new ide("\\\\([a-zA-Z]+)");
    public static final ide b = new ide("\\^(?:\\{2\\}|2(?![0-9]))");
    public static final ide c = new ide("\\^(?:\\{3\\}|3(?![0-9]))");
    public static final ide d = new ide("\\^");
    public static final ide e = new ide("(?<![a-zA-Z]{2})-(?![a-zA-Z]{2})");
    public static final ide f = new ide("\\\\[,;:!\\s\\\\]");
    public static final ide g = new ide("[\\\\{}_^$&]");
    public static final ide h = new ide("\\s+");
    public static final Map i = sta.h0(new cpc("pm", "plus or minus"), new cpc("mp", "minus or plus"), new cpc("times", "times"), new cpc("cdot", "times"), new cpc("ast", "times"), new cpc("div", "divided by"), new cpc("ne", "is not equal to"), new cpc("neq", "is not equal to"), new cpc("le", "is less than or equal to"), new cpc("leq", "is less than or equal to"), new cpc("ge", "is greater than or equal to"), new cpc("geq", "is greater than or equal to"), new cpc("lt", "is less than"), new cpc("gt", "is greater than"), new cpc("ll", "is much less than"), new cpc("gg", "is much greater than"), new cpc("approx", "is approximately equal to"), new cpc("equiv", "is equivalent to"), new cpc("sim", "is similar to"), new cpc("propto", "is proportional to"), new cpc("sqrt", "the square root of"), new cpc("frac", "fraction"), new cpc("dfrac", "fraction"), new cpc("tfrac", "fraction"), new cpc("cfrac", "fraction"), new cpc("binom", "binomial"), new cpc("over", "over"), new cpc("sum", "sum"), new cpc("prod", "product"), new cpc("int", "integral"), new cpc("iint", "double integral"), new cpc("iiint", "triple integral"), new cpc("oint", "contour integral"), new cpc("lim", "limit"), new cpc("max", "maximum"), new cpc("min", "minimum"), new cpc("sup", "supremum"), new cpc("inf", "infimum"), new cpc("infty", "infinity"), new cpc("partial", "partial"), new cpc("nabla", "del"), new cpc("deg", "degrees"), new cpc("angle", "angle"), new cpc("perp", "is perpendicular to"), new cpc("parallel", "is parallel to"), new cpc("ldots", "and so on"), new cpc("cdots", "and so on"), new cpc("vdots", "and so on"), new cpc("ddots", "and so on"), new cpc("dots", "and so on"), new cpc("prime", "prime"), new cpc("hbar", "h bar"), new cpc("to", "to"), new cpc("rightarrow", "to"), new cpc("longrightarrow", "to"), new cpc("leftarrow", "from"), new cpc("Rightarrow", "implies"), new cpc("implies", "implies"), new cpc("Leftarrow", "is implied by"), new cpc("iff", "if and only if"), new cpc("Leftrightarrow", "if and only if"), new cpc("mapsto", "maps to"), new cpc("forall", "for all"), new cpc("exists", "there exists"), new cpc("nexists", "there does not exist"), new cpc("neg", "not"), new cpc("lnot", "not"), new cpc("land", "and"), new cpc("wedge", "and"), new cpc("lor", "or"), new cpc("vee", "or"), new cpc("therefore", "therefore"), new cpc("because", "because"), new cpc("in", "in"), new cpc("notin", "not in"), new cpc("ni", "contains"), new cpc("cup", "union"), new cpc("cap", "intersection"), new cpc("subset", "is a subset of"), new cpc("subseteq", "is a subset of"), new cpc("supset", "is a superset of"), new cpc("supseteq", "is a superset of"), new cpc("setminus", "set minus"), new cpc("emptyset", "the empty set"), new cpc("varnothing", "the empty set"), new cpc("left", ""), new cpc("right", ""), new cpc("middle", ""), new cpc("big", ""), new cpc("Big", ""), new cpc("bigg", ""), new cpc("Bigg", ""), new cpc("bigl", ""), new cpc("bigr", ""), new cpc("Bigl", ""), new cpc("Bigr", ""), new cpc("biggl", ""), new cpc("biggr", ""), new cpc("Biggl", ""), new cpc("Biggr", ""), new cpc("mathrm", ""), new cpc("mathbf", ""), new cpc("mathit", ""), new cpc("mathsf", ""), new cpc("mathtt", ""), new cpc("mathbb", ""), new cpc("mathcal", ""), new cpc("mathfrak", ""), new cpc("mathscr", ""), new cpc("boldsymbol", ""), new cpc("operatorname", ""), new cpc("text", ""), new cpc("textbf", ""), new cpc("textit", ""), new cpc("textrm", ""), new cpc("textsf", ""), new cpc("texttt", ""), new cpc("displaystyle", ""), new cpc("textstyle", ""), new cpc("scriptstyle", ""), new cpc("scriptscriptstyle", ""), new cpc("limits", ""), new cpc("nolimits", ""), new cpc("quad", ""), new cpc("qquad", ""), new cpc("phantom", ""), new cpc("hphantom", ""), new cpc("vphantom", ""));

    public static final void a(int i2, ld4 ld4Var, String str, boolean z) {
        int i3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(546744195);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.f(str) ? 32 : 16;
        }
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            js5 js5Var = js5.a;
            if (z) {
                e18Var.a0(1540423256);
                js5Var.c(((i3 >> 3) & 14) | 432, e18Var, str, true);
                e18Var.p(false);
            } else {
                e18Var.a0(1540499082);
                js5Var.a(str, e18Var, ((i3 >> 3) & 14) | 48);
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ev0(z, str, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final java.lang.String r21, defpackage.iqb r22, boolean r23, boolean r24, long r25, int r27, long r28, defpackage.ld4 r30, final int r31, final int r32) {
        /*
            Method dump skipped, instruction units count: 877
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ht9.b(java.lang.String, iqb, boolean, boolean, long, int, long, ld4, int, int):void");
    }

    public static final String c(String str) {
        str.getClass();
        String string = bsg.k1(h.h(g.h(e.h(d.h(c.h(b.h(f.h(a.g(str, new e69(5)), " "), " squared "), " cubed "), " to the "), " minus "), " "), " ")).toString();
        return string.length() == 0 ? str : string;
    }
}
