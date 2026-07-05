package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public class ji0 extends TextView {
    public final ig0 E;
    public final fi0 F;
    public final epk G;
    public fh0 H;
    public boolean I;
    public poj J;
    public Future K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        jrh.a(context);
        this.I = false;
        this.J = null;
        qlh.a(this, getContext());
        ig0 ig0Var = new ig0(this);
        this.E = ig0Var;
        ig0Var.l(attributeSet, i);
        fi0 fi0Var = new fi0(this);
        this.F = fi0Var;
        fi0Var.f(attributeSet, i);
        fi0Var.b();
        epk epkVar = new epk();
        epkVar.E = this;
        this.G = epkVar;
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private fh0 getEmojiTextViewHelper() {
        if (this.H == null) {
            this.H = new fh0(this);
        }
        return this.H;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ig0 ig0Var = this.E;
        if (ig0Var != null) {
            ig0Var.e();
        }
        fi0 fi0Var = this.F;
        if (fi0Var != null) {
            fi0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (wyi.c) {
            return super.getAutoSizeMaxTextSize();
        }
        fi0 fi0Var = this.F;
        if (fi0Var != null) {
            return Math.round(fi0Var.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (wyi.c) {
            return super.getAutoSizeMinTextSize();
        }
        fi0 fi0Var = this.F;
        if (fi0Var != null) {
            return Math.round(fi0Var.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (wyi.c) {
            return super.getAutoSizeStepGranularity();
        }
        fi0 fi0Var = this.F;
        if (fi0Var != null) {
            return Math.round(fi0Var.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (wyi.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        fi0 fi0Var = this.F;
        return fi0Var != null ? fi0Var.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (wyi.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        fi0 fi0Var = this.F;
        if (fi0Var != null) {
            return fi0Var.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof elh ? ((elh) customSelectionActionModeCallback).a : customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public gi0 getSuperCaller() {
        if (this.J == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.J = new ii0(this);
            } else if (i >= 28) {
                this.J = new hi0(this);
            } else {
                this.J = new poj(this);
            }
        }
        return this.J;
    }

    public ColorStateList getSupportBackgroundTintList() {
        ig0 ig0Var = this.E;
        if (ig0Var != null) {
            return ig0Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        ig0 ig0Var = this.E;
        if (ig0Var != null) {
            return ig0Var.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.F.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.F.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.K;
        if (future != null) {
            try {
                this.K = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                grk.g(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        epk epkVar;
        if (Build.VERSION.SDK_INT >= 28 || (epkVar = this.G) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) epkVar.F;
        return textClassifier == null ? ai0.a((TextView) epkVar.E) : textClassifier;
    }

    public xad getTextMetricsParamsCompat() {
        return grk.g(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.F.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            ez1.T(editorInfo, getText());
        }
        lsk.d(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        fi0 fi0Var = this.F;
        if (fi0Var == null || wyi.c) {
            return;
        }
        fi0Var.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.K;
        if (future != null) {
            try {
                this.K = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                grk.g(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        fi0 fi0Var = this.F;
        if (fi0Var != null) {
            oi0 oi0Var = fi0Var.i;
            if (wyi.c || !oi0Var.f()) {
                return;
            }
            oi0Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (wyi.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        fi0 fi0Var = this.F;
        if (fi0Var != null) {
            fi0Var.h(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (wyi.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        fi0 fi0Var = this.F;
        if (fi0Var != null) {
            fi0Var.i(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (wyi.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        fi0 fi0Var = this.F;
        if (fi0Var != null) {
            fi0Var.j(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ig0 ig0Var = this.E;
        if (ig0Var != null) {
            ig0Var.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ig0 ig0Var = this.E;
        if (ig0Var != null) {
            ig0Var.n(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        fi0 fi0Var = this.F;
        if (fi0Var != null) {
            fi0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        fi0 fi0Var = this.F;
        if (fi0Var != null) {
            fi0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? xn5.c0(context, i) : null, i2 != 0 ? xn5.c0(context, i2) : null, i3 != 0 ? xn5.c0(context, i3) : null, i4 != 0 ? xn5.c0(context, i4) : null);
        fi0 fi0Var = this.F;
        if (fi0Var != null) {
            fi0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? xn5.c0(context, i) : null, i2 != 0 ? xn5.c0(context, i2) : null, i3 != 0 ? xn5.c0(context, i3) : null, i4 != 0 ? xn5.c0(context, i4) : null);
        fi0 fi0Var = this.F;
        if (fi0Var != null) {
            fi0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(grk.l(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((ovj) getEmojiTextViewHelper().b.F).f(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().C(i);
        } else {
            grk.i(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().k(i);
        } else {
            grk.j(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().E(i, f);
        } else if (i2 >= 34) {
            i5.i(this, i, f);
        } else {
            grk.k(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(yad yadVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        grk.g(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        ig0 ig0Var = this.E;
        if (ig0Var != null) {
            ig0Var.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        ig0 ig0Var = this.E;
        if (ig0Var != null) {
            ig0Var.t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        fi0 fi0Var = this.F;
        fi0Var.k(colorStateList);
        fi0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        fi0 fi0Var = this.F;
        fi0Var.l(mode);
        fi0Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        fi0 fi0Var = this.F;
        if (fi0Var != null) {
            fi0Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        epk epkVar;
        if (Build.VERSION.SDK_INT >= 28 || (epkVar = this.G) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            epkVar.F = textClassifier;
        }
    }

    public void setTextFuture(Future<yad> future) {
        this.K = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(xad xadVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = xadVar.b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(xadVar.a);
        setBreakStrategy(xadVar.c);
        setHyphenationFrequency(xadVar.d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = wyi.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        fi0 fi0Var = this.F;
        if (fi0Var != null) {
            oi0 oi0Var = fi0Var.i;
            if (z || oi0Var.f()) {
                return;
            }
            oi0Var.g(i, f);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.I) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            qwk qwkVar = kbi.a;
            if (context == null) {
                sz6.p("Context cannot be null");
                return;
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.I = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.I = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        grk.k(this, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        fi0 fi0Var = this.F;
        if (fi0Var != null) {
            fi0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        fi0 fi0Var = this.F;
        if (fi0Var != null) {
            fi0Var.b();
        }
    }

    public ji0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }
}
