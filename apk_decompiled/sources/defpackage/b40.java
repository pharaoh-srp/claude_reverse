package defpackage;

import android.text.Layout;
import android.text.TextPaint;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
public final class b40 implements frc {
    public final String E;
    public final tkh F;
    public final List G;
    public final List H;
    public final wt7 I;
    public final cz5 J;
    public final s60 K;
    public final CharSequence L;
    public final lu9 M;
    public lrb N;
    public final boolean O;
    public final int P;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x07b9  */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r37v0 */
    /* JADX WARN: Type inference failed for: r37v1, types: [ue1] */
    /* JADX WARN: Type inference failed for: r37v2 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [egg] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [egg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25, types: [b02] */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v69 */
    /* JADX WARN: Type inference failed for: r5v70 */
    /* JADX WARN: Type inference failed for: r5v71 */
    /* JADX WARN: Type inference failed for: r9v18, types: [bu2] */
    /* JADX WARN: Type inference failed for: r9v74 */
    /* JADX WARN: Type inference failed for: r9v75, types: [vl6] */
    /* JADX WARN: Type inference failed for: r9v81 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b40(java.lang.String r46, defpackage.tkh r47, java.util.List r48, java.util.List r49, defpackage.wt7 r50, defpackage.cz5 r51) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b40.<init>(java.lang.String, tkh, java.util.List, java.util.List, wt7, cz5):void");
    }

    @Override // defpackage.frc
    public final boolean c() {
        lrb lrbVar = this.N;
        if (lrbVar != null ? lrbVar.O() : false) {
            return true;
        }
        if (!this.O && nai.i(this.F)) {
            efe efeVar = ll6.a;
            efe efeVar2 = ll6.a;
            wlg wlgVarS = (wlg) efeVar2.F;
            if (wlgVarS == null) {
                if (gl6.d()) {
                    wlgVarS = efeVar2.s();
                    efeVar2.F = wlgVarS;
                } else {
                    wlgVarS = iuj.f;
                }
            }
            if (((Boolean) wlgVarS.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.frc
    public final float f() {
        lu9 lu9Var = this.M;
        float f = lu9Var.e;
        TextPaint textPaint = lu9Var.b;
        if (!Float.isNaN(f)) {
            return lu9Var.e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = lu9Var.a;
        lineInstance.setText(new ri2(charSequence.length(), charSequence));
        PriorityQueue priorityQueue = new PriorityQueue(10, dgj.c);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new b79(i, next, 1));
            } else {
                b79 b79Var = (b79) priorityQueue.peek();
                if (b79Var != null && b79Var.F - b79Var.E < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new b79(i, next, 1));
                }
            }
            i = next;
        }
        boolean zIsEmpty = priorityQueue.isEmpty();
        float desiredWidth = MTTypesetterKt.kLineSkipLimitMultiplier;
        if (!zIsEmpty) {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                pmf.d();
                return MTTypesetterKt.kLineSkipLimitMultiplier;
            }
            b79 b79Var2 = (b79) it.next();
            desiredWidth = Layout.getDesiredWidth(lu9Var.b(), b79Var2.E, b79Var2.F, textPaint);
            while (it.hasNext()) {
                b79 b79Var3 = (b79) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(lu9Var.b(), b79Var3.E, b79Var3.F, textPaint));
            }
        }
        lu9Var.e = desiredWidth;
        return desiredWidth;
    }

    @Override // defpackage.frc
    public final float j() {
        return this.M.c();
    }
}
