package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xf5 extends a2a {
    @Override // defpackage.c5c
    public final String A() {
        return "#data";
    }

    @Override // defpackage.c5c
    public final void E(gjk gjkVar, n96 n96Var) {
        String strO = O();
        if (n96Var.J != 2 || strO.contains("<![CDATA[")) {
            gjkVar.h(strO);
            return;
        }
        yj6 yj6Var = this.E;
        if (yj6Var != null && yj6Var.H.G.equals("script")) {
            gjkVar.h("//<![CDATA[\n").h(strO).h("\n//]]>");
            return;
        }
        yj6 yj6Var2 = this.E;
        if (yj6Var2 == null || !yj6Var2.H.G.equals("style")) {
            gjkVar.h("<![CDATA[").h(strO).h("]]>");
        } else {
            gjkVar.h("/*<![CDATA[*/\n").h(strO).h("\n/*]]>*/");
        }
    }

    @Override // defpackage.c5c
    public final Object clone() {
        return (xf5) super.clone();
    }

    @Override // defpackage.c5c
    /* JADX INFO: renamed from: q */
    public final c5c clone() {
        return (xf5) super.clone();
    }
}
