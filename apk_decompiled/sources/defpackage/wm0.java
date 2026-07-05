package defpackage;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.RemoteViews;
import com.anthropic.claude.R;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class wm0 {
    public final String a;
    public final AtomicBoolean b;
    public final zy1 c;
    public final ive d;
    public final nm0 e;
    public final y68 f;
    public final t8g g;
    public final boolean h;
    public final lsc i;
    public final lsc j;
    public Map k;
    public final mf9 l;
    public final amg m;

    public wm0(ive iveVar, nm0 nm0Var, Bundle bundle) {
        y68 y68Var = y68.a;
        t8g t8gVar = (t8g) iveVar.F;
        this.a = msk.d(nm0Var.a);
        this.b = new AtomicBoolean(true);
        this.c = wd6.P(Integer.MAX_VALUE, 6, null);
        this.d = iveVar;
        this.e = nm0Var;
        this.f = y68Var;
        this.g = t8gVar;
        this.h = true;
        if (msk.e(nm0Var)) {
            sz6.p("If the AppWidgetSession is not created for a bound widget, you must provide a lambda action receiver");
            throw null;
        }
        ql8 ql8Var = ql8.J;
        this.i = new lsc(null, ql8Var);
        this.j = new lsc(bundle, ql8Var);
        this.k = nm6.E;
        this.l = knk.g();
        this.m = bmg.a(null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(4:18|47|66|67)(1:(2:15|16)(3:17|61|62)))(1:19))(2:21|(2:23|24)(3:25|(1:28)|65))|20|29|73|30|31|32|(9:34|35|71|36|37|38|(1:40)|43|44)(2:51|52)|(3:(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0109, code lost:
    
        if (r3.b(r5) == r13) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013f, code lost:
    
        if (r3.b(r5) != r13) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0150, code lost:
    
        if (r3.b(r5) != r13) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0164, code lost:
    
        if (r3.b(r5) != r13) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(defpackage.wm0 r21, android.content.Context r22, defpackage.zk6 r23, defpackage.vp4 r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wm0.b(wm0, android.content.Context, zk6, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(defpackage.wm0 r6, android.content.Context r7, java.lang.Object r8, defpackage.vp4 r9) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wm0.c(wm0, android.content.Context, java.lang.Object, vp4):java.lang.Object");
    }

    public final void a(Context context, Throwable th) throws Throwable {
        Log.e("GlanceAppWidget", "Error in Glance App Widget", th);
        if (!this.h) {
            throw th;
        }
        int i = this.e.a;
        this.d.getClass();
        AppWidgetManager.getInstance(context).updateAppWidget(i, new RemoteViews(context.getPackageName(), R.layout.glance_error_layout));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
    
        if (c(r6, r1, r9, r0) == r4) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b A[Catch: ClosedReceiveChannelException -> 0x0081, TRY_LEAVE, TryCatch #0 {ClosedReceiveChannelException -> 0x0081, blocks: (B:13:0x002c, B:22:0x0051, B:26:0x0063, B:28:0x006b, B:18:0x0040, B:21:0x0047), top: B:34:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007e -> B:14:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(android.content.Context r7, defpackage.f2d r8, defpackage.vp4 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.epf
            if (r0 == 0) goto L13
            r0 = r9
            epf r0 = (defpackage.epf) r0
            int r1 = r0.J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.J = r1
            goto L18
        L13:
            epf r0 = new epf
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.H
            int r1 = r0.J
            r2 = 2
            r3 = 1
            m45 r4 = defpackage.m45.E
            if (r1 == 0) goto L44
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L33
            sy1 r7 = r0.G
            bz7 r8 = r0.F
            android.content.Context r1 = r0.E
            defpackage.sf5.h0(r9)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L81
        L2f:
            r5 = r1
            r1 = r7
            r7 = r5
            goto L51
        L33:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            r6 = 0
            return r6
        L3a:
            sy1 r7 = r0.G
            bz7 r8 = r0.F
            android.content.Context r1 = r0.E
            defpackage.sf5.h0(r9)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L81
            goto L63
        L44:
            defpackage.sf5.h0(r9)
            zy1 r9 = r6.c     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L81
            r9.getClass()     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L81
            sy1 r1 = new sy1     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L81
            r1.<init>(r9)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L81
        L51:
            r0.E = r7     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L81
            r0.F = r8     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L81
            r0.G = r1     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L81
            r0.J = r3     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L81
            java.lang.Object r9 = r1.b(r0)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L81
            if (r9 != r4) goto L60
            goto L80
        L60:
            r5 = r1
            r1 = r7
            r7 = r5
        L63:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L81
            boolean r9 = r9.booleanValue()     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L81
            if (r9 == 0) goto L81
            java.lang.Object r9 = r7.c()     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L81
            r8.invoke(r9)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L81
            r0.E = r1     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L81
            r0.F = r8     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L81
            r0.G = r7     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L81
            r0.J = r2     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L81
            java.lang.Object r9 = c(r6, r1, r9, r0)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L81
            if (r9 != r4) goto L2f
        L80:
            return r4
        L81:
            iei r6 = defpackage.iei.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wm0.d(android.content.Context, f2d, vp4):java.lang.Object");
    }

    public final Object e(Object obj, vp4 vp4Var) {
        Object objB = this.c.b(vp4Var, obj);
        return objB == m45.E ? objB : iei.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.vp4 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.vm0
            if (r0 == 0) goto L13
            r0 = r5
            vm0 r0 = (defpackage.vm0) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            vm0 r0 = new vm0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.F
            int r1 = r0.H
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            rm0 r4 = r0.E
            defpackage.sf5.h0(r5)
            goto L4b
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.sf5.h0(r5)
            rm0 r5 = new rm0
            mf9 r1 = new mf9
            mf9 r3 = r4.l
            r1.<init>(r3)
            r5.<init>(r1)
            r0.E = r5
            r0.H = r2
            java.lang.Object r4 = r4.e(r5, r0)
            m45 r0 = defpackage.m45.E
            if (r4 != r0) goto L4a
            return r0
        L4a:
            r4 = r5
        L4b:
            mf9 r4 = r4.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wm0.f(vp4):java.lang.Object");
    }
}
