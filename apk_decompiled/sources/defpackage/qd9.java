package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class qd9 implements jc0, z9d {
    public static final /* synthetic */ wn9[] e;
    public final ww7 a;
    public final neg b;
    public final dfa c;
    public final abe d;

    static {
        kce kceVar = jce.a;
        e = new wn9[]{kceVar.g(new mrd(kceVar.b(qd9.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};
    }

    public qd9(el5 el5Var, zae zaeVar, ww7 ww7Var) {
        neg negVarX;
        el5Var.getClass();
        ke9 ke9Var = (ke9) el5Var.E;
        ww7Var.getClass();
        this.a = ww7Var;
        if (zaeVar != null) {
            ke9Var.j.getClass();
            negVarX = ql8.x(zaeVar);
        } else {
            negVarX = neg.n;
        }
        this.b = negVarX;
        gfa gfaVar = ke9Var.a;
        xz xzVar = new xz(el5Var, 12, this);
        gfaVar.getClass();
        this.c = new dfa(gfaVar, xzVar);
        this.d = zaeVar != null ? (abe) w44.M0(zaeVar.c()) : null;
    }

    @Override // defpackage.jc0
    public final neg d() {
        return this.b;
    }

    @Override // defpackage.jc0
    public final ww7 e() {
        return this.a;
    }

    @Override // defpackage.jc0
    public Map f() {
        return nm6.E;
    }

    @Override // defpackage.jc0
    public final yr9 getType() {
        return (j7g) wd6.s0(this.c, e[0]);
    }
}
