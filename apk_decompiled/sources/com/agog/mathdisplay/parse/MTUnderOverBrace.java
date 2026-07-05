package com.agog.mathdisplay.parse;

import defpackage.ij0;
import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0000H\u0016J\b\u0010\u0012\u001a\u00020\u0000H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/agog/mathdisplay/parse/MTUnderOverBrace;", "Lcom/agog/mathdisplay/parse/MTMathAtom;", "<init>", "()V", "innerList", "Lcom/agog/mathdisplay/parse/MTMathList;", "getInnerList", "()Lcom/agog/mathdisplay/parse/MTMathList;", "setInnerList", "(Lcom/agog/mathdisplay/parse/MTMathList;)V", "isOver", "", "()Z", "setOver", "(Z)V", "toLatexString", "", "copyDeep", "finalized", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTUnderOverBrace extends MTMathAtom {
    private MTMathList innerList;
    private boolean isOver;

    public MTUnderOverBrace() {
        super(MTMathAtomType.KMTMathAtomUnderOverBrace, "");
    }

    @Override // com.agog.mathdisplay.parse.MTMathAtom
    public MTUnderOverBrace copyDeep() throws MathDisplayException {
        MTUnderOverBrace mTUnderOverBrace = new MTUnderOverBrace();
        copyDeepContent(mTUnderOverBrace);
        MTMathList mTMathList = this.innerList;
        mTUnderOverBrace.innerList = mTMathList != null ? mTMathList.copyDeep() : null;
        mTUnderOverBrace.isOver = this.isOver;
        return mTUnderOverBrace;
    }

    @Override // com.agog.mathdisplay.parse.MTMathAtom
    public MTUnderOverBrace finalized() throws MathDisplayException {
        MTUnderOverBrace mTUnderOverBraceCopyDeep = copyDeep();
        finalized(mTUnderOverBraceCopyDeep);
        MTMathList mTMathList = mTUnderOverBraceCopyDeep.innerList;
        mTUnderOverBraceCopyDeep.innerList = mTMathList != null ? mTMathList.finalized() : null;
        return mTUnderOverBraceCopyDeep;
    }

    public final MTMathList getInnerList() {
        return this.innerList;
    }

    /* JADX INFO: renamed from: isOver, reason: from getter */
    public final boolean getIsOver() {
        return this.isOver;
    }

    public final void setInnerList(MTMathList mTMathList) {
        this.innerList = mTMathList;
    }

    public final void setOver(boolean z) {
        this.isOver = z;
    }

    @Override // com.agog.mathdisplay.parse.MTMathAtom
    public String toLatexString() {
        String latexString;
        String str = this.isOver ? "overbrace" : "underbrace";
        MTMathList mTMathList = this.innerList;
        if (mTMathList == null || (latexString = MTMathListBuilder.INSTANCE.toLatexString(mTMathList)) == null) {
            latexString = "";
        }
        return ij0.l("\\", str, "{", latexString, "}");
    }
}
