package com.agog.mathdisplay.parse;

import defpackage.ij0;
import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0000H\u0016J\b\u0010\r\u001a\u00020\u0000H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/agog/mathdisplay/parse/MTOverLeftRightArrow;", "Lcom/agog/mathdisplay/parse/MTMathAtom;", "<init>", "()V", "innerList", "Lcom/agog/mathdisplay/parse/MTMathList;", "getInnerList", "()Lcom/agog/mathdisplay/parse/MTMathList;", "setInnerList", "(Lcom/agog/mathdisplay/parse/MTMathList;)V", "toLatexString", "", "copyDeep", "finalized", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTOverLeftRightArrow extends MTMathAtom {
    private MTMathList innerList;

    public MTOverLeftRightArrow() {
        super(MTMathAtomType.KMTMathAtomOverline, "");
    }

    @Override // com.agog.mathdisplay.parse.MTMathAtom
    public MTOverLeftRightArrow copyDeep() throws MathDisplayException {
        MTOverLeftRightArrow mTOverLeftRightArrow = new MTOverLeftRightArrow();
        copyDeepContent(mTOverLeftRightArrow);
        MTMathList mTMathList = this.innerList;
        mTOverLeftRightArrow.innerList = mTMathList != null ? mTMathList.copyDeep() : null;
        return mTOverLeftRightArrow;
    }

    @Override // com.agog.mathdisplay.parse.MTMathAtom
    public MTOverLeftRightArrow finalized() throws MathDisplayException {
        MTOverLeftRightArrow mTOverLeftRightArrowCopyDeep = copyDeep();
        finalized(mTOverLeftRightArrowCopyDeep);
        MTMathList mTMathList = mTOverLeftRightArrowCopyDeep.innerList;
        mTOverLeftRightArrowCopyDeep.innerList = mTMathList != null ? mTMathList.finalized() : null;
        return mTOverLeftRightArrowCopyDeep;
    }

    public final MTMathList getInnerList() {
        return this.innerList;
    }

    public final void setInnerList(MTMathList mTMathList) {
        this.innerList = mTMathList;
    }

    @Override // com.agog.mathdisplay.parse.MTMathAtom
    public String toLatexString() {
        MTMathList mTMathList = this.innerList;
        return ij0.j("\\overleftrightarrow{", mTMathList != null ? MTMathListBuilder.INSTANCE.toLatexString(mTMathList) : "", "}");
    }
}
