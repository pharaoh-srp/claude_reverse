package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class x06 extends huk {
    public final /* synthetic */ int b;
    public final /* synthetic */ AbstractCollection c;

    public /* synthetic */ x06(AbstractCollection abstractCollection, int i) {
        this.b = i;
        this.c = abstractCollection;
    }

    public static /* synthetic */ void p(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "fromSuper";
        } else if (i != 2) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "fromCurrent";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        if (i == 1 || i == 2) {
            objArr[2] = "conflict";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // defpackage.huk
    public final void j(e92 e92Var) {
        int i = this.b;
        AbstractCollection abstractCollection = this.c;
        switch (i) {
            case 0:
                e92Var.getClass();
                gmc.r(e92Var, null);
                ((ArrayList) abstractCollection).add(e92Var);
                return;
            default:
                if (e92Var == null) {
                    p(0);
                    throw null;
                }
                gmc.r(e92Var, null);
                ((LinkedHashSet) abstractCollection).add(e92Var);
                return;
        }
    }

    @Override // defpackage.huk
    public final void l(e92 e92Var, e92 e92Var2) {
        switch (this.b) {
            case 0:
                e92Var2.getClass();
                if (e92Var2 instanceof j08) {
                    ((j08) e92Var2).U0(e16.a, e92Var);
                    return;
                }
                return;
            default:
                if (e92Var2 != null) {
                    return;
                }
                p(2);
                throw null;
        }
    }
}
