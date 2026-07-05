package defpackage;

import com.anthropic.claude.api.account.BootstrapResponse;
import okio.FileSystem;

/* JADX INFO: loaded from: classes.dex */
public final class b78 {
    public final a78 a;
    public final jk5 b;

    public b78(mn5 mn5Var, tf5 tf5Var, FileSystem fileSystem, bg9 bg9Var, h86 h86Var, a78 a78Var) {
        this.a = a78Var;
        this.b = new jk5(tf5Var.b().e("global_bootstrap"), "GlobalBootstrapCache", BootstrapResponse.Companion.serializer(), mn5Var, fileSystem, bg9Var, h86Var, null);
    }
}
