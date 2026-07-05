package com.agog.mathdisplay.parse;

import defpackage.ij0;
import defpackage.mdj;
import defpackage.wg6;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0000H\u0016J\b\u0010\u0013\u001a\u00020\u0000H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/agog/mathdisplay/parse/MTPhantom;", "Lcom/agog/mathdisplay/parse/MTMathAtom;", "<init>", "()V", "innerList", "Lcom/agog/mathdisplay/parse/MTMathList;", "getInnerList", "()Lcom/agog/mathdisplay/parse/MTMathList;", "setInnerList", "(Lcom/agog/mathdisplay/parse/MTMathList;)V", "mode", "Lcom/agog/mathdisplay/parse/MTPhantomMode;", "getMode", "()Lcom/agog/mathdisplay/parse/MTPhantomMode;", "setMode", "(Lcom/agog/mathdisplay/parse/MTPhantomMode;)V", "toLatexString", "", "copyDeep", "finalized", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTPhantom extends MTMathAtom {
    private MTMathList innerList;
    private MTPhantomMode mode;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = mdj.f)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MTPhantomMode.values().length];
            try {
                iArr[MTPhantomMode.Full.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MTPhantomMode.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MTPhantomMode.Vertical.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MTPhantom() {
        super(MTMathAtomType.KMTMathAtomPhantom, "");
        this.mode = MTPhantomMode.Full;
    }

    @Override // com.agog.mathdisplay.parse.MTMathAtom
    public MTPhantom copyDeep() throws MathDisplayException {
        MTPhantom mTPhantom = new MTPhantom();
        copyDeepContent(mTPhantom);
        MTMathList mTMathList = this.innerList;
        mTPhantom.innerList = mTMathList != null ? mTMathList.copyDeep() : null;
        mTPhantom.mode = this.mode;
        return mTPhantom;
    }

    @Override // com.agog.mathdisplay.parse.MTMathAtom
    public MTPhantom finalized() throws MathDisplayException {
        MTPhantom mTPhantomCopyDeep = copyDeep();
        finalized(mTPhantomCopyDeep);
        MTMathList mTMathList = mTPhantomCopyDeep.innerList;
        mTPhantomCopyDeep.innerList = mTMathList != null ? mTMathList.finalized() : null;
        return mTPhantomCopyDeep;
    }

    public final MTMathList getInnerList() {
        return this.innerList;
    }

    public final MTPhantomMode getMode() {
        return this.mode;
    }

    public final void setInnerList(MTMathList mTMathList) {
        this.innerList = mTMathList;
    }

    public final void setMode(MTPhantomMode mTPhantomMode) {
        mTPhantomMode.getClass();
        this.mode = mTPhantomMode;
    }

    @Override // com.agog.mathdisplay.parse.MTMathAtom
    public String toLatexString() {
        String str;
        String latexString;
        int i = WhenMappings.$EnumSwitchMapping$0[this.mode.ordinal()];
        if (i == 1) {
            str = "phantom";
        } else if (i == 2) {
            str = "hphantom";
        } else {
            if (i != 3) {
                wg6.i();
                return null;
            }
            str = "vphantom";
        }
        MTMathList mTMathList = this.innerList;
        if (mTMathList == null || (latexString = MTMathListBuilder.INSTANCE.toLatexString(mTMathList)) == null) {
            latexString = "";
        }
        return ij0.l("\\", str, "{", latexString, "}");
    }
}
