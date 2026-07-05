package com.agog.mathdisplay.render;

import defpackage.mdj;
import defpackage.mq5;
import defpackage.sq6;
import defpackage.vb7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J;\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010!\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006&"}, d2 = {"Lcom/agog/mathdisplay/render/MTGlyphPart;", "", "glyph", "", "fullAdvance", "", "startConnectorLength", "endConnectorLength", "isExtender", "", "<init>", "(IFFFZ)V", "getGlyph", "()I", "setGlyph", "(I)V", "getFullAdvance", "()F", "setFullAdvance", "(F)V", "getStartConnectorLength", "setStartConnectorLength", "getEndConnectorLength", "setEndConnectorLength", "()Z", "setExtender", "(Z)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final /* data */ class MTGlyphPart {
    private float endConnectorLength;
    private float fullAdvance;
    private int glyph;
    private boolean isExtender;
    private float startConnectorLength;

    public /* synthetic */ MTGlyphPart(int i, float f, float f2, float f3, boolean z, int i2, mq5 mq5Var) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0.0f : f, (i2 & 4) != 0 ? 0.0f : f2, (i2 & 8) != 0 ? 0.0f : f3, (i2 & 16) != 0 ? false : z);
    }

    public static /* synthetic */ MTGlyphPart copy$default(MTGlyphPart mTGlyphPart, int i, float f, float f2, float f3, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = mTGlyphPart.glyph;
        }
        if ((i2 & 2) != 0) {
            f = mTGlyphPart.fullAdvance;
        }
        if ((i2 & 4) != 0) {
            f2 = mTGlyphPart.startConnectorLength;
        }
        if ((i2 & 8) != 0) {
            f3 = mTGlyphPart.endConnectorLength;
        }
        if ((i2 & 16) != 0) {
            z = mTGlyphPart.isExtender;
        }
        boolean z2 = z;
        float f4 = f2;
        return mTGlyphPart.copy(i, f, f4, f3, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getGlyph() {
        return this.glyph;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getFullAdvance() {
        return this.fullAdvance;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getStartConnectorLength() {
        return this.startConnectorLength;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getEndConnectorLength() {
        return this.endConnectorLength;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsExtender() {
        return this.isExtender;
    }

    public final MTGlyphPart copy(int glyph, float fullAdvance, float startConnectorLength, float endConnectorLength, boolean isExtender) {
        return new MTGlyphPart(glyph, fullAdvance, startConnectorLength, endConnectorLength, isExtender);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MTGlyphPart)) {
            return false;
        }
        MTGlyphPart mTGlyphPart = (MTGlyphPart) other;
        return this.glyph == mTGlyphPart.glyph && Float.compare(this.fullAdvance, mTGlyphPart.fullAdvance) == 0 && Float.compare(this.startConnectorLength, mTGlyphPart.startConnectorLength) == 0 && Float.compare(this.endConnectorLength, mTGlyphPart.endConnectorLength) == 0 && this.isExtender == mTGlyphPart.isExtender;
    }

    public final float getEndConnectorLength() {
        return this.endConnectorLength;
    }

    public final float getFullAdvance() {
        return this.fullAdvance;
    }

    public final int getGlyph() {
        return this.glyph;
    }

    public final float getStartConnectorLength() {
        return this.startConnectorLength;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isExtender) + vb7.b(this.endConnectorLength, vb7.b(this.startConnectorLength, vb7.b(this.fullAdvance, Integer.hashCode(this.glyph) * 31, 31), 31), 31);
    }

    public final boolean isExtender() {
        return this.isExtender;
    }

    public final void setEndConnectorLength(float f) {
        this.endConnectorLength = f;
    }

    public final void setExtender(boolean z) {
        this.isExtender = z;
    }

    public final void setFullAdvance(float f) {
        this.fullAdvance = f;
    }

    public final void setGlyph(int i) {
        this.glyph = i;
    }

    public final void setStartConnectorLength(float f) {
        this.startConnectorLength = f;
    }

    public String toString() {
        int i = this.glyph;
        float f = this.fullAdvance;
        float f2 = this.startConnectorLength;
        float f3 = this.endConnectorLength;
        boolean z = this.isExtender;
        StringBuilder sb = new StringBuilder("MTGlyphPart(glyph=");
        sb.append(i);
        sb.append(", fullAdvance=");
        sb.append(f);
        sb.append(", startConnectorLength=");
        sb.append(f2);
        sb.append(", endConnectorLength=");
        sb.append(f3);
        sb.append(", isExtender=");
        return sq6.v(")", sb, z);
    }

    public MTGlyphPart(int i, float f, float f2, float f3, boolean z) {
        this.glyph = i;
        this.fullAdvance = f;
        this.startConnectorLength = f2;
        this.endConnectorLength = f3;
        this.isExtender = z;
    }

    public MTGlyphPart() {
        this(0, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, false, 31, null);
    }
}
