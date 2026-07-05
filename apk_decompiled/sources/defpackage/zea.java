package defpackage;

import com.anthropic.claude.api.experience.ExperienceToggle;

/* JADX INFO: loaded from: classes.dex */
public final class zea extends cfa implements u6c {
    public volatile mvd H;
    public final /* synthetic */ e0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zea(gfa gfaVar, l4 l4Var, e0 e0Var) {
        super(gfaVar, l4Var);
        this.I = e0Var;
        if (gfaVar == null) {
            g(0);
            throw null;
        }
        this.H = null;
    }

    public static /* synthetic */ void d(int i) {
        String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[i != 2 ? 2 : 3];
        if (i != 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        } else {
            objArr[0] = ExperienceToggle.DEFAULT_PARAM_KEY;
        }
        if (i != 2) {
            objArr[1] = "recursionDetected";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        }
        if (i == 2) {
            objArr[2] = "doPostCompute";
        }
        String str2 = String.format(str, objArr);
        if (i == 2) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static /* synthetic */ void g(int i) {
        String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 2 ? 3 : 2];
        if (i == 1) {
            objArr[0] = "computable";
        } else if (i != 2) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        }
        if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        } else {
            objArr[1] = "invoke";
        }
        if (i != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i == 2) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // defpackage.cfa, defpackage.zy7
    public final Object a() {
        mvd mvdVar = this.H;
        Object objA = (mvdVar == null || !mvdVar.k()) ? super.a() : mvdVar.i();
        if (objA != null) {
            return objA;
        }
        g(2);
        throw null;
    }

    @Override // defpackage.cfa
    public final void e(Object obj) {
        this.H = new mvd(obj);
        try {
            if (obj != null) {
                this.I.invoke(obj);
            } else {
                d(2);
                throw null;
            }
        } finally {
            this.H = null;
        }
    }

    @Override // defpackage.cfa
    public final z5l f(boolean z) {
        return z5l.h(new k4(x44.W(nu6.d)));
    }
}
