package androidx.fragment.app.strictmode;

import defpackage.cx7;
import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/fragment/app/strictmode/Violation;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
public abstract class Violation extends RuntimeException {
    public final cx7 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Violation(cx7 cx7Var, String str) {
        super(str);
        cx7Var.getClass();
        this.E = cx7Var;
    }
}
