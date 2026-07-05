package com.agog.mathdisplay.parse;

import defpackage.ij0;
import defpackage.mdj;
import defpackage.x44;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\b\u0010\"\u001a\u00020\u0017H\u0016J\b\u0010#\u001a\u00020\u0000H\u0016J\b\u0010$\u001a\u00020\u0000H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0006R\u001a\u0010\u0014\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0012\"\u0004\b\u0015\u0010\u0006R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001b¨\u0006%"}, d2 = {"Lcom/agog/mathdisplay/parse/MTFraction;", "Lcom/agog/mathdisplay/parse/MTMathAtom;", "<init>", "()V", "rule", "", "(Z)V", "numerator", "Lcom/agog/mathdisplay/parse/MTMathList;", "getNumerator", "()Lcom/agog/mathdisplay/parse/MTMathList;", "setNumerator", "(Lcom/agog/mathdisplay/parse/MTMathList;)V", "denominator", "getDenominator", "setDenominator", "hasRule", "getHasRule", "()Z", "setHasRule", "isContinuedFraction", "setContinuedFraction", "alignment", "", "getAlignment", "()Ljava/lang/String;", "setAlignment", "(Ljava/lang/String;)V", "leftDelimiter", "getLeftDelimiter", "setLeftDelimiter", "rightDelimiter", "getRightDelimiter", "setRightDelimiter", "toLatexString", "copyDeep", "finalized", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTFraction extends MTMathAtom {
    private String alignment;
    private MTMathList denominator;
    private boolean hasRule;
    private boolean isContinuedFraction;
    private String leftDelimiter;
    private MTMathList numerator;
    private String rightDelimiter;

    public MTFraction() {
        super(MTMathAtomType.KMTMathAtomFraction, "");
        this.hasRule = true;
        this.alignment = "c";
    }

    @Override // com.agog.mathdisplay.parse.MTMathAtom
    public MTFraction copyDeep() throws MathDisplayException {
        MTFraction mTFraction = new MTFraction(this.hasRule);
        copyDeepContent(mTFraction);
        mTFraction.hasRule = this.hasRule;
        mTFraction.isContinuedFraction = this.isContinuedFraction;
        mTFraction.alignment = this.alignment;
        MTMathList mTMathList = this.numerator;
        mTFraction.numerator = mTMathList != null ? mTMathList.copyDeep() : null;
        MTMathList mTMathList2 = this.denominator;
        mTFraction.denominator = mTMathList2 != null ? mTMathList2.copyDeep() : null;
        mTFraction.leftDelimiter = this.leftDelimiter;
        mTFraction.rightDelimiter = this.rightDelimiter;
        return mTFraction;
    }

    @Override // com.agog.mathdisplay.parse.MTMathAtom
    public MTFraction finalized() throws MathDisplayException {
        MTFraction mTFractionCopyDeep = copyDeep();
        finalized(mTFractionCopyDeep);
        MTMathList mTMathList = mTFractionCopyDeep.numerator;
        mTFractionCopyDeep.numerator = mTMathList != null ? mTMathList.finalized() : null;
        MTMathList mTMathList2 = mTFractionCopyDeep.denominator;
        mTFractionCopyDeep.denominator = mTMathList2 != null ? mTMathList2.finalized() : null;
        return mTFractionCopyDeep;
    }

    public final String getAlignment() {
        return this.alignment;
    }

    public final MTMathList getDenominator() {
        return this.denominator;
    }

    public final boolean getHasRule() {
        return this.hasRule;
    }

    public final String getLeftDelimiter() {
        return this.leftDelimiter;
    }

    public final MTMathList getNumerator() {
        return this.numerator;
    }

    public final String getRightDelimiter() {
        return this.rightDelimiter;
    }

    /* JADX INFO: renamed from: isContinuedFraction, reason: from getter */
    public final boolean getIsContinuedFraction() {
        return this.isContinuedFraction;
    }

    public final void setAlignment(String str) {
        str.getClass();
        this.alignment = str;
    }

    public final void setContinuedFraction(boolean z) {
        this.isContinuedFraction = z;
    }

    public final void setDenominator(MTMathList mTMathList) {
        this.denominator = mTMathList;
    }

    public final void setHasRule(boolean z) {
        this.hasRule = z;
    }

    public final void setLeftDelimiter(String str) {
        this.leftDelimiter = str;
    }

    public final void setNumerator(MTMathList mTMathList) {
        this.numerator = mTMathList;
    }

    public final void setRightDelimiter(String str) {
        this.rightDelimiter = str;
    }

    @Override // com.agog.mathdisplay.parse.MTMathAtom
    public String toLatexString() {
        String strJ = this.isContinuedFraction ? !x44.r(this.alignment, "c") ? ij0.j("\\cfrac[", this.alignment, "]") : "\\cfrac" : this.hasRule ? "\\frac" : "\\atop";
        if (this.leftDelimiter != null || this.rightDelimiter != null) {
            strJ = strJ + "[" + this + ".leftDelimiter][" + this + ".rightDelimiter]";
        }
        MTMathList mTMathList = this.numerator;
        String latexString = mTMathList != null ? MTMathListBuilder.INSTANCE.toLatexString(mTMathList) : "";
        MTMathList mTMathList2 = this.denominator;
        return toStringSubs(strJ + "{" + latexString + "}{" + (mTMathList2 != null ? MTMathListBuilder.INSTANCE.toLatexString(mTMathList2) : "") + "}");
    }

    public MTFraction(boolean z) {
        this();
        this.hasRule = z;
    }
}
