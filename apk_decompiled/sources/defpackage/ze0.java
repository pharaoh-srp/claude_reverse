package defpackage;

import com.anthropic.claude.types.environment.AppEnvironment;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class ze0 {
    public static final kw9 f = yb5.w(w1a.G, new j7(13));
    public final String a;
    public final AppEnvironment b;
    public final boolean c;
    public final boolean d;
    public final Set e;

    public /* synthetic */ ze0(String str, AppEnvironment appEnvironment, boolean z, Set set, int i) {
        this(str, appEnvironment, z, false, (i & 16) != 0 ? sf5.f0(str) : set);
    }

    public String a() {
        return this.a;
    }

    public ze0(String str, AppEnvironment appEnvironment, boolean z, boolean z2, Set set) {
        this.a = str;
        this.b = appEnvironment;
        this.c = z;
        this.d = z2;
        this.e = set;
    }
}
