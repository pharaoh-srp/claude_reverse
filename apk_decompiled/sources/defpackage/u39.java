package defpackage;

import android.view.ViewConfiguration;
import android.webkit.WebView;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class u39 implements u0f {
    public float a;
    public float b;
    public boolean c;
    public boolean d;
    public int e;
    public boolean f;
    public final Object g;
    public Object h;

    public u39(h2f h2fVar, bi0 bi0Var) {
        ArrayList arrayList = new ArrayList();
        this.g = arrayList;
        this.h = null;
        this.c = false;
        this.d = true;
        this.e = -1;
        if (bi0Var == null) {
            return;
        }
        bi0Var.r(this);
        if (this.f) {
            ((a2f) this.h).b((a2f) arrayList.get(this.e));
            arrayList.set(this.e, (a2f) this.h);
            this.f = false;
        }
        a2f a2fVar = (a2f) this.h;
        if (a2fVar != null) {
            arrayList.add(a2fVar);
        }
    }

    @Override // defpackage.u0f
    public void a(float f, float f2, float f3, float f4) {
        ((a2f) this.h).a(f, f2);
        ((ArrayList) this.g).add((a2f) this.h);
        this.h = new a2f(f3, f4, f3 - f, f4 - f2);
        this.f = false;
    }

    @Override // defpackage.u0f
    public void b(float f, float f2) {
        ArrayList arrayList = (ArrayList) this.g;
        if (this.f) {
            ((a2f) this.h).b((a2f) arrayList.get(this.e));
            arrayList.set(this.e, (a2f) this.h);
            this.f = false;
        }
        a2f a2fVar = (a2f) this.h;
        if (a2fVar != null) {
            arrayList.add(a2fVar);
        }
        this.a = f;
        this.b = f2;
        this.h = new a2f(f, f2, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
        this.e = arrayList.size();
    }

    @Override // defpackage.u0f
    public void c(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.d || this.c) {
            ((a2f) this.h).a(f, f2);
            ((ArrayList) this.g).add((a2f) this.h);
            this.c = false;
        }
        this.h = new a2f(f5, f6, f5 - f3, f6 - f4);
        this.f = false;
    }

    @Override // defpackage.u0f
    public void close() {
        ((ArrayList) this.g).add((a2f) this.h);
        e(this.a, this.b);
        this.f = true;
    }

    @Override // defpackage.u0f
    public void d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        this.c = true;
        this.d = false;
        a2f a2fVar = (a2f) this.h;
        h2f.b(a2fVar.a, a2fVar.b, f, f2, f3, z, z2, f4, f5, this);
        this.d = true;
        this.f = false;
    }

    @Override // defpackage.u0f
    public void e(float f, float f2) {
        ((a2f) this.h).a(f, f2);
        ((ArrayList) this.g).add((a2f) this.h);
        a2f a2fVar = (a2f) this.h;
        this.h = new a2f(f, f2, f - a2fVar.a, f2 - a2fVar.b);
        this.f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean f(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u39.f(android.view.MotionEvent):boolean");
    }

    public u39(WebView webView, bz7 bz7Var) {
        this.g = webView;
        this.h = bz7Var;
        this.e = ViewConfiguration.get(webView.getContext()).getScaledTouchSlop();
    }
}
