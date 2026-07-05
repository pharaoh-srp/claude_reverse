package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class n0f implements Cloneable {
    public final float E;
    public final int F;

    public n0f(float f) {
        this.E = f;
        this.F = 1;
    }

    public final float a(h2f h2fVar) {
        if (this.F != 9) {
            return d(h2fVar);
        }
        f2f f2fVar = (f2f) h2fVar.d;
        sp0 sp0Var = f2fVar.g;
        if (sp0Var == null) {
            sp0Var = f2fVar.f;
        }
        float f = this.E;
        if (sp0Var == null) {
            return f;
        }
        float fSqrt = sp0Var.d;
        if (fSqrt != sp0Var.e) {
            fSqrt = (float) (Math.sqrt((r0 * r0) + (fSqrt * fSqrt)) / 1.414213562373095d);
        }
        return (f * fSqrt) / 100.0f;
    }

    public final float b(h2f h2fVar, float f) {
        return this.F == 9 ? (this.E * f) / 100.0f : d(h2fVar);
    }

    public final float c() {
        float f;
        float f2;
        int iF = sq6.F(this.F);
        float f3 = this.E;
        if (iF == 0) {
            return f3;
        }
        if (iF == 3) {
            return f3 * 96.0f;
        }
        if (iF == 4) {
            f = f3 * 96.0f;
            f2 = 2.54f;
        } else if (iF == 5) {
            f = f3 * 96.0f;
            f2 = 25.4f;
        } else if (iF == 6) {
            f = f3 * 96.0f;
            f2 = 72.0f;
        } else {
            if (iF != 7) {
                return f3;
            }
            f = f3 * 96.0f;
            f2 = 6.0f;
        }
        return f / f2;
    }

    public final float d(h2f h2fVar) {
        float textSize;
        int iF = sq6.F(this.F);
        float f = this.E;
        switch (iF) {
            case 1:
                textSize = ((f2f) h2fVar.d).d.getTextSize();
                break;
            case 2:
                textSize = ((f2f) h2fVar.d).d.getTextSize() / 2.0f;
                break;
            case 3:
                h2fVar.getClass();
                return f * 96.0f;
            case 4:
                h2fVar.getClass();
                return (f * 96.0f) / 2.54f;
            case 5:
                h2fVar.getClass();
                return (f * 96.0f) / 25.4f;
            case 6:
                h2fVar.getClass();
                return (f * 96.0f) / 72.0f;
            case 7:
                h2fVar.getClass();
                return (f * 96.0f) / 6.0f;
            case 8:
                f2f f2fVar = (f2f) h2fVar.d;
                sp0 sp0Var = f2fVar.g;
                if (sp0Var == null) {
                    sp0Var = f2fVar.f;
                }
                if (sp0Var != null) {
                    return (f * sp0Var.d) / 100.0f;
                }
            default:
                return f;
        }
        return textSize * f;
    }

    public final float f(h2f h2fVar) {
        if (this.F != 9) {
            return d(h2fVar);
        }
        f2f f2fVar = (f2f) h2fVar.d;
        sp0 sp0Var = f2fVar.g;
        if (sp0Var == null) {
            sp0Var = f2fVar.f;
        }
        float f = this.E;
        return sp0Var == null ? f : (f * sp0Var.e) / 100.0f;
    }

    public final boolean g() {
        return this.E < MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    public final boolean h() {
        return this.E == MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.E));
        switch (this.F) {
            case 1:
                str = "px";
                break;
            case 2:
                str = "em";
                break;
            case 3:
                str = "ex";
                break;
            case 4:
                str = "in";
                break;
            case 5:
                str = "cm";
                break;
            case 6:
                str = "mm";
                break;
            case 7:
                str = "pt";
                break;
            case 8:
                str = "pc";
                break;
            case 9:
                str = "percent";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        return sb.toString();
    }

    public n0f(int i, float f) {
        this.E = f;
        this.F = i;
    }
}
