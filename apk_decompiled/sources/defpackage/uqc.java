package defpackage;

import com.anthropic.router.panes.Panes;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class uqc implements jyb {
    public final Panes a;
    public final d8a b;

    public uqc(Panes panes) {
        panes.getClass();
        this.a = panes;
        d8a d8aVarE = x44.E();
        boolean zIsEmpty = panes.getMain().isEmpty();
        re3 re3Var = re3.F;
        re3 re3Var2 = re3.E;
        int i = 0;
        if (!zIsEmpty) {
            int iM = x44.M(panes.getMain());
            int i2 = 0;
            for (Object obj : panes.getMain()) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    x44.n0();
                    throw null;
                }
                d8aVarE.add(new x6g(new tf4(obj), (i2 == iM && (this.a.getMode() != ye3.E || (this.a.getDetails().isEmpty() && this.a.getExtra().isEmpty()))) ? re3Var : re3Var2));
                i2 = i3;
            }
        }
        if (!this.a.getDetails().isEmpty()) {
            int iM2 = x44.M(this.a.getDetails());
            int i4 = 0;
            for (Object obj2 : this.a.getDetails()) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    x44.n0();
                    throw null;
                }
                d8aVarE.add(new x6g(new qf4(obj2), (i4 == iM2 && (this.a.getMode() == ye3.G || this.a.getExtra().isEmpty())) ? re3Var : re3Var2));
                i4 = i5;
            }
        }
        if (!this.a.getExtra().isEmpty()) {
            int iM3 = x44.M(this.a.getExtra());
            for (Object obj3 : this.a.getExtra()) {
                int i6 = i + 1;
                if (i < 0) {
                    x44.n0();
                    throw null;
                }
                d8aVarE.add(new x6g(new rf4(obj3), i != iM3 ? re3Var2 : re3Var));
                i = i6;
            }
        }
        this.b = x44.v(d8aVarE);
    }

    @Override // defpackage.jyb
    public final List a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uqc) && x44.r(this.a, ((uqc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PanesNavState(panes=" + this.a + ")";
    }
}
