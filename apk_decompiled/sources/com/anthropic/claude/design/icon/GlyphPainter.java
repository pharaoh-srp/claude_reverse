package com.anthropic.claude.design.icon;

import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import defpackage.ae0;
import defpackage.bpc;
import defpackage.cv9;
import defpackage.efe;
import defpackage.fj0;
import defpackage.fu9;
import defpackage.grc;
import defpackage.hr1;
import defpackage.ib2;
import defpackage.jz;
import defpackage.k8g;
import defpackage.mdj;
import defpackage.mwa;
import defpackage.wd6;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/anthropic/claude/design/icon/GlyphPainter;", "Lbpc;", "icon"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
final class GlyphPainter extends bpc {
    public final String J;
    public final Resources K;
    public final boolean L;
    public final float M;
    public final long N;
    public final Paint O;
    public int P;
    public final Paint.FontMetrics Q;
    public float R;
    public hr1 S;

    public GlyphPainter(String str, Resources resources, float f, boolean z, float f2) {
        str.getClass();
        resources.getClass();
        this.J = str;
        this.K = resources;
        this.L = z;
        this.M = f2;
        this.N = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        Paint paint = new Paint(1);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setColor(-16777216);
        this.O = paint;
        this.P = -1;
        this.Q = new Paint.FontMetrics();
        this.R = 1.0f;
    }

    @Override // defpackage.bpc
    public final boolean c(float f) {
        this.R = f;
        return true;
    }

    @Override // defpackage.bpc
    public final boolean d(hr1 hr1Var) {
        this.S = hr1Var;
        return true;
    }

    @Override // defpackage.bpc
    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getM() {
        return this.N;
    }

    @Override // defpackage.bpc
    public final void j(cv9 cv9Var) {
        ib2 ib2Var = cv9Var.E;
        if (!this.L || cv9Var.getLayoutDirection() != fu9.F) {
            k(cv9Var);
            return;
        }
        long jP0 = ib2Var.P0();
        fj0 fj0Var = ib2Var.F;
        long jW = fj0Var.w();
        fj0Var.p().g();
        try {
            ((efe) fj0Var.E).C(jP0, -1.0f, 1.0f);
            k(cv9Var);
        } finally {
            grc.y(fj0Var, jW);
        }
    }

    public final void k(cv9 cv9Var) {
        ib2 ib2Var = cv9Var.E;
        float fD = k8g.d(ib2Var.g()) * this.M;
        int iE0 = wd6.e0(mwa.L(fD / ib2Var.getDensity()), 12, 32);
        int i = this.P;
        Paint paint = this.O;
        if (iE0 != i) {
            Typeface typeface = ae0.a;
            paint.setTypeface(ae0.a(this.K, iE0));
            this.P = iE0;
        }
        paint.setTextSize(fD);
        paint.setAlpha((int) (this.R * 255.0f));
        hr1 hr1Var = this.S;
        paint.setColorFilter(hr1Var != null ? hr1Var.a : null);
        Paint.FontMetrics fontMetrics = this.Q;
        paint.getFontMetrics(fontMetrics);
        jz.b(ib2Var.F.p()).drawText(this.J, Float.intBitsToFloat((int) (ib2Var.g() >> 32)) / 2.0f, (Float.intBitsToFloat((int) (ib2Var.g() & 4294967295L)) / 2.0f) - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), paint);
    }
}
