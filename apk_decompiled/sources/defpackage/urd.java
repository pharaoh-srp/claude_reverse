package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.anthropic.claude.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class urd extends FrameLayout {
    public static final Object G = new Object();
    public final ArrayList E;
    public trd F;

    public urd(Context context, List list) {
        super(context);
        this.E = new ArrayList();
        setProtections(list);
    }

    private d1h getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof d1h) {
            return (d1h) tag;
        }
        d1h d1hVar = new d1h(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, d1hVar);
        return d1hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b1 A[LOOP:0: B:7:0x0028->B:27:0x00b1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r13 = this;
            java.util.ArrayList r0 = r13.E
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lc
            r13.b()
            return
        Lc:
            d1h r1 = r13.getOrInstallSystemBarStateMonitor()
            r13.b()
            trd r2 = new trd
            r2.<init>(r1, r0)
            r13.F = r2
            int r0 = r13.getChildCount()
            trd r1 = r13.F
            java.util.ArrayList r1 = r1.a
            int r1 = r1.size()
            r2 = 0
            r3 = r2
        L28:
            if (r3 >= r1) goto Lbf
            trd r4 = r13.F
            java.util.ArrayList r4 = r4.a
            java.lang.Object r4 = r4.get(r3)
            l54 r4 = (defpackage.l54) r4
            android.content.Context r5 = r13.getContext()
            int r6 = r3 + r0
            srd r7 = r4.b
            int r4 = r4.a
            r8 = 1
            r9 = 8
            r10 = -1
            if (r4 == r8) goto L67
            r8 = 2
            if (r4 == r8) goto L62
            r8 = 4
            if (r4 == r8) goto L5b
            if (r4 != r9) goto L51
            int r4 = r7.b
            r8 = 80
            goto L6b
        L51:
            java.lang.String r13 = "Unexpected side: "
            java.lang.String r13 = defpackage.grc.p(r4, r13)
            defpackage.sz6.p(r13)
            return
        L5b:
            int r4 = r7.a
            r8 = 5
        L5e:
            r12 = r10
            r10 = r4
            r4 = r12
            goto L6b
        L62:
            int r4 = r7.b
            r8 = 48
            goto L6b
        L67:
            int r4 = r7.a
            r8 = 3
            goto L5e
        L6b:
            android.widget.FrameLayout$LayoutParams r11 = new android.widget.FrameLayout$LayoutParams
            r11.<init>(r10, r4, r8)
            f59 r4 = r7.c
            int r8 = r4.a
            r11.leftMargin = r8
            int r8 = r4.b
            r11.topMargin = r8
            int r8 = r4.c
            r11.rightMargin = r8
            int r4 = r4.d
            r11.bottomMargin = r4
            android.view.View r4 = new android.view.View
            r4.<init>(r5)
            java.lang.Object r5 = defpackage.urd.G
            r4.setTag(r5)
            float r5 = r7.f
            r4.setTranslationX(r5)
            float r5 = r7.g
            r4.setTranslationY(r5)
            float r5 = r7.h
            r4.setAlpha(r5)
            boolean r5 = r7.d
            if (r5 == 0) goto La0
            r9 = r2
        La0:
            r4.setVisibility(r9)
            android.graphics.drawable.ColorDrawable r5 = r7.e
            r4.setBackground(r5)
            qb5 r5 = new qb5
            r5.<init>(r11, r4, r2)
            qb5 r8 = r7.i
            if (r8 != 0) goto Lba
            r7.i = r5
            r13.addView(r4, r6, r11)
            int r3 = r3 + 1
            goto L28
        Lba:
            java.lang.String r13 = "Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?"
            defpackage.sz6.j(r13)
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.urd.a():void");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != G) {
            trd trdVar = this.F;
            int childCount = getChildCount() - (trdVar != null ? trdVar.a.size() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    public final void b() {
        trd trdVar;
        if (this.F != null) {
            removeViews(getChildCount() - this.F.a.size(), this.F.a.size());
            int size = this.F.a.size();
            int i = 0;
            while (true) {
                trdVar = this.F;
                if (i >= size) {
                    break;
                }
                ((l54) trdVar.a.get(i)).b.i = null;
                i++;
            }
            ArrayList arrayList = trdVar.a;
            if (!trdVar.f) {
                trdVar.f = true;
                trdVar.b.b.remove(trdVar);
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((l54) arrayList.get(size2)).e = null;
                }
                arrayList.clear();
            }
            this.F = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof d1h) {
            d1h d1hVar = (d1h) tag;
            if (d1hVar.b.isEmpty()) {
                d1hVar.a.post(new pya(10, d1hVar));
                viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public void setProtections(List<l54> list) {
        ArrayList arrayList = this.E;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            a();
            requestApplyInsets();
        }
    }
}
