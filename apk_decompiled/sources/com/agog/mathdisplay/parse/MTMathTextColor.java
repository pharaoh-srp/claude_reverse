package com.agog.mathdisplay.parse;

import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u000bH\u0016J\b\u0010\u0011\u001a\u00020\u0000H\u0016J\b\u0010\u0012\u001a\u00020\u0000H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/agog/mathdisplay/parse/MTMathTextColor;", "Lcom/agog/mathdisplay/parse/MTMathAtom;", "<init>", "()V", "innerList", "Lcom/agog/mathdisplay/parse/MTMathList;", "getInnerList", "()Lcom/agog/mathdisplay/parse/MTMathList;", "setInnerList", "(Lcom/agog/mathdisplay/parse/MTMathList;)V", "colorString", "", "getColorString", "()Ljava/lang/String;", "setColorString", "(Ljava/lang/String;)V", "toLatexString", "copyDeep", "finalized", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTMathTextColor extends MTMathAtom {
    private String colorString;
    private MTMathList innerList;

    public MTMathTextColor() {
        super(MTMathAtomType.KMTMathAtomTextColor, "");
    }

    @Override // com.agog.mathdisplay.parse.MTMathAtom
    public MTMathTextColor copyDeep() throws MathDisplayException {
        MTMathTextColor mTMathTextColor = new MTMathTextColor();
        copyDeepContent(mTMathTextColor);
        MTMathList mTMathList = this.innerList;
        mTMathTextColor.innerList = mTMathList != null ? mTMathList.copyDeep() : null;
        mTMathTextColor.colorString = this.colorString;
        return mTMathTextColor;
    }

    @Override // com.agog.mathdisplay.parse.MTMathAtom
    public MTMathTextColor finalized() throws MathDisplayException {
        MTMathTextColor mTMathTextColorCopyDeep = copyDeep();
        finalized(mTMathTextColorCopyDeep);
        MTMathList mTMathList = mTMathTextColorCopyDeep.innerList;
        mTMathTextColorCopyDeep.innerList = mTMathList != null ? mTMathList.finalized() : null;
        return mTMathTextColorCopyDeep;
    }

    public final String getColorString() {
        return this.colorString;
    }

    public final MTMathList getInnerList() {
        return this.innerList;
    }

    public final void setColorString(String str) {
        this.colorString = str;
    }

    public final void setInnerList(MTMathList mTMathList) {
        this.innerList = mTMathList;
    }

    @Override // com.agog.mathdisplay.parse.MTMathAtom
    public String toLatexString() {
        return toStringSubs("\\textcolor{" + this + ".colorString}{" + this + ".innerList}");
    }
}
