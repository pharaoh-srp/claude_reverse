package defpackage;

import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.glance.appwidget.GlanceRemoteViewsService;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes2.dex */
public final class t68 implements RemoteViewsService.RemoteViewsFactory {
    public final GlanceRemoteViewsService a;
    public final int b;
    public final int c;
    public final String d;

    public t68(GlanceRemoteViewsService glanceRemoteViewsService, int i, int i2, String str) {
        this.a = glanceRemoteViewsService;
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        if (r11 == r10) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.t68 r11, defpackage.nm0 r12, defpackage.vp4 r13) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException {
        /*
            androidx.glance.appwidget.GlanceRemoteViewsService r1 = r11.a
            int r6 = r11.b
            boolean r0 = r13 instanceof defpackage.s68
            if (r0 == 0) goto L18
            r0 = r13
            s68 r0 = (defpackage.s68) r0
            int r2 = r0.G
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r0.G = r2
        L16:
            r5 = r0
            goto L1e
        L18:
            s68 r0 = new s68
            r0.<init>(r11, r13)
            goto L16
        L1e:
            java.lang.Object r11 = r5.E
            int r13 = r5.G
            iei r7 = defpackage.iei.a
            r8 = 3
            r0 = 1
            r9 = 0
            m45 r10 = defpackage.m45.E
            if (r13 == 0) goto L47
            if (r13 == r0) goto L43
            r12 = 2
            if (r13 == r12) goto L3c
            if (r13 != r8) goto L36
            defpackage.sf5.h0(r11)
            return r7
        L36:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r11)
            return r9
        L3c:
            defpackage.sf5.h0(r11)
            r9 = r11
            lf9 r9 = (defpackage.lf9) r9
            goto L93
        L43:
            defpackage.sf5.h0(r11)
            goto L87
        L47:
            defpackage.sf5.h0(r11)
            android.appwidget.AppWidgetManager r11 = android.appwidget.AppWidgetManager.getInstance(r1)
            android.appwidget.AppWidgetProviderInfo r11 = r11.getAppWidgetInfo(r6)
            if (r11 == 0) goto L72
            android.content.ComponentName r11 = r11.provider
            if (r11 == 0) goto L72
            java.lang.String r11 = r11.getClassName()
            if (r11 == 0) goto L72
            java.lang.Class r11 = java.lang.Class.forName(r11)
            java.lang.reflect.Constructor r11 = r11.getDeclaredConstructor(r9)
            java.lang.Object r11 = r11.newInstance(r9)
            r11.getClass()
            com.anthropic.claude.widget.ClaudeAppWidgetReceiver r11 = (com.anthropic.claude.widget.ClaudeAppWidgetReceiver) r11
            ive r11 = r11.b
            goto L73
        L72:
            r11 = r9
        L73:
            if (r11 == 0) goto L8e
            j68 r4 = new j68
            r13 = 4
            r4.<init>(r13, r9, r0)
            r5.G = r0
            r3 = 0
            r0 = r11
            r2 = r12
            java.lang.Object r11 = r0.t(r1, r2, r3, r4, r5)
            if (r11 != r10) goto L87
            goto L9d
        L87:
            lf9 r11 = (defpackage.lf9) r11
            if (r11 != 0) goto L8c
            goto L8e
        L8c:
            r9 = r11
            goto L93
        L8e:
            am4 r11 = androidx.glance.appwidget.UnmanagedSessionReceiver.a
            defpackage.am4.v(r6)
        L93:
            if (r9 == 0) goto L9e
            r5.G = r8
            java.lang.Object r11 = r9.n(r5)
            if (r11 != r10) goto L9e
        L9d:
            return r10
        L9e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t68.a(t68, nm0, vp4):java.lang.Object");
    }

    public final tee b() {
        tee teeVar;
        y0c y0cVar = GlanceRemoteViewsService.E;
        int i = this.b;
        int i2 = this.c;
        String str = this.d;
        y0c y0cVar2 = GlanceRemoteViewsService.E;
        synchronized (y0cVar2) {
            teeVar = (tee) y0cVar2.a.get(y0c.a(i, i2, str));
            if (teeVar == null) {
                teeVar = tee.d;
            }
        }
        return teeVar;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return b().a.length;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i) {
        try {
            return b().a[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final /* bridge */ /* synthetic */ RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i) {
        try {
            return b().b[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return new RemoteViews(this.a.getPackageName(), R.layout.glance_invalid_list_item);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return b().c;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        b().getClass();
        return false;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        gb9.U(new cj(this, null, 25));
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
        y0c y0cVar = GlanceRemoteViewsService.E;
        int i = this.b;
        int i2 = this.c;
        String str = this.d;
        y0c y0cVar2 = GlanceRemoteViewsService.E;
        synchronized (y0cVar2) {
            y0cVar2.a.remove(y0c.a(i, i2, str));
        }
    }
}
