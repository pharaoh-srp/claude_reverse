package com.agog.mathdisplay.parse;

import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\u0000H\u0016R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/agog/mathdisplay/parse/MTMathStyle;", "Lcom/agog/mathdisplay/parse/MTMathAtom;", "<init>", "()V", "st", "Lcom/agog/mathdisplay/parse/MTLineStyle;", "(Lcom/agog/mathdisplay/parse/MTLineStyle;)V", "style", "getStyle", "()Lcom/agog/mathdisplay/parse/MTLineStyle;", "setStyle", "copyDeep", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTMathStyle extends MTMathAtom {
    private MTLineStyle style;

    public MTMathStyle() {
        super(MTMathAtomType.KMTMathAtomStyle, "");
        this.style = MTLineStyle.KMTLineStyleDisplay;
    }

    @Override // com.agog.mathdisplay.parse.MTMathAtom
    public MTMathStyle copyDeep() throws MathDisplayException {
        MTMathStyle mTMathStyle = new MTMathStyle(this.style);
        copyDeepContent(mTMathStyle);
        return mTMathStyle;
    }

    public final MTLineStyle getStyle() {
        return this.style;
    }

    public final void setStyle(MTLineStyle mTLineStyle) {
        mTLineStyle.getClass();
        this.style = mTLineStyle;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MTMathStyle(MTLineStyle mTLineStyle) {
        this();
        mTLineStyle.getClass();
        this.style = mTLineStyle;
    }
}
