package com.agog.mathdisplay;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.agog.mathdisplay.MTFontManager;
import com.agog.mathdisplay.parse.MTLineStyle;
import com.agog.mathdisplay.parse.MTMathList;
import com.agog.mathdisplay.parse.MTMathListBuilder;
import com.agog.mathdisplay.parse.MTParseError;
import com.agog.mathdisplay.parse.MTParseErrors;
import com.agog.mathdisplay.render.MTFont;
import com.agog.mathdisplay.render.MTMathListDisplay;
import com.agog.mathdisplay.render.MTTypesetter;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.fq6;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.wd6;
import defpackage.wg6;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 c2\u00020\u0001:\u0003cdeB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0017\u0010%\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R.\u0010*\u001a\u0004\u0018\u00010\u00142\b\u0010)\u001a\u0004\u0018\u00010\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010#\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\u0018R*\u0010/\u001a\u00020.2\u0006\u0010)\u001a\u00020.8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00105\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u0010\f\"\u0004\b8\u00109R.\u0010;\u001a\u0004\u0018\u00010:2\b\u0010)\u001a\u0004\u0018\u00010:8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R*\u0010B\u001a\u00020A2\u0006\u0010)\u001a\u00020A8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR*\u0010I\u001a\u00020H2\u0006\u0010)\u001a\u00020H8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR*\u0010O\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR*\u0010V\u001a\u00020U2\u0006\u0010)\u001a\u00020U8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u001c\u0010]\u001a\u00020\\8B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u001a\u0010a\u001a\u00020A8\u0006X\u0086D¢\u0006\f\n\u0004\ba\u0010C\u001a\u0004\bb\u0010E¨\u0006f"}, d2 = {"Lcom/agog/mathdisplay/MTMathView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "displayError", "()Z", "Landroid/graphics/Canvas;", "canvas", "drawError", "(Landroid/graphics/Canvas;)Z", "Landroid/graphics/Rect;", "errorBounds", "()Landroid/graphics/Rect;", "Lcom/agog/mathdisplay/parse/MTMathList;", "list", "Liei;", "setParsedMathList", "(Lcom/agog/mathdisplay/parse/MTMathList;)V", "onDraw", "(Landroid/graphics/Canvas;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Lcom/agog/mathdisplay/render/MTMathListDisplay;", "displayList", "Lcom/agog/mathdisplay/render/MTMathListDisplay;", "_mathList", "Lcom/agog/mathdisplay/parse/MTMathList;", "Lcom/agog/mathdisplay/parse/MTParseError;", "lastError", "Lcom/agog/mathdisplay/parse/MTParseError;", "getLastError", "()Lcom/agog/mathdisplay/parse/MTParseError;", ExperienceToggle.DEFAULT_PARAM_KEY, "mathList", "getMathList", "()Lcom/agog/mathdisplay/parse/MTMathList;", "setMathList", "", "latex", "Ljava/lang/String;", "getLatex", "()Ljava/lang/String;", "setLatex", "(Ljava/lang/String;)V", "displayErrorInline", "Z", "getDisplayErrorInline", "setDisplayErrorInline", "(Z)V", "Lcom/agog/mathdisplay/render/MTFont;", "font", "Lcom/agog/mathdisplay/render/MTFont;", "getFont", "()Lcom/agog/mathdisplay/render/MTFont;", "setFont", "(Lcom/agog/mathdisplay/render/MTFont;)V", "", "fontSize", "F", "getFontSize", "()F", "setFontSize", "(F)V", "Lcom/agog/mathdisplay/MTMathView$MTMathViewMode;", "labelMode", "Lcom/agog/mathdisplay/MTMathView$MTMathViewMode;", "getLabelMode", "()Lcom/agog/mathdisplay/MTMathView$MTMathViewMode;", "setLabelMode", "(Lcom/agog/mathdisplay/MTMathView$MTMathViewMode;)V", "textColor", "I", "getTextColor", "()I", "setTextColor", "(I)V", "Lcom/agog/mathdisplay/MTMathView$MTTextAlignment;", "textAlignment", "Lcom/agog/mathdisplay/MTMathView$MTTextAlignment;", "getTextAlignment", "()Lcom/agog/mathdisplay/MTMathView$MTTextAlignment;", "setTextAlignment", "(Lcom/agog/mathdisplay/MTMathView$MTTextAlignment;)V", "Lcom/agog/mathdisplay/parse/MTLineStyle;", "currentStyle", "Lcom/agog/mathdisplay/parse/MTLineStyle;", "getCurrentStyle", "()Lcom/agog/mathdisplay/parse/MTLineStyle;", "errorFontSize", "getErrorFontSize", "Companion", "MTMathViewMode", "MTTextAlignment", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTMathView extends View {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private MTMathList _mathList;
    private MTLineStyle currentStyle;
    private boolean displayErrorInline;
    private MTMathListDisplay displayList;
    private final float errorFontSize;
    private MTFont font;
    private float fontSize;
    private MTMathViewMode labelMode;
    private final MTParseError lastError;
    private String latex;
    private MTMathList mathList;
    private MTTextAlignment textAlignment;
    private int textColor;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/agog/mathdisplay/MTMathView$MTMathViewMode;", "", "<init>", "(Ljava/lang/String;I)V", "KMTMathViewModeDisplay", "KMTMathViewModeText", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
    public static final class MTMathViewMode {
        private static final /* synthetic */ fq6 $ENTRIES;
        private static final /* synthetic */ MTMathViewMode[] $VALUES;
        public static final MTMathViewMode KMTMathViewModeDisplay = new MTMathViewMode("KMTMathViewModeDisplay", 0);
        public static final MTMathViewMode KMTMathViewModeText = new MTMathViewMode("KMTMathViewModeText", 1);

        private static final /* synthetic */ MTMathViewMode[] $values() {
            return new MTMathViewMode[]{KMTMathViewModeDisplay, KMTMathViewModeText};
        }

        static {
            MTMathViewMode[] mTMathViewModeArr$values = $values();
            $VALUES = mTMathViewModeArr$values;
            $ENTRIES = wd6.n0(mTMathViewModeArr$values);
        }

        private MTMathViewMode(String str, int i) {
        }

        public static fq6 getEntries() {
            return $ENTRIES;
        }

        public static MTMathViewMode valueOf(String str) {
            return (MTMathViewMode) Enum.valueOf(MTMathViewMode.class, str);
        }

        public static MTMathViewMode[] values() {
            return (MTMathViewMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/agog/mathdisplay/MTMathView$MTTextAlignment;", "", "<init>", "(Ljava/lang/String;I)V", "KMTTextAlignmentLeft", "KMTTextAlignmentCenter", "KMTTextAlignmentRight", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
    public static final class MTTextAlignment {
        private static final /* synthetic */ fq6 $ENTRIES;
        private static final /* synthetic */ MTTextAlignment[] $VALUES;
        public static final MTTextAlignment KMTTextAlignmentLeft = new MTTextAlignment("KMTTextAlignmentLeft", 0);
        public static final MTTextAlignment KMTTextAlignmentCenter = new MTTextAlignment("KMTTextAlignmentCenter", 1);
        public static final MTTextAlignment KMTTextAlignmentRight = new MTTextAlignment("KMTTextAlignmentRight", 2);

        private static final /* synthetic */ MTTextAlignment[] $values() {
            return new MTTextAlignment[]{KMTTextAlignmentLeft, KMTTextAlignmentCenter, KMTTextAlignmentRight};
        }

        static {
            MTTextAlignment[] mTTextAlignmentArr$values = $values();
            $VALUES = mTTextAlignmentArr$values;
            $ENTRIES = wd6.n0(mTTextAlignmentArr$values);
        }

        private MTTextAlignment(String str, int i) {
        }

        public static fq6 getEntries() {
            return $ENTRIES;
        }

        public static MTTextAlignment valueOf(String str) {
            return (MTTextAlignment) Enum.valueOf(MTTextAlignment.class, str);
        }

        public static MTTextAlignment[] values() {
            return (MTTextAlignment[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = mdj.f)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MTMathViewMode.values().length];
            try {
                iArr[MTMathViewMode.KMTMathViewModeDisplay.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MTMathViewMode.KMTMathViewModeText.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MTTextAlignment.values().length];
            try {
                iArr2[MTTextAlignment.KMTTextAlignmentLeft.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[MTTextAlignment.KMTTextAlignmentCenter.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[MTTextAlignment.KMTTextAlignmentRight.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MTMathView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.lastError = new MTParseError(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        this.latex = "";
        this.displayErrorInline = true;
        MTFontManager.Companion companion = MTFontManager.INSTANCE;
        companion.setContext(context);
        this.font = companion.defaultFont();
        this.fontSize = 20.0f;
        this.labelMode = MTMathViewMode.KMTMathViewModeDisplay;
        this.textColor = -16777216;
        this.textAlignment = MTTextAlignment.KMTTextAlignmentLeft;
        this.currentStyle = MTLineStyle.KMTLineStyleDisplay;
        this.errorFontSize = 20.0f;
    }

    private final boolean displayError() {
        return this.lastError.getErrorcode() != MTParseErrors.ErrorNone && this.displayErrorInline;
    }

    private final boolean drawError(Canvas canvas) {
        if (!displayError()) {
            return false;
        }
        Paint paint = new Paint();
        paint.setTypeface(Typeface.DEFAULT);
        canvas.drawPaint(paint);
        paint.setColor(-65536);
        paint.setTextSize(INSTANCE.convertDpToPixel(this.errorFontSize));
        canvas.drawText(this.lastError.getErrordesc(), MTTypesetterKt.kLineSkipLimitMultiplier, -errorBounds().top, paint);
        return true;
    }

    private final Rect errorBounds() {
        if (!displayError()) {
            return new Rect(0, 0, 0, 0);
        }
        Paint paint = new Paint();
        paint.setTypeface(Typeface.DEFAULT);
        paint.setTextSize(INSTANCE.convertDpToPixel(this.errorFontSize));
        Rect rect = new Rect();
        String errordesc = this.lastError.getErrordesc();
        String errordesc2 = this.lastError.getErrordesc();
        errordesc2.getClass();
        paint.getTextBounds(errordesc, 0, errordesc2.length(), rect);
        return rect;
    }

    private final MTLineStyle getCurrentStyle() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.labelMode.ordinal()];
        if (i == 1) {
            return MTLineStyle.KMTLineStyleDisplay;
        }
        if (i == 2) {
            return MTLineStyle.KMTLineStyleText;
        }
        wg6.i();
        return null;
    }

    public final boolean getDisplayErrorInline() {
        return this.displayErrorInline;
    }

    public final float getErrorFontSize() {
        return this.errorFontSize;
    }

    public final MTFont getFont() {
        return this.font;
    }

    public final float getFontSize() {
        return this.fontSize;
    }

    public final MTMathViewMode getLabelMode() {
        return this.labelMode;
    }

    public final MTParseError getLastError() {
        return this.lastError;
    }

    public final String getLatex() {
        return this.latex;
    }

    public final MTMathList getMathList() {
        return this.mathList;
    }

    @Override // android.view.View
    public final MTTextAlignment getTextAlignment() {
        return this.textAlignment;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int paddingLeft;
        canvas.getClass();
        super.onDraw(canvas);
        if (drawError(canvas)) {
            return;
        }
        MTMathListDisplay mTMathListDisplayCreateLineForMathList = this.displayList;
        MTMathList mTMathList = this._mathList;
        if (mTMathList != null && mTMathListDisplayCreateLineForMathList == null) {
            MTTypesetter.Companion companion = MTTypesetter.INSTANCE;
            MTFont mTFont = this.font;
            mTFont.getClass();
            mTMathListDisplayCreateLineForMathList = companion.createLineForMathList(mTMathList, mTFont, getCurrentStyle());
            this.displayList = mTMathListDisplayCreateLineForMathList;
        }
        if (mTMathListDisplayCreateLineForMathList != null) {
            mTMathListDisplayCreateLineForMathList.setTextColor(this.textColor);
            int i = WhenMappings.$EnumSwitchMapping$1[this.textAlignment.ordinal()];
            if (i == 1) {
                paddingLeft = getPaddingLeft();
            } else if (i == 2) {
                paddingLeft = ((((getWidth() - getPaddingLeft()) - getPaddingRight()) - ((int) mTMathListDisplayCreateLineForMathList.getWidth())) / 2) + getPaddingLeft();
            } else {
                if (i != 3) {
                    wg6.i();
                    return;
                }
                paddingLeft = (getWidth() - ((int) mTMathListDisplayCreateLineForMathList.getWidth())) - getPaddingRight();
            }
            int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            float descent = mTMathListDisplayCreateLineForMathList.getDescent() + mTMathListDisplayCreateLineForMathList.getAscent();
            float f = this.fontSize;
            if (descent < f / 2.0f) {
                descent = f / 2.0f;
            }
            float descent2 = mTMathListDisplayCreateLineForMathList.getDescent() + ((height - descent) / 2.0f) + getPaddingBottom();
            mTMathListDisplayCreateLineForMathList.getPosition().setX(paddingLeft);
            mTMathListDisplayCreateLineForMathList.getPosition().setY(descent2);
            canvas.save();
            canvas.translate(MTTypesetterKt.kLineSkipLimitMultiplier, getHeight());
            canvas.scale(1.0f, -1.0f);
            mTMathListDisplayCreateLineForMathList.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        float descent;
        float width;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        MTMathListDisplay mTMathListDisplayCreateLineForMathList = this.displayList;
        MTMathList mTMathList = this._mathList;
        if (mTMathList != null && mTMathListDisplayCreateLineForMathList == null) {
            MTTypesetter.Companion companion = MTTypesetter.INSTANCE;
            MTFont mTFont = this.font;
            mTFont.getClass();
            mTMathListDisplayCreateLineForMathList = companion.createLineForMathList(mTMathList, mTFont, getCurrentStyle());
            this.displayList = mTMathListDisplayCreateLineForMathList;
        }
        if (mTMathListDisplayCreateLineForMathList != null) {
            descent = mTMathListDisplayCreateLineForMathList.getDescent() + mTMathListDisplayCreateLineForMathList.getAscent() + paddingBottom;
            width = mTMathListDisplayCreateLineForMathList.getWidth() + paddingRight;
        } else {
            descent = MTTypesetterKt.kLineSkipLimitMultiplier;
            width = 0.0f;
        }
        Rect rectErrorBounds = errorBounds();
        setMeasuredDimension((int) (Math.max(width, rectErrorBounds.width()) + 1.0f), (int) (Math.max(descent, rectErrorBounds.height()) + 1.0f));
    }

    public final void setDisplayErrorInline(boolean z) {
        this.displayErrorInline = z;
    }

    public final void setFont(MTFont mTFont) {
        this.font = mTFont;
        this.displayList = null;
        requestLayout();
        invalidate();
    }

    public final void setFontSize(float f) {
        this.fontSize = f;
        MTFont mTFont = this.font;
        if (mTFont != null) {
            setFont(mTFont.copyFontWithSize(f));
        }
    }

    public final void setLabelMode(MTMathViewMode mTMathViewMode) {
        mTMathViewMode.getClass();
        this.labelMode = mTMathViewMode;
        this.displayList = null;
        requestLayout();
        invalidate();
    }

    public final void setLatex(String str) {
        str.getClass();
        this.latex = str;
        MTMathList mTMathListBuildFromString = MTMathListBuilder.INSTANCE.buildFromString(str, this.lastError);
        if (this.lastError.getErrorcode() != MTParseErrors.ErrorNone) {
            this._mathList = null;
        } else {
            this._mathList = mTMathListBuildFromString;
        }
        this.displayList = null;
        requestLayout();
        invalidate();
    }

    public final void setMathList(MTMathList mTMathList) {
        this.mathList = mTMathList;
        if (mTMathList != null) {
            setLatex(MTMathListBuilder.INSTANCE.toLatexString(mTMathList));
        }
    }

    public final void setParsedMathList(MTMathList list) {
        this._mathList = list;
        this.displayList = null;
        requestLayout();
        invalidate();
    }

    public final void setTextAlignment(MTTextAlignment mTTextAlignment) {
        mTTextAlignment.getClass();
        this.textAlignment = mTTextAlignment;
        requestLayout();
        invalidate();
    }

    public final void setTextColor(int i) {
        this.textColor = i;
        MTMathListDisplay mTMathListDisplay = this.displayList;
        if (mTMathListDisplay != null) {
            mTMathListDisplay.setTextColor(i);
        }
        invalidate();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"Lcom/agog/mathdisplay/MTMathView$Companion;", "", "<init>", "()V", "convertDpToPixel", "", "dp", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
    public static final class Companion {
        public /* synthetic */ Companion(mq5 mq5Var) {
            this();
        }

        public final float convertDpToPixel(float dp) {
            return ij0.c(Resources.getSystem().getDisplayMetrics().densityDpi, 160.0f, dp);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MTMathView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ MTMathView(Context context, AttributeSet attributeSet, int i, int i2, mq5 mq5Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MTMathView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
