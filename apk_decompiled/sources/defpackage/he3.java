package defpackage;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class he3 {
    public final sxb a;
    public final ide b;
    public final Collection c;
    public final bz7 d;
    public final wd3[] e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public he3(sxb sxbVar, wd3[] wd3VarArr, bz7 bz7Var) {
        this(sxbVar, null, null, bz7Var, (wd3[]) Arrays.copyOf(wd3VarArr, wd3VarArr.length));
        sxbVar.getClass();
    }

    public /* synthetic */ he3(sxb sxbVar, wd3[] wd3VarArr) {
        this(sxbVar, wd3VarArr, ex.b0);
    }

    public he3(sxb sxbVar, ide ideVar, Collection collection, bz7 bz7Var, wd3... wd3VarArr) {
        this.a = sxbVar;
        this.b = ideVar;
        this.c = collection;
        this.d = bz7Var;
        this.e = wd3VarArr;
    }

    public /* synthetic */ he3(Collection collection, wd3[] wd3VarArr) {
        this(collection, wd3VarArr, ex.d0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public he3(Collection collection, wd3[] wd3VarArr, bz7 bz7Var) {
        this(null, null, collection, bz7Var, (wd3[]) Arrays.copyOf(wd3VarArr, wd3VarArr.length));
        collection.getClass();
    }
}
