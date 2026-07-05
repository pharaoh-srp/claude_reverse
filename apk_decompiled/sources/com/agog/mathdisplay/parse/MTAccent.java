package com.agog.mathdisplay.parse;

import defpackage.ij0;
import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0000H\u0016J\b\u0010\u000e\u001a\u00020\u0000H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/agog/mathdisplay/parse/MTAccent;", "Lcom/agog/mathdisplay/parse/MTMathAtom;", "nucleus", "", "<init>", "(Ljava/lang/String;)V", "innerList", "Lcom/agog/mathdisplay/parse/MTMathList;", "getInnerList", "()Lcom/agog/mathdisplay/parse/MTMathList;", "setInnerList", "(Lcom/agog/mathdisplay/parse/MTMathList;)V", "toLatexString", "copyDeep", "finalized", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTAccent extends MTMathAtom {
    private MTMathList innerList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTAccent(String str) {
        super(MTMathAtomType.KMTMathAtomAccent, str);
        str.getClass();
    }

    @Override // com.agog.mathdisplay.parse.MTMathAtom
    public MTAccent copyDeep() throws MathDisplayException {
        MTAccent mTAccent = new MTAccent(getNucleus());
        copyDeepContent(mTAccent);
        MTMathList mTMathList = this.innerList;
        mTAccent.innerList = mTMathList != null ? mTMathList.copyDeep() : null;
        return mTAccent;
    }

    @Override // com.agog.mathdisplay.parse.MTMathAtom
    public MTAccent finalized() throws MathDisplayException {
        MTAccent mTAccentCopyDeep = copyDeep();
        finalized(mTAccentCopyDeep);
        MTMathList mTMathList = mTAccentCopyDeep.innerList;
        mTAccentCopyDeep.innerList = mTMathList != null ? mTMathList.finalized() : null;
        return mTAccentCopyDeep;
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
        return ij0.j("{", mTMathList != null ? MTMathListBuilder.INSTANCE.toLatexString(mTMathList) : "", "}");
    }
}
