package com.agog.mathdisplay.parse;

import defpackage.ij0;
import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0000H\u0016J\b\u0010\u0010\u001a\u00020\u0000H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/agog/mathdisplay/parse/MTRadical;", "Lcom/agog/mathdisplay/parse/MTMathAtom;", "<init>", "()V", "degree", "Lcom/agog/mathdisplay/parse/MTMathList;", "getDegree", "()Lcom/agog/mathdisplay/parse/MTMathList;", "setDegree", "(Lcom/agog/mathdisplay/parse/MTMathList;)V", "radicand", "getRadicand", "setRadicand", "toLatexString", "", "copyDeep", "finalized", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTRadical extends MTMathAtom {
    private MTMathList degree;
    private MTMathList radicand;

    public MTRadical() {
        super(MTMathAtomType.KMTMathAtomRadical, "");
    }

    @Override // com.agog.mathdisplay.parse.MTMathAtom
    public MTRadical copyDeep() throws MathDisplayException {
        MTRadical mTRadical = new MTRadical();
        copyDeepContent(mTRadical);
        MTMathList mTMathList = this.radicand;
        mTRadical.radicand = mTMathList != null ? mTMathList.copyDeep() : null;
        MTMathList mTMathList2 = this.degree;
        mTRadical.degree = mTMathList2 != null ? mTMathList2.copyDeep() : null;
        return mTRadical;
    }

    @Override // com.agog.mathdisplay.parse.MTMathAtom
    public MTRadical finalized() throws MathDisplayException {
        MTRadical mTRadicalCopyDeep = copyDeep();
        finalized(mTRadicalCopyDeep);
        MTMathList mTMathList = mTRadicalCopyDeep.radicand;
        mTRadicalCopyDeep.radicand = mTMathList != null ? mTMathList.finalized() : null;
        MTMathList mTMathList2 = mTRadicalCopyDeep.degree;
        mTRadicalCopyDeep.degree = mTMathList2 != null ? mTMathList2.finalized() : null;
        return mTRadicalCopyDeep;
    }

    public final MTMathList getDegree() {
        return this.degree;
    }

    public final MTMathList getRadicand() {
        return this.radicand;
    }

    public final void setDegree(MTMathList mTMathList) {
        this.degree = mTMathList;
    }

    public final void setRadicand(MTMathList mTMathList) {
        this.radicand = mTMathList;
    }

    @Override // com.agog.mathdisplay.parse.MTMathAtom
    public String toLatexString() {
        MTMathList mTMathList = this.degree;
        String strJ = mTMathList != null ? ij0.j("\\sqrt[", MTMathListBuilder.INSTANCE.toLatexString(mTMathList), "]") : "\\sqrt";
        MTMathList mTMathList2 = this.radicand;
        return toStringSubs(strJ + "{" + (mTMathList2 != null ? MTMathListBuilder.INSTANCE.toLatexString(mTMathList2) : "") + "}");
    }
}
