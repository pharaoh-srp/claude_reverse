package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.anthropic.claude.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zte extends ViewGroup {
    public final int E;
    public final ArrayList F;
    public final ArrayList G;
    public final ire H;
    public int I;

    public zte(Context context) {
        super(context);
        this.E = 5;
        ArrayList arrayList = new ArrayList();
        this.F = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.G = arrayList2;
        this.H = new ire(1);
        setClipChildren(false);
        bue bueVar = new bue(context);
        addView(bueVar);
        arrayList.add(bueVar);
        arrayList2.add(bueVar);
        this.I = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void a(l50 l50Var) {
        l50Var.h0 = null;
        wd6.t0(l50Var);
        ire ireVar = this.H;
        bue bueVar = (bue) ((LinkedHashMap) ireVar.F).get(l50Var);
        if (bueVar != null) {
            bueVar.c();
            LinkedHashMap linkedHashMap = (LinkedHashMap) ireVar.F;
            bue bueVar2 = (bue) linkedHashMap.get(l50Var);
            if (bueVar2 != null) {
            }
            linkedHashMap.remove(l50Var);
            this.G.add(bueVar);
        }
    }

    public final bue b(l50 l50Var) throws IOException {
        ire ireVar = this.H;
        LinkedHashMap linkedHashMap = (LinkedHashMap) ireVar.F;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) ireVar.F;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) ireVar.G;
        bue bueVar = (bue) linkedHashMap.get(l50Var);
        if (bueVar != null) {
            return bueVar;
        }
        bue bueVar2 = (bue) b54.y0(this.G);
        if (bueVar2 == null) {
            int i = this.I;
            ArrayList arrayList = this.F;
            if (i > x44.M(arrayList)) {
                bueVar2 = new bue(getContext());
                addView(bueVar2);
                arrayList.add(bueVar2);
            } else {
                bueVar2 = (bue) arrayList.get(this.I);
                l50 l50Var2 = (l50) linkedHashMap3.get(bueVar2);
                if (l50Var2 != null) {
                    l50Var2.h0 = null;
                    wd6.t0(l50Var2);
                    bue bueVar3 = (bue) linkedHashMap2.get(l50Var2);
                    if (bueVar3 != null) {
                    }
                    linkedHashMap2.remove(l50Var2);
                    bueVar2.c();
                }
            }
            int i2 = this.I;
            if (i2 < this.E - 1) {
                this.I = i2 + 1;
            } else {
                this.I = 0;
            }
        }
        linkedHashMap2.put(l50Var, bueVar2);
        linkedHashMap3.put(bueVar2, l50Var);
        return bueVar2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }
}
