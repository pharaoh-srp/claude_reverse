package defpackage;

import android.content.ComponentName;
import android.content.Context;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class f6i {
    public final Context a;
    public final int b;
    public final boolean c;
    public final bu9 d;
    public final int e;
    public final boolean f;
    public final AtomicInteger g;
    public final c59 h;
    public final AtomicBoolean i;
    public final long j;
    public final int k;
    public final boolean l;
    public final Integer m;
    public final ComponentName n;
    public final ro6 o;

    public f6i(Context context, int i, boolean z, bu9 bu9Var, int i2, boolean z2, AtomicInteger atomicInteger, c59 c59Var, AtomicBoolean atomicBoolean, long j, int i3, boolean z3, Integer num, ComponentName componentName, ro6 ro6Var) {
        this.a = context;
        this.b = i;
        this.c = z;
        this.d = bu9Var;
        this.e = i2;
        this.f = z2;
        this.g = atomicInteger;
        this.h = c59Var;
        this.i = atomicBoolean;
        this.j = j;
        this.k = i3;
        this.l = z3;
        this.m = num;
        this.n = componentName;
        this.o = ro6Var;
    }

    public static f6i a(f6i f6iVar, int i, AtomicInteger atomicInteger, c59 c59Var, AtomicBoolean atomicBoolean, long j, Integer num, int i2) {
        return new f6i(f6iVar.a, f6iVar.b, f6iVar.c, f6iVar.d, (i2 & 16) != 0 ? f6iVar.e : i, (i2 & 32) != 0 ? f6iVar.f : true, (i2 & 64) != 0 ? f6iVar.g : atomicInteger, (i2 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? f6iVar.h : c59Var, (i2 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? f6iVar.i : atomicBoolean, (i2 & 512) != 0 ? f6iVar.j : j, (i2 & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? f6iVar.k : 0, (i2 & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? f6iVar.l : true, (i2 & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? f6iVar.m : num, f6iVar.n, f6iVar.o);
    }

    public final f6i b(c59 c59Var, int i) {
        return a(this, i, null, c59Var, null, 0L, null, 65391);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f6i) {
            f6i f6iVar = (f6i) obj;
            return this.a.equals(f6iVar.a) && this.b == f6iVar.b && this.c == f6iVar.c && this.d == f6iVar.d && this.e == f6iVar.e && this.f == f6iVar.f && x44.r(this.g, f6iVar.g) && x44.r(this.h, f6iVar.h) && x44.r(this.i, f6iVar.i) && za6.b(this.j, f6iVar.j) && this.k == f6iVar.k && this.l == f6iVar.l && x44.r(this.m, f6iVar.m) && x44.r(this.n, f6iVar.n) && this.o == f6iVar.o;
        }
        return false;
    }

    public final int hashCode() {
        int iP = fsh.p(vb7.c(-1, vb7.c(this.k, vb7.e((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + fsh.p(vb7.c(this.e, (this.d.hashCode() + fsh.p(vb7.c(this.b, this.a.hashCode() * 31, 31), 31, this.c)) * 31, 31), 31, this.f)) * 31)) * 31)) * 31, 31, this.j), 31), 31), 31, this.l);
        Integer num = this.m;
        int iHashCode = (iP + (num == null ? 0 : num.hashCode())) * 31;
        ComponentName componentName = this.n;
        return this.o.hashCode() + ((iHashCode + (componentName != null ? componentName.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "TranslationContext(context=" + this.a + ", appWidgetId=" + this.b + ", isRtl=" + this.c + ", layoutConfiguration=" + this.d + ", itemPosition=" + this.e + ", isLazyCollectionDescendant=" + this.f + ", lastViewId=" + this.g + ", parentContext=" + this.h + ", isBackgroundSpecified=" + this.i + ", layoutSize=" + ((Object) za6.e(this.j)) + ", layoutCollectionViewId=" + this.k + ", layoutCollectionItemId=-1, canUseSelectableGroup=" + this.l + ", actionTargetId=" + this.m + ", actionBroadcastReceiver=" + this.n + ", glanceComponents=" + this.o + ')';
    }
}
