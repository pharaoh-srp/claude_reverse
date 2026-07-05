package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class s72 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ bz7 F;
    public final /* synthetic */ List G;

    public /* synthetic */ s72(int i, bz7 bz7Var, List list) {
        this.E = i;
        this.F = bz7Var;
        this.G = list;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        List list = this.G;
        bz7 bz7Var = this.F;
        switch (i) {
        }
        return bz7Var.invoke(list.get(((Number) obj).intValue()));
    }
}
