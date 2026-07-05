package com.agog.mathdisplay.parse;

import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bJ\b\u0010\u000e\u001a\u00020\u0000H\u0016R\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/agog/mathdisplay/parse/MTLargeOperator;", "Lcom/agog/mathdisplay/parse/MTMathAtom;", "nucleus", "", "<init>", "(Ljava/lang/String;)V", "limits", "", "(Ljava/lang/String;Z)V", "hasLimits", "getHasLimits", "()Z", "setHasLimits", "(Z)V", "copyDeep", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTLargeOperator extends MTMathAtom {
    private boolean hasLimits;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTLargeOperator(String str) {
        super(MTMathAtomType.KMTMathAtomLargeOperator, str);
        str.getClass();
    }

    @Override // com.agog.mathdisplay.parse.MTMathAtom
    public MTLargeOperator copyDeep() throws MathDisplayException {
        MTLargeOperator mTLargeOperator = new MTLargeOperator(getNucleus(), this.hasLimits);
        copyDeepContent(mTLargeOperator);
        return mTLargeOperator;
    }

    public final boolean getHasLimits() {
        return this.hasLimits;
    }

    public final void setHasLimits(boolean z) {
        this.hasLimits = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MTLargeOperator(String str, boolean z) {
        this(str);
        str.getClass();
        this.hasLimits = z;
    }
}
