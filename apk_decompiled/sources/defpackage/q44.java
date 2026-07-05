package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class q44 extends r44 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q44(gg9 gg9Var, int i) {
        super(gg9Var);
        this.c = i;
    }

    @Override // defpackage.r44
    public final Collection a() {
        switch (this.c) {
            case 0:
                return new ArrayList();
            default:
                return new LinkedHashSet();
        }
    }
}
