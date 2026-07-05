package com.agog.mathdisplay.render;

import android.graphics.Canvas;
import com.agog.mathdisplay.parse.NSRange;
import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.mdj;
import defpackage.mq5;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0004\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010*\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0017\u001a\u0004\b+\u0010\u0019\"\u0004\b,\u0010\u001bR*\u0010/\u001a\u00020-2\u0006\u0010.\u001a\u00020-8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R*\u00106\u001a\u0002052\u0006\u0010.\u001a\u0002058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R*\u0010<\u001a\u0002052\u0006\u0010.\u001a\u0002058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b<\u00107\u001a\u0004\b=\u00109\"\u0004\b>\u0010;¨\u0006?"}, d2 = {"Lcom/agog/mathdisplay/render/MTDisplay;", "", "", "ascent", "descent", "width", "Lcom/agog/mathdisplay/parse/NSRange;", "range", "", "hasScript", "<init>", "(FFFLcom/agog/mathdisplay/parse/NSRange;Z)V", "Liei;", "positionChanged", "()V", "colorChanged", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "Lcom/agog/mathdisplay/render/CGRect;", "displayBounds", "()Lcom/agog/mathdisplay/render/CGRect;", "F", "getAscent", "()F", "setAscent", "(F)V", "getDescent", "setDescent", "getWidth", "setWidth", "Lcom/agog/mathdisplay/parse/NSRange;", "getRange", "()Lcom/agog/mathdisplay/parse/NSRange;", "setRange", "(Lcom/agog/mathdisplay/parse/NSRange;)V", "Z", "getHasScript", "()Z", "setHasScript", "(Z)V", "shiftDown", "getShiftDown", "setShiftDown", "Lcom/agog/mathdisplay/render/CGPoint;", ExperienceToggle.DEFAULT_PARAM_KEY, "position", "Lcom/agog/mathdisplay/render/CGPoint;", "getPosition", "()Lcom/agog/mathdisplay/render/CGPoint;", "setPosition", "(Lcom/agog/mathdisplay/render/CGPoint;)V", "", "textColor", "I", "getTextColor", "()I", "setTextColor", "(I)V", "localTextColor", "getLocalTextColor", "setLocalTextColor", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public class MTDisplay {
    private float ascent;
    private float descent;
    private boolean hasScript;
    private int localTextColor;
    private CGPoint position;
    private NSRange range;
    private float shiftDown;
    private int textColor;
    private float width;

    public MTDisplay(float f, float f2, float f3, NSRange nSRange, boolean z) {
        nSRange.getClass();
        this.ascent = f;
        this.descent = f2;
        this.width = f3;
        this.range = nSRange;
        this.hasScript = z;
        this.position = new CGPoint(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 3, null);
        this.textColor = -16777216;
        this.range = NSRange.copy$default(this.range, 0, 0, 3, null);
    }

    public void colorChanged() {
    }

    public final CGRect displayBounds() {
        return new CGRect(this.position.getX(), this.position.getY() - getDescent(), getWidth(), getDescent() + getAscent());
    }

    public void draw(Canvas canvas) {
        canvas.getClass();
    }

    public float getAscent() {
        return this.ascent;
    }

    public float getDescent() {
        return this.descent;
    }

    public final boolean getHasScript() {
        return this.hasScript;
    }

    public final int getLocalTextColor() {
        return this.localTextColor;
    }

    public final CGPoint getPosition() {
        return this.position;
    }

    public final NSRange getRange() {
        return this.range;
    }

    public final float getShiftDown() {
        return this.shiftDown;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public float getWidth() {
        return this.width;
    }

    public void positionChanged() {
    }

    public void setAscent(float f) {
        this.ascent = f;
    }

    public void setDescent(float f) {
        this.descent = f;
    }

    public final void setHasScript(boolean z) {
        this.hasScript = z;
    }

    public final void setLocalTextColor(int i) {
        this.localTextColor = i;
        colorChanged();
    }

    public final void setPosition(CGPoint cGPoint) {
        cGPoint.getClass();
        this.position = CGPoint.copy$default(cGPoint, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 3, null);
        positionChanged();
    }

    public final void setRange(NSRange nSRange) {
        nSRange.getClass();
        this.range = nSRange;
    }

    public final void setShiftDown(float f) {
        this.shiftDown = f;
    }

    public final void setTextColor(int i) {
        this.textColor = i;
        colorChanged();
    }

    public void setWidth(float f) {
        this.width = f;
    }

    public MTDisplay() {
        this(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, false, 31, null);
    }

    public /* synthetic */ MTDisplay(float f, float f2, float f3, NSRange nSRange, boolean z, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? new NSRange(0, 0, 3, null) : nSRange, (i & 16) != 0 ? false : z);
    }
}
