package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.anthropic.claude.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class wva {
    public final vva a;
    public f0g b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public cwa m;
    public boolean q;
    public RippleDrawable s;
    public int t;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean r = true;

    public wva(vva vvaVar, f0g f0gVar) {
        this.a = vvaVar;
        this.b = f0gVar;
    }

    public final i1g a() {
        RippleDrawable rippleDrawable = this.s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        int numberOfLayers = this.s.getNumberOfLayers();
        RippleDrawable rippleDrawable2 = this.s;
        return numberOfLayers > 2 ? (i1g) rippleDrawable2.getDrawable(2) : (i1g) rippleDrawable2.getDrawable(1);
    }

    public final cwa b(boolean z) {
        RippleDrawable rippleDrawable = this.s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (cwa) ((LayerDrawable) ((InsetDrawable) this.s.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void c(f0g f0gVar) {
        this.b = f0gVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(f0gVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(f0gVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(f0gVar);
        }
    }

    public final void d(int i, int i2) {
        WeakHashMap weakHashMap = mvi.a;
        vva vvaVar = this.a;
        int paddingStart = vvaVar.getPaddingStart();
        int paddingTop = vvaVar.getPaddingTop();
        int paddingEnd = vvaVar.getPaddingEnd();
        int paddingBottom = vvaVar.getPaddingBottom();
        int i3 = this.e;
        int i4 = this.f;
        this.f = i2;
        this.e = i;
        if (!this.o) {
            e();
        }
        vvaVar.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void e() {
        cwa cwaVar = new cwa(this.b);
        vva vvaVar = this.a;
        cwaVar.E.b = new mk6(vvaVar.getContext());
        cwaVar.h();
        cwaVar.setTintList(this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            cwaVar.setTintMode(mode);
        }
        float f = this.h;
        ColorStateList colorStateList = this.k;
        cwaVar.E.j = f;
        cwaVar.invalidateSelf();
        bwa bwaVar = cwaVar.E;
        if (bwaVar.d != colorStateList) {
            bwaVar.d = colorStateList;
            cwaVar.onStateChange(cwaVar.getState());
        }
        cwa cwaVar2 = new cwa(this.b);
        cwaVar2.setTint(0);
        float f2 = this.h;
        int iK = this.n ? cmk.k(vvaVar, R.attr.colorSurface) : 0;
        cwaVar2.E.j = f2;
        cwaVar2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iK);
        bwa bwaVar2 = cwaVar2.E;
        if (bwaVar2.d != colorStateListValueOf) {
            bwaVar2.d = colorStateListValueOf;
            cwaVar2.onStateChange(cwaVar2.getState());
        }
        cwa cwaVar3 = new cwa(this.b);
        this.m = cwaVar3;
        cwaVar3.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(uue.a(this.l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{cwaVar2, cwaVar}), this.c, this.e, this.d, this.f), this.m);
        this.s = rippleDrawable;
        vvaVar.setInternalBackground(rippleDrawable);
        cwa cwaVarB = b(false);
        if (cwaVarB != null) {
            float f3 = this.t;
            bwa bwaVar3 = cwaVarB.E;
            if (bwaVar3.m != f3) {
                bwaVar3.m = f3;
                cwaVarB.h();
            }
            cwaVarB.setState(vvaVar.getDrawableState());
        }
    }

    public final void f() {
        cwa cwaVarB = b(false);
        cwa cwaVarB2 = b(true);
        if (cwaVarB != null) {
            float f = this.h;
            ColorStateList colorStateList = this.k;
            cwaVarB.E.j = f;
            cwaVarB.invalidateSelf();
            bwa bwaVar = cwaVarB.E;
            if (bwaVar.d != colorStateList) {
                bwaVar.d = colorStateList;
                cwaVarB.onStateChange(cwaVarB.getState());
            }
            if (cwaVarB2 != null) {
                float f2 = this.h;
                int iK = this.n ? cmk.k(this.a, R.attr.colorSurface) : 0;
                cwaVarB2.E.j = f2;
                cwaVarB2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iK);
                bwa bwaVar2 = cwaVarB2.E;
                if (bwaVar2.d != colorStateListValueOf) {
                    bwaVar2.d = colorStateListValueOf;
                    cwaVarB2.onStateChange(cwaVarB2.getState());
                }
            }
        }
    }
}
