package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class l06 extends huk {
    public final /* synthetic */ du6 b;
    public final /* synthetic */ LinkedHashSet c;
    public final /* synthetic */ boolean d;

    public l06(du6 du6Var, LinkedHashSet linkedHashSet, boolean z) {
        this.b = du6Var;
        this.c = linkedHashSet;
        this.d = z;
    }

    public static /* synthetic */ void p(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "fromSuper";
        } else if (i == 2) {
            objArr[0] = "fromCurrent";
        } else if (i == 3) {
            objArr[0] = "member";
        } else if (i != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i == 1 || i == 2) {
            objArr[2] = "conflict";
        } else if (i == 3 || i == 4) {
            objArr[2] = "setOverriddenDescriptors";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // defpackage.huk
    public final void j(e92 e92Var) {
        if (e92Var == null) {
            p(0);
            throw null;
        }
        gmc.r(e92Var, new cv(26, this));
        this.c.add(e92Var);
    }

    @Override // defpackage.huk
    public final void l(e92 e92Var, e92 e92Var2) {
        if (e92Var2 != null) {
            return;
        }
        p(2);
        throw null;
    }

    @Override // defpackage.huk
    public final void o(e92 e92Var, Collection collection) {
        if (e92Var == null) {
            p(3);
            throw null;
        }
        if (!this.d || e92Var.getKind() == 2) {
            e92Var.d0(collection);
        }
    }
}
