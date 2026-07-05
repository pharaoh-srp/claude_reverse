package com.agog.mathdisplay.parse;

import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\u0000H\u0016R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/agog/mathdisplay/parse/MTMathSpace;", "Lcom/agog/mathdisplay/parse/MTMathAtom;", "<init>", "()V", "sp", "", "(F)V", "space", "getSpace", "()F", "setSpace", "copyDeep", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTMathSpace extends MTMathAtom {
    private float space;

    public MTMathSpace() {
        super(MTMathAtomType.KMTMathAtomSpace, "");
    }

    @Override // com.agog.mathdisplay.parse.MTMathAtom
    public MTMathSpace copyDeep() throws MathDisplayException {
        MTMathSpace mTMathSpace = new MTMathSpace(this.space);
        copyDeepContent(mTMathSpace);
        return mTMathSpace;
    }

    public final float getSpace() {
        return this.space;
    }

    public final void setSpace(float f) {
        this.space = f;
    }

    public MTMathSpace(float f) {
        this();
        this.space = f;
    }
}
