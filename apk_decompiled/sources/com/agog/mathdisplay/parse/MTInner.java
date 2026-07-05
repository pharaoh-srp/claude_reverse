package com.agog.mathdisplay.parse;

import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.rl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0000H\u0016J\b\u0010#\u001a\u00020\u0000H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\u000b\u001a\u0004\u0018\u00010\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u0001@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u0001@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/agog/mathdisplay/parse/MTInner;", "Lcom/agog/mathdisplay/parse/MTMathAtom;", "<init>", "()V", "innerList", "Lcom/agog/mathdisplay/parse/MTMathList;", "getInnerList", "()Lcom/agog/mathdisplay/parse/MTMathList;", "setInnerList", "(Lcom/agog/mathdisplay/parse/MTMathList;)V", ExperienceToggle.DEFAULT_PARAM_KEY, "leftBoundary", "getLeftBoundary", "()Lcom/agog/mathdisplay/parse/MTMathAtom;", "setLeftBoundary", "(Lcom/agog/mathdisplay/parse/MTMathAtom;)V", "rightBoundary", "getRightBoundary", "setRightBoundary", "delimiterHeight", "", "getDelimiterHeight", "()Ljava/lang/Float;", "setDelimiterHeight", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "sizedDelimiterType", "Lcom/agog/mathdisplay/parse/MTMathAtomType;", "getSizedDelimiterType", "()Lcom/agog/mathdisplay/parse/MTMathAtomType;", "setSizedDelimiterType", "(Lcom/agog/mathdisplay/parse/MTMathAtomType;)V", "toLatexString", "", "copyDeep", "finalized", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTInner extends MTMathAtom {
    private Float delimiterHeight;
    private MTMathList innerList;
    private MTMathAtom leftBoundary;
    private MTMathAtom rightBoundary;
    private MTMathAtomType sizedDelimiterType;

    public MTInner() {
        super(MTMathAtomType.KMTMathAtomInner, "");
    }

    @Override // com.agog.mathdisplay.parse.MTMathAtom
    public MTInner copyDeep() throws MathDisplayException {
        MTInner mTInner = new MTInner();
        copyDeepContent(mTInner);
        MTMathList mTMathList = this.innerList;
        mTInner.innerList = mTMathList != null ? mTMathList.copyDeep() : null;
        MTMathAtom mTMathAtom = this.leftBoundary;
        mTInner.setLeftBoundary(mTMathAtom != null ? mTMathAtom.copyDeep() : null);
        MTMathAtom mTMathAtom2 = this.rightBoundary;
        mTInner.setRightBoundary(mTMathAtom2 != null ? mTMathAtom2.copyDeep() : null);
        mTInner.delimiterHeight = this.delimiterHeight;
        mTInner.sizedDelimiterType = this.sizedDelimiterType;
        return mTInner;
    }

    @Override // com.agog.mathdisplay.parse.MTMathAtom
    public MTInner finalized() throws MathDisplayException {
        MTInner mTInnerCopyDeep = copyDeep();
        finalized(mTInnerCopyDeep);
        MTMathList mTMathList = mTInnerCopyDeep.innerList;
        mTInnerCopyDeep.innerList = mTMathList != null ? mTMathList.finalized() : null;
        MTMathAtom mTMathAtom = mTInnerCopyDeep.leftBoundary;
        mTInnerCopyDeep.setLeftBoundary(mTMathAtom != null ? mTMathAtom.finalized() : null);
        MTMathAtom mTMathAtom2 = mTInnerCopyDeep.rightBoundary;
        mTInnerCopyDeep.setRightBoundary(mTMathAtom2 != null ? mTMathAtom2.finalized() : null);
        return mTInnerCopyDeep;
    }

    public final Float getDelimiterHeight() {
        return this.delimiterHeight;
    }

    public final MTMathList getInnerList() {
        return this.innerList;
    }

    public final MTMathAtom getLeftBoundary() {
        return this.leftBoundary;
    }

    public final MTMathAtom getRightBoundary() {
        return this.rightBoundary;
    }

    public final MTMathAtomType getSizedDelimiterType() {
        return this.sizedDelimiterType;
    }

    public final void setDelimiterHeight(Float f) {
        this.delimiterHeight = f;
    }

    public final void setInnerList(MTMathList mTMathList) {
        this.innerList = mTMathList;
    }

    public final void setLeftBoundary(MTMathAtom mTMathAtom) throws MathDisplayException {
        if (mTMathAtom == null || mTMathAtom.getType() == MTMathAtomType.KMTMathAtomBoundary) {
            this.leftBoundary = mTMathAtom;
        } else {
            rl7.o("Left boundary must be of type KMTMathAtomBoundary ", mTMathAtom);
        }
    }

    public final void setRightBoundary(MTMathAtom mTMathAtom) throws MathDisplayException {
        if (mTMathAtom == null || mTMathAtom.getType() == MTMathAtomType.KMTMathAtomBoundary) {
            this.rightBoundary = mTMathAtom;
        } else {
            rl7.o("Right boundary must be of type KMTMathAtomBoundary ", mTMathAtom);
        }
    }

    public final void setSizedDelimiterType(MTMathAtomType mTMathAtomType) {
        this.sizedDelimiterType = mTMathAtomType;
    }

    @Override // com.agog.mathdisplay.parse.MTMathAtom
    public String toLatexString() {
        MTMathAtom mTMathAtom = this.leftBoundary;
        String strJ = mTMathAtom != null ? ij0.j("\\inner[", mTMathAtom.getNucleus(), "]") : "\\inner";
        MTMathList mTMathList = this.innerList;
        String strP = kgh.p(strJ, "{", mTMathList != null ? MTMathListBuilder.INSTANCE.toLatexString(mTMathList) : "", "}");
        MTMathAtom mTMathAtom2 = this.rightBoundary;
        if (mTMathAtom2 != null) {
            strP = kgh.p(strP, "[", mTMathAtom2.getNucleus(), "]");
        }
        return toStringSubs(strP);
    }
}
