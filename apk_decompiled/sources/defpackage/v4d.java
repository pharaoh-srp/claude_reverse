package defpackage;

import okio.FileSystem;
import okio.Path;

/* JADX INFO: loaded from: classes.dex */
public final class v4d {
    public final FileSystem a;
    public final tf5 b;
    public final h86 c;

    public v4d(FileSystem fileSystem, tf5 tf5Var, h86 h86Var) {
        this.a = fileSystem;
        this.b = tf5Var;
        this.c = h86Var;
    }

    public final tbd a(String str) {
        Path pathE = this.b.a().e("datastores");
        this.a.e(pathE);
        Path pathE2 = pathE.e(str.concat(".preferences_pb"));
        e45 e45VarB = this.c.b();
        myg mygVarG = iuj.g();
        e45VarB.getClass();
        return yb5.m(lm6.E, fd9.c(nai.Z(e45VarB, mygVarG)), new dg8(22, new dg8(21, pathE2)));
    }
}
