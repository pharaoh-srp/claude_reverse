package com.agog.mathdisplay.render;

import android.graphics.Canvas;
import com.agog.mathdisplay.parse.NSRange;
import defpackage.mdj;
import defpackage.w44;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\nR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/agog/mathdisplay/render/MTMathListDisplay;", "Lcom/agog/mathdisplay/render/MTDisplay;", "", "displays", "Lcom/agog/mathdisplay/parse/NSRange;", "range", "<init>", "(Ljava/util/List;Lcom/agog/mathdisplay/parse/NSRange;)V", "Liei;", "colorChanged", "()V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "recomputeDimensions", "Lcom/agog/mathdisplay/render/MTLinePosition;", "type", "Lcom/agog/mathdisplay/render/MTLinePosition;", "getType", "()Lcom/agog/mathdisplay/render/MTLinePosition;", "setType", "(Lcom/agog/mathdisplay/render/MTLinePosition;)V", "subDisplays", "Ljava/util/List;", "getSubDisplays", "()Ljava/util/List;", "setSubDisplays", "(Ljava/util/List;)V", "", "index", "I", "getIndex", "()I", "setIndex", "(I)V", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTMathListDisplay extends MTDisplay {
    private int index;
    private List<? extends MTDisplay> subDisplays;
    private MTLinePosition type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTMathListDisplay(List<? extends MTDisplay> list, NSRange nSRange) {
        super(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, nSRange, false, 23, null);
        list.getClass();
        nSRange.getClass();
        this.type = MTLinePosition.KMTLinePositionRegular;
        this.index = -1;
        this.subDisplays = list;
        recomputeDimensions();
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public void colorChanged() {
        List<? extends MTDisplay> list = this.subDisplays;
        if (list != null) {
            for (MTDisplay mTDisplay : w44.p1(list)) {
                if (mTDisplay.getLocalTextColor() == 0) {
                    mTDisplay.setTextColor(getTextColor());
                } else {
                    mTDisplay.setTextColor(mTDisplay.getLocalTextColor());
                }
            }
        }
    }

    @Override // com.agog.mathdisplay.render.MTDisplay
    public void draw(Canvas canvas) {
        canvas.getClass();
        canvas.save();
        canvas.translate(getPosition().getX(), getPosition().getY());
        List<? extends MTDisplay> list = this.subDisplays;
        if (list != null) {
            Iterator it = w44.p1(list).iterator();
            while (it.hasNext()) {
                ((MTDisplay) it.next()).draw(canvas);
            }
        }
        canvas.restore();
    }

    public final int getIndex() {
        return this.index;
    }

    public final List<MTDisplay> getSubDisplays() {
        return this.subDisplays;
    }

    public final MTLinePosition getType() {
        return this.type;
    }

    public final void recomputeDimensions() {
        float f;
        float f2;
        List<? extends MTDisplay> list = this.subDisplays;
        float f3 = MTTypesetterKt.kLineSkipLimitMultiplier;
        if (list != null) {
            float f4 = 0.0f;
            f = 0.0f;
            f2 = 0.0f;
            for (MTDisplay mTDisplay : w44.p1(list)) {
                float fMax = Math.max(MTTypesetterKt.kLineSkipLimitMultiplier, mTDisplay.getAscent() + mTDisplay.getPosition().getY());
                if (fMax > f4) {
                    f4 = fMax;
                }
                float fMax2 = Math.max(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier - (mTDisplay.getPosition().getY() - mTDisplay.getDescent()));
                if (fMax2 > f) {
                    f = fMax2;
                }
                float x = mTDisplay.getPosition().getX() + mTDisplay.getWidth();
                if (x > f2) {
                    f2 = x;
                }
            }
            f3 = f4;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        setAscent(f3);
        setDescent(f);
        setWidth(f2);
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final void setSubDisplays(List<? extends MTDisplay> list) {
        this.subDisplays = list;
    }

    public final void setType(MTLinePosition mTLinePosition) {
        mTLinePosition.getClass();
        this.type = mTLinePosition;
    }
}
