package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aa6 extends a2a {
    public static final String I = "/".concat("doctypeInternalSubset");

    @Override // defpackage.c5c
    public final String A() {
        return "#doctype";
    }

    @Override // defpackage.c5c
    public final void E(gjk gjkVar, n96 n96Var) {
        if (n96Var.J != 1 || U("publicId") || U("systemId")) {
            gjkVar.h("<!DOCTYPE");
        } else {
            gjkVar.h("<!doctype");
        }
        if (U("name")) {
            gjkVar.h(" ").h(g("name"));
        }
        if (U("pubSysKey")) {
            gjkVar.h(" ").h(g("pubSysKey"));
        }
        if (U("publicId")) {
            gjkVar.h(" \"").h(g("publicId")).g('\"');
        }
        if (U("systemId")) {
            gjkVar.h(" \"").h(g("systemId")).g('\"');
        }
        n31 n31VarK = k();
        String str = I;
        if (n31VarK.o(str)) {
            gjkVar.h(" [").h(g(str)).g(']');
        }
        gjkVar.g('>');
    }

    public final boolean U(String str) {
        return !xrg.f(g(str));
    }
}
