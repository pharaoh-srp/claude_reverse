package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qt6 implements vt6 {
    public final int a;
    public final List b;
    public final st6 c;

    public qt6(int i, List list, st6 st6Var) {
        this.a = i;
        this.b = list;
        this.c = st6Var;
    }

    @Override // defpackage.vt6
    public final zb0 a(ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(-1920741428);
        CharSequence[] charSequenceArr = (CharSequence[]) this.b.toArray(new CharSequence[0]);
        zb0 zb0VarK = zrk.k(this.a, (CharSequence[]) Arrays.copyOf(charSequenceArr, charSequenceArr.length), e18Var);
        e18Var.p(false);
        return zb0VarK;
    }

    @Override // defpackage.vt6
    public final st6 c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt6)) {
            return false;
        }
        qt6 qt6Var = (qt6) obj;
        return this.a == qt6Var.a && x44.r(this.b, qt6Var.b) && this.c == qt6Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + kgh.m(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "GenericMessageWithArgs(annotatedStringResourceId=" + this.a + ", args=" + this.b + ", severity=" + this.c + ")";
    }

    public /* synthetic */ qt6(int i, List list) {
        this(i, list, st6.E);
    }
}
