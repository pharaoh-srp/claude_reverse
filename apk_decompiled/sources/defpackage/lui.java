package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;
import com.agog.mathdisplay.render.MTTypesetterKt;
import io.sentry.e0;

/* JADX INFO: loaded from: classes2.dex */
public final class lui {
    public final x6b a;
    public final qui b;
    public final long c;
    public boolean d;
    public long g;
    public boolean j;
    public boolean m;
    public boolean n;
    public int e = 0;
    public long f = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long i = -9223372036854775807L;
    public float k = 1.0f;
    public g1h l = g1h.a;
    public final boolean o = true;

    public lui(Context context, x6b x6bVar, long j) {
        this.a = x6bVar;
        this.c = j;
        this.b = new qui(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02d1 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0196 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0197  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(long r31, long r33, long r35, long r37, boolean r39, boolean r40, defpackage.rv1 r41) {
        /*
            Method dump skipped, instruction units count: 745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lui.a(long, long, long, long, boolean, boolean, rv1):int");
    }

    public final boolean b(boolean z) {
        if (z && (this.e == 3 || (this.n && (!this.m || !this.o)))) {
            this.i = -9223372036854775807L;
            return true;
        }
        if (this.i == -9223372036854775807L) {
            return false;
        }
        this.l.getClass();
        if (SystemClock.elapsedRealtime() < this.i) {
            return true;
        }
        this.i = -9223372036854775807L;
        return false;
    }

    public final void c(boolean z) {
        long jElapsedRealtime;
        this.j = z;
        long j = this.c;
        if (j > 0) {
            this.l.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        } else {
            jElapsedRealtime = -9223372036854775807L;
        }
        this.i = jElapsedRealtime;
    }

    public final void d() {
        this.d = true;
        this.l.getClass();
        this.g = tpi.C(SystemClock.elapsedRealtime());
        qui quiVar = this.b;
        quiVar.d = true;
        quiVar.b();
        DisplayManager displayManager = (DisplayManager) quiVar.b.getSystemService("display");
        nui puiVar = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                puiVar = Build.VERSION.SDK_INT >= 33 ? new pui(choreographer, displayManager) : new oui(choreographer, displayManager);
            } catch (RuntimeException e) {
                ysj.v("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
        }
        quiVar.c = puiVar;
        if (puiVar != null) {
            puiVar.a();
        }
        quiVar.d(false);
    }

    public final void e(int i) {
        if (i == 0) {
            this.e = 1;
        } else if (i == 1) {
            this.e = 0;
        } else {
            if (i != 2) {
                e0.b();
                return;
            }
            this.e = Math.min(this.e, 2);
        }
        this.b.b();
    }

    public final void f(float f) {
        qui quiVar = this.b;
        quiVar.f = f;
        nm7 nm7Var = quiVar.a;
        ((mm7) nm7Var.H).c();
        ((mm7) nm7Var.I).c();
        nm7Var.G = false;
        nm7Var.F = -9223372036854775807L;
        nm7Var.E = 0;
        quiVar.c();
    }

    public final void g(Surface surface) {
        this.m = surface != null;
        this.n = false;
        qui quiVar = this.b;
        if (quiVar.e != surface) {
            quiVar.a();
            quiVar.e = surface;
            quiVar.d(true);
        }
        this.e = Math.min(this.e, 1);
    }

    public final void h(float f) {
        fd9.E(f > MTTypesetterKt.kLineSkipLimitMultiplier);
        if (f == this.k) {
            return;
        }
        this.k = f;
        qui quiVar = this.b;
        quiVar.i = f;
        quiVar.d(false);
    }
}
